// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleResponseTest {

    @Test
    fun create() {
        val scheduleResponse =
            ScheduleResponse.builder()
                .id("id")
                .amount(0.0)
                .balanceId("balanceId")
                .code("code")
                .createdBy("createdBy")
                .currencyPaid("currencyPaid")
                .customFields(
                    ScheduleResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .frequency(ScheduleResponse.Frequency.DAILY)
                .frequencyInterval(0)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .nextRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paid(0.0)
                .previousRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionDescription("transactionDescription")
                .transactionTypeId("transactionTypeId")
                .version(0L)
                .build()

        assertThat(scheduleResponse.id()).isEqualTo("id")
        assertThat(scheduleResponse.amount()).contains(0.0)
        assertThat(scheduleResponse.balanceId()).contains("balanceId")
        assertThat(scheduleResponse.code()).contains("code")
        assertThat(scheduleResponse.createdBy()).contains("createdBy")
        assertThat(scheduleResponse.currencyPaid()).contains("currencyPaid")
        assertThat(scheduleResponse.customFields())
            .contains(
                ScheduleResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduleResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.frequency()).contains(ScheduleResponse.Frequency.DAILY)
        assertThat(scheduleResponse.frequencyInterval()).contains(0)
        assertThat(scheduleResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(scheduleResponse.name()).contains("name")
        assertThat(scheduleResponse.nextRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.paid()).contains(0.0)
        assertThat(scheduleResponse.previousRun())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleResponse.transactionDescription()).contains("transactionDescription")
        assertThat(scheduleResponse.transactionTypeId()).contains("transactionTypeId")
        assertThat(scheduleResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduleResponse =
            ScheduleResponse.builder()
                .id("id")
                .amount(0.0)
                .balanceId("balanceId")
                .code("code")
                .createdBy("createdBy")
                .currencyPaid("currencyPaid")
                .customFields(
                    ScheduleResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .frequency(ScheduleResponse.Frequency.DAILY)
                .frequencyInterval(0)
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .nextRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paid(0.0)
                .previousRun(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionDescription("transactionDescription")
                .transactionTypeId("transactionTypeId")
                .version(0L)
                .build()

        val roundtrippedScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduleResponse),
                jacksonTypeRef<ScheduleResponse>(),
            )

        assertThat(roundtrippedScheduleResponse).isEqualTo(scheduleResponse)
    }
}
