// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.PlanCreateParams
import com.m3ter.models.PlanDeleteParams
import com.m3ter.models.PlanListParams
import com.m3ter.models.PlanRetrieveParams
import com.m3ter.models.PlanUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanServiceTest {

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
        val planService = client.plans()

        val planResponse =
            planService.create(
                PlanCreateParams.builder()
                    .orgId("orgId")
                    .code("JS!?Q0]r] ]\$]")
                    .name("x")
                    .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .bespoke(true)
                    .customFields(
                        PlanCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .ordinal(0L)
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .version(0L)
                    .build()
            )

        planResponse.validate()
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
        val planService = client.plans()

        val planResponse =
            planService.retrieve(PlanRetrieveParams.builder().orgId("orgId").id("id").build())

        planResponse.validate()
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
        val planService = client.plans()

        val planResponse =
            planService.update(
                PlanUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("JS!?Q0]r] ]\$]")
                    .name("x")
                    .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .bespoke(true)
                    .customFields(
                        PlanUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .ordinal(0L)
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .version(0L)
                    .build()
            )

        planResponse.validate()
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
        val planService = client.plans()

        val page = planService.list(PlanListParams.builder().orgId("orgId").build())

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
        val planService = client.plans()

        val planResponse =
            planService.delete(PlanDeleteParams.builder().orgId("orgId").id("id").build())

        planResponse.validate()
    }
}
