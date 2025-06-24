// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanTemplateListPageResponseTest {

    @Test
    fun create() {
        val planTemplateListPageResponse =
            PlanTemplateListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(planTemplateListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(planTemplateListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planTemplateListPageResponse =
            PlanTemplateListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedPlanTemplateListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planTemplateListPageResponse),
                jacksonTypeRef<PlanTemplateListPageResponse>(),
            )

        assertThat(roundtrippedPlanTemplateListPageResponse).isEqualTo(planTemplateListPageResponse)
    }
}
