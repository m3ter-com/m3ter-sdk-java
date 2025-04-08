// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanResponseTest {

    @Test
    fun create() {
        val planResponse =
            PlanResponse.builder()
                .id("id")
                .version(0L)
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
                .build()

        assertThat(planResponse.id()).isEqualTo("id")
        assertThat(planResponse.version()).isEqualTo(0L)
        assertThat(planResponse.accountId()).contains("accountId")
        assertThat(planResponse.bespoke()).contains(true)
        assertThat(planResponse.code()).contains("code")
        assertThat(planResponse.createdBy()).contains("createdBy")
        assertThat(planResponse.customFields())
            .contains(
                PlanResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planResponse.minimumSpend()).contains(0.0)
        assertThat(planResponse.minimumSpendAccountingProductId())
            .contains("minimumSpendAccountingProductId")
        assertThat(planResponse.minimumSpendBillInAdvance()).contains(true)
        assertThat(planResponse.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(planResponse.name()).contains("name")
        assertThat(planResponse.ordinal()).contains(0L)
        assertThat(planResponse.planTemplateId()).contains("planTemplateId")
        assertThat(planResponse.productId()).contains("productId")
        assertThat(planResponse.standingCharge()).contains(0.0)
        assertThat(planResponse.standingChargeAccountingProductId())
            .contains("standingChargeAccountingProductId")
        assertThat(planResponse.standingChargeBillInAdvance()).contains(true)
        assertThat(planResponse.standingChargeDescription()).contains("standingChargeDescription")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planResponse =
            PlanResponse.builder()
                .id("id")
                .version(0L)
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
                .build()

        val roundtrippedPlanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planResponse),
                jacksonTypeRef<PlanResponse>(),
            )

        assertThat(roundtrippedPlanResponse).isEqualTo(planResponse)
    }
}
