// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementJobCreateParamsTest {

    @Test
    fun create() {
        StatementStatementJobCreateParams.builder()
            .orgId("orgId")
            .billId("x")
            .includeCsvFormat(true)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = StatementStatementJobCreateParams.builder().billId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StatementStatementJobCreateParams.builder()
                .orgId("orgId")
                .billId("x")
                .includeCsvFormat(true)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.billId()).isEqualTo("x")
        assertThat(body.includeCsvFormat()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = StatementStatementJobCreateParams.builder().billId("x").build()

        val body = params._body()

        assertThat(body.billId()).isEqualTo("x")
    }
}
