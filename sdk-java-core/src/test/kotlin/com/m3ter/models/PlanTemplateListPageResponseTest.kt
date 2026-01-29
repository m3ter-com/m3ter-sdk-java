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
                        .id("string")
                        .billFrequency(PlanTemplateResponse.BillFrequency.DAILY)
                        .billFrequencyInterval(1)
                        .code("string")
                        .createdBy("createdBy")
                        .currency("USD")
                        .customFields(
                            PlanTemplateResponse.CustomFields.builder()
                                .putAdditionalProperty("example1", JsonValue.from(123))
                                .putAdditionalProperty("example2", JsonValue.from("string"))
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendBillInAdvance(false)
                        .minimumSpendDescription("string")
                        .name("string")
                        .ordinal(0L)
                        .productId("string")
                        .standingCharge(0.0)
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("string")
                        .standingChargeInterval(1)
                        .standingChargeOffset(364)
                        .version(1L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(planTemplateListPageResponse.data().getOrNull())
            .containsExactly(
                PlanTemplateResponse.builder()
                    .id("string")
                    .billFrequency(PlanTemplateResponse.BillFrequency.DAILY)
                    .billFrequencyInterval(1)
                    .code("string")
                    .createdBy("createdBy")
                    .currency("USD")
                    .customFields(
                        PlanTemplateResponse.CustomFields.builder()
                            .putAdditionalProperty("example1", JsonValue.from(123))
                            .putAdditionalProperty("example2", JsonValue.from("string"))
                            .build()
                    )
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .minimumSpend(0.0)
                    .minimumSpendBillInAdvance(false)
                    .minimumSpendDescription("string")
                    .name("string")
                    .ordinal(0L)
                    .productId("string")
                    .standingCharge(0.0)
                    .standingChargeBillInAdvance(true)
                    .standingChargeDescription("string")
                    .standingChargeInterval(1)
                    .standingChargeOffset(364)
                    .version(1L)
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
                        .id("string")
                        .billFrequency(PlanTemplateResponse.BillFrequency.DAILY)
                        .billFrequencyInterval(1)
                        .code("string")
                        .createdBy("createdBy")
                        .currency("USD")
                        .customFields(
                            PlanTemplateResponse.CustomFields.builder()
                                .putAdditionalProperty("example1", JsonValue.from(123))
                                .putAdditionalProperty("example2", JsonValue.from("string"))
                                .build()
                        )
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .minimumSpend(0.0)
                        .minimumSpendBillInAdvance(false)
                        .minimumSpendDescription("string")
                        .name("string")
                        .ordinal(0L)
                        .productId("string")
                        .standingCharge(0.0)
                        .standingChargeBillInAdvance(true)
                        .standingChargeDescription("string")
                        .standingChargeInterval(1)
                        .standingChargeOffset(364)
                        .version(1L)
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
