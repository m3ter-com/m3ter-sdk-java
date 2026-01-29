// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeCreateParamsTest {

    @Test
    fun create() {
        ChargeCreateParams.builder()
            .orgId("orgId")
            .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .code("S?oC\"\$]C] ]]]]]5]")
            .currency("x")
            .entityType(ChargeCreateParams.EntityType.AD_HOC)
            .lineItemType(ChargeCreateParams.LineItemType.BALANCE_FEE)
            .name("x")
            .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .amount(0.0)
            .billDate("2022-01-04")
            .contractId("contractId")
            .description("description")
            .entityId("entityId")
            .notes("notes")
            .unitPrice(0.0)
            .units(0.0)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChargeCreateParams.builder()
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("x")
                .entityType(ChargeCreateParams.EntityType.AD_HOC)
                .lineItemType(ChargeCreateParams.LineItemType.BALANCE_FEE)
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChargeCreateParams.builder()
                .orgId("orgId")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("x")
                .entityType(ChargeCreateParams.EntityType.AD_HOC)
                .lineItemType(ChargeCreateParams.LineItemType.BALANCE_FEE)
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amount(0.0)
                .billDate("2022-01-04")
                .contractId("contractId")
                .description("description")
                .entityId("entityId")
                .notes("notes")
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.entityType()).isEqualTo(ChargeCreateParams.EntityType.AD_HOC)
        assertThat(body.lineItemType()).isEqualTo(ChargeCreateParams.LineItemType.BALANCE_FEE)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.accountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.amount()).contains(0.0)
        assertThat(body.billDate()).contains("2022-01-04")
        assertThat(body.contractId()).contains("contractId")
        assertThat(body.description()).contains("description")
        assertThat(body.entityId()).contains("entityId")
        assertThat(body.notes()).contains("notes")
        assertThat(body.unitPrice()).contains(0.0)
        assertThat(body.units()).contains(0.0)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChargeCreateParams.builder()
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("x")
                .entityType(ChargeCreateParams.EntityType.AD_HOC)
                .lineItemType(ChargeCreateParams.LineItemType.BALANCE_FEE)
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.entityType()).isEqualTo(ChargeCreateParams.EntityType.AD_HOC)
        assertThat(body.lineItemType()).isEqualTo(ChargeCreateParams.LineItemType.BALANCE_FEE)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
