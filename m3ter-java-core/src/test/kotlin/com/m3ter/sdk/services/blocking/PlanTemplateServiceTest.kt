// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.PlanTemplateCreateParams
import com.m3ter.sdk.models.PlanTemplateDeleteParams
import com.m3ter.sdk.models.PlanTemplateListParams
import com.m3ter.sdk.models.PlanTemplateRetrieveParams
import com.m3ter.sdk.models.PlanTemplateUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanTemplateServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val planTemplateService = client.planTemplates()
        val planTemplate =
            planTemplateService.create(
                PlanTemplateCreateParams.builder()
                    .orgId("orgId")
                    .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                    .currency("xxx")
                    .name("x")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingCharge(0.0)
                    .billFrequencyInterval(1L)
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        PlanTemplateCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .ordinal(0L)
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .standingChargeInterval(1L)
                    .standingChargeOffset(0L)
                    .version(0L)
                    .build()
            )
        println(planTemplate)
        planTemplate.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val planTemplateService = client.planTemplates()
        val planTemplate =
            planTemplateService.retrieve(
                PlanTemplateRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(planTemplate)
        planTemplate.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val planTemplateService = client.planTemplates()
        val planTemplate =
            planTemplateService.update(
                PlanTemplateUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
                    .currency("xxx")
                    .name("x")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingCharge(0.0)
                    .billFrequencyInterval(1L)
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        PlanTemplateUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .ordinal(0L)
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .standingChargeInterval(1L)
                    .standingChargeOffset(0L)
                    .version(0L)
                    .build()
            )
        println(planTemplate)
        planTemplate.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val planTemplateService = client.planTemplates()
        val paginatedDataPlanTemplateResponse =
            planTemplateService.list(PlanTemplateListParams.builder().orgId("orgId").build())
        println(paginatedDataPlanTemplateResponse)
        paginatedDataPlanTemplateResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val planTemplateService = client.planTemplates()
        val planTemplate =
            planTemplateService.delete(
                PlanTemplateDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(planTemplate)
        planTemplate.validate()
    }
}
