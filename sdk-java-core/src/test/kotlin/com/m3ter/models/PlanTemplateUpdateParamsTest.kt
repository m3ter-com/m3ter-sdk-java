// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanTemplateUpdateParamsTest {

    @Test
    fun create() {
        PlanTemplateUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
            .currency("USD")
            .name("string")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .standingCharge(0.0)
            .billFrequencyInterval(1)
            .code("string")
            .customFields(PlanTemplateUpdateParams.CustomFields.builder().build())
            .minimumSpend(0.0)
            .minimumSpendBillInAdvance(true)
            .minimumSpendDescription("string")
            .ordinal(0L)
            .standingChargeBillInAdvance(true)
            .standingChargeDescription("string")
            .standingChargeInterval(1)
            .standingChargeOffset(364)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanTemplateUpdateParams.builder()
                .id("id")
                .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanTemplateUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .billFrequencyInterval(1)
                .code("string")
                .customFields(PlanTemplateUpdateParams.CustomFields.builder().build())
                .minimumSpend(0.0)
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("string")
                .ordinal(0L)
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("string")
                .standingChargeInterval(1)
                .standingChargeOffset(364)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.billFrequency()).isEqualTo(PlanTemplateUpdateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
        assertThat(body.billFrequencyInterval()).contains(1)
        assertThat(body.code()).contains("string")
        assertThat(body.customFields())
            .contains(PlanTemplateUpdateParams.CustomFields.builder().build())
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("string")
        assertThat(body.ordinal()).contains(0L)
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.standingChargeDescription()).contains("string")
        assertThat(body.standingChargeInterval()).contains(1)
        assertThat(body.standingChargeOffset()).contains(364)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanTemplateUpdateParams.builder()
                .id("id")
                .billFrequency(PlanTemplateUpdateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .build()

        val body = params._body()

        assertThat(body.billFrequency()).isEqualTo(PlanTemplateUpdateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
    }
}
