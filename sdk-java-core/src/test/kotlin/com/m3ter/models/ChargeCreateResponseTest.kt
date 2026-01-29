// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeCreateResponseTest {

    @Test
    fun create() {
        val chargeCreateResponse =
            ChargeCreateResponse.builder()
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
                .entityType(ChargeCreateResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeCreateResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        assertThat(chargeCreateResponse.id()).isEqualTo("id")
        assertThat(chargeCreateResponse.accountId()).contains("accountId")
        assertThat(chargeCreateResponse.accountingProductId()).contains("accountingProductId")
        assertThat(chargeCreateResponse.amount()).contains(0.0)
        assertThat(chargeCreateResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(chargeCreateResponse.billId()).contains("billId")
        assertThat(chargeCreateResponse.code()).contains("code")
        assertThat(chargeCreateResponse.contractId()).contains("contractId")
        assertThat(chargeCreateResponse.createdBy()).contains("createdBy")
        assertThat(chargeCreateResponse.currency()).contains("currency")
        assertThat(chargeCreateResponse.description()).contains("description")
        assertThat(chargeCreateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeCreateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeCreateResponse.entityId()).contains("entityId")
        assertThat(chargeCreateResponse.entityType())
            .contains(ChargeCreateResponse.EntityType.AD_HOC)
        assertThat(chargeCreateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(chargeCreateResponse.lineItemType())
            .contains(ChargeCreateResponse.LineItemType.BALANCE_FEE)
        assertThat(chargeCreateResponse.name()).contains("name")
        assertThat(chargeCreateResponse.notes()).contains("notes")
        assertThat(chargeCreateResponse.scheduleId()).contains("scheduleId")
        assertThat(chargeCreateResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeCreateResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeCreateResponse.unitPrice()).contains(0.0)
        assertThat(chargeCreateResponse.units()).contains(0.0)
        assertThat(chargeCreateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeCreateResponse =
            ChargeCreateResponse.builder()
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
                .entityType(ChargeCreateResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeCreateResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val roundtrippedChargeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeCreateResponse),
                jacksonTypeRef<ChargeCreateResponse>(),
            )

        assertThat(roundtrippedChargeCreateResponse).isEqualTo(chargeCreateResponse)
    }
}
