// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentCreateParamsTest {

    @Test
    fun create() {
        CounterAdjustmentCreateParams.builder()
            .orgId("orgId")
            .accountId("x")
            .counterId("x")
            .date("2022-01-04")
            .value(0)
            .purchaseOrderNumber("purchaseOrderNumber")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CounterAdjustmentCreateParams.builder()
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterAdjustmentCreateParams.builder()
                .orgId("orgId")
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0)
                .purchaseOrderNumber("purchaseOrderNumber")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.counterId()).isEqualTo("x")
        assertThat(body.date()).isEqualTo("2022-01-04")
        assertThat(body.value()).isEqualTo(0)
        assertThat(body.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CounterAdjustmentCreateParams.builder()
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.counterId()).isEqualTo("x")
        assertThat(body.date()).isEqualTo("2022-01-04")
        assertThat(body.value()).isEqualTo(0)
    }
}
