// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BillLineItemListParams
import com.m3ter.models.BillLineItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LineItemServiceAsyncTest {

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

        val lineItemResponseFuture =
            lineItemServiceAsync.retrieve(
                BillLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        val lineItemResponse = lineItemResponseFuture.get()
        lineItemResponse.validate()
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
