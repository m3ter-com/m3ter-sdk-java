// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.PlanGroupCreateParams
import com.m3ter.models.PlanGroupDeleteParams
import com.m3ter.models.PlanGroupRetrieveParams
import com.m3ter.models.PlanGroupUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanGroupServiceAsyncTest {

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
        val planGroupServiceAsync = client.planGroups()

        val planGroupResponseFuture =
            planGroupServiceAsync.create(
                PlanGroupCreateParams.builder()
                    .orgId("orgId")
                    .currency("xxx")
                    .name("x")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        PlanGroupCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("standingChargeAccountingProductId")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .version(0L)
                    .build()
            )

        val planGroupResponse = planGroupResponseFuture.get()
        planGroupResponse.validate()
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
        val planGroupServiceAsync = client.planGroups()

        val planGroupResponseFuture =
            planGroupServiceAsync.retrieve(
                PlanGroupRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val planGroupResponse = planGroupResponseFuture.get()
        planGroupResponse.validate()
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
        val planGroupServiceAsync = client.planGroups()

        val planGroupResponseFuture =
            planGroupServiceAsync.update(
                PlanGroupUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .currency("xxx")
                    .name("x")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        PlanGroupUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .minimumSpend(0.0)
                    .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("standingChargeAccountingProductId")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .version(0L)
                    .build()
            )

        val planGroupResponse = planGroupResponseFuture.get()
        planGroupResponse.validate()
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
        val planGroupServiceAsync = client.planGroups()

        val pageFuture = planGroupServiceAsync.list()

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
        val planGroupServiceAsync = client.planGroups()

        val planGroupResponseFuture =
            planGroupServiceAsync.delete(
                PlanGroupDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val planGroupResponse = planGroupResponseFuture.get()
        planGroupResponse.validate()
    }
}
