// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataDeleteKeyParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataDeleteKeyParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .lookupKey("lookupKey")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataDeleteKeyParams.builder()
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

    @Test
    fun body() {
        val params =
            LookupTableLookupTableRevisionDataDeleteKeyParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataDeleteKeyParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .build()

        val body = params._body()
    }
}
