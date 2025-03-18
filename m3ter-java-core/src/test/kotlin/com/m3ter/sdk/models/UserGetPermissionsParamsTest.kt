// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserGetPermissionsParamsTest {

    @Test
    fun create() {
        UserGetPermissionsParams.builder()
            .orgId("orgId")
            .id("id")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UserGetPermissionsParams.builder()
                .orgId("orgId")
                .id("id")
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
        val params = UserGetPermissionsParams.builder().orgId("orgId").id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = UserGetPermissionsParams.builder().orgId("orgId").id("id").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
