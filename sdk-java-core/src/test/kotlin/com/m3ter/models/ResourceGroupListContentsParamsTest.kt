// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupListContentsParamsTest {

    @Test
    fun create() {
        ResourceGroupListContentsParams.builder()
            .orgId("orgId")
            .type("type")
            .resourceGroupId("resourceGroupId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ResourceGroupListContentsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("type")
        assertThat(params._pathParam(2)).isEqualTo("resourceGroupId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ResourceGroupListContentsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("nextToken", "nextToken").put("pageSize", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ResourceGroupListContentsParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
