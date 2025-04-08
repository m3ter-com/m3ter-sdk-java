// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BillJobCancelParams
import com.m3ter.models.BillJobCreateParams
import com.m3ter.models.BillJobRecalculateParams
import com.m3ter.models.BillJobRetrieveParams
import com.m3ter.models.CurrencyConversion
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillJobServiceAsyncTest {

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
        val billJobServiceAsync = client.billJobs()

        val billJobResponseFuture =
            billJobServiceAsync.create(
                BillJobCreateParams.builder()
                    .orgId("orgId")
                    .addAccountId("string")
                    .billDate(LocalDate.parse("2019-12-27"))
                    .billFrequencyInterval(0L)
                    .billingFrequency(BillJobCreateParams.BillingFrequency.DAILY)
                    .addCurrencyConversion(
                        CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                    )
                    .dayEpoch(LocalDate.parse("2019-12-27"))
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .externalInvoiceDate(LocalDate.parse("2019-12-27"))
                    .lastDateInBillingPeriod(LocalDate.parse("2019-12-27"))
                    .monthEpoch(LocalDate.parse("2019-12-27"))
                    .targetCurrency("xxx")
                    .timezone("UTC")
                    .version(0L)
                    .weekEpoch(LocalDate.parse("2019-12-27"))
                    .yearEpoch(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val billJobResponse = billJobResponseFuture.get()
        billJobResponse.validate()
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
        val billJobServiceAsync = client.billJobs()

        val billJobResponseFuture =
            billJobServiceAsync.retrieve(
                BillJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val billJobResponse = billJobResponseFuture.get()
        billJobResponse.validate()
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
        val billJobServiceAsync = client.billJobs()

        val pageFuture = billJobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billJobServiceAsync = client.billJobs()

        val billJobResponseFuture =
            billJobServiceAsync.cancel(
                BillJobCancelParams.builder().orgId("orgId").id("id").build()
            )

        val billJobResponse = billJobResponseFuture.get()
        billJobResponse.validate()
    }

    @Test
    fun recalculate() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billJobServiceAsync = client.billJobs()

        val billJobResponseFuture =
            billJobServiceAsync.recalculate(
                BillJobRecalculateParams.builder()
                    .orgId("orgId")
                    .addBillId("string")
                    .version(0L)
                    .build()
            )

        val billJobResponse = billJobResponseFuture.get()
        billJobResponse.validate()
    }
}
