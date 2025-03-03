// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntegrationConfigurationGetByEntityParamsTest {

    @Test
    fun create() {
        IntegrationConfigurationGetByEntityParams.builder()
            .orgId("orgId")
            .entityType("entityType")
            .entityId("entityId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder()
                .orgId("orgId")
                .entityType("entityType")
                .entityId("entityId")
                .build()
        val expected = QueryParams.builder()
        expected.put("entityId", "entityId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder()
                .orgId("orgId")
                .entityType("entityType")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder()
                .orgId("orgId")
                .entityType("entityType")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "entityType"
        assertThat(params.getPathParam(1)).isEqualTo("entityType")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
