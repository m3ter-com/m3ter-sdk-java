// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingCreateParamsTest {

    @Test
    fun create() {
        ExternalMappingCreateParams.builder()
            .orgId("orgId")
            .externalId("cus_00000000000000")
            .externalSystem("Stripe")
            .externalTable("Customer")
            .m3terEntity("Account")
            .m3terId("00000000-0000-0000-0000-000000000000")
            .integrationConfigId("00000000-0000-0000-0000-000000000000")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalMappingCreateParams.builder()
                .externalId("cus_00000000000000")
                .externalSystem("Stripe")
                .externalTable("Customer")
                .m3terEntity("Account")
                .m3terId("00000000-0000-0000-0000-000000000000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalMappingCreateParams.builder()
                .orgId("orgId")
                .externalId("cus_00000000000000")
                .externalSystem("Stripe")
                .externalTable("Customer")
                .m3terEntity("Account")
                .m3terId("00000000-0000-0000-0000-000000000000")
                .integrationConfigId("00000000-0000-0000-0000-000000000000")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("cus_00000000000000")
        assertThat(body.externalSystem()).isEqualTo("Stripe")
        assertThat(body.externalTable()).isEqualTo("Customer")
        assertThat(body.m3terEntity()).isEqualTo("Account")
        assertThat(body.m3terId()).isEqualTo("00000000-0000-0000-0000-000000000000")
        assertThat(body.integrationConfigId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalMappingCreateParams.builder()
                .externalId("cus_00000000000000")
                .externalSystem("Stripe")
                .externalTable("Customer")
                .m3terEntity("Account")
                .m3terId("00000000-0000-0000-0000-000000000000")
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("cus_00000000000000")
        assertThat(body.externalSystem()).isEqualTo("Stripe")
        assertThat(body.externalTable()).isEqualTo("Customer")
        assertThat(body.m3terEntity()).isEqualTo("Account")
        assertThat(body.m3terId()).isEqualTo("00000000-0000-0000-0000-000000000000")
    }
}
