// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupCreateParamsTest {

    @Test
    fun create() {
        PlanGroupCreateParams.builder()
            .orgId("orgId")
            .currency("xxx")
            .name("x")
            .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .code("JS!?Q0]r] ]\$]")
            .customFields(
                PlanGroupCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .minimumSpend(0.0)
            .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
            .minimumSpendBillInAdvance(true)
            .minimumSpendDescription("minimumSpendDescription")
            .standingCharge(0.0)
            .standingChargeAccountingProductId("standingChargeAccountingProductId")
            .standingChargeBillInAdvance(true)
            .standingChargeDescription("standingChargeDescription")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanGroupCreateParams.builder().orgId("orgId").currency("xxx").name("x").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanGroupCreateParams.builder()
                .orgId("orgId")
                .currency("xxx")
                .name("x")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .code("JS!?Q0]r] ]\$]")
                .customFields(
                    PlanGroupCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .minimumSpend(0.0)
                .minimumSpendAccountingProductId("minimumSpendAccountingProductId")
                .minimumSpendBillInAdvance(true)
                .minimumSpendDescription("minimumSpendDescription")
                .standingCharge(0.0)
                .standingChargeAccountingProductId("standingChargeAccountingProductId")
                .standingChargeBillInAdvance(true)
                .standingChargeDescription("standingChargeDescription")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.currency()).isEqualTo("xxx")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.accountId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.customFields())
            .contains(
                PlanGroupCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.minimumSpend()).contains(0.0)
        assertThat(body.minimumSpendAccountingProductId())
            .contains("minimumSpendAccountingProductId")
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.minimumSpendDescription()).contains("minimumSpendDescription")
        assertThat(body.standingCharge()).contains(0.0)
        assertThat(body.standingChargeAccountingProductId())
            .contains("standingChargeAccountingProductId")
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.standingChargeDescription()).contains("standingChargeDescription")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanGroupCreateParams.builder().orgId("orgId").currency("xxx").name("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.currency()).isEqualTo("xxx")
        assertThat(body.name()).isEqualTo("x")
    }
}
