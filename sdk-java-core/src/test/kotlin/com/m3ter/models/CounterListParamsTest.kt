// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterListParamsTest {

    @Test
    fun create() {
        CounterListParams.builder()
            .orgId("orgId")
            .addCode("string")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1)
            .addProductId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CounterListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CounterListParams.builder()
                .orgId("orgId")
                .addCode("string")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1)
                .addProductId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("codes", listOf("string").joinToString(","))
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("productId", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CounterListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
