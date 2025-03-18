// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillApproveResponseTest {

    @Test
    fun create() {
        val billApproveResponse = BillApproveResponse.builder().message("message").build()

        assertThat(billApproveResponse.message()).contains("message")
    }
}
