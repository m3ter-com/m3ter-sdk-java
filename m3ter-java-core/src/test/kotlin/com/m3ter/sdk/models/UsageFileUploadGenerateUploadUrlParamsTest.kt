// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageFileUploadGenerateUploadUrlParamsTest {

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
    fun body() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .orgId("orgId")
                .contentType("x")
                .fileName("x")
                .contentLength(1L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contentType()).isEqualTo("x")
        assertThat(body.fileName()).isEqualTo("x")
        assertThat(body.contentLength()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .orgId("orgId")
                .contentType("x")
                .fileName("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.contentType()).isEqualTo("x")
        assertThat(body.fileName()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            UsageFileUploadGenerateUploadUrlParams.builder()
                .orgId("orgId")
                .contentType("x")
                .fileName("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
