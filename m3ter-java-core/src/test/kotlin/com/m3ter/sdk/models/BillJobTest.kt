// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillJobTest {

    @Test
    fun createBillJob() {
        val billJob =
            BillJob.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .billDate(LocalDate.parse("2019-12-27"))
                .billFrequencyInterval(0L)
                .addBillId("string")
                .billingFrequency(BillJob.BillingFrequency.DAILY)
                .createdBy("createdBy")
                .addCurrencyConversion(
                    CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                )
                .dayEpoch(LocalDate.parse("2019-12-27"))
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dueDate(LocalDate.parse("2019-12-27"))
                .externalInvoiceDate(LocalDate.parse("2019-12-27"))
                .lastDateInBillingPeriod(LocalDate.parse("2019-12-27"))
                .lastModifiedBy("lastModifiedBy")
                .monthEpoch(LocalDate.parse("2019-12-27"))
                .pending(0L)
                .status(BillJob.Status.PENDING)
                .targetCurrency("targetCurrency")
                .timezone("UTC")
                .total(0L)
                .type(BillJob.Type.CREATE)
                .weekEpoch(LocalDate.parse("2019-12-27"))
                .yearEpoch(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(billJob).isNotNull
        assertThat(billJob.id()).isEqualTo("id")
        assertThat(billJob.version()).isEqualTo(0L)
        assertThat(billJob.accountIds().get()).containsExactly("string")
        assertThat(billJob.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.billFrequencyInterval()).contains(0L)
        assertThat(billJob.billIds().get()).containsExactly("string")
        assertThat(billJob.billingFrequency()).contains(BillJob.BillingFrequency.DAILY)
        assertThat(billJob.createdBy()).contains("createdBy")
        assertThat(billJob.currencyConversions().get())
            .containsExactly(
                CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
            )
        assertThat(billJob.dayEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billJob.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billJob.dueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.externalInvoiceDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.lastDateInBillingPeriod()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(billJob.monthEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.pending()).contains(0L)
        assertThat(billJob.status()).contains(BillJob.Status.PENDING)
        assertThat(billJob.targetCurrency()).contains("targetCurrency")
        assertThat(billJob.timezone()).contains("UTC")
        assertThat(billJob.total()).contains(0L)
        assertThat(billJob.type()).contains(BillJob.Type.CREATE)
        assertThat(billJob.weekEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJob.yearEpoch()).contains(LocalDate.parse("2019-12-27"))
    }
}
