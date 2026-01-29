// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeListPageResponseTest {

    @Test
    fun create() {
        val chargeListPageResponse =
            ChargeListPageResponse.builder()
                .addData(
                    ChargeListResponse.builder()
                        .id("id")
                        .accountId("accountId")
                        .accountingProductId("accountingProductId")
                        .amount(0.0)
                        .billDate(LocalDate.parse("2019-12-27"))
                        .billId("billId")
                        .code("code")
                        .contractId("contractId")
                        .createdBy("createdBy")
                        .currency("currency")
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .entityType(ChargeListResponse.EntityType.AD_HOC)
                        .lastModifiedBy("lastModifiedBy")
                        .lineItemType(ChargeListResponse.LineItemType.BALANCE_FEE)
                        .name("name")
                        .notes("notes")
                        .scheduleId("scheduleId")
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .unitPrice(0.0)
                        .units(0.0)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(chargeListPageResponse.data().getOrNull())
            .containsExactly(
                ChargeListResponse.builder()
                    .id("id")
                    .accountId("accountId")
                    .accountingProductId("accountingProductId")
                    .amount(0.0)
                    .billDate(LocalDate.parse("2019-12-27"))
                    .billId("billId")
                    .code("code")
                    .contractId("contractId")
                    .createdBy("createdBy")
                    .currency("currency")
                    .description("description")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .entityId("entityId")
                    .entityType(ChargeListResponse.EntityType.AD_HOC)
                    .lastModifiedBy("lastModifiedBy")
                    .lineItemType(ChargeListResponse.LineItemType.BALANCE_FEE)
                    .name("name")
                    .notes("notes")
                    .scheduleId("scheduleId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )
        assertThat(chargeListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeListPageResponse =
            ChargeListPageResponse.builder()
                .addData(
                    ChargeListResponse.builder()
                        .id("id")
                        .accountId("accountId")
                        .accountingProductId("accountingProductId")
                        .amount(0.0)
                        .billDate(LocalDate.parse("2019-12-27"))
                        .billId("billId")
                        .code("code")
                        .contractId("contractId")
                        .createdBy("createdBy")
                        .currency("currency")
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .entityId("entityId")
                        .entityType(ChargeListResponse.EntityType.AD_HOC)
                        .lastModifiedBy("lastModifiedBy")
                        .lineItemType(ChargeListResponse.LineItemType.BALANCE_FEE)
                        .name("name")
                        .notes("notes")
                        .scheduleId("scheduleId")
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .unitPrice(0.0)
                        .units(0.0)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedChargeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeListPageResponse),
                jacksonTypeRef<ChargeListPageResponse>(),
            )

        assertThat(roundtrippedChargeListPageResponse).isEqualTo(chargeListPageResponse)
    }
}
