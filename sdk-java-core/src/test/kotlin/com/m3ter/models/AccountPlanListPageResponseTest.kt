// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPlanListPageResponseTest {

    @Test
    fun create() {
        val accountPlanListPageResponse =
            AccountPlanListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(accountPlanListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(accountPlanListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountPlanListPageResponse =
            AccountPlanListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedAccountPlanListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountPlanListPageResponse),
                jacksonTypeRef<AccountPlanListPageResponse>(),
            )

        assertThat(roundtrippedAccountPlanListPageResponse).isEqualTo(accountPlanListPageResponse)
    }
}
