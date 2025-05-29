// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectUrlResponseTest {

    @Test
    fun create() {
        val objectUrlResponse = ObjectUrlResponse.builder().downloadUrl("downloadUrl").build()

        assertThat(objectUrlResponse.downloadUrl()).contains("downloadUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectUrlResponse = ObjectUrlResponse.builder().downloadUrl("downloadUrl").build()

        val roundtrippedObjectUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectUrlResponse),
                jacksonTypeRef<ObjectUrlResponse>(),
            )

        assertThat(roundtrippedObjectUrlResponse).isEqualTo(objectUrlResponse)
    }
}
