// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataRetrieveKeyParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataRetrieveKeyParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .lookupKey("lookupKey")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataRetrieveKeyParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("lookupTableRevisionId")
        assertThat(params._pathParam(3)).isEqualTo("lookupKey")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
