// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataGenerateDownloadUrlParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .contentLength(1L)
            .contentType(
                LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                    .APPLICATION_JSONL
            )
            .fileName("x")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentLength(1L)
                .contentType(
                    LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                        .APPLICATION_JSONL
                )
                .fileName("x")
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
            LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentLength(1L)
                .contentType(
                    LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                        .APPLICATION_JSONL
                )
                .fileName("x")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.contentLength()).isEqualTo(1L)
        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                    .APPLICATION_JSONL
            )
        assertThat(body.fileName()).isEqualTo("x")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .contentLength(1L)
                .contentType(
                    LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                        .APPLICATION_JSONL
                )
                .fileName("x")
                .build()

        val body = params._body()

        assertThat(body.contentLength()).isEqualTo(1L)
        assertThat(body.contentType())
            .isEqualTo(
                LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                    .APPLICATION_JSONL
            )
        assertThat(body.fileName()).isEqualTo("x")
    }
}
