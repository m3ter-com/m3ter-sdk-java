// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.BalanceChargeScheduleCreateParams
import com.m3ter.models.BalanceChargeScheduleDeleteParams
import com.m3ter.models.BalanceChargeSchedulePreviewParams
import com.m3ter.models.BalanceChargeScheduleRetrieveParams
import com.m3ter.models.BalanceChargeScheduleUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargeScheduleServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val chargeScheduleFuture =
            chargeScheduleServiceAsync.create(
                BalanceChargeScheduleCreateParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .billFrequency(BalanceChargeScheduleCreateParams.BillFrequency.DAILY)
                    .billFrequencyInterval(1)
                    .billInAdvance(true)
                    .chargeDescription("x")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .currency("currency")
                    .name("x")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amount(0.0)
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .customFields(
                        BalanceChargeScheduleCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )

        val chargeSchedule = chargeScheduleFuture.get()
        chargeSchedule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val chargeScheduleFuture =
            chargeScheduleServiceAsync.retrieve(
                BalanceChargeScheduleRetrieveParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .id("id")
                    .build()
            )

        val chargeSchedule = chargeScheduleFuture.get()
        chargeSchedule.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val chargeScheduleFuture =
            chargeScheduleServiceAsync.update(
                BalanceChargeScheduleUpdateParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .id("id")
                    .billFrequency(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
                    .billFrequencyInterval(1)
                    .billInAdvance(true)
                    .chargeDescription("x")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .currency("currency")
                    .name("x")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amount(0.0)
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .customFields(
                        BalanceChargeScheduleUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )

        val chargeSchedule = chargeScheduleFuture.get()
        chargeSchedule.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val pageFuture = chargeScheduleServiceAsync.list("balanceId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val chargeScheduleFuture =
            chargeScheduleServiceAsync.delete(
                BalanceChargeScheduleDeleteParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .id("id")
                    .build()
            )

        val chargeSchedule = chargeScheduleFuture.get()
        chargeSchedule.validate()
    }

    @Test
    fun preview() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val chargeScheduleServiceAsync = client.balances().chargeSchedules()

        val responseFuture =
            chargeScheduleServiceAsync.preview(
                BalanceChargeSchedulePreviewParams.builder()
                    .orgId("orgId")
                    .balanceId("balanceId")
                    .nextToken("nextToken")
                    .pageSize(1)
                    .billFrequency(BalanceChargeSchedulePreviewParams.BillFrequency.DAILY)
                    .billFrequencyInterval(1)
                    .billInAdvance(true)
                    .chargeDescription("x")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .currency("currency")
                    .name("x")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amount(0.0)
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .customFields(
                        BalanceChargeSchedulePreviewParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
