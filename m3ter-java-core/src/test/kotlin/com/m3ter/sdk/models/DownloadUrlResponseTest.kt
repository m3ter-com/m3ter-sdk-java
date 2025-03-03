// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DownloadUrlResponseTest {

    @Test
    fun createDownloadUrlResponse() {
        val downloadUrlResponse = DownloadUrlResponse.builder().url("url").build()
        assertThat(downloadUrlResponse).isNotNull
        assertThat(downloadUrlResponse.url()).contains("url")
    }
}
