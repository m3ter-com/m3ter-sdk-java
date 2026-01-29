// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableListParamsTest {

    @Test
    fun create() {
        LookupTableListParams.builder()
            .orgId("orgId")
            .addAdditional("string")
            .addCode("string")
            .nextToken("nextToken")
            .pageSize(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LookupTableListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupTableListParams.builder()
                .orgId("orgId")
                .addAdditional("string")
                .addCode("string")
                .nextToken("nextToken")
                .pageSize(1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("additional", listOf("string").joinToString(","))
                    .put("codes", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LookupTableListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
