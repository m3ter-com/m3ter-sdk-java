// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationCreateParamsTest {

    @Test
    fun create() {
        DataExportDestinationCreateParams.builder()
            .orgId("orgId")
            .body(
                DataExportDestinationS3Request.builder()
                    .bucketName("xxx")
                    .iamRoleArn("arn:aws:iam::321669910225:role/z")
                    .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                    .partitionOrder(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
                    .prefix("prefix")
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataExportDestinationCreateParams.builder()
                .body(
                    DataExportDestinationS3Request.builder()
                        .bucketName("xxx")
                        .iamRoleArn("arn:aws:iam::321669910225:role/z")
                        .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataExportDestinationCreateParams.builder()
                .orgId("orgId")
                .body(
                    DataExportDestinationS3Request.builder()
                        .bucketName("xxx")
                        .iamRoleArn("arn:aws:iam::321669910225:role/z")
                        .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                        .partitionOrder(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
                        .prefix("prefix")
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportDestinationCreateParams.Body.ofDataExportDestinationS3Request(
                    DataExportDestinationS3Request.builder()
                        .bucketName("xxx")
                        .iamRoleArn("arn:aws:iam::321669910225:role/z")
                        .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                        .partitionOrder(DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST)
                        .prefix("prefix")
                        .version(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportDestinationCreateParams.builder()
                .body(
                    DataExportDestinationS3Request.builder()
                        .bucketName("xxx")
                        .iamRoleArn("arn:aws:iam::321669910225:role/z")
                        .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataExportDestinationCreateParams.Body.ofDataExportDestinationS3Request(
                    DataExportDestinationS3Request.builder()
                        .bucketName("xxx")
                        .iamRoleArn("arn:aws:iam::321669910225:role/z")
                        .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                        .build()
                )
            )
    }
}
