// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.PlanGroupCreateParams
import com.m3ter.models.PlanGroupDeleteParams
import com.m3ter.models.PlanGroupRetrieveParams
import com.m3ter.models.PlanGroupUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlanGroupServiceTest {

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
        val planGroupService = client.planGroups()

        val planGroupResponse =
            planGroupService.create(
                PlanGroupCreateParams.builder()
                    .orgId("orgId")
                    .currency("xxx")
                    .name("x")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("S?oC\"\$]C] ]]]]]5]")
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

        planGroupResponse.validate()
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
        val planGroupService = client.planGroups()

        val planGroupResponse =
            planGroupService.retrieve(
                PlanGroupRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        planGroupResponse.validate()
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
        val planGroupService = client.planGroups()

        val planGroupResponse =
            planGroupService.update(
                PlanGroupUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .currency("xxx")
                    .name("x")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("S?oC\"\$]C] ]]]]]5]")
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

        planGroupResponse.validate()
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
        val planGroupService = client.planGroups()

        val page = planGroupService.list()

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
        val planGroupService = client.planGroups()

        val planGroupResponse =
            planGroupService.delete(PlanGroupDeleteParams.builder().orgId("orgId").id("id").build())

        planGroupResponse.validate()
    }
}
