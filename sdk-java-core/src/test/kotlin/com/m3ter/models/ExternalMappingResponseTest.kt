// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingResponseTest {

    @Test
    fun create() {
        val externalMappingResponse =
            ExternalMappingResponse.builder()
                .id("id")
                .externalId("cus_00000000000000")
                .externalSystem("Stripe")
                .externalTable("Customer")
                .m3terEntity("Account")
                .m3terId("00000000-0000-0000-0000-000000000000")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfigId("00000000-0000-0000-0000-000000000000")
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(externalMappingResponse.id()).isEqualTo("id")
        assertThat(externalMappingResponse.externalId()).isEqualTo("cus_00000000000000")
        assertThat(externalMappingResponse.externalSystem()).isEqualTo("Stripe")
        assertThat(externalMappingResponse.externalTable()).isEqualTo("Customer")
        assertThat(externalMappingResponse.m3terEntity()).isEqualTo("Account")
        assertThat(externalMappingResponse.m3terId())
            .isEqualTo("00000000-0000-0000-0000-000000000000")
        assertThat(externalMappingResponse.createdBy()).contains("createdBy")
        assertThat(externalMappingResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMappingResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMappingResponse.integrationConfigId())
            .contains("00000000-0000-0000-0000-000000000000")
        assertThat(externalMappingResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(externalMappingResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMappingResponse =
            ExternalMappingResponse.builder()
                .id("id")
                .externalId("cus_00000000000000")
                .externalSystem("Stripe")
                .externalTable("Customer")
                .m3terEntity("Account")
                .m3terId("00000000-0000-0000-0000-000000000000")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfigId("00000000-0000-0000-0000-000000000000")
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        val roundtrippedExternalMappingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMappingResponse),
                jacksonTypeRef<ExternalMappingResponse>(),
            )

        assertThat(roundtrippedExternalMappingResponse).isEqualTo(externalMappingResponse)
    }
}
