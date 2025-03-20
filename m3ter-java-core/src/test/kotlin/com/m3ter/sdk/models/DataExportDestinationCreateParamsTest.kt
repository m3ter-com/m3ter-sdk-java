// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationCreateParamsTest {

    @Test
    fun create() {
        DataExportDestinationCreateParams.builder()
            .orgId("orgId")
            .bucketName("xxx")
            .code("JS!?Q0]r] ]\$]")
            .iamRoleArn("arn:aws:iam::321669910225:role/z")
            .name("x")
            .partitionOrder(DataExportDestinationCreateParams.PartitionOrder.TYPE_FIRST)
            .prefix("prefix")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataExportDestinationCreateParams.builder()
                .orgId("orgId")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataExportDestinationCreateParams.builder()
                .orgId("orgId")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .partitionOrder(DataExportDestinationCreateParams.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("xxx")
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.iamRoleArn()).isEqualTo("arn:aws:iam::321669910225:role/z")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.partitionOrder())
            .contains(DataExportDestinationCreateParams.PartitionOrder.TYPE_FIRST)
        assertThat(body.prefix()).contains("prefix")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportDestinationCreateParams.builder()
                .orgId("orgId")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.bucketName()).isEqualTo("xxx")
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.iamRoleArn()).isEqualTo("arn:aws:iam::321669910225:role/z")
        assertThat(body.name()).isEqualTo("x")
    }
}
