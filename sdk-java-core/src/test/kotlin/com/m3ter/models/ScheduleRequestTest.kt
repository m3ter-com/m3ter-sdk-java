// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleRequestTest {

    @Test
    fun create() {
        val scheduleRequest =
            ScheduleRequest.builder()
                .amount(0.0)
                .code("S?oC\"\$]C] ]]]]]5]")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .frequency(ScheduleRequest.Frequency.DAILY)
                .frequencyInterval(1)
                .name("x")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionDescription("x")
                .transactionTypeId("transactionTypeId")
                .currencyPaid("currencyPaid")
                .customFields(
                    ScheduleRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paid(0.0)
                .version(0L)
                .build()

        assertThat(scheduleRequest.amount()).isEqualTo(0.0)
        assertThat(scheduleRequest.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(scheduleRequest.endDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleRequest.frequency()).isEqualTo(ScheduleRequest.Frequency.DAILY)
        assertThat(scheduleRequest.frequencyInterval()).isEqualTo(1)
        assertThat(scheduleRequest.name()).isEqualTo("x")
        assertThat(scheduleRequest.startDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduleRequest.transactionDescription()).isEqualTo("x")
        assertThat(scheduleRequest.transactionTypeId()).isEqualTo("transactionTypeId")
        assertThat(scheduleRequest.currencyPaid()).contains("currencyPaid")
        assertThat(scheduleRequest.customFields())
            .contains(
                ScheduleRequest.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduleRequest.paid()).contains(0.0)
        assertThat(scheduleRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduleRequest =
            ScheduleRequest.builder()
                .amount(0.0)
                .code("S?oC\"\$]C] ]]]]]5]")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .frequency(ScheduleRequest.Frequency.DAILY)
                .frequencyInterval(1)
                .name("x")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionDescription("x")
                .transactionTypeId("transactionTypeId")
                .currencyPaid("currencyPaid")
                .customFields(
                    ScheduleRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paid(0.0)
                .version(0L)
                .build()

        val roundtrippedScheduleRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduleRequest),
                jacksonTypeRef<ScheduleRequest>(),
            )

        assertThat(roundtrippedScheduleRequest).isEqualTo(scheduleRequest)
    }
}
