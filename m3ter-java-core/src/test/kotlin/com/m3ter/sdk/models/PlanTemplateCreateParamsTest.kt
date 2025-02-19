// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanTemplateCreateParamsTest {

    @Test
    fun create() {
        PlanTemplateCreateParams.builder()
            .orgId("orgId")
            .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
            .currency("USD")
            .name("string")
            .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .standingCharge(0.0)
            .billFrequencyInterval(1L)
            .code("string")
            .customFields(PlanTemplateCreateParams.CustomFields.builder().build())
            .minimumSpend(0.0)
            .minimumSpendBillInAdvance(true)
            .minimumSpendDescription("string")
            .ordinal(0L)
            .standingChargeBillInAdvance(true)
            .standingChargeDescription("string")
            .standingChargeInterval(1L)
            .standingChargeOffset(364L)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .billFrequencyInterval(1L)
                .code("string")
                .customFields(PlanTemplateCreateParams.CustomFields.builder().build())
                .minimumSpend(0.0)
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("string")
                .ordinal(0L)
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("string")
                .standingChargeInterval(1L)
                .standingChargeOffset(364L)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.billFrequency()).isEqualTo(PlanTemplateCreateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
        assertThat(body.billFrequencyInterval()).contains(1L)
        assertThat(body.code()).contains("string")
        assertThat(body.customFields())
            .contains(PlanTemplateCreateParams.CustomFields.builder().build())
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("string")
        assertThat(body.ordinal()).contains(0L)
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.standingChargeDescription()).contains("string")
        assertThat(body.standingChargeInterval()).contains(1L)
        assertThat(body.standingChargeOffset()).contains(364L)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
                .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .standingCharge(0.0)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.billFrequency()).isEqualTo(PlanTemplateCreateParams.BillFrequency.DAILY)
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.productId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.standingCharge()).isEqualTo(0.0)
    }

    @Test
    fun getPathParam() {
        val params =
            PlanTemplateCreateParams.builder()
                .orgId("orgId")
                .billFrequency(PlanTemplateCreateParams.BillFrequency.DAILY)
                .currency("USD")
                .name("string")
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
