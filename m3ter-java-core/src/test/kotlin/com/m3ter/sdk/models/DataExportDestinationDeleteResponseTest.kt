// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationDeleteResponseTest {

    @Test
    fun create() {
        val dataExportDestinationDeleteResponse =
            DataExportDestinationDeleteResponse.builder()
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
                .partitionOrder(DataExportDestinationDeleteResponse.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .build()

        assertThat(dataExportDestinationDeleteResponse.id()).isEqualTo("id")
        assertThat(dataExportDestinationDeleteResponse.version()).isEqualTo(0L)
        assertThat(dataExportDestinationDeleteResponse.code()).contains("code")
        assertThat(dataExportDestinationDeleteResponse.createdBy()).contains("createdBy")
        assertThat(dataExportDestinationDeleteResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationDeleteResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataExportDestinationDeleteResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(dataExportDestinationDeleteResponse.name()).contains("name")
        assertThat(dataExportDestinationDeleteResponse.bucketName()).contains("bucketName")
        assertThat(dataExportDestinationDeleteResponse.iamRoleArn()).contains("iamRoleArn")
        assertThat(dataExportDestinationDeleteResponse.partitionOrder())
            .contains(DataExportDestinationDeleteResponse.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationDeleteResponse.prefix()).contains("prefix")
    }
}
