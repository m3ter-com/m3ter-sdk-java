// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillApproveResponseTest {

    @Test
    fun create() {
        val billApproveResponse = BillApproveResponse.builder().message("message").build()

        assertThat(billApproveResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billApproveResponse = BillApproveResponse.builder().message("message").build()

        val roundtrippedBillApproveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billApproveResponse),
                jacksonTypeRef<BillApproveResponse>(),
            )

        assertThat(roundtrippedBillApproveResponse).isEqualTo(billApproveResponse)
    }
}
