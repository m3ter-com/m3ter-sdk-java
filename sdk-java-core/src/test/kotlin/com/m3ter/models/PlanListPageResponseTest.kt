// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanListPageResponseTest {

    @Test
    fun create() {
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanResponse.builder()
                        .id("id")
                        .accountId("accountId")
                        .bespoke(true)
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            PlanResponse.CustomFields.builder()
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
                        .ordinal(0L)
                        .planTemplateId("planTemplateId")
                        .productId("productId")
                        .standingCharge(0.0)
                        .standingChargeAccountingProductId("standingChargeAccountingProductId")
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("standingChargeDescription")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(planListPageResponse.data().getOrNull())
            .containsExactly(
                PlanResponse.builder()
                    .id("id")
                    .accountId("accountId")
                    .bespoke(true)
                    .code("code")
                    .createdBy("createdBy")
                    .customFields(
                        PlanResponse.CustomFields.builder()
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
                    .ordinal(0L)
                    .planTemplateId("planTemplateId")
                    .productId("productId")
                    .standingCharge(0.0)
                    .standingChargeAccountingProductId("standingChargeAccountingProductId")
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("standingChargeDescription")
                    .version(0L)
                    .build()
            )
        assertThat(planListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planListPageResponse =
            PlanListPageResponse.builder()
                .addData(
                    PlanResponse.builder()
                        .id("id")
                        .accountId("accountId")
                        .bespoke(true)
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            PlanResponse.CustomFields.builder()
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
                        .ordinal(0L)
                        .planTemplateId("planTemplateId")
                        .productId("productId")
                        .standingCharge(0.0)
                        .standingChargeAccountingProductId("standingChargeAccountingProductId")
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("standingChargeDescription")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedPlanListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planListPageResponse),
                jacksonTypeRef<PlanListPageResponse>(),
            )

        assertThat(roundtrippedPlanListPageResponse).isEqualTo(planListPageResponse)
    }
}
