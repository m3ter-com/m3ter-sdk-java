// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceListPageResponseTest {

    @Test
    fun create() {
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(balanceListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(balanceListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceListPageResponse =
            BalanceListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedBalanceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceListPageResponse),
                jacksonTypeRef<BalanceListPageResponse>(),
            )

        assertThat(roundtrippedBalanceListPageResponse).isEqualTo(balanceListPageResponse)
    }
}
