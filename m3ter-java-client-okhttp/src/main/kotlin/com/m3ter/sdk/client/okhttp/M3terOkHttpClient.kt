// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client.okhttp

import com.fasterxml.jackson.databind.json.JsonMapper
import com.m3ter.sdk.client.M3terClient
import com.m3ter.sdk.client.M3terClientImpl
import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.Timeout
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.net.Proxy
import java.time.Clock
import java.time.Duration
import java.util.Optional

class M3terOkHttpClient private constructor() {

    companion object {

        /** Returns a mutable builder for constructing an instance of [M3terOkHttpClient]. */
        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): M3terClient = builder().fromEnv().build()
    }

    /** A builder for [M3terOkHttpClient]. */
    class Builder internal constructor() {

        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var baseUrl: String = ClientOptions.PRODUCTION_URL
        private var timeout: Timeout = Timeout.default()
        private var proxy: Proxy? = null

        fun baseUrl(baseUrl: String) = apply {
            clientOptions.baseUrl(baseUrl)
            this.baseUrl = baseUrl
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { clientOptions.jsonMapper(jsonMapper) }

        fun clock(clock: Clock) = apply { clientOptions.clock(clock) }

        fun headers(headers: Headers) = apply { clientOptions.headers(headers) }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.headers(headers)
        }

        fun putHeader(name: String, value: String) = apply { clientOptions.putHeader(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.putHeaders(name, values)
        }

        fun putAllHeaders(headers: Headers) = apply { clientOptions.putAllHeaders(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllHeaders(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply {
            clientOptions.replaceHeaders(name, value)
        }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.replaceHeaders(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { clientOptions.replaceAllHeaders(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllHeaders(headers)
        }

        fun removeHeaders(name: String) = apply { clientOptions.removeHeaders(name) }

        fun removeAllHeaders(names: Set<String>) = apply { clientOptions.removeAllHeaders(names) }

        fun queryParams(queryParams: QueryParams) = apply { clientOptions.queryParams(queryParams) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.queryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            clientOptions.putQueryParam(key, value)
        }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            clientOptions.putQueryParams(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            clientOptions.putAllQueryParams(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllQueryParams(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            clientOptions.replaceQueryParams(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            clientOptions.replaceQueryParams(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            clientOptions.replaceAllQueryParams(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllQueryParams(queryParams)
        }

        fun removeQueryParams(key: String) = apply { clientOptions.removeQueryParams(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply {
            clientOptions.removeAllQueryParams(keys)
        }

        fun timeout(timeout: Timeout) = apply {
            clientOptions.timeout(timeout)
            this.timeout = timeout
        }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        fun maxRetries(maxRetries: Int) = apply { clientOptions.maxRetries(maxRetries) }

        fun proxy(proxy: Proxy) = apply { this.proxy = proxy }

        fun responseValidation(responseValidation: Boolean) = apply {
            clientOptions.responseValidation(responseValidation)
        }

        fun apiKey(apiKey: String) = apply { clientOptions.apiKey(apiKey) }

        fun apiSecret(apiSecret: String) = apply { clientOptions.apiSecret(apiSecret) }

        fun token(token: String?) = apply { clientOptions.token(token) }

        fun token(token: Optional<String>) = token(token.orElse(null))

        fun orgId(orgId: String) = apply { clientOptions.orgId(orgId) }

        fun fromEnv() = apply { clientOptions.fromEnv() }

        fun build(): M3terClient =
            M3terClientImpl(
                clientOptions
                    .httpClient(
                        OkHttpClient.builder()
                            .baseUrl(baseUrl)
                            .timeout(timeout)
                            .proxy(proxy)
                            .build()
                    )
                    .build()
            )
    }
}
