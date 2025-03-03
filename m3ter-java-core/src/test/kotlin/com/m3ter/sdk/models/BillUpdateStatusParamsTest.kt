// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillUpdateStatusParamsTest {

    @Test
    fun create() {
        BillUpdateStatusParams.builder()
            .orgId("orgId")
            .id("id")
            .status(BillUpdateStatusParams.Status.PENDING)
            .build()
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

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(BillUpdateStatusParams.Status.PENDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BillUpdateStatusParams.builder()
                .orgId("orgId")
                .id("id")
                .status(BillUpdateStatusParams.Status.PENDING)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(BillUpdateStatusParams.Status.PENDING)
    }

    @Test
    fun getPathParam() {
        val params =
            BillUpdateStatusParams.builder()
                .orgId("orgId")
                .id("id")
                .status(BillUpdateStatusParams.Status.PENDING)
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
