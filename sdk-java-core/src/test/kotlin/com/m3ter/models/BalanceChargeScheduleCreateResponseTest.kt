// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleCreateResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleCreateResponse =
            BalanceChargeScheduleCreateResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleCreateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleCreateResponse.CustomFields.builder()
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

        assertThat(balanceChargeScheduleCreateResponse.id()).isEqualTo("id")
        assertThat(balanceChargeScheduleCreateResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeScheduleCreateResponse.amount()).contains(0.0)
        assertThat(balanceChargeScheduleCreateResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeScheduleCreateResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeScheduleCreateResponse.billFrequency())
            .contains(BalanceChargeScheduleCreateResponse.BillFrequency.DAILY)
        assertThat(balanceChargeScheduleCreateResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeScheduleCreateResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeScheduleCreateResponse.code()).contains("code")
        assertThat(balanceChargeScheduleCreateResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeScheduleCreateResponse.currency()).contains("currency")
        assertThat(balanceChargeScheduleCreateResponse.customFields())
            .contains(
                BalanceChargeScheduleCreateResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeScheduleCreateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balanceChargeScheduleCreateResponse.name()).contains("name")
        assertThat(balanceChargeScheduleCreateResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleCreateResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeScheduleCreateResponse.units()).contains(0.0)
        assertThat(balanceChargeScheduleCreateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleCreateResponse =
            BalanceChargeScheduleCreateResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleCreateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleCreateResponse.CustomFields.builder()
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

        val roundtrippedBalanceChargeScheduleCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleCreateResponse),
                jacksonTypeRef<BalanceChargeScheduleCreateResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleCreateResponse)
            .isEqualTo(balanceChargeScheduleCreateResponse)
    }
}
