@file:JvmName("PrepareRequest")

package com.m3ter.sdk.core

import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.models.AuthenticationGetBearerTokenParams
import com.m3ter.sdk.models.AuthenticationGetBearerTokenResponse
import com.m3ter.sdk.services.blocking.AuthenticationService
import com.m3ter.sdk.services.blocking.AuthenticationServiceImpl
import java.util.*
import java.util.concurrent.CompletableFuture

@JvmSynthetic
internal fun HttpRequest.prepare(clientOptions: ClientOptions, params: Params): HttpRequest {
    val request: HttpRequest =
        toBuilder()
            .putAllQueryParams(clientOptions.queryParams)
            .replaceAllQueryParams(params._queryParams())
            .putAllHeaders(clientOptions.headers)
            .replaceAllHeaders(params._headers())
            .build()

    val isAuthRequest: Boolean =
        request.pathSegments.contains("oauth") && request.pathSegments.contains("token")
    val token: String? = clientOptions.token

    // If the request is not an OAuth token request or if the token is not null
    // return early, no need to generate token.
    if (isAuthRequest || token != null) {
        return request
    }

    val keySecret: String = clientOptions.apiKey + ":" + clientOptions.apiSecret
    val encodedKeySecret: String = Base64.getEncoder().encodeToString(keySecret.toByteArray())
    val authService: AuthenticationService = AuthenticationServiceImpl(clientOptions)
    val tokenResponse: AuthenticationGetBearerTokenResponse =
        authService.getBearerToken(
            AuthenticationGetBearerTokenParams.builder()
                .grantType(AuthenticationGetBearerTokenParams.GrantType.CLIENT_CREDENTIALS)
                .putAdditionalHeader("Authorization", "Basic $encodedKeySecret")
                .build(),
            RequestOptions.none(),
        )

    return request
        .toBuilder()
        .putAllHeaders(clientOptions.toBuilder().token(tokenResponse.accessToken()).build().headers)
        .build()
}

@JvmSynthetic
internal fun HttpRequest.prepareAsync(
    clientOptions: ClientOptions,
    params: Params,
): CompletableFuture<HttpRequest> =
    // This async version exists to make it easier to add async specific preparation logic in the
    // future.
    CompletableFuture.completedFuture(prepare(clientOptions, params))
