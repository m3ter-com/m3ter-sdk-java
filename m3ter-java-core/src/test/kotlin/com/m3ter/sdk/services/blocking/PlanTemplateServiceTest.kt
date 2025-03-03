// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
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
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val planTemplateService = client.planTemplates()

        val planTemplate =
            planTemplateService.create(
                PlanTemplateCreateParams.builder()
                    .orgId("orgId")
                    .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                    .currency("USD")
                    .name("string")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingCharge(0.0)
                    .billFrequencyInterval(1L)
                    .code("string")
                    .customFields(PlanTemplateCreateParams.CustomFields.builder().build())
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("string")
                    .ordinal(0L)
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("string")
                    .standingChargeInterval(1L)
                    .standingChargeOffset(364L)
                    .version(0L)
                    .build()
            )

        planTemplate.validate()
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
        val planTemplateService = client.planTemplates()

        val planTemplate =
            planTemplateService.retrieve(
                PlanTemplateRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        planTemplate.validate()
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
        val planTemplateService = client.planTemplates()

        val planTemplate =
            planTemplateService.update(
                PlanTemplateUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
                    .currency("USD")
                    .name("string")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .standingCharge(0.0)
                    .billFrequencyInterval(1L)
                    .code("string")
                    .customFields(PlanTemplateUpdateParams.CustomFields.builder().build())
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("string")
                    .ordinal(0L)
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("string")
                    .standingChargeInterval(1L)
                    .standingChargeOffset(364L)
                    .version(0L)
                    .build()
            )

        planTemplate.validate()
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
        val planTemplateService = client.planTemplates()

        val page = planTemplateService.list(PlanTemplateListParams.builder().orgId("orgId").build())

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
        val planTemplateService = client.planTemplates()

        val planTemplate =
            planTemplateService.delete(
                PlanTemplateDeleteParams.builder().orgId("orgId").id("id").build()
            )

        planTemplate.validate()
    }
}
