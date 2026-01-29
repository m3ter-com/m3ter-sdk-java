// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionListParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionListParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionListParams.builder()
                .lookupTableId("lookupTableId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupTableLookupTableRevisionListParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionListParams.builder()
                .lookupTableId("lookupTableId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
