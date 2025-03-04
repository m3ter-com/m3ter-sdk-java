// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillApproveResponseTest {

    @Test
    fun createBillApproveResponse() {
        val billApproveResponse = BillApproveResponse.builder().message("message").build()
        assertThat(billApproveResponse).isNotNull
        assertThat(billApproveResponse.message()).contains("message")
    }
}
