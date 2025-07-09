// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BillApproveParams
import com.m3ter.models.BillDeleteParams
import com.m3ter.models.BillLatestByAccountParams
import com.m3ter.models.BillLockParams
import com.m3ter.models.BillRetrieveParams
import com.m3ter.models.BillSearchParams
import com.m3ter.models.BillUpdateStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillServiceAsyncTest {

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
        val billServiceAsync = client.bills()

        val billResponseFuture =
            billServiceAsync.retrieve(
                BillRetrieveParams.builder().orgId("orgId").id("id").addAdditional("string").build()
            )

        val billResponse = billResponseFuture.get()
        billResponse.validate()
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
        val billServiceAsync = client.bills()

        val pageFuture = billServiceAsync.list()

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
        val billServiceAsync = client.bills()

        val billResponseFuture =
            billServiceAsync.delete(BillDeleteParams.builder().orgId("orgId").id("id").build())

        val billResponse = billResponseFuture.get()
        billResponse.validate()
    }

    @Test
    fun approve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billServiceAsync = client.bills()

        val responseFuture =
            billServiceAsync.approve(
                BillApproveParams.builder()
                    .orgId("orgId")
                    .accountIds("accountIds")
                    .externalInvoiceDateEnd("externalInvoiceDateEnd")
                    .externalInvoiceDateStart("externalInvoiceDateStart")
                    .addBillId("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun latestByAccount() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billServiceAsync = client.bills()

        val billResponseFuture =
            billServiceAsync.latestByAccount(
                BillLatestByAccountParams.builder()
                    .orgId("orgId")
                    .accountId("accountId")
                    .addAdditional("string")
                    .build()
            )

        val billResponse = billResponseFuture.get()
        billResponse.validate()
    }

    @Test
    fun lock() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billServiceAsync = client.bills()

        val billResponseFuture =
            billServiceAsync.lock(BillLockParams.builder().orgId("orgId").id("id").build())

        val billResponse = billResponseFuture.get()
        billResponse.validate()
    }

    @Test
    fun search() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billServiceAsync = client.bills()

        val responseFuture =
            billServiceAsync.search(
                BillSearchParams.builder()
                    .orgId("orgId")
                    .fromDocument(0)
                    .operator(BillSearchParams.Operator.AND)
                    .pageSize(1)
                    .searchQuery("searchQuery")
                    .sortBy("sortBy")
                    .sortOrder(BillSearchParams.SortOrder.ASC)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateStatus() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billServiceAsync = client.bills()

        val billResponseFuture =
            billServiceAsync.updateStatus(
                BillUpdateStatusParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .status(BillUpdateStatusParams.Status.PENDING)
                    .build()
            )

        val billResponse = billResponseFuture.get()
        billResponse.validate()
    }
}
