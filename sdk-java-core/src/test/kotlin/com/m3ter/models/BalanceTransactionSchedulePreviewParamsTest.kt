// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTransactionSchedulePreviewParamsTest {

    @Test
    fun create() {
        BalanceTransactionSchedulePreviewParams.builder()
            .orgId("orgId")
            .balanceId("balanceId")
            .nextToken("nextToken")
            .pageSize(1)
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
            BalanceTransactionSchedulePreviewParams.builder()
                .balanceId("balanceId")
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
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BalanceTransactionSchedulePreviewParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .nextToken("nextToken")
                .pageSize(1)
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("nextToken", "nextToken").put("pageSize", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceTransactionSchedulePreviewParams.builder()
                .balanceId("balanceId")
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BalanceTransactionSchedulePreviewParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .nextToken("nextToken")
                .pageSize(1)
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
            BalanceTransactionSchedulePreviewParams.builder()
                .balanceId("balanceId")
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
