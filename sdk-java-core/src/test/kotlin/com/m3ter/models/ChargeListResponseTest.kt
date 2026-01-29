// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeListResponseTest {

    @Test
    fun create() {
        val chargeListResponse =
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

        assertThat(chargeListResponse.id()).isEqualTo("id")
        assertThat(chargeListResponse.accountId()).contains("accountId")
        assertThat(chargeListResponse.accountingProductId()).contains("accountingProductId")
        assertThat(chargeListResponse.amount()).contains(0.0)
        assertThat(chargeListResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(chargeListResponse.billId()).contains("billId")
        assertThat(chargeListResponse.code()).contains("code")
        assertThat(chargeListResponse.contractId()).contains("contractId")
        assertThat(chargeListResponse.createdBy()).contains("createdBy")
        assertThat(chargeListResponse.currency()).contains("currency")
        assertThat(chargeListResponse.description()).contains("description")
        assertThat(chargeListResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeListResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeListResponse.entityId()).contains("entityId")
        assertThat(chargeListResponse.entityType()).contains(ChargeListResponse.EntityType.AD_HOC)
        assertThat(chargeListResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(chargeListResponse.lineItemType())
            .contains(ChargeListResponse.LineItemType.BALANCE_FEE)
        assertThat(chargeListResponse.name()).contains("name")
        assertThat(chargeListResponse.notes()).contains("notes")
        assertThat(chargeListResponse.scheduleId()).contains("scheduleId")
        assertThat(chargeListResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeListResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeListResponse.unitPrice()).contains(0.0)
        assertThat(chargeListResponse.units()).contains(0.0)
        assertThat(chargeListResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeListResponse =
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

        val roundtrippedChargeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeListResponse),
                jacksonTypeRef<ChargeListResponse>(),
            )

        assertThat(roundtrippedChargeListResponse).isEqualTo(chargeListResponse)
    }
}
