// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.AccountPlanCreateParams
import com.m3ter.sdk.models.AccountPlanDeleteParams
import com.m3ter.sdk.models.AccountPlanListParams
import com.m3ter.sdk.models.AccountPlanRetrieveParams
import com.m3ter.sdk.models.AccountPlanUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountPlanServiceAsyncTest {

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
        val accountPlanServiceAsync = client.accountPlans()

        val accountPlanResponseFuture =
            accountPlanServiceAsync.create(
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

        val accountPlanResponse = accountPlanResponseFuture.get()
        accountPlanResponse.validate()
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
        val accountPlanServiceAsync = client.accountPlans()

        val accountPlanResponseFuture =
            accountPlanServiceAsync.retrieve(
                AccountPlanRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val accountPlanResponse = accountPlanResponseFuture.get()
        accountPlanResponse.validate()
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
        val accountPlanServiceAsync = client.accountPlans()

        val accountPlanResponseFuture =
            accountPlanServiceAsync.update(
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

        val accountPlanResponse = accountPlanResponseFuture.get()
        accountPlanResponse.validate()
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
        val accountPlanServiceAsync = client.accountPlans()

        val pageFuture =
            accountPlanServiceAsync.list(AccountPlanListParams.builder().orgId("orgId").build())

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
        val accountPlanServiceAsync = client.accountPlans()

        val accountPlanResponseFuture =
            accountPlanServiceAsync.delete(
                AccountPlanDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val accountPlanResponse = accountPlanResponseFuture.get()
        accountPlanResponse.validate()
    }
}
