// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillJobListPageResponseTest {

    @Test
    fun create() {
        val billJobListPageResponse =
            BillJobListPageResponse.builder()
                .addData(
                    BillJobResponse.builder()
                        .id("id")
                        .addAccountId("string")
                        .billDate(LocalDate.parse("2019-12-27"))
                        .billFrequencyInterval(0)
                        .addBillId("string")
                        .billingFrequency(BillJobResponse.BillingFrequency.DAILY)
                        .createdBy("createdBy")
                        .addCurrencyConversion(
                            CurrencyConversion.builder()
                                .from("EUR")
                                .to("USD")
                                .multiplier(1.12)
                                .build()
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
                        .version(0L)
                        .weekEpoch(LocalDate.parse("2019-12-27"))
                        .yearEpoch(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(billJobListPageResponse.data().getOrNull())
            .containsExactly(
                BillJobResponse.builder()
                    .id("id")
                    .addAccountId("string")
                    .billDate(LocalDate.parse("2019-12-27"))
                    .billFrequencyInterval(0)
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
                    .version(0L)
                    .weekEpoch(LocalDate.parse("2019-12-27"))
                    .yearEpoch(LocalDate.parse("2019-12-27"))
                    .build()
            )
        assertThat(billJobListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billJobListPageResponse =
            BillJobListPageResponse.builder()
                .addData(
                    BillJobResponse.builder()
                        .id("id")
                        .addAccountId("string")
                        .billDate(LocalDate.parse("2019-12-27"))
                        .billFrequencyInterval(0)
                        .addBillId("string")
                        .billingFrequency(BillJobResponse.BillingFrequency.DAILY)
                        .createdBy("createdBy")
                        .addCurrencyConversion(
                            CurrencyConversion.builder()
                                .from("EUR")
                                .to("USD")
                                .multiplier(1.12)
                                .build()
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
                        .version(0L)
                        .weekEpoch(LocalDate.parse("2019-12-27"))
                        .yearEpoch(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBillJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billJobListPageResponse),
                jacksonTypeRef<BillJobListPageResponse>(),
            )

        assertThat(roundtrippedBillJobListPageResponse).isEqualTo(billJobListPageResponse)
    }
}
