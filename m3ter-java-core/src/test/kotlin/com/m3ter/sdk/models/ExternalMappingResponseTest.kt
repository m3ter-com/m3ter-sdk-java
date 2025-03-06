// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalMappingResponseTest {

    @Test
    fun createExternalMappingResponse() {
        val externalMappingResponse =
            ExternalMappingResponse.builder()
                .id("id")
                .externalId("x")
                .externalSystem("x")
                .externalTable("x")
                .m3terEntity("x")
                .m3terId("x")
                .version(0L)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfigId("integrationConfigId")
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(externalMappingResponse).isNotNull
        assertThat(externalMappingResponse.id()).isEqualTo("id")
        assertThat(externalMappingResponse.externalId()).isEqualTo("x")
        assertThat(externalMappingResponse.externalSystem()).isEqualTo("x")
        assertThat(externalMappingResponse.externalTable()).isEqualTo("x")
        assertThat(externalMappingResponse.m3terEntity()).isEqualTo("x")
        assertThat(externalMappingResponse.m3terId()).isEqualTo("x")
        assertThat(externalMappingResponse.version()).isEqualTo(0L)
        assertThat(externalMappingResponse.createdBy()).contains("createdBy")
        assertThat(externalMappingResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMappingResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMappingResponse.integrationConfigId()).contains("integrationConfigId")
        assertThat(externalMappingResponse.lastModifiedBy()).contains("lastModifiedBy")
    }
}
