// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListByExternalEntityPageResponseTest {

    @Test
    fun create() {
        val externalMappingListByExternalEntityPageResponse =
            ExternalMappingListByExternalEntityPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(externalMappingListByExternalEntityPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(externalMappingListByExternalEntityPageResponse.nextToken())
            .contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMappingListByExternalEntityPageResponse =
            ExternalMappingListByExternalEntityPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedExternalMappingListByExternalEntityPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMappingListByExternalEntityPageResponse),
                jacksonTypeRef<ExternalMappingListByExternalEntityPageResponse>(),
            )

        assertThat(roundtrippedExternalMappingListByExternalEntityPageResponse)
            .isEqualTo(externalMappingListByExternalEntityPageResponse)
    }
}
