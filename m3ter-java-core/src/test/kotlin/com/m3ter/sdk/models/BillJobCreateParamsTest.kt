// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillJobCreateParamsTest {

    @Test
    fun create() {
        BillJobCreateParams.builder()
            .orgId("orgId")
            .addAccountId("string")
            .billDate(LocalDate.parse("2019-12-27"))
            .billFrequencyInterval(0L)
            .billingFrequency(BillJobCreateParams.BillingFrequency.DAILY)
            .addCurrencyConversion(
                CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
            )
            .dayEpoch(LocalDate.parse("2019-12-27"))
            .dueDate(LocalDate.parse("2019-12-27"))
            .externalInvoiceDate(LocalDate.parse("2019-12-27"))
            .lastDateInBillingPeriod(LocalDate.parse("2019-12-27"))
            .monthEpoch(LocalDate.parse("2019-12-27"))
            .targetCurrency("xxx")
            .timezone("UTC")
            .version(0L)
            .weekEpoch(LocalDate.parse("2019-12-27"))
            .yearEpoch(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            BillJobCreateParams.builder()
                .orgId("orgId")
                .addAccountId("string")
                .billDate(LocalDate.parse("2019-12-27"))
                .billFrequencyInterval(0L)
                .billingFrequency(BillJobCreateParams.BillingFrequency.DAILY)
                .addCurrencyConversion(
                    CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                )
                .dayEpoch(LocalDate.parse("2019-12-27"))
                .dueDate(LocalDate.parse("2019-12-27"))
                .externalInvoiceDate(LocalDate.parse("2019-12-27"))
                .lastDateInBillingPeriod(LocalDate.parse("2019-12-27"))
                .monthEpoch(LocalDate.parse("2019-12-27"))
                .targetCurrency("xxx")
                .timezone("UTC")
                .version(0L)
                .weekEpoch(LocalDate.parse("2019-12-27"))
                .yearEpoch(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountIds()).contains(listOf("string"))
        assertThat(body.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.billFrequencyInterval()).contains(0L)
        assertThat(body.billingFrequency()).contains(BillJobCreateParams.BillingFrequency.DAILY)
        assertThat(body.currencyConversions())
            .contains(
                listOf(CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build())
            )
        assertThat(body.dayEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.dueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.externalInvoiceDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.lastDateInBillingPeriod()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.monthEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.targetCurrency()).contains("xxx")
        assertThat(body.timezone()).contains("UTC")
        assertThat(body.version()).contains(0L)
        assertThat(body.weekEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.yearEpoch()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillJobCreateParams.builder().orgId("orgId").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = BillJobCreateParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
