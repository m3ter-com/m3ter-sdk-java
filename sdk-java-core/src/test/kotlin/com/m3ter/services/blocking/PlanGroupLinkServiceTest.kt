// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.PlanGroupLinkCreateParams
import com.m3ter.models.PlanGroupLinkDeleteParams
import com.m3ter.models.PlanGroupLinkRetrieveParams
import com.m3ter.models.PlanGroupLinkUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanGroupLinkServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()

        val planGroupLinkResponse =
            planGroupLinkService.create(
                PlanGroupLinkCreateParams.builder()
                    .orgId("orgId")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )

        planGroupLinkResponse.validate()
    }

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
        val planGroupLinkService = client.planGroupLinks()

        val planGroupLinkResponse =
            planGroupLinkService.retrieve(
                PlanGroupLinkRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        planGroupLinkResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planGroupLinkService = client.planGroupLinks()

        val planGroupLinkResponse =
            planGroupLinkService.update(
                PlanGroupLinkUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )

        planGroupLinkResponse.validate()
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
        val planGroupLinkService = client.planGroupLinks()

        val page = planGroupLinkService.list()

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
        val planGroupLinkService = client.planGroupLinks()

        val planGroupLinkResponse =
            planGroupLinkService.delete(
                PlanGroupLinkDeleteParams.builder().orgId("orgId").id("id").build()
            )

        planGroupLinkResponse.validate()
    }
}
