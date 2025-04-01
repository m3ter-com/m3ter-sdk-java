// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationUpdateResponseTest {

    @Test
    fun create() {
        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.builder()
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
                .partitionOrder(DataExportDestinationUpdateResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        assertThat(dataExportDestinationUpdateResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationUpdateResponse.version()).isEqualTo(0L)
        assertThat(dataExportDestinationUpdateResponse.code()).contains("code")
        assertThat(dataExportDestinationUpdateResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationUpdateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestinationUpdateResponse.name()).contains("name")
        assertThat(dataExportDestinationUpdateResponse.bucketName()).contains("bucketName")
        assertThat(dataExportDestinationUpdateResponse.iamRoleArn()).contains("iamRoleArn")
        assertThat(dataExportDestinationUpdateResponse.partitionOrder())
            .contains(DataExportDestinationUpdateResponse.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationUpdateResponse.prefix()).contains("prefix")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.builder()
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
                .partitionOrder(DataExportDestinationUpdateResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        val roundtrippedDataExportDestinationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationUpdateResponse),
                jacksonTypeRef<DataExportDestinationUpdateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationUpdateResponse)
            .isEqualTo(dataExportDestinationUpdateResponse)
    }
}
