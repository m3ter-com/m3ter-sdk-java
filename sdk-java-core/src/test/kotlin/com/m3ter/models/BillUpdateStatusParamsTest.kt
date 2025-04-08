// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillUpdateStatusParamsTest {

    @Test
    fun create() {
        BillUpdateStatusParams.builder()
            .orgId("orgId")
            .id("id")
            .status(BillUpdateStatusParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillUpdateStatusParams.builder()
                .orgId("orgId")
                .id("id")
                .status(BillUpdateStatusParams.Status.PENDING)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BillUpdateStatusParams.builder()
                .orgId("orgId")
                .id("id")
                .status(BillUpdateStatusParams.Status.PENDING)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(BillUpdateStatusParams.Status.PENDING)
    }
}
