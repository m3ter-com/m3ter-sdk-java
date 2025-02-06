// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanGroupTest {

    @Test
    fun createPlanGroup() {
        val planGroup =
            PlanGroup.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .code("code")
                .createdBy("createdBy")
                .currency("currency")
                .customFields(
                    PlanGroup.CustomFields.builder()
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
        assertThat(planGroup).isNotNull
        assertThat(planGroup.id()).isEqualTo("id")
        assertThat(planGroup.version()).isEqualTo(0L)
        assertThat(planGroup.accountId()).contains("accountId")
        assertThat(planGroup.code()).contains("code")
        assertThat(planGroup.createdBy()).contains("createdBy")
        assertThat(planGroup.currency()).contains("currency")
        assertThat(planGroup.customFields())
            .contains(
                PlanGroup.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(planGroup.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroup.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroup.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planGroup.minimumSpend()).contains(0.0)
        assertThat(planGroup.minimumSpendAccountingProductId())
            .contains("minimumSpendAccountingProductId")
        assertThat(planGroup.minimumSpendBillInAdvance()).contains(true)
        assertThat(planGroup.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(planGroup.name()).contains("name")
        assertThat(planGroup.standingCharge()).contains(0.0)
        assertThat(planGroup.standingChargeAccountingProductId())
            .contains("standingChargeAccountingProductId")
        assertThat(planGroup.standingChargeBillInAdvance()).contains(true)
        assertThat(planGroup.standingChargeDescription()).contains("standingChargeDescription")
    }
}
