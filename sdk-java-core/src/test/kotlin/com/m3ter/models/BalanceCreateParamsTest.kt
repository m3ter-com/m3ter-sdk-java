// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceCreateParamsTest {

    @Test
    fun create() {
        BalanceCreateParams.builder()
            .orgId("orgId")
            .accountId("x")
            .currency("x")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .balanceDrawDownDescription("balanceDrawDownDescription")
            .code("JS!?Q0]r] ]\$]")
            .consumptionsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .description("description")
            .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .addLineItemType(BalanceCreateParams.LineItemType.STANDING_CHARGE)
            .name("name")
            .overageDescription("overageDescription")
            .overageSurchargePercent(0.0)
            .addProductId("string")
            .rolloverAmount(0.0)
            .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceCreateParams.builder()
                .accountId("x")
                .currency("x")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BalanceCreateParams.builder()
                .orgId("orgId")
                .accountId("x")
                .currency("x")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .balanceDrawDownDescription("balanceDrawDownDescription")
                .code("JS!?Q0]r] ]\$]")
                .consumptionsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .description("description")
                .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addLineItemType(BalanceCreateParams.LineItemType.STANDING_CHARGE)
                .name("name")
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .rolloverAmount(0.0)
                .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.balanceDrawDownDescription()).contains("balanceDrawDownDescription")
        assertThat(body.code()).contains("JS!?Q0]r] ]\$]")
        assertThat(body.consumptionsAccountingProductId())
            .contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.description()).contains("description")
        assertThat(body.feesAccountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.lineItemTypes().getOrNull())
            .containsExactly(BalanceCreateParams.LineItemType.STANDING_CHARGE)
        assertThat(body.name()).contains("name")
        assertThat(body.overageDescription()).contains("overageDescription")
        assertThat(body.overageSurchargePercent()).contains(0.0)
        assertThat(body.productIds().getOrNull()).containsExactly("string")
        assertThat(body.rolloverAmount()).contains(0.0)
        assertThat(body.rolloverEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BalanceCreateParams.builder()
                .accountId("x")
                .currency("x")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
