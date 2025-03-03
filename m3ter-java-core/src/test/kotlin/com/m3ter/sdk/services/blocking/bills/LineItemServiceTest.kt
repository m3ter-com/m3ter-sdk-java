// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.bills

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.BillLineItemListParams
import com.m3ter.sdk.models.BillLineItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LineItemServiceTest {

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
        val lineItemService = client.bills().lineItems()

        val lineItem =
            lineItemService.retrieve(
                BillLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        lineItem.validate()
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
        val lineItemService = client.bills().lineItems()

        val page =
            lineItemService.list(
                BillLineItemListParams.builder().orgId("orgId").billId("billId").build()
            )

        page.response().validate()
    }
}
