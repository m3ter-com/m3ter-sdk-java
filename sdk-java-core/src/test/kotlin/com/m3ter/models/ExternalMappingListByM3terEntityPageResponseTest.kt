// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListByM3terEntityPageResponseTest {

    @Test
    fun create() {
        val externalMappingListByM3terEntityPageResponse =
            ExternalMappingListByM3terEntityPageResponse.builder()
                .addData(
                    ExternalMappingResponse.builder()
                        .id("id")
                        .externalId("x")
                        .externalSystem("x")
                        .externalTable("x")
                        .m3terEntity("x")
                        .m3terId("x")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .integrationConfigId("integrationConfigId")
                        .lastModifiedBy("lastModifiedBy")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(externalMappingListByM3terEntityPageResponse.data().getOrNull())
            .containsExactly(
                ExternalMappingResponse.builder()
                    .id("id")
                    .externalId("x")
                    .externalSystem("x")
                    .externalTable("x")
                    .m3terEntity("x")
                    .m3terId("x")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .integrationConfigId("integrationConfigId")
                    .lastModifiedBy("lastModifiedBy")
                    .version(0L)
                    .build()
            )
        assertThat(externalMappingListByM3terEntityPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMappingListByM3terEntityPageResponse =
            ExternalMappingListByM3terEntityPageResponse.builder()
                .addData(
                    ExternalMappingResponse.builder()
                        .id("id")
                        .externalId("x")
                        .externalSystem("x")
                        .externalTable("x")
                        .m3terEntity("x")
                        .m3terId("x")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .integrationConfigId("integrationConfigId")
                        .lastModifiedBy("lastModifiedBy")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedExternalMappingListByM3terEntityPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMappingListByM3terEntityPageResponse),
                jacksonTypeRef<ExternalMappingListByM3terEntityPageResponse>(),
            )

        assertThat(roundtrippedExternalMappingListByM3terEntityPageResponse)
            .isEqualTo(externalMappingListByM3terEntityPageResponse)
    }
}
