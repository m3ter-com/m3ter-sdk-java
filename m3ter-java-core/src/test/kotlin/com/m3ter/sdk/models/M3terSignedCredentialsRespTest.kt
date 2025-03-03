// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class M3terSignedCredentialsRespTest {

    @Test
    fun createM3terSignedCredentialsResp() {
        val m3terSignedCredentialsResp =
            M3terSignedCredentialsResp.builder()
                .id("id")
                .destination("x")
                .type("x")
                .version(0L)
                .apiKey("apiKey")
                .createdBy("createdBy")
                .destinationId("destinationId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .secret("secret")
                .build()
        assertThat(m3terSignedCredentialsResp).isNotNull
        assertThat(m3terSignedCredentialsResp.id()).isEqualTo("id")
        assertThat(m3terSignedCredentialsResp.destination()).isEqualTo("x")
        assertThat(m3terSignedCredentialsResp.type()).isEqualTo("x")
        assertThat(m3terSignedCredentialsResp.version()).isEqualTo(0L)
        assertThat(m3terSignedCredentialsResp.apiKey()).contains("apiKey")
        assertThat(m3terSignedCredentialsResp.createdBy()).contains("createdBy")
        assertThat(m3terSignedCredentialsResp.destinationId()).contains("destinationId")
        assertThat(m3terSignedCredentialsResp.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(m3terSignedCredentialsResp.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(m3terSignedCredentialsResp.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(m3terSignedCredentialsResp.name()).contains("name")
        assertThat(m3terSignedCredentialsResp.secret()).contains("secret")
    }
}
