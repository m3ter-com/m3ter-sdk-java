// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterAdjustmentUpdateParamsTest {

    @Test
    fun create() {
        CounterAdjustmentUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .accountId("x")
            .counterId("x")
            .date("2022-01-04")
            .value(0L)
            .purchaseOrderNumber("purchaseOrderNumber")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CounterAdjustmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0L)
                .purchaseOrderNumber("purchaseOrderNumber")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.counterId()).isEqualTo("x")
        assertThat(body.date()).isEqualTo("2022-01-04")
        assertThat(body.value()).isEqualTo(0L)
        assertThat(body.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CounterAdjustmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.counterId()).isEqualTo("x")
        assertThat(body.date()).isEqualTo("2022-01-04")
        assertThat(body.value()).isEqualTo(0L)
    }

    @Test
    fun getPathParam() {
        val params =
            CounterAdjustmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("x")
                .counterId("x")
                .date("2022-01-04")
                .value(0L)
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
