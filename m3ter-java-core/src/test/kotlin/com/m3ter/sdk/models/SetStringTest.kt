// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SetStringTest {

    @Test
    fun createSetString() {
        val setString = SetString.builder().empty(true).build()
        assertThat(setString).isNotNull
        assertThat(setString.empty()).contains(true)
    }
}
