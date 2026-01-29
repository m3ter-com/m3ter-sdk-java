// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.BalanceTransactionScheduleCreateParams
import com.m3ter.models.BalanceTransactionScheduleDeleteParams
import com.m3ter.models.BalanceTransactionSchedulePreviewParams
import com.m3ter.models.BalanceTransactionScheduleRetrieveParams
import com.m3ter.models.BalanceTransactionScheduleUpdateParams
import com.m3ter.models.ScheduleRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionScheduleServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val scheduleResponse =
            transactionScheduleService.create(
                BalanceTransactionScheduleCreateParams.builder()
                    .orgId("orgId")
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
            )

        scheduleResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val scheduleResponse =
            transactionScheduleService.retrieve(
                BalanceTransactionScheduleRetrieveParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .id("id")
                    .build()
            )

        scheduleResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val scheduleResponse =
            transactionScheduleService.update(
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
            )

        scheduleResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val page = transactionScheduleService.list("balanceId")

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val scheduleResponse =
            transactionScheduleService.delete(
                BalanceTransactionScheduleDeleteParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .id("id")
                    .build()
            )

        scheduleResponse.validate()
    }

    @Test
    fun preview() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val transactionScheduleService = client.balances().transactionSchedules()

        val scheduleResponse =
            transactionScheduleService.preview(
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
            )

        scheduleResponse.validate()
    }
}
