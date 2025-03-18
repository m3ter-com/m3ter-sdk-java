// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentCreateParamsTest {

    @Test
    fun create() {
        CommitmentCreateParams.builder()
            .orgId("orgId")
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
            .childBillingMode(CommitmentCreateParams.ChildBillingMode.PARENT_SUMMARY)
            .commitmentFeeBillInAdvance(true)
            .commitmentFeeDescription("commitmentFeeDescription")
            .commitmentUsageDescription("commitmentUsageDescription")
            .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .drawdownsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .addFeeDate(
                CommitmentFee.builder()
                    .amount(1.0)
                    .date(LocalDate.parse("2019-12-27"))
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
            .addLineItemType(CommitmentCreateParams.LineItemType.STANDING_CHARGE)
            .overageDescription("overageDescription")
            .overageSurchargePercent(0.0)
            .addProductId("string")
            .separateOverageUsage(true)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommitmentCreateParams.builder()
                .orgId("orgId")
                .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .amount(1.0)
                .currency("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommitmentCreateParams.builder()
                .orgId("orgId")
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
                .childBillingMode(CommitmentCreateParams.ChildBillingMode.PARENT_SUMMARY)
                .commitmentFeeBillInAdvance(true)
                .commitmentFeeDescription("commitmentFeeDescription")
                .commitmentUsageDescription("commitmentUsageDescription")
                .contractId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .drawdownsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addFeeDate(
                    CommitmentFee.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addLineItemType(CommitmentCreateParams.LineItemType.STANDING_CHARGE)
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
            .contains(CommitmentCreateParams.ChildBillingMode.PARENT_SUMMARY)
        assertThat(body.commitmentFeeBillInAdvance()).contains(true)
        assertThat(body.commitmentFeeDescription()).contains("commitmentFeeDescription")
        assertThat(body.commitmentUsageDescription()).contains("commitmentUsageDescription")
        assertThat(body.contractId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.drawdownsAccountingProductId())
            .contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.feeDates().getOrNull())
            .containsExactly(
                CommitmentFee.builder()
                    .amount(1.0)
                    .date(LocalDate.parse("2019-12-27"))
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.feesAccountingProductId()).contains("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        assertThat(body.lineItemTypes().getOrNull())
            .containsExactly(CommitmentCreateParams.LineItemType.STANDING_CHARGE)
        assertThat(body.overageDescription()).contains("overageDescription")
        assertThat(body.overageSurchargePercent()).contains(0.0)
        assertThat(body.productIds().getOrNull()).containsExactly("string")
        assertThat(body.separateOverageUsage()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitmentCreateParams.builder()
                .orgId("orgId")
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
}
