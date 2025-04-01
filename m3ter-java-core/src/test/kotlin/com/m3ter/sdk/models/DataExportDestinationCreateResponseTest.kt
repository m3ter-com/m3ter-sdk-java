// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationCreateResponseTest {

    @Test
    fun create() {
        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .bucketName("bucketName")
                .iamRoleArn("iamRoleArn")
                .partitionOrder(DataExportDestinationCreateResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        assertThat(dataExportDestinationCreateResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationCreateResponse.version()).isEqualTo(0L)
        assertThat(dataExportDestinationCreateResponse.code()).contains("code")
        assertThat(dataExportDestinationCreateResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationCreateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationCreateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationCreateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestinationCreateResponse.name()).contains("name")
        assertThat(dataExportDestinationCreateResponse.bucketName()).contains("bucketName")
        assertThat(dataExportDestinationCreateResponse.iamRoleArn()).contains("iamRoleArn")
        assertThat(dataExportDestinationCreateResponse.partitionOrder())
            .contains(DataExportDestinationCreateResponse.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationCreateResponse.prefix()).contains("prefix")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .bucketName("bucketName")
                .iamRoleArn("iamRoleArn")
                .partitionOrder(DataExportDestinationCreateResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        val roundtrippedDataExportDestinationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationCreateResponse),
                jacksonTypeRef<DataExportDestinationCreateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationCreateResponse)
            .isEqualTo(dataExportDestinationCreateResponse)
    }
}
