// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.PlanTemplateCreateParams
import com.m3ter.sdk.models.PlanTemplateDeleteParams
import com.m3ter.sdk.models.PlanTemplateListParams
import com.m3ter.sdk.models.PlanTemplateRetrieveParams
import com.m3ter.sdk.models.PlanTemplateUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PlanTemplateServiceAsyncTest {

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
        val planTemplateServiceAsync = client.planTemplates()

        val planTemplateFuture =
            planTemplateServiceAsync.create(
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

        val planTemplate = planTemplateFuture.get()
        planTemplate.validate()
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
        val planTemplateServiceAsync = client.planTemplates()

        val planTemplateFuture =
            planTemplateServiceAsync.retrieve(
                PlanTemplateRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val planTemplate = planTemplateFuture.get()
        planTemplate.validate()
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
        val planTemplateServiceAsync = client.planTemplates()

        val planTemplateFuture =
            planTemplateServiceAsync.update(
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

        val planTemplate = planTemplateFuture.get()
        planTemplate.validate()
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
        val planTemplateServiceAsync = client.planTemplates()

        val pageFuture =
            planTemplateServiceAsync.list(PlanTemplateListParams.builder().orgId("orgId").build())

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
        val planTemplateServiceAsync = client.planTemplates()

        val planTemplateFuture =
            planTemplateServiceAsync.delete(
                PlanTemplateDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val planTemplate = planTemplateFuture.get()
        planTemplate.validate()
    }
}
