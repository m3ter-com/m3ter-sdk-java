// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionScheduleUpdateParamsTest {

    @Test
    fun create() {
        BalanceTransactionScheduleUpdateParams.builder()
            .orgId("orgId")
            .balanceId("balanceId")
            .id("id")
            .scheduleRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceTransactionScheduleUpdateParams.builder()
                .balanceId("balanceId")
                .id("id")
                .scheduleRequest(
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
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("balanceId")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BalanceTransactionScheduleUpdateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .id("id")
                .scheduleRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BalanceTransactionScheduleUpdateParams.builder()
                .balanceId("balanceId")
                .id("id")
                .scheduleRequest(
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .build()
            )
    }
}
