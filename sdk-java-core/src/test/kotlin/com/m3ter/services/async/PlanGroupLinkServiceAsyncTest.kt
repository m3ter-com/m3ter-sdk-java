// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.PlanGroupLinkCreateParams
import com.m3ter.models.PlanGroupLinkDeleteParams
import com.m3ter.models.PlanGroupLinkRetrieveParams
import com.m3ter.models.PlanGroupLinkUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanGroupLinkServiceAsyncTest {

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
        val planGroupLinkServiceAsync = client.planGroupLinks()

        val planGroupLinkResponseFuture =
            planGroupLinkServiceAsync.create(
                PlanGroupLinkCreateParams.builder()
                    .orgId("orgId")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )

        val planGroupLinkResponse = planGroupLinkResponseFuture.get()
        planGroupLinkResponse.validate()
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
        val planGroupLinkServiceAsync = client.planGroupLinks()

        val planGroupLinkResponseFuture =
            planGroupLinkServiceAsync.retrieve(
                PlanGroupLinkRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val planGroupLinkResponse = planGroupLinkResponseFuture.get()
        planGroupLinkResponse.validate()
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
        val planGroupLinkServiceAsync = client.planGroupLinks()

        val planGroupLinkResponseFuture =
            planGroupLinkServiceAsync.update(
                PlanGroupLinkUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )

        val planGroupLinkResponse = planGroupLinkResponseFuture.get()
        planGroupLinkResponse.validate()
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
        val planGroupLinkServiceAsync = client.planGroupLinks()

        val pageFuture = planGroupLinkServiceAsync.list()

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
        val planGroupLinkServiceAsync = client.planGroupLinks()

        val planGroupLinkResponseFuture =
            planGroupLinkServiceAsync.delete(
                PlanGroupLinkDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val planGroupLinkResponse = planGroupLinkResponseFuture.get()
        planGroupLinkResponse.validate()
    }
}
