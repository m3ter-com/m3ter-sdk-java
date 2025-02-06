// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTemplateTest {

    @Test
    fun createPlanTemplate() {
        val planTemplate =
            PlanTemplate.builder()
                .id("id")
                .version(0L)
                .billFrequency(PlanTemplate.BillFrequency.DAILY)
                .billFrequencyInterval(0L)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    PlanTemplate.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .minimumSpend(0.0)
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("minimumSpendDescription")
                .name("name")
                .ordinal(0L)
                .productId("productId")
                .standingCharge(0.0)
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("standingChargeDescription")
                .standingChargeInterval(0L)
                .standingChargeOffset(0L)
                .build()
        assertThat(planTemplate).isNotNull
        assertThat(planTemplate.id()).isEqualTo("id")
        assertThat(planTemplate.version()).isEqualTo(0L)
        assertThat(planTemplate.billFrequency()).contains(PlanTemplate.BillFrequency.DAILY)
        assertThat(planTemplate.billFrequencyInterval()).contains(0L)
        assertThat(planTemplate.code()).contains("code")
        assertThat(planTemplate.createdBy()).contains("createdBy")
        assertThat(planTemplate.currency()).contains("currency")
        assertThat(planTemplate.customFields())
            .contains(
                PlanTemplate.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planTemplate.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planTemplate.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planTemplate.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planTemplate.minimumSpend()).contains(0.0)
        assertThat(planTemplate.minimumSpendBillInAdvance()).contains(true)
        assertThat(planTemplate.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(planTemplate.name()).contains("name")
        assertThat(planTemplate.ordinal()).contains(0L)
        assertThat(planTemplate.productId()).contains("productId")
        assertThat(planTemplate.standingCharge()).contains(0.0)
        assertThat(planTemplate.standingChargeBillInAdvance()).contains(true)
        assertThat(planTemplate.standingChargeDescription()).contains("standingChargeDescription")
        assertThat(planTemplate.standingChargeInterval()).contains(0L)
        assertThat(planTemplate.standingChargeOffset()).contains(0L)
    }
}
