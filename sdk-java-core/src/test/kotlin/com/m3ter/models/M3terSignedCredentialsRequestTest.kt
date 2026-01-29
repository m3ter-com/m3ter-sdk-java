// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class M3terSignedCredentialsRequestTest {

    @Test
    fun create() {
        val m3terSignedCredentialsRequest =
            M3terSignedCredentialsRequest.builder()
                .apiKey("api key")
                .secret("api secret")
                .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                .empty(true)
                .version(0L)
                .build()

        assertThat(m3terSignedCredentialsRequest.apiKey()).isEqualTo("api key")
        assertThat(m3terSignedCredentialsRequest.secret()).isEqualTo("api secret")
        assertThat(m3terSignedCredentialsRequest.type())
            .isEqualTo(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
        assertThat(m3terSignedCredentialsRequest.empty()).contains(true)
        assertThat(m3terSignedCredentialsRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val m3terSignedCredentialsRequest =
            M3terSignedCredentialsRequest.builder()
                .apiKey("api key")
                .secret("api secret")
                .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                .empty(true)
                .version(0L)
                .build()

        val roundtrippedM3terSignedCredentialsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(m3terSignedCredentialsRequest),
                jacksonTypeRef<M3terSignedCredentialsRequest>(),
            )

        assertThat(roundtrippedM3terSignedCredentialsRequest)
            .isEqualTo(m3terSignedCredentialsRequest)
    }
}
