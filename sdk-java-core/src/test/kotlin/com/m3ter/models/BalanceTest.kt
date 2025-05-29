// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceTest {

    @Test
    fun create() {
        val balance =
            Balance.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .amount(0.0)
                .balanceDrawDownDescription("balanceDrawDownDescription")
                .code("code")
                .consumptionsAccountingProductId("consumptionsAccountingProductId")
                .contractId("contractId")
                .createdBy("createdBy")
                .currency("currency")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feesAccountingProductId("feesAccountingProductId")
                .lastModifiedBy("lastModifiedBy")
                .addLineItemType(Balance.LineItemType.STANDING_CHARGE)
                .name("name")
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .rolloverAmount(0.0)
                .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(balance.id()).isEqualTo("id")
        assertThat(balance.version()).isEqualTo(0L)
        assertThat(balance.accountId()).contains("accountId")
        assertThat(balance.amount()).contains(0.0)
        assertThat(balance.balanceDrawDownDescription()).contains("balanceDrawDownDescription")
        assertThat(balance.code()).contains("code")
        assertThat(balance.consumptionsAccountingProductId())
            .contains("consumptionsAccountingProductId")
        assertThat(balance.contractId()).contains("contractId")
        assertThat(balance.createdBy()).contains("createdBy")
        assertThat(balance.currency()).contains("currency")
        assertThat(balance.description()).contains("description")
        assertThat(balance.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.endDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.feesAccountingProductId()).contains("feesAccountingProductId")
        assertThat(balance.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(balance.lineItemTypes().getOrNull())
            .containsExactly(Balance.LineItemType.STANDING_CHARGE)
        assertThat(balance.name()).contains("name")
        assertThat(balance.overageDescription()).contains("overageDescription")
        assertThat(balance.overageSurchargePercent()).contains(0.0)
        assertThat(balance.productIds().getOrNull()).containsExactly("string")
        assertThat(balance.rolloverAmount()).contains(0.0)
        assertThat(balance.rolloverEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(balance.startDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balance =
            Balance.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .amount(0.0)
                .balanceDrawDownDescription("balanceDrawDownDescription")
                .code("code")
                .consumptionsAccountingProductId("consumptionsAccountingProductId")
                .contractId("contractId")
                .createdBy("createdBy")
                .currency("currency")
                .description("description")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .feesAccountingProductId("feesAccountingProductId")
                .lastModifiedBy("lastModifiedBy")
                .addLineItemType(Balance.LineItemType.STANDING_CHARGE)
                .name("name")
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .rolloverAmount(0.0)
                .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBalance =
            jsonMapper.readValue(jsonMapper.writeValueAsString(balance), jacksonTypeRef<Balance>())

        assertThat(roundtrippedBalance).isEqualTo(balance)
    }
}
