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

        val planGroupLink =
            planGroupLinkService.create(
                PlanGroupLinkCreateParams.builder()
                    .orgId("orgId")
                    .planGroupId("x")
                    .planId("x")
                    .version(0L)
                    .build()
            )

        planGroupLink.validate()
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

        val planGroupLink =
            planGroupLinkService.retrieve(
                PlanGroupLinkRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        planGroupLink.validate()
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

        planGroupLink.validate()
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

        val page =
            planGroupLinkService.list(PlanGroupLinkListParams.builder().orgId("orgId").build())

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

        val planGroupLink =
            planGroupLinkService.delete(
                PlanGroupLinkDeleteParams.builder().orgId("orgId").id("id").build()
            )

        planGroupLink.validate()
    }
}
