// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class M3terSignedCredentialsReqTest {

    @Test
    fun createM3terSignedCredentialsReq() {
        val m3terSignedCredentialsReq =
            M3terSignedCredentialsReq.builder()
                .apiKey("x")
                .secret("x")
                .type(M3terSignedCredentialsReq.Type.M3_TER_SIGNED_REQUEST)
                .empty(true)
                .version(0L)
                .build()
        assertThat(m3terSignedCredentialsReq).isNotNull
        assertThat(m3terSignedCredentialsReq.apiKey()).isEqualTo("x")
        assertThat(m3terSignedCredentialsReq.secret()).isEqualTo("x")
        assertThat(m3terSignedCredentialsReq.type())
            .isEqualTo(M3terSignedCredentialsReq.Type.M3_TER_SIGNED_REQUEST)
        assertThat(m3terSignedCredentialsReq.empty()).contains(true)
        assertThat(m3terSignedCredentialsReq.version()).contains(0L)
    }
}
