// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPlanCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            AccountPlanCreateParams.builder()
                .orgId("orgId")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.childBillingMode())
            .contains(AccountPlanCreateParams.ChildBillingMode.PARENT_SUMMARY)
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.contractId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.customFields())
            .contains(
                AccountPlanCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.planGroupId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.planId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountPlanCreateParams.builder()
                .orgId("orgId")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
