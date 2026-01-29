// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionScheduleListPageResponseTest {

    @Test
    fun create() {
        val balanceTransactionScheduleListPageResponse =
            BalanceTransactionScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(balanceTransactionScheduleListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(balanceTransactionScheduleListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceTransactionScheduleListPageResponse =
            BalanceTransactionScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBalanceTransactionScheduleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceTransactionScheduleListPageResponse),
                jacksonTypeRef<BalanceTransactionScheduleListPageResponse>(),
            )

        assertThat(roundtrippedBalanceTransactionScheduleListPageResponse)
            .isEqualTo(balanceTransactionScheduleListPageResponse)
    }
}
