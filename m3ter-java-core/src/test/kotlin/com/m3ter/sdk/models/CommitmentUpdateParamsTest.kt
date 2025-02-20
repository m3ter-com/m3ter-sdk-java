// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitmentUpdateParamsTest {

    @Test
    fun create() {
        CommitmentUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .amount(1.0)
            .currency("x")
            .endDate(LocalDate.parse("2019-12-27"))
            .startDate(LocalDate.parse("2019-12-27"))
            .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .amountFirstBill(0.0)
            .amountPrePaid(0.0)
            .billEpoch(LocalDate.parse("2019-12-27"))
            .billingInterval(1L)
            .billingOffset(0L)
            .billingPlanId("billingPlanId")
            .childBillingMode(CommitmentUpdateParams.ChildBillingMode.PARENT_SUMMARY)
            .commitmentFeeBillInAdvance(true)
            .commitmentFeeDescription("commitmentFeeDescription")
            .commitmentUsageDescription("commitmentUsageDescription")
            .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .drawdownsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .addFeeDate(
                CommitmentUpdateParams.FeeDate.builder()
                    .amount(1.0)
                    .date(LocalDate.parse("2019-12-27"))
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .addLineItemType(CommitmentUpdateParams.LineItemType.STANDING_CHARGE)
            .overageDescription("overageDescription")
            .overageSurchargePercent(0.0)
            .addProductId("string")
            .separateOverageUsage(true)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CommitmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amount(1.0)
                .currency("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .startDate(LocalDate.parse("2019-12-27"))
                .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amountFirstBill(0.0)
                .amountPrePaid(0.0)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billingInterval(1L)
                .billingOffset(0L)
                .billingPlanId("billingPlanId")
                .childBillingMode(CommitmentUpdateParams.ChildBillingMode.PARENT_SUMMARY)
                .commitmentFeeBillInAdvance(true)
                .commitmentFeeDescription("commitmentFeeDescription")
                .commitmentUsageDescription("commitmentUsageDescription")
                .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .drawdownsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addFeeDate(
                    CommitmentUpdateParams.FeeDate.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addLineItemType(CommitmentUpdateParams.LineItemType.STANDING_CHARGE)
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .separateOverageUsage(true)
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.accountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.amountFirstBill()).contains(0.0)
        assertThat(body.amountPrePaid()).contains(0.0)
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.billingInterval()).contains(1L)
        assertThat(body.billingOffset()).contains(0L)
        assertThat(body.billingPlanId()).contains("billingPlanId")
        assertThat(body.childBillingMode())
            .contains(CommitmentUpdateParams.ChildBillingMode.PARENT_SUMMARY)
        assertThat(body.commitmentFeeBillInAdvance()).contains(true)
        assertThat(body.commitmentFeeDescription()).contains("commitmentFeeDescription")
        assertThat(body.commitmentUsageDescription()).contains("commitmentUsageDescription")
        assertThat(body.contractId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.drawdownsAccountingProductId())
            .contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.feeDates())
            .contains(
                listOf(
                    CommitmentUpdateParams.FeeDate.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(body.feesAccountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.lineItemTypes())
            .contains(listOf(CommitmentUpdateParams.LineItemType.STANDING_CHARGE))
        assertThat(body.overageDescription()).contains("overageDescription")
        assertThat(body.overageSurchargePercent()).contains(0.0)
        assertThat(body.productIds()).contains(listOf("string"))
        assertThat(body.separateOverageUsage()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amount(1.0)
                .currency("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.amount()).isEqualTo(1.0)
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun getPathParam() {
        val params =
            CommitmentUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amount(1.0)
                .currency("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .startDate(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
