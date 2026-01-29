// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataArchieveParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataArchieveParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .contentType(
                LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataArchieveParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("lookupTableRevisionId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LookupTableLookupTableRevisionDataArchieveParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
                )
                .build()

        val body = params._body()

        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataArchieveParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
                )
                .build()

        val body = params._body()

        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataArchieveParams.ContentType.APPLICATION_JSONL
            )
    }
}
