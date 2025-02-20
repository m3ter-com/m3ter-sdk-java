// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.PlanGroupLinkCreateParams
import com.m3ter.sdk.models.PlanGroupLinkDeleteParams
import com.m3ter.sdk.models.PlanGroupLinkListParams
import com.m3ter.sdk.models.PlanGroupLinkRetrieveParams
import com.m3ter.sdk.models.PlanGroupLinkUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanGroupLinkServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()
        val planGroupLink =
            planGroupLinkService.create(
                PlanGroupLinkCreateParams.builder()
                    .orgId("orgId")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )
        println(planGroupLink)
        planGroupLink.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()
        val planGroupLink =
            planGroupLinkService.retrieve(
                PlanGroupLinkRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(planGroupLink)
        planGroupLink.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()
        val planGroupLink =
            planGroupLinkService.update(
                PlanGroupLinkUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )
        println(planGroupLink)
        planGroupLink.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()
        val paginatedDataPlanGroupLinkResponse =
            planGroupLinkService.list(PlanGroupLinkListParams.builder().orgId("orgId").build())
        println(paginatedDataPlanGroupLinkResponse)
        paginatedDataPlanGroupLinkResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()
        val planGroupLink =
            planGroupLinkService.delete(
                PlanGroupLinkDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(planGroupLink)
        planGroupLink.validate()
    }
}
