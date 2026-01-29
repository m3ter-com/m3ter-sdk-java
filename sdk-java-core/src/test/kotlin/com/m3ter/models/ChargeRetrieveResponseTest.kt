// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeRetrieveResponseTest {

    @Test
    fun create() {
        val chargeRetrieveResponse =
            ChargeRetrieveResponse.builder()
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
                .entityType(ChargeRetrieveResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeRetrieveResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        assertThat(chargeRetrieveResponse.id()).isEqualTo("id")
        assertThat(chargeRetrieveResponse.accountId()).contains("accountId")
        assertThat(chargeRetrieveResponse.accountingProductId()).contains("accountingProductId")
        assertThat(chargeRetrieveResponse.amount()).contains(0.0)
        assertThat(chargeRetrieveResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(chargeRetrieveResponse.billId()).contains("billId")
        assertThat(chargeRetrieveResponse.code()).contains("code")
        assertThat(chargeRetrieveResponse.contractId()).contains("contractId")
        assertThat(chargeRetrieveResponse.createdBy()).contains("createdBy")
        assertThat(chargeRetrieveResponse.currency()).contains("currency")
        assertThat(chargeRetrieveResponse.description()).contains("description")
        assertThat(chargeRetrieveResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeRetrieveResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeRetrieveResponse.entityId()).contains("entityId")
        assertThat(chargeRetrieveResponse.entityType())
            .contains(ChargeRetrieveResponse.EntityType.AD_HOC)
        assertThat(chargeRetrieveResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(chargeRetrieveResponse.lineItemType())
            .contains(ChargeRetrieveResponse.LineItemType.BALANCE_FEE)
        assertThat(chargeRetrieveResponse.name()).contains("name")
        assertThat(chargeRetrieveResponse.notes()).contains("notes")
        assertThat(chargeRetrieveResponse.scheduleId()).contains("scheduleId")
        assertThat(chargeRetrieveResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeRetrieveResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeRetrieveResponse.unitPrice()).contains(0.0)
        assertThat(chargeRetrieveResponse.units()).contains(0.0)
        assertThat(chargeRetrieveResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeRetrieveResponse =
            ChargeRetrieveResponse.builder()
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
                .entityType(ChargeRetrieveResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeRetrieveResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val roundtrippedChargeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeRetrieveResponse),
                jacksonTypeRef<ChargeRetrieveResponse>(),
            )

        assertThat(roundtrippedChargeRetrieveResponse).isEqualTo(chargeRetrieveResponse)
    }
}
