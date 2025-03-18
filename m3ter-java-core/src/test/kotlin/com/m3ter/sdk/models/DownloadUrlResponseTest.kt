// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DownloadUrlResponseTest {

    @Test
    fun create() {
        val downloadUrlResponse = DownloadUrlResponse.builder().url("url").build()

        assertThat(downloadUrlResponse.url()).contains("url")
    }
}
