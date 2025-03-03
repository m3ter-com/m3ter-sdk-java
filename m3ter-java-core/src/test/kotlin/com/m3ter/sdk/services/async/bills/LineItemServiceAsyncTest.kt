// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.bills

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.BillLineItemListParams
import com.m3ter.sdk.models.BillLineItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceAsyncTest {

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
        val lineItemServiceAsync = client.bills().lineItems()

        val lineItemFuture =
            lineItemServiceAsync.retrieve(
                BillLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val lineItem = lineItemFuture.get()
        lineItem.validate()
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
        val lineItemServiceAsync = client.bills().lineItems()

        val pageFuture =
            lineItemServiceAsync.list(
                BillLineItemListParams.builder().orgId("orgId").billId("billId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
