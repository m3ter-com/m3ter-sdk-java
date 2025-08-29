// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class M3terSignedCredentialsResponseTest {

    @Test
    fun create() {
        val m3terSignedCredentialsResponse =
            M3terSignedCredentialsResponse.builder()
                .id("id")
                .destination("x")
                .type("x")
                .apiKey("api key")
                .createdBy("createdBy")
                .destinationId("destinationId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .secret("api secret")
                .version(0L)
                .build()

        assertThat(m3terSignedCredentialsResponse.id()).isEqualTo("id")
        assertThat(m3terSignedCredentialsResponse.destination()).isEqualTo("x")
        assertThat(m3terSignedCredentialsResponse.type()).isEqualTo("x")
        assertThat(m3terSignedCredentialsResponse.apiKey()).contains("api key")
        assertThat(m3terSignedCredentialsResponse.createdBy()).contains("createdBy")
        assertThat(m3terSignedCredentialsResponse.destinationId()).contains("destinationId")
        assertThat(m3terSignedCredentialsResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(m3terSignedCredentialsResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(m3terSignedCredentialsResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(m3terSignedCredentialsResponse.name()).contains("name")
        assertThat(m3terSignedCredentialsResponse.secret()).contains("api secret")
        assertThat(m3terSignedCredentialsResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val m3terSignedCredentialsResponse =
            M3terSignedCredentialsResponse.builder()
                .id("id")
                .destination("x")
                .type("x")
                .apiKey("api key")
                .createdBy("createdBy")
                .destinationId("destinationId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .secret("api secret")
                .version(0L)
                .build()

        val roundtrippedM3terSignedCredentialsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(m3terSignedCredentialsResponse),
                jacksonTypeRef<M3terSignedCredentialsResponse>(),
            )

        assertThat(roundtrippedM3terSignedCredentialsResponse)
            .isEqualTo(m3terSignedCredentialsResponse)
    }
}
