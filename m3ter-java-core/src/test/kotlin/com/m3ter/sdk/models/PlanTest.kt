// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTest {

    @Test
    fun createPlan() {
        val plan =
            Plan.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .bespoke(true)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    Plan.CustomFields.builder()
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
        assertThat(plan).isNotNull
        assertThat(plan.id()).isEqualTo("id")
        assertThat(plan.version()).isEqualTo(0L)
        assertThat(plan.accountId()).contains("accountId")
        assertThat(plan.bespoke()).contains(true)
        assertThat(plan.code()).contains("code")
        assertThat(plan.createdBy()).contains("createdBy")
        assertThat(plan.customFields())
            .contains(
                Plan.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(plan.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(plan.dtLastModified()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(plan.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(plan.minimumSpend()).contains(0.0)
        assertThat(plan.minimumSpendAccountingProductId())
            .contains("minimumSpendAccountingProductId")
        assertThat(plan.minimumSpendBillInAdvance()).contains(true)
        assertThat(plan.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(plan.name()).contains("name")
        assertThat(plan.ordinal()).contains(0L)
        assertThat(plan.planTemplateId()).contains("planTemplateId")
        assertThat(plan.productId()).contains("productId")
        assertThat(plan.standingCharge()).contains(0.0)
        assertThat(plan.standingChargeAccountingProductId())
            .contains("standingChargeAccountingProductId")
        assertThat(plan.standingChargeBillInAdvance()).contains(true)
        assertThat(plan.standingChargeDescription()).contains("standingChargeDescription")
    }
}
