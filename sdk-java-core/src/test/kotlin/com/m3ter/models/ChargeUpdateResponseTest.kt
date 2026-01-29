// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeUpdateResponseTest {

    @Test
    fun create() {
        val chargeUpdateResponse =
            ChargeUpdateResponse.builder()
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
                .entityType(ChargeUpdateResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeUpdateResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        assertThat(chargeUpdateResponse.id()).isEqualTo("id")
        assertThat(chargeUpdateResponse.accountId()).contains("accountId")
        assertThat(chargeUpdateResponse.accountingProductId()).contains("accountingProductId")
        assertThat(chargeUpdateResponse.amount()).contains(0.0)
        assertThat(chargeUpdateResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(chargeUpdateResponse.billId()).contains("billId")
        assertThat(chargeUpdateResponse.code()).contains("code")
        assertThat(chargeUpdateResponse.contractId()).contains("contractId")
        assertThat(chargeUpdateResponse.createdBy()).contains("createdBy")
        assertThat(chargeUpdateResponse.currency()).contains("currency")
        assertThat(chargeUpdateResponse.description()).contains("description")
        assertThat(chargeUpdateResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeUpdateResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeUpdateResponse.entityId()).contains("entityId")
        assertThat(chargeUpdateResponse.entityType())
            .contains(ChargeUpdateResponse.EntityType.AD_HOC)
        assertThat(chargeUpdateResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(chargeUpdateResponse.lineItemType())
            .contains(ChargeUpdateResponse.LineItemType.BALANCE_FEE)
        assertThat(chargeUpdateResponse.name()).contains("name")
        assertThat(chargeUpdateResponse.notes()).contains("notes")
        assertThat(chargeUpdateResponse.scheduleId()).contains("scheduleId")
        assertThat(chargeUpdateResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeUpdateResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeUpdateResponse.unitPrice()).contains(0.0)
        assertThat(chargeUpdateResponse.units()).contains(0.0)
        assertThat(chargeUpdateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeUpdateResponse =
            ChargeUpdateResponse.builder()
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
                .entityType(ChargeUpdateResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeUpdateResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val roundtrippedChargeUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeUpdateResponse),
                jacksonTypeRef<ChargeUpdateResponse>(),
            )

        assertThat(roundtrippedChargeUpdateResponse).isEqualTo(chargeUpdateResponse)
    }
}
