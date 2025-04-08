// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillJobResponseTest {

    @Test
    fun create() {
        val billJobResponse =
            BillJobResponse.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .billDate(LocalDate.parse("2019-12-27"))
                .billFrequencyInterval(0L)
                .addBillId("string")
                .billingFrequency(BillJobResponse.BillingFrequency.DAILY)
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
                .status(BillJobResponse.Status.PENDING)
                .targetCurrency("targetCurrency")
                .timezone("UTC")
                .total(0L)
                .type(BillJobResponse.Type.CREATE)
                .weekEpoch(LocalDate.parse("2019-12-27"))
                .yearEpoch(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(billJobResponse.id()).isEqualTo("id")
        assertThat(billJobResponse.version()).isEqualTo(0L)
        assertThat(billJobResponse.accountIds().getOrNull()).containsExactly("string")
        assertThat(billJobResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.billFrequencyInterval()).contains(0L)
        assertThat(billJobResponse.billIds().getOrNull()).containsExactly("string")
        assertThat(billJobResponse.billingFrequency())
            .contains(BillJobResponse.BillingFrequency.DAILY)
        assertThat(billJobResponse.createdBy()).contains("createdBy")
        assertThat(billJobResponse.currencyConversions().getOrNull())
            .containsExactly(
                CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
            )
        assertThat(billJobResponse.dayEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billJobResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billJobResponse.dueDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.externalInvoiceDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.lastDateInBillingPeriod())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(billJobResponse.monthEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.pending()).contains(0L)
        assertThat(billJobResponse.status()).contains(BillJobResponse.Status.PENDING)
        assertThat(billJobResponse.targetCurrency()).contains("targetCurrency")
        assertThat(billJobResponse.timezone()).contains("UTC")
        assertThat(billJobResponse.total()).contains(0L)
        assertThat(billJobResponse.type()).contains(BillJobResponse.Type.CREATE)
        assertThat(billJobResponse.weekEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billJobResponse.yearEpoch()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billJobResponse =
            BillJobResponse.builder()
                .id("id")
                .version(0L)
                .addAccountId("string")
                .billDate(LocalDate.parse("2019-12-27"))
                .billFrequencyInterval(0L)
                .addBillId("string")
                .billingFrequency(BillJobResponse.BillingFrequency.DAILY)
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
                .status(BillJobResponse.Status.PENDING)
                .targetCurrency("targetCurrency")
                .timezone("UTC")
                .total(0L)
                .type(BillJobResponse.Type.CREATE)
                .weekEpoch(LocalDate.parse("2019-12-27"))
                .yearEpoch(LocalDate.parse("2019-12-27"))
                .build()

        val roundtrippedBillJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billJobResponse),
                jacksonTypeRef<BillJobResponse>(),
            )

        assertThat(roundtrippedBillJobResponse).isEqualTo(billJobResponse)
    }
}
