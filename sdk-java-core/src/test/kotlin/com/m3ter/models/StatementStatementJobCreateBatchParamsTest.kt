// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementJobCreateBatchParamsTest {

    @Test
    fun create() {
        StatementStatementJobCreateBatchParams.builder()
            .orgId("orgId")
            .addBillId("string")
            .includeCsvFormat(true)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = StatementStatementJobCreateBatchParams.builder().addBillId("string").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StatementStatementJobCreateBatchParams.builder()
                .orgId("orgId")
                .addBillId("string")
                .includeCsvFormat(true)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
        assertThat(body.includeCsvFormat()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = StatementStatementJobCreateBatchParams.builder().addBillId("string").build()

        val body = params._body()

        assertThat(body.billIds()).containsExactly("string")
    }
}
