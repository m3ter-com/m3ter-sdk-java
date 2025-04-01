// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class M3terSignedCredentialsRequestTest {

    @Test
    fun create() {
        val m3terSignedCredentialsRequest =
            M3terSignedCredentialsRequest.builder()
                .apiKey("x")
                .secret("x")
                .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                .empty(true)
                .version(0L)
                .build()

        assertThat(m3terSignedCredentialsRequest.apiKey()).isEqualTo("x")
        assertThat(m3terSignedCredentialsRequest.secret()).isEqualTo("x")
        assertThat(m3terSignedCredentialsRequest.type())
            .isEqualTo(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
        assertThat(m3terSignedCredentialsRequest.empty()).contains(true)
        assertThat(m3terSignedCredentialsRequest.version()).contains(0L)
    }
}
