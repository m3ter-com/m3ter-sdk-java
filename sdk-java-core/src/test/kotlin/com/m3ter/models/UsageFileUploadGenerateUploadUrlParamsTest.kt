// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadGenerateUploadUrlParamsTest {

    @Test
    fun create() {
        UsageFileUploadGenerateUploadUrlParams.builder()
            .orgId("orgId")
            .contentLength(1L)
            .contentType(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
            .fileName("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .contentLength(1L)
                .contentType(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
                .fileName("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .orgId("orgId")
                .contentLength(1L)
                .contentType(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
                .fileName("x")
                .build()

        val body = params._body()

        assertThat(body.contentLength()).isEqualTo(1L)
        assertThat(body.contentType())
            .isEqualTo(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
        assertThat(body.fileName()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .contentLength(1L)
                .contentType(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
                .fileName("x")
                .build()

        val body = params._body()

        assertThat(body.contentLength()).isEqualTo(1L)
        assertThat(body.contentType())
            .isEqualTo(UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON)
        assertThat(body.fileName()).isEqualTo("x")
    }
}
