// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingListParamsTest {

    @Test
    fun create() {
        PricingListParams.builder()
            .orgId("orgId")
            .date("date")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1L)
            .planId("planId")
            .planTemplateId("planTemplateId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PricingListParams.builder()
                .orgId("orgId")
                .date("date")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1L)
                .planId("planId")
                .planTemplateId("planTemplateId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date", "date")
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("planId", "planId")
                    .put("planTemplateId", "planTemplateId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PricingListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = PricingListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
