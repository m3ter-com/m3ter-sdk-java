// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupResponseTest {

    @Test
    fun create() {
        val planGroupResponse =
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

        assertThat(planGroupResponse.id()).isEqualTo("id")
        assertThat(planGroupResponse.version()).isEqualTo(0L)
        assertThat(planGroupResponse.accountId()).contains("accountId")
        assertThat(planGroupResponse.code()).contains("code")
        assertThat(planGroupResponse.createdBy()).contains("createdBy")
        assertThat(planGroupResponse.currency()).contains("currency")
        assertThat(planGroupResponse.customFields())
            .contains(
                PlanGroupResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planGroupResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planGroupResponse.minimumSpend()).contains(0.0)
        assertThat(planGroupResponse.minimumSpendAccountingProductId())
            .contains("minimumSpendAccountingProductId")
        assertThat(planGroupResponse.minimumSpendBillInAdvance()).contains(true)
        assertThat(planGroupResponse.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(planGroupResponse.name()).contains("name")
        assertThat(planGroupResponse.standingCharge()).contains(0.0)
        assertThat(planGroupResponse.standingChargeAccountingProductId())
            .contains("standingChargeAccountingProductId")
        assertThat(planGroupResponse.standingChargeBillInAdvance()).contains(true)
        assertThat(planGroupResponse.standingChargeDescription())
            .contains("standingChargeDescription")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planGroupResponse =
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

        val roundtrippedPlanGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planGroupResponse),
                jacksonTypeRef<PlanGroupResponse>(),
            )

        assertThat(roundtrippedPlanGroupResponse).isEqualTo(planGroupResponse)
    }
}
