// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadGenerateUploadUrlParamsTest {

    @Test
    fun create() {
        UsageFileUploadGenerateUploadUrlParams.builder()
            .orgId("orgId")
            .contentType("x")
            .fileName("x")
            .contentLength(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder().contentType("x").fileName("x").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .orgId("orgId")
                .contentType("x")
                .fileName("x")
                .contentLength(1L)
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("x")
        assertThat(body.fileName()).isEqualTo("x")
        assertThat(body.contentLength()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder().contentType("x").fileName("x").build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("x")
        assertThat(body.fileName()).isEqualTo("x")
    }
}
