// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataRetrieveParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataRetrieveParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .addAdditional("string")
            .limit(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataRetrieveParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("lookupTableRevisionId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupTableLookupTableRevisionDataRetrieveParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addAdditional("string")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("additional", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataRetrieveParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
