// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingUpdateParamsTest {

    @Test
    fun create() {
        ExternalMappingUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .externalId("JS!?Q0]r] ]\$]")
            .externalSystem("JS!?Q0]r] ]\$]")
            .externalTable("JS!?Q0]r] ]\$]")
            .m3terEntity("JS!?Q0]r] ]\$]")
            .m3terId("JS!?Q0]r] ]\$]")
            .integrationConfigId("integrationConfigId")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalMappingUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalMappingUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .integrationConfigId("integrationConfigId")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.externalId()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalSystem()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalTable()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terEntity()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terId()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.integrationConfigId()).contains("integrationConfigId")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalMappingUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.externalId()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalSystem()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalTable()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terEntity()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terId()).isEqualTo("JS!?Q0]r] ]\$]")
    }
}
