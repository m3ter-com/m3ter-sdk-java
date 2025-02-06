// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountPlanTest {

    @Test
    fun createAccountPlan() {
        val accountPlan =
            AccountPlan.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .childBillingMode(AccountPlan.ChildBillingMode.PARENT_SUMMARY)
                .code("code")
                .contractId("contractId")
                .createdBy("createdBy")
                .customFields(
                    AccountPlan.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .planGroupId("planGroupId")
                .planId("planId")
                .productId("productId")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(accountPlan).isNotNull
        assertThat(accountPlan.id()).isEqualTo("id")
        assertThat(accountPlan.version()).isEqualTo(0L)
        assertThat(accountPlan.accountId()).contains("accountId")
        assertThat(accountPlan.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(accountPlan.childBillingMode())
            .contains(AccountPlan.ChildBillingMode.PARENT_SUMMARY)
        assertThat(accountPlan.code()).contains("code")
        assertThat(accountPlan.contractId()).contains("contractId")
        assertThat(accountPlan.createdBy()).contains("createdBy")
        assertThat(accountPlan.customFields())
            .contains(
                AccountPlan.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(accountPlan.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlan.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlan.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlan.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(accountPlan.planGroupId()).contains("planGroupId")
        assertThat(accountPlan.planId()).contains("planId")
        assertThat(accountPlan.productId()).contains("productId")
        assertThat(accountPlan.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
