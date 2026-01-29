// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeSchedulePreviewResponseTest {

    @Test
    fun create() {
        val balanceChargeSchedulePreviewResponse =
            BalanceChargeSchedulePreviewResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeSchedulePreviewResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeSchedulePreviewResponse.CustomFields.builder()
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

        assertThat(balanceChargeSchedulePreviewResponse.id()).isEqualTo("id")
        assertThat(balanceChargeSchedulePreviewResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeSchedulePreviewResponse.amount()).contains(0.0)
        assertThat(balanceChargeSchedulePreviewResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeSchedulePreviewResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeSchedulePreviewResponse.billFrequency())
            .contains(BalanceChargeSchedulePreviewResponse.BillFrequency.DAILY)
        assertThat(balanceChargeSchedulePreviewResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeSchedulePreviewResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeSchedulePreviewResponse.code()).contains("code")
        assertThat(balanceChargeSchedulePreviewResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeSchedulePreviewResponse.currency()).contains("currency")
        assertThat(balanceChargeSchedulePreviewResponse.customFields())
            .contains(
                BalanceChargeSchedulePreviewResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeSchedulePreviewResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balanceChargeSchedulePreviewResponse.name()).contains("name")
        assertThat(balanceChargeSchedulePreviewResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeSchedulePreviewResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeSchedulePreviewResponse.units()).contains(0.0)
        assertThat(balanceChargeSchedulePreviewResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeSchedulePreviewResponse =
            BalanceChargeSchedulePreviewResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeSchedulePreviewResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeSchedulePreviewResponse.CustomFields.builder()
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

        val roundtrippedBalanceChargeSchedulePreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeSchedulePreviewResponse),
                jacksonTypeRef<BalanceChargeSchedulePreviewResponse>(),
            )

        assertThat(roundtrippedBalanceChargeSchedulePreviewResponse)
            .isEqualTo(balanceChargeSchedulePreviewResponse)
    }
}
