// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DownloadUrlResponseTest {

    @Test
    fun create() {
        val downloadUrlResponse = DownloadUrlResponse.builder().url("url").build()

        assertThat(downloadUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val downloadUrlResponse = DownloadUrlResponse.builder().url("url").build()

        val roundtrippedDownloadUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(downloadUrlResponse),
                jacksonTypeRef<DownloadUrlResponse>(),
            )

        assertThat(roundtrippedDownloadUrlResponse).isEqualTo(downloadUrlResponse)
    }
}
