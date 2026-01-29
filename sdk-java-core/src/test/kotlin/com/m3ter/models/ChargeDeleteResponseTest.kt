// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeDeleteResponseTest {

    @Test
    fun create() {
        val chargeDeleteResponse =
            ChargeDeleteResponse.builder()
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
                .entityType(ChargeDeleteResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeDeleteResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        assertThat(chargeDeleteResponse.id()).isEqualTo("id")
        assertThat(chargeDeleteResponse.accountId()).contains("accountId")
        assertThat(chargeDeleteResponse.accountingProductId()).contains("accountingProductId")
        assertThat(chargeDeleteResponse.amount()).contains(0.0)
        assertThat(chargeDeleteResponse.billDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(chargeDeleteResponse.billId()).contains("billId")
        assertThat(chargeDeleteResponse.code()).contains("code")
        assertThat(chargeDeleteResponse.contractId()).contains("contractId")
        assertThat(chargeDeleteResponse.createdBy()).contains("createdBy")
        assertThat(chargeDeleteResponse.currency()).contains("currency")
        assertThat(chargeDeleteResponse.description()).contains("description")
        assertThat(chargeDeleteResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeDeleteResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeDeleteResponse.entityId()).contains("entityId")
        assertThat(chargeDeleteResponse.entityType())
            .contains(ChargeDeleteResponse.EntityType.AD_HOC)
        assertThat(chargeDeleteResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(chargeDeleteResponse.lineItemType())
            .contains(ChargeDeleteResponse.LineItemType.BALANCE_FEE)
        assertThat(chargeDeleteResponse.name()).contains("name")
        assertThat(chargeDeleteResponse.notes()).contains("notes")
        assertThat(chargeDeleteResponse.scheduleId()).contains("scheduleId")
        assertThat(chargeDeleteResponse.servicePeriodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeDeleteResponse.servicePeriodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chargeDeleteResponse.unitPrice()).contains(0.0)
        assertThat(chargeDeleteResponse.units()).contains(0.0)
        assertThat(chargeDeleteResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chargeDeleteResponse =
            ChargeDeleteResponse.builder()
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
                .entityType(ChargeDeleteResponse.EntityType.AD_HOC)
                .lastModifiedBy("lastModifiedBy")
                .lineItemType(ChargeDeleteResponse.LineItemType.BALANCE_FEE)
                .name("name")
                .notes("notes")
                .scheduleId("scheduleId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val roundtrippedChargeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chargeDeleteResponse),
                jacksonTypeRef<ChargeDeleteResponse>(),
            )

        assertThat(roundtrippedChargeDeleteResponse).isEqualTo(chargeDeleteResponse)
    }
}
