package com.cobo.waas2.auth;

import com.cobo.waas2.ApiSigner;
import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * A request interceptor that injects the API Key Header into requests, and signs messages, whenever required.
 */
public class AuthenticationInterceptor implements Interceptor {

    private final ApiSigner apiSigner;

    private final boolean debug;

    public AuthenticationInterceptor(ApiSigner apiSigner, boolean debug) {
        this.apiSigner = apiSigner;
        this.debug = debug;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder newRequestBuilder = original.newBuilder();

        Request newRequest = addHeader(original, newRequestBuilder);
        Response response = chain.proceed(newRequest);
        String responseBody = response.body() == null ? "null" : response.body().string();

        if (debug) {
            System.out.println("response <<<<<<<<");
            System.out.println("responseBody:" + responseBody);
        }
        MediaType mediaType = response.body().contentType();
        return response.newBuilder()
                .body(ResponseBody.create(mediaType, responseBody))
                .build();
    }

    private Request addHeader(Request original, Request.Builder newRequestBuilder) throws UnsupportedEncodingException {
        String method = original.method();
        String path = pathSegmentsToString(original.url().pathSegments());
        String body = "";
        String queryParams = "";
        HttpUrl url = original.url();
        StringBuilder sb = new StringBuilder();
        Set<String> names = url.queryParameterNames();
        for (String name : names) {
            String value = url.queryParameter(name);
            if (value != null) {
            sb.append(name).append("=").append(URLEncoder.encode(value, "UTF-8")).append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        queryParams = sb.toString();

        Buffer buffer = new Buffer();
        try {
            if (original.body() != null) {
                original.body().writeTo(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        body = buffer.readUtf8();

        long currentTime = System.currentTimeMillis();
        String nonce = String.valueOf(currentTime);
        //(method.upper(), path, timestamp, urlencode(params), body_str)
        String content = method + "|" + path + "|" + nonce + "|" + queryParams + "|" +body;
        String sig = apiSigner.sign(content.getBytes());
        newRequestBuilder.removeHeader("BIZ-API-KEY");
        newRequestBuilder.removeHeader("BIZ-API-NONCE");
        newRequestBuilder.removeHeader("BIZ-API-SIGNATURE");
        newRequestBuilder.addHeader("BIZ-API-KEY", apiSigner.getPublicKey())
                .addHeader("BIZ-API-NONCE", nonce)
                .addHeader("BIZ-API-SIGNATURE", sig);

        // Build new request after adding the necessary authentication information
        Request request = newRequestBuilder.build();
        if (debug) {
            System.out.println("request >>>>>>>>");
            System.out.println(request.method() + "\n" + request.url() + "\n" + "content:" + content + "\nsig:" + sig + "\nnonce:" + nonce);
        }
        return request;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final AuthenticationInterceptor that = (AuthenticationInterceptor) o;
        return Objects.equals(apiSigner.getPublicKey(), that.apiSigner.getPublicKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiSigner.getPublicKey());
    }

    String pathSegmentsToString(List<String> pathSegments) {
        StringBuilder out = new StringBuilder();
        for (String pathSegment : pathSegments) {
            out.append('/');
            out.append(pathSegment);
        }
        return out.toString();
    }
}