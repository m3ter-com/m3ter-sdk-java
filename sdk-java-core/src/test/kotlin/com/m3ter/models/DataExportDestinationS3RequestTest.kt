// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationS3RequestTest {

    @Test
    fun create() {
        val dataExportDestinationS3Request =
            DataExportDestinationS3Request.builder()
                .bucketName("xxx")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                .partitionOrder(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .version(0L)
                .build()

        assertThat(dataExportDestinationS3Request.bucketName()).isEqualTo("xxx")
        assertThat(dataExportDestinationS3Request.iamRoleArn())
            .isEqualTo("arn:aws:iam::321669910225:role/z")
        assertThat(dataExportDestinationS3Request.destinationType())
            .contains(DataExportDestinationS3Request.DestinationType.S3)
        assertThat(dataExportDestinationS3Request.partitionOrder())
            .contains(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationS3Request.prefix()).contains("prefix")
        assertThat(dataExportDestinationS3Request.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationS3Request =
            DataExportDestinationS3Request.builder()
                .bucketName("xxx")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                .partitionOrder(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .version(0L)
                .build()

        val roundtrippedDataExportDestinationS3Request =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationS3Request),
                jacksonTypeRef<DataExportDestinationS3Request>(),
            )

        assertThat(roundtrippedDataExportDestinationS3Request)
            .isEqualTo(dataExportDestinationS3Request)
    }
}
