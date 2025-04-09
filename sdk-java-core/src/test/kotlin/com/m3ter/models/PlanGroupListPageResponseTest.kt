// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupListPageResponseTest {

    @Test
    fun create() {
        val planGroupListPageResponse =
            PlanGroupListPageResponse.builder()
                .addData(
                    PlanGroupResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .code("code")
                        .createdBy("createdBy")
                        .currency("currency")
                        .customFields(
                            PlanGroupResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                        .minimumSpendBillInAdvance(true)
                        .minimumSpendDescription("minimumSpendDescription")
                        .name("name")
                        .standingCharge(0.0)
                        .standingChargeAccountingProductId("standingChargeAccountingProductId")
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("standingChargeDescription")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(planGroupListPageResponse.data().getOrNull())
            .containsExactly(
                PlanGroupResponse.builder()
                    .id("id")
                    .version(0L)
                    .accountId("accountId")
                    .code("code")
                    .createdBy("createdBy")
                    .currency("currency")
                    .customFields(
                        PlanGroupResponse.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .minimumSpend(0.0)
                    .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                    .minimumSpendBillInAdvance(true)
                    .minimumSpendDescription("minimumSpendDescription")
                    .name("name")
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("standingChargeAccountingProductId")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .build()
            )
        assertThat(planGroupListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planGroupListPageResponse =
            PlanGroupListPageResponse.builder()
                .addData(
                    PlanGroupResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .code("code")
                        .createdBy("createdBy")
                        .currency("currency")
                        .customFields(
                            PlanGroupResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                        .minimumSpendBillInAdvance(true)
                        .minimumSpendDescription("minimumSpendDescription")
                        .name("name")
                        .standingCharge(0.0)
                        .standingChargeAccountingProductId("standingChargeAccountingProductId")
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("standingChargeDescription")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedPlanGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planGroupListPageResponse),
                jacksonTypeRef<PlanGroupListPageResponse>(),
            )

        assertThat(roundtrippedPlanGroupListPageResponse).isEqualTo(planGroupListPageResponse)
    }
}
