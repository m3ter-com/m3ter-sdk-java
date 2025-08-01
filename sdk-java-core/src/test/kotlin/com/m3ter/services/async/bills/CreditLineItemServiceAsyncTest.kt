// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BillCreditLineItemCreateParams
import com.m3ter.models.BillCreditLineItemDeleteParams
import com.m3ter.models.BillCreditLineItemRetrieveParams
import com.m3ter.models.BillCreditLineItemUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditLineItemServiceAsyncTest {

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
        val creditLineItemServiceAsync = client.bills().creditLineItems()

        val creditLineItemResponseFuture =
            creditLineItemServiceAsync.create(
                BillCreditLineItemCreateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .accountingProductId("accountingProductId")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditReasonId("creditReasonId")
                    .lineItemType(BillCreditLineItemCreateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        val creditLineItemResponse = creditLineItemResponseFuture.get()
        creditLineItemResponse.validate()
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
        val creditLineItemServiceAsync = client.bills().creditLineItems()

        val creditLineItemResponseFuture =
            creditLineItemServiceAsync.retrieve(
                BillCreditLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val creditLineItemResponse = creditLineItemResponseFuture.get()
        creditLineItemResponse.validate()
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
        val creditLineItemServiceAsync = client.bills().creditLineItems()

        val creditLineItemResponseFuture =
            creditLineItemServiceAsync.update(
                BillCreditLineItemUpdateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .accountingProductId("accountingProductId")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditReasonId("creditReasonId")
                    .lineItemType(BillCreditLineItemUpdateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        val creditLineItemResponse = creditLineItemResponseFuture.get()
        creditLineItemResponse.validate()
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
        val creditLineItemServiceAsync = client.bills().creditLineItems()

        val pageFuture = creditLineItemServiceAsync.list("billId")

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
        val creditLineItemServiceAsync = client.bills().creditLineItems()

        val creditLineItemResponseFuture =
            creditLineItemServiceAsync.delete(
                BillCreditLineItemDeleteParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val creditLineItemResponse = creditLineItemResponseFuture.get()
        creditLineItemResponse.validate()
    }
}
