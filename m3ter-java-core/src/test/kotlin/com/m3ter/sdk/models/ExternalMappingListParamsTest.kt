// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListParamsTest {

    @Test
    fun create() {
        ExternalMappingListParams.builder()
            .orgId("orgId")
            .externalSystemId("externalSystemId")
            .integrationConfigId("integrationConfigId")
            .addM3terId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalMappingListParams.builder()
                .orgId("orgId")
                .externalSystemId("externalSystemId")
                .integrationConfigId("integrationConfigId")
                .addM3terId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("externalSystemId", "externalSystemId")
                    .put("integrationConfigId", "integrationConfigId")
                    .put("m3terIds", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalMappingListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = ExternalMappingListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
