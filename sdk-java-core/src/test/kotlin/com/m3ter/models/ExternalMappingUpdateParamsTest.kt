// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingUpdateParamsTest {

    @Test
    fun create() {
        ExternalMappingUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .externalId("S?oC\"\$]C] ]]]]]5]")
            .externalSystem("S?oC\"\$]C] ]]]]]5]")
            .externalTable("S?oC\"\$]C] ]]]]]5]")
            .m3terEntity("S?oC\"\$]C] ]]]]]5]")
            .m3terId("S?oC\"\$]C] ]]]]]5]")
            .integrationConfigId("integrationConfigId")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalMappingUpdateParams.builder()
                .id("id")
                .externalId("S?oC\"\$]C] ]]]]]5]")
                .externalSystem("S?oC\"\$]C] ]]]]]5]")
                .externalTable("S?oC\"\$]C] ]]]]]5]")
                .m3terEntity("S?oC\"\$]C] ]]]]]5]")
                .m3terId("S?oC\"\$]C] ]]]]]5]")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
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
                .externalId("S?oC\"\$]C] ]]]]]5]")
                .externalSystem("S?oC\"\$]C] ]]]]]5]")
                .externalTable("S?oC\"\$]C] ]]]]]5]")
                .m3terEntity("S?oC\"\$]C] ]]]]]5]")
                .m3terId("S?oC\"\$]C] ]]]]]5]")
                .integrationConfigId("integrationConfigId")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.externalSystem()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.externalTable()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.m3terEntity()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.m3terId()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.integrationConfigId()).contains("integrationConfigId")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExternalMappingUpdateParams.builder()
                .id("id")
                .externalId("S?oC\"\$]C] ]]]]]5]")
                .externalSystem("S?oC\"\$]C] ]]]]]5]")
                .externalTable("S?oC\"\$]C] ]]]]]5]")
                .m3terEntity("S?oC\"\$]C] ]]]]]5]")
                .m3terId("S?oC\"\$]C] ]]]]]5]")
                .build()

        val body = params._body()

        assertThat(body.externalId()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.externalSystem()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.externalTable()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.m3terEntity()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.m3terId()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
    }
}
