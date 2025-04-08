// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.AccountPlanCreateParams
import com.m3ter.models.AccountPlanDeleteParams
import com.m3ter.models.AccountPlanRetrieveParams
import com.m3ter.models.AccountPlanUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountPlanServiceTest {

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
        val accountPlanService = client.accountPlans()

        val accountPlanResponse =
            accountPlanService.create(
                AccountPlanCreateParams.builder()
                    .orgId("orgId")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .childBillingMode(AccountPlanCreateParams.ChildBillingMode.PARENT_SUMMARY)
                    .code("JS!?Q0]r] ]\$]")
                    .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .customFields(
                        AccountPlanCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .planGroupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .planId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        accountPlanResponse.validate()
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
        val accountPlanService = client.accountPlans()

        val accountPlanResponse =
            accountPlanService.retrieve(
                AccountPlanRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        accountPlanResponse.validate()
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
        val accountPlanService = client.accountPlans()

        val accountPlanResponse =
            accountPlanService.update(
                AccountPlanUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .childBillingMode(AccountPlanUpdateParams.ChildBillingMode.PARENT_SUMMARY)
                    .code("JS!?Q0]r] ]\$]")
                    .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .customFields(
                        AccountPlanUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .planGroupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .planId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        accountPlanResponse.validate()
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
        val accountPlanService = client.accountPlans()

        val page = accountPlanService.list()

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
        val accountPlanService = client.accountPlans()

        val accountPlanResponse =
            accountPlanService.delete(
                AccountPlanDeleteParams.builder().orgId("orgId").id("id").build()
            )

        accountPlanResponse.validate()
    }
}
