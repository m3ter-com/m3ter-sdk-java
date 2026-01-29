// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleListResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleListResponse =
            BalanceChargeScheduleListResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleListResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleListResponse.CustomFields.builder()
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

        assertThat(balanceChargeScheduleListResponse.id()).isEqualTo("id")
        assertThat(balanceChargeScheduleListResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeScheduleListResponse.amount()).contains(0.0)
        assertThat(balanceChargeScheduleListResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeScheduleListResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeScheduleListResponse.billFrequency())
            .contains(BalanceChargeScheduleListResponse.BillFrequency.DAILY)
        assertThat(balanceChargeScheduleListResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeScheduleListResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeScheduleListResponse.code()).contains("code")
        assertThat(balanceChargeScheduleListResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeScheduleListResponse.currency()).contains("currency")
        assertThat(balanceChargeScheduleListResponse.customFields())
            .contains(
                BalanceChargeScheduleListResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeScheduleListResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balanceChargeScheduleListResponse.name()).contains("name")
        assertThat(balanceChargeScheduleListResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleListResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeScheduleListResponse.units()).contains(0.0)
        assertThat(balanceChargeScheduleListResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleListResponse =
            BalanceChargeScheduleListResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleListResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleListResponse.CustomFields.builder()
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

        val roundtrippedBalanceChargeScheduleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleListResponse),
                jacksonTypeRef<BalanceChargeScheduleListResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleListResponse)
            .isEqualTo(balanceChargeScheduleListResponse)
    }
}
