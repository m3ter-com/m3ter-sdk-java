// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
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
    fun pathParams() {
        val params = PricingListParams.builder().orgId("orgId").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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
}
