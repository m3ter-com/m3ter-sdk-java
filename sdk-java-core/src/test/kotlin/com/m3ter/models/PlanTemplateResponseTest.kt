// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanTemplateResponseTest {

    @Test
    fun create() {
        val planTemplateResponse =
            PlanTemplateResponse.builder()
                .id("id")
                .billFrequency(PlanTemplateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    PlanTemplateResponse.CustomFields.builder()
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
                .standingChargeInterval(0)
                .standingChargeOffset(0)
                .version(0L)
                .build()

        assertThat(planTemplateResponse.id()).isEqualTo("id")
        assertThat(planTemplateResponse.billFrequency())
            .contains(PlanTemplateResponse.BillFrequency.DAILY)
        assertThat(planTemplateResponse.billFrequencyInterval()).contains(0)
        assertThat(planTemplateResponse.code()).contains("code")
        assertThat(planTemplateResponse.createdBy()).contains("createdBy")
        assertThat(planTemplateResponse.currency()).contains("currency")
        assertThat(planTemplateResponse.customFields())
            .contains(
                PlanTemplateResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planTemplateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planTemplateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planTemplateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planTemplateResponse.minimumSpend()).contains(0.0)
        assertThat(planTemplateResponse.minimumSpendBillInAdvance()).contains(true)
        assertThat(planTemplateResponse.minimumSpendDescription())
            .contains("minimumSpendDescription")
        assertThat(planTemplateResponse.name()).contains("name")
        assertThat(planTemplateResponse.ordinal()).contains(0L)
        assertThat(planTemplateResponse.productId()).contains("productId")
        assertThat(planTemplateResponse.standingCharge()).contains(0.0)
        assertThat(planTemplateResponse.standingChargeBillInAdvance()).contains(true)
        assertThat(planTemplateResponse.standingChargeDescription())
            .contains("standingChargeDescription")
        assertThat(planTemplateResponse.standingChargeInterval()).contains(0)
        assertThat(planTemplateResponse.standingChargeOffset()).contains(0)
        assertThat(planTemplateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planTemplateResponse =
            PlanTemplateResponse.builder()
                .id("id")
                .billFrequency(PlanTemplateResponse.BillFrequency.DAILY)
                .billFrequencyInterval(0)
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    PlanTemplateResponse.CustomFields.builder()
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
                .standingChargeInterval(0)
                .standingChargeOffset(0)
                .version(0L)
                .build()

        val roundtrippedPlanTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planTemplateResponse),
                jacksonTypeRef<PlanTemplateResponse>(),
            )

        assertThat(roundtrippedPlanTemplateResponse).isEqualTo(planTemplateResponse)
    }
}
