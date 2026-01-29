// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleRetrieveResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleRetrieveResponse =
            BalanceChargeScheduleRetrieveResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleRetrieveResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleRetrieveResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .nextRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .previousRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        assertThat(balanceChargeScheduleRetrieveResponse.id()).isEqualTo("id")
        assertThat(balanceChargeScheduleRetrieveResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeScheduleRetrieveResponse.amount()).contains(0.0)
        assertThat(balanceChargeScheduleRetrieveResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeScheduleRetrieveResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeScheduleRetrieveResponse.billFrequency())
            .contains(BalanceChargeScheduleRetrieveResponse.BillFrequency.DAILY)
        assertThat(balanceChargeScheduleRetrieveResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeScheduleRetrieveResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeScheduleRetrieveResponse.code()).contains("code")
        assertThat(balanceChargeScheduleRetrieveResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeScheduleRetrieveResponse.currency()).contains("currency")
        assertThat(balanceChargeScheduleRetrieveResponse.customFields())
            .contains(
                BalanceChargeScheduleRetrieveResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeScheduleRetrieveResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(balanceChargeScheduleRetrieveResponse.name()).contains("name")
        assertThat(balanceChargeScheduleRetrieveResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleRetrieveResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeScheduleRetrieveResponse.units()).contains(0.0)
        assertThat(balanceChargeScheduleRetrieveResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleRetrieveResponse =
            BalanceChargeScheduleRetrieveResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleRetrieveResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleRetrieveResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .nextRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .previousRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val roundtrippedBalanceChargeScheduleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleRetrieveResponse),
                jacksonTypeRef<BalanceChargeScheduleRetrieveResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleRetrieveResponse)
            .isEqualTo(balanceChargeScheduleRetrieveResponse)
    }
}
