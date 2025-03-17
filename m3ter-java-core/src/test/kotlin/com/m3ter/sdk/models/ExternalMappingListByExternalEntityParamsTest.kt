// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListByExternalEntityParamsTest {

    @Test
    fun create() {
        ExternalMappingListByExternalEntityParams.builder()
            .orgId("orgId")
            .system("system")
            .externalTable("externalTable")
            .externalId("externalId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("nextToken", "nextToken")
        expected.put("pageSize", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "system"
        assertThat(params.getPathParam(1)).isEqualTo("system")
        // path param "externalTable"
        assertThat(params.getPathParam(2)).isEqualTo("externalTable")
        // path param "externalId"
        assertThat(params.getPathParam(3)).isEqualTo("externalId")
        // out-of-bound path param
        assertThat(params.getPathParam(4)).isEqualTo("")
    }
}
