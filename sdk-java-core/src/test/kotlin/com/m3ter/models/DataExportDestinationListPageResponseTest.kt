// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationListPageResponseTest {

    @Test
    fun create() {
        val dataExportDestinationListPageResponse =
            DataExportDestinationListPageResponse.builder()
                .addData(
                    DataExportDestinationResponse.builder()
                        .id("id")
                        .version(0L)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(dataExportDestinationListPageResponse.data().getOrNull())
            .containsExactly(
                DataExportDestinationResponse.builder()
                    .id("id")
                    .version(0L)
                    .code("code")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .build()
            )
        assertThat(dataExportDestinationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationListPageResponse =
            DataExportDestinationListPageResponse.builder()
                .addData(
                    DataExportDestinationResponse.builder()
                        .id("id")
                        .version(0L)
                        .code("code")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedDataExportDestinationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationListPageResponse),
                jacksonTypeRef<DataExportDestinationListPageResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationListPageResponse)
            .isEqualTo(dataExportDestinationListPageResponse)
    }
}
