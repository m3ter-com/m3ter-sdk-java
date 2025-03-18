// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationRetrieveResponseTest {

    @Test
    fun create() {
        val dataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse.builder()
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
                .partitionOrder(DataExportDestinationRetrieveResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        assertThat(dataExportDestinationRetrieveResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationRetrieveResponse.version()).isEqualTo(0L)
        assertThat(dataExportDestinationRetrieveResponse.code()).contains("code")
        assertThat(dataExportDestinationRetrieveResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationRetrieveResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationRetrieveResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationRetrieveResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(dataExportDestinationRetrieveResponse.name()).contains("name")
        assertThat(dataExportDestinationRetrieveResponse.bucketName()).contains("bucketName")
        assertThat(dataExportDestinationRetrieveResponse.iamRoleArn()).contains("iamRoleArn")
        assertThat(dataExportDestinationRetrieveResponse.partitionOrder())
            .contains(DataExportDestinationRetrieveResponse.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationRetrieveResponse.prefix()).contains("prefix")
    }
}
