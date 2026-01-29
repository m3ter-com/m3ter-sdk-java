// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .contentType(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                    .ContentType
                    .APPLICATION_JSONL
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                        .ContentType
                        .APPLICATION_JSONL
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
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                        .ContentType
                        .APPLICATION_JSONL
                )
                .build()

        val body = params._body()

        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                    .ContentType
                    .APPLICATION_JSONL
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentType(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                        .ContentType
                        .APPLICATION_JSONL
                )
                .build()

        val body = params._body()

        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                    .ContentType
                    .APPLICATION_JSONL
            )
    }
}
