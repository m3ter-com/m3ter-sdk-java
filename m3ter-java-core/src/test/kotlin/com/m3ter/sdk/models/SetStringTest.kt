// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetStringTest {

    @Test
    fun create() {
        val setString = SetString.builder().empty(true).build()

        assertThat(setString.empty()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setString = SetString.builder().empty(true).build()

        val roundtrippedSetString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setString),
                jacksonTypeRef<SetString>(),
            )

        assertThat(roundtrippedSetString).isEqualTo(setString)
    }
}
