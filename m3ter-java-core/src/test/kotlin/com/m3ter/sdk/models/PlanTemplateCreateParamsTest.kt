// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTemplateCreateParamsTest {

    @Test
    fun create() {
        PlanTemplateCreateParams.builder()
            .orgId("orgId")
            .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
            .currency("xxx")
            .name("x")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .standingCharge(0.0)
            .billFrequencyInterval(1L)
            .code("JS!?Q0]r] ]\$]")
            .customFields(
                PlanTemplateCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .minimumSpend(0.0)
            .minimumSpendBillInAdvance(true)
            .minimumSpendDescription("minimumSpendDescription")
            .ordinal(0L)
            .standingChargeBillInAdvance(true)
            .standingChargeDescription("standingChargeDescription")
            .standingChargeInterval(1L)
            .standingChargeOffset(0L)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("xxx")
                .name("x")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .billFrequencyInterval(1L)
                .code("JS!?Q0]r] ]\$]")
                .customFields(
                    PlanTemplateCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimumSpend(0.0)
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("minimumSpendDescription")
                .ordinal(0L)
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("standingChargeDescription")
                .standingChargeInterval(1L)
                .standingChargeOffset(0L)
                .version(0L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.billFrequency()).isEqualTo(PlanTemplateCreateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("xxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
        assertThat(body.billFrequencyInterval()).contains(1L)
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.customFields())
            .contains(
                PlanTemplateCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(body.ordinal()).contains(0L)
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.standingChargeDescription()).contains("standingChargeDescription")
        assertThat(body.standingChargeInterval()).contains(1L)
        assertThat(body.standingChargeOffset()).contains(0L)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("xxx")
                .name("x")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.billFrequency()).isEqualTo(PlanTemplateCreateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("xxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
    }

    @Test
    fun getPathParam() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("xxx")
                .name("x")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
