// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.bills

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.BillDebitLineItemCreateParams
import com.m3ter.sdk.models.BillDebitLineItemDeleteParams
import com.m3ter.sdk.models.BillDebitLineItemListParams
import com.m3ter.sdk.models.BillDebitLineItemRetrieveParams
import com.m3ter.sdk.models.BillDebitLineItemUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DebitLineItemServiceAsyncTest {

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
        val debitLineItemServiceAsync = client.bills().debitLineItems()

        val debitLineItemResponseFuture =
            debitLineItemServiceAsync.create(
                BillDebitLineItemCreateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .debitReasonId("debitReasonId")
                    .lineItemType(BillDebitLineItemCreateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        val debitLineItemResponse = debitLineItemResponseFuture.get()
        debitLineItemResponse.validate()
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
        val debitLineItemServiceAsync = client.bills().debitLineItems()

        val debitLineItemResponseFuture =
            debitLineItemServiceAsync.retrieve(
                BillDebitLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val debitLineItemResponse = debitLineItemResponseFuture.get()
        debitLineItemResponse.validate()
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
        val debitLineItemServiceAsync = client.bills().debitLineItems()

        val debitLineItemResponseFuture =
            debitLineItemServiceAsync.update(
                BillDebitLineItemUpdateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .debitReasonId("debitReasonId")
                    .lineItemType(BillDebitLineItemUpdateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        val debitLineItemResponse = debitLineItemResponseFuture.get()
        debitLineItemResponse.validate()
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
        val debitLineItemServiceAsync = client.bills().debitLineItems()

        val pageFuture =
            debitLineItemServiceAsync.list(
                BillDebitLineItemListParams.builder().orgId("orgId").billId("billId").build()
            )

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
        val debitLineItemServiceAsync = client.bills().debitLineItems()

        val debitLineItemResponseFuture =
            debitLineItemServiceAsync.delete(
                BillDebitLineItemDeleteParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val debitLineItemResponse = debitLineItemResponseFuture.get()
        debitLineItemResponse.validate()
    }
}
