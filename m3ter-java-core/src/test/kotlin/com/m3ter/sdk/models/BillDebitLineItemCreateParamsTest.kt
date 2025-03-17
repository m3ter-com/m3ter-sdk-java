// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillDebitLineItemCreateParamsTest {

    @Test
    fun create() {
        BillDebitLineItemCreateParams.builder()
            .orgId("orgId")
            .billId("billId")
            .amount(1.0)
            .description("x")
            .productId("productId")
            .referencedBillId("referencedBillId")
            .referencedLineItemId("referencedLineItemId")
            .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .debitReasonId("debitReasonId")
            .lineItemType(BillDebitLineItemCreateParams.LineItemType.STANDING_CHARGE)
            .reasonId("reasonId")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BillDebitLineItemCreateParams.builder()
                .orgId("orgId")
                .billId("billId")
                .amount(1.0)
                .description("x")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .debitReasonId("debitReasonId")
                .lineItemType(BillDebitLineItemCreateParams.LineItemType.STANDING_CHARGE)
                .reasonId("reasonId")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.productId()).isEqualTo("productId")
        assertThat(body.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(body.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.debitReasonId()).contains("debitReasonId")
        assertThat(body.lineItemType())
            .contains(BillDebitLineItemCreateParams.LineItemType.STANDING_CHARGE)
        assertThat(body.reasonId()).contains("reasonId")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BillDebitLineItemCreateParams.builder()
                .orgId("orgId")
                .billId("billId")
                .amount(1.0)
                .description("x")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.productId()).isEqualTo("productId")
        assertThat(body.referencedBillId()).isEqualTo("referencedBillId")
        assertThat(body.referencedLineItemId()).isEqualTo("referencedLineItemId")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            BillDebitLineItemCreateParams.builder()
                .orgId("orgId")
                .billId("billId")
                .amount(1.0)
                .description("x")
                .productId("productId")
                .referencedBillId("referencedBillId")
                .referencedLineItemId("referencedLineItemId")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "billId"
        assertThat(params.getPathParam(1)).isEqualTo("billId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
