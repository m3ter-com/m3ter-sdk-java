// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanUpdateParamsTest {

    @Test
    fun create() {
        PlanUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .code("S?oC\"\$]C] ]]]]]5]")
            .name("x")
            .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .bespoke(true)
            .customFields(
                PlanUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .minimumSpend(0.0)
            .minimumSpendAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .minimumSpendBillInAdvance(true)
            .minimumSpendDescription("minimumSpendDescription")
            .ordinal(0L)
            .standingCharge(0.0)
            .standingChargeAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .standingChargeBillInAdvance(true)
            .standingChargeDescription("standingChargeDescription")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanUpdateParams.builder()
                .id("id")
                .code("S?oC\"\$]C] ]]]]]5]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("S?oC\"\$]C] ]]]]]5]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .bespoke(true)
                .customFields(
                    PlanUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimumSpend(0.0)
                .minimumSpendAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("minimumSpendDescription")
                .ordinal(0L)
                .standingCharge(0.0)
                .standingChargeAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("standingChargeDescription")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.planTemplateId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.accountId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.bespoke()).contains(true)
        assertThat(body.customFields())
            .contains(
                PlanUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendAccountingProductId())
            .contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(body.ordinal()).contains(0L)
        assertThat(body.standingCharge()).contains(0.0)
        assertThat(body.standingChargeAccountingProductId())
            .contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.standingChargeDescription()).contains("standingChargeDescription")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanUpdateParams.builder()
                .id("id")
                .code("S?oC\"\$]C] ]]]]]5]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.planTemplateId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    }
}
