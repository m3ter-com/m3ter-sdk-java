// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountPlanUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.childBillingMode())
            .contains(AccountPlanUpdateParams.ChildBillingMode.PARENT_SUMMARY)
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.contractId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.customFields())
            .contains(
                AccountPlanUpdateParams.CustomFields.builder()
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
            AccountPlanUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            AccountPlanUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
