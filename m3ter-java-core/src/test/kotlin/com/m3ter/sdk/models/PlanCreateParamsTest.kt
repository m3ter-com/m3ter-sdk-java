// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
        PlanCreateParams.builder()
            .orgId("orgId")
            .code("JS!?Q0]r] ]\$]")
            .name("x")
            .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .bespoke(true)
            .customFields(
                PlanCreateParams.CustomFields.builder()
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
    fun body() {
        val params =
            PlanCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .bespoke(true)
                .customFields(
                    PlanCreateParams.CustomFields.builder()
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

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.planTemplateId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.accountId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.bespoke()).contains(true)
        assertThat(body.customFields())
            .contains(
                PlanCreateParams.CustomFields.builder()
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
            PlanCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.planTemplateId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    }

    @Test
    fun getPathParam() {
        val params =
            PlanCreateParams.builder()
                .orgId("orgId")
                .code("JS!?Q0]r] ]\$]")
                .name("x")
                .planTemplateId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
