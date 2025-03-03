// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResourceGroupListPermissionsParamsTest {

    @Test
    fun create() {
        ResourceGroupListPermissionsParams.builder()
            .orgId("orgId")
            .type("type")
            .resourceGroupId("resourceGroupId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ResourceGroupListPermissionsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
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
            ResourceGroupListPermissionsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ResourceGroupListPermissionsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "type"
        assertThat(params.getPathParam(1)).isEqualTo("type")
        // path param "resourceGroupId"
        assertThat(params.getPathParam(2)).isEqualTo("resourceGroupId")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
