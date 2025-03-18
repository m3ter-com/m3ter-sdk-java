// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanTemplateListParamsTest {

    @Test
    fun create() {
        PlanTemplateListParams.builder()
            .orgId("orgId")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .productId("productId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlanTemplateListParams.builder()
                .orgId("orgId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .productId("productId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("productId", "productId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlanTemplateListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = PlanTemplateListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
