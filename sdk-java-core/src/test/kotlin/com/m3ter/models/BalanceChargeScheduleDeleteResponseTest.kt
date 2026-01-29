// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleDeleteResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleDeleteResponse =
            BalanceChargeScheduleDeleteResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleDeleteResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleDeleteResponse.CustomFields.builder()
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

        assertThat(balanceChargeScheduleDeleteResponse.id()).isEqualTo("id")
        assertThat(balanceChargeScheduleDeleteResponse.chargeDescription()).isEqualTo("x")
        assertThat(balanceChargeScheduleDeleteResponse.amount()).contains(0.0)
        assertThat(balanceChargeScheduleDeleteResponse.balanceId()).contains("balanceId")
        assertThat(balanceChargeScheduleDeleteResponse.billEpoch())
            .contains(LocalDate.parse("2019-12-27"))
        assertThat(balanceChargeScheduleDeleteResponse.billFrequency())
            .contains(BalanceChargeScheduleDeleteResponse.BillFrequency.DAILY)
        assertThat(balanceChargeScheduleDeleteResponse.billFrequencyInterval()).contains(0)
        assertThat(balanceChargeScheduleDeleteResponse.billInAdvance()).contains(true)
        assertThat(balanceChargeScheduleDeleteResponse.code()).contains("code")
        assertThat(balanceChargeScheduleDeleteResponse.createdBy()).contains("createdBy")
        assertThat(balanceChargeScheduleDeleteResponse.currency()).contains("currency")
        assertThat(balanceChargeScheduleDeleteResponse.customFields())
            .contains(
                BalanceChargeScheduleDeleteResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(balanceChargeScheduleDeleteResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balanceChargeScheduleDeleteResponse.name()).contains("name")
        assertThat(balanceChargeScheduleDeleteResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balanceChargeScheduleDeleteResponse.unitPrice()).contains(0.0)
        assertThat(balanceChargeScheduleDeleteResponse.units()).contains(0.0)
        assertThat(balanceChargeScheduleDeleteResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleDeleteResponse =
            BalanceChargeScheduleDeleteResponse.builder()
                .id("id")
                .chargeDescription("x")
                .amount(0.0)
                .balanceId("balanceId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billFrequency(BalanceChargeScheduleDeleteResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .billInAdvance(true)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    BalanceChargeScheduleDeleteResponse.CustomFields.builder()
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

        val roundtrippedBalanceChargeScheduleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleDeleteResponse),
                jacksonTypeRef<BalanceChargeScheduleDeleteResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleDeleteResponse)
            .isEqualTo(balanceChargeScheduleDeleteResponse)
    }
}
