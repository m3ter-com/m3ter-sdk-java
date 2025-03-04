// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataExportDestinationUpdateParamsTest {

    @Test
    fun create() {
        DataExportDestinationUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .bucketName("xxx")
            .code("JS!?Q0]r] ]\$]")
            .iamRoleArn("arn:aws:iam::321669910225:role/z")
            .name("x")
            .partitionOrder(DataExportDestinationUpdateParams.PartitionOrder.TYPE_FIRST)
            .prefix("prefix")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            DataExportDestinationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .partitionOrder(DataExportDestinationUpdateParams.PartitionOrder.TYPE_FIRST)
                .prefix("prefix")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.bucketName()).isEqualTo("xxx")
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.iamRoleArn()).isEqualTo("arn:aws:iam::321669910225:role/z")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.partitionOrder())
            .contains(DataExportDestinationUpdateParams.PartitionOrder.TYPE_FIRST)
        assertThat(body.prefix()).contains("prefix")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataExportDestinationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.bucketName()).isEqualTo("xxx")
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.iamRoleArn()).isEqualTo("arn:aws:iam::321669910225:role/z")
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            DataExportDestinationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .bucketName("xxx")
                .code("JS!?Q0]r] ]\$]")
                .iamRoleArn("arn:aws:iam::321669910225:role/z")
                .name("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
