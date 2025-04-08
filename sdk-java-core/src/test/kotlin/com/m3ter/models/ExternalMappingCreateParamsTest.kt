// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingCreateParamsTest {

    @Test
    fun create() {
        ExternalMappingCreateParams.builder()
            .orgId("orgId")
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
            ExternalMappingCreateParams.builder()
                .orgId("orgId")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalMappingCreateParams.builder()
                .orgId("orgId")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .integrationConfigId("integrationConfigId")
                .version(0L)
                .build()

        val body = params._body()

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
            ExternalMappingCreateParams.builder()
                .orgId("orgId")
                .externalId("JS!?Q0]r] ]\$]")
                .externalSystem("JS!?Q0]r] ]\$]")
                .externalTable("JS!?Q0]r] ]\$]")
                .m3terEntity("JS!?Q0]r] ]\$]")
                .m3terId("JS!?Q0]r] ]\$]")
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalSystem()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.externalTable()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terEntity()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.m3terId()).isEqualTo("JS!?Q0]r] ]\$]")
    }
}
