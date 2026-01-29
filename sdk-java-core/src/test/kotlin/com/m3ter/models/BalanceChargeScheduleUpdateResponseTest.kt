// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleUpdateResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleUpdateResponse =
            BalanceChargeScheduleUpdateResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleUpdateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleUpdateResponse.CustomFields.builder()
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

        assertThat(balanceChargeScheduleUpdateResponse.id()).isEqualTo("id")
        assertThat(balanceChargeScheduleUpdateResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeScheduleUpdateResponse.amount()).contains(0.0)
        assertThat(balanceChargeScheduleUpdateResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeScheduleUpdateResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeScheduleUpdateResponse.billFrequency())
            .contains(BalanceChargeScheduleUpdateResponse.BillFrequency.DAILY)
        assertThat(balanceChargeScheduleUpdateResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeScheduleUpdateResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeScheduleUpdateResponse.code()).contains("code")
        assertThat(balanceChargeScheduleUpdateResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeScheduleUpdateResponse.currency()).contains("currency")
        assertThat(balanceChargeScheduleUpdateResponse.customFields())
            .contains(
                BalanceChargeScheduleUpdateResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeScheduleUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balanceChargeScheduleUpdateResponse.name()).contains("name")
        assertThat(balanceChargeScheduleUpdateResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleUpdateResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeScheduleUpdateResponse.units()).contains(0.0)
        assertThat(balanceChargeScheduleUpdateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleUpdateResponse =
            BalanceChargeScheduleUpdateResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleUpdateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleUpdateResponse.CustomFields.builder()
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

        val roundtrippedBalanceChargeScheduleUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleUpdateResponse),
                jacksonTypeRef<BalanceChargeScheduleUpdateResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleUpdateResponse)
            .isEqualTo(balanceChargeScheduleUpdateResponse)
    }
}
