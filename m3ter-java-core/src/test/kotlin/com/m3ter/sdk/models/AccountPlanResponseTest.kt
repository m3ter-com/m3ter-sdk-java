// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPlanResponseTest {

    @Test
    fun create() {
        val accountPlanResponse =
            AccountPlanResponse.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .childBillingMode(AccountPlanResponse.ChildBillingMode.PARENT_SUMMARY)
                .code("code")
                .contractId("contractId")
                .createdBy("createdBy")
                .customFields(
                    AccountPlanResponse.CustomFields.builder()
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

        assertThat(accountPlanResponse.id()).isEqualTo("id")
        assertThat(accountPlanResponse.version()).isEqualTo(0L)
        assertThat(accountPlanResponse.accountId()).contains("accountId")
        assertThat(accountPlanResponse.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(accountPlanResponse.childBillingMode())
            .contains(AccountPlanResponse.ChildBillingMode.PARENT_SUMMARY)
        assertThat(accountPlanResponse.code()).contains("code")
        assertThat(accountPlanResponse.contractId()).contains("contractId")
        assertThat(accountPlanResponse.createdBy()).contains("createdBy")
        assertThat(accountPlanResponse.customFields())
            .contains(
                AccountPlanResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(accountPlanResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlanResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlanResponse.endDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountPlanResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(accountPlanResponse.planGroupId()).contains("planGroupId")
        assertThat(accountPlanResponse.planId()).contains("planId")
        assertThat(accountPlanResponse.productId()).contains("productId")
        assertThat(accountPlanResponse.startDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountPlanResponse =
            AccountPlanResponse.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .billEpoch(LocalDate.parse("2019-12-27"))
                .childBillingMode(AccountPlanResponse.ChildBillingMode.PARENT_SUMMARY)
                .code("code")
                .contractId("contractId")
                .createdBy("createdBy")
                .customFields(
                    AccountPlanResponse.CustomFields.builder()
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

        val roundtrippedAccountPlanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountPlanResponse),
                jacksonTypeRef<AccountPlanResponse>(),
            )

        assertThat(roundtrippedAccountPlanResponse).isEqualTo(accountPlanResponse)
    }
}
