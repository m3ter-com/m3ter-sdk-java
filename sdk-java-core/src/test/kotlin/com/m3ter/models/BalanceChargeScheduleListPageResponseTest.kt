// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleListPageResponseTest {

    @Test
    fun create() {
        val balanceChargeScheduleListPageResponse =
            BalanceChargeScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(balanceChargeScheduleListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(balanceChargeScheduleListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChargeScheduleListPageResponse =
            BalanceChargeScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBalanceChargeScheduleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChargeScheduleListPageResponse),
                jacksonTypeRef<BalanceChargeScheduleListPageResponse>(),
            )

        assertThat(roundtrippedBalanceChargeScheduleListPageResponse)
            .isEqualTo(balanceChargeScheduleListPageResponse)
    }
}
