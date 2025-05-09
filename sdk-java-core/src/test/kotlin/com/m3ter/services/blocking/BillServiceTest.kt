// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
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
internal class BillServiceTest {

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

        val page = billService.list()

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
                    .fromDocument(0)
                    .operator(BillSearchParams.Operator.AND)
                    .pageSize(1)
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
