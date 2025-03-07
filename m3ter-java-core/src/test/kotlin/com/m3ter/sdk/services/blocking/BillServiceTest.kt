// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.BillApproveParams
import com.m3ter.sdk.models.BillDeleteParams
import com.m3ter.sdk.models.BillLatestByAccountParams
import com.m3ter.sdk.models.BillListParams
import com.m3ter.sdk.models.BillLockParams
import com.m3ter.sdk.models.BillRetrieveParams
import com.m3ter.sdk.models.BillSearchParams
import com.m3ter.sdk.models.BillUpdateStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillServiceTest {

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
        val billService = client.bills()

        val billResponse =
            billService.retrieve(BillRetrieveParams.builder().orgId("orgId").id("id").build())

        billResponse.validate()
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
        val billService = client.bills()

        val page = billService.list(BillListParams.builder().orgId("orgId").build())

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
        val billService = client.bills()

        val billResponse =
            billService.delete(BillDeleteParams.builder().orgId("orgId").id("id").build())

        billResponse.validate()
    }

    @Test
    fun approve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billService = client.bills()

        val response =
            billService.approve(
                BillApproveParams.builder()
                    .orgId("orgId")
                    .accountIds("accountIds")
                    .externalInvoiceDateEnd("externalInvoiceDateEnd")
                    .externalInvoiceDateStart("externalInvoiceDateStart")
                    .addBillId("string")
                    .build()
            )

        response.validate()
    }

    @Test
    fun latestByAccount() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billService = client.bills()

        val billResponse =
            billService.latestByAccount(
                BillLatestByAccountParams.builder().orgId("orgId").accountId("accountId").build()
            )

        billResponse.validate()
    }

    @Test
    fun lock() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billService = client.bills()

        val billResponse =
            billService.lock(BillLockParams.builder().orgId("orgId").id("id").build())

        billResponse.validate()
    }

    @Test
    fun search() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billService = client.bills()

        val response =
            billService.search(
                BillSearchParams.builder()
                    .orgId("orgId")
                    .fromDocument(0L)
                    .operator(BillSearchParams.Operator.AND)
                    .pageSize(1L)
                    .searchQuery("searchQuery")
                    .sortBy("sortBy")
                    .sortOrder(BillSearchParams.SortOrder.ASC)
                    .build()
            )

        response.validate()
    }

    @Test
    fun updateStatus() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billService = client.bills()

        val billResponse =
            billService.updateStatus(
                BillUpdateStatusParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .status(BillUpdateStatusParams.Status.PENDING)
                    .build()
            )

        billResponse.validate()
    }
}
