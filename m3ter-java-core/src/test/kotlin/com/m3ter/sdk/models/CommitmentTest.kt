// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitmentTest {

    @Test
    fun createCommitment() {
        val commitment =
            Commitment.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .accountingProductId("accountingProductId")
                .amount(0.0)
                .amountFirstBill(0.0)
                .amountPrePaid(0.0)
                .amountSpent(0.0)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billingInterval(0L)
                .billingOffset(0L)
                .billingPlanId("billingPlanId")
                .childBillingMode(Commitment.ChildBillingMode.PARENT_SUMMARY)
                .commitmentFeeBillInAdvance(true)
                .commitmentFeeDescription("commitmentFeeDescription")
                .commitmentUsageDescription("commitmentUsageDescription")
                .contractId("contractId")
                .createdBy("createdBy")
                .currency("currency")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(LocalDate.parse("2019-12-27"))
                .addFeeDate(
                    Commitment.FeeDate.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .lastModifiedBy("lastModifiedBy")
                .addLineItemType(Commitment.LineItemType.STANDING_CHARGE)
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .separateOverageUsage(true)
                .startDate(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(commitment).isNotNull
        assertThat(commitment.id()).isEqualTo("id")
        assertThat(commitment.version()).isEqualTo(0L)
        assertThat(commitment.accountId()).contains("accountId")
        assertThat(commitment.accountingProductId()).contains("accountingProductId")
        assertThat(commitment.amount()).contains(0.0)
        assertThat(commitment.amountFirstBill()).contains(0.0)
        assertThat(commitment.amountPrePaid()).contains(0.0)
        assertThat(commitment.amountSpent()).contains(0.0)
        assertThat(commitment.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(commitment.billingInterval()).contains(0L)
        assertThat(commitment.billingOffset()).contains(0L)
        assertThat(commitment.billingPlanId()).contains("billingPlanId")
        assertThat(commitment.childBillingMode())
            .contains(Commitment.ChildBillingMode.PARENT_SUMMARY)
        assertThat(commitment.commitmentFeeBillInAdvance()).contains(true)
        assertThat(commitment.commitmentFeeDescription()).contains("commitmentFeeDescription")
        assertThat(commitment.commitmentUsageDescription()).contains("commitmentUsageDescription")
        assertThat(commitment.contractId()).contains("contractId")
        assertThat(commitment.createdBy()).contains("createdBy")
        assertThat(commitment.currency()).contains("currency")
        assertThat(commitment.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitment.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitment.endDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(commitment.feeDates().get())
            .containsExactly(
                Commitment.FeeDate.builder()
                    .amount(1.0)
                    .date(LocalDate.parse("2019-12-27"))
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(commitment.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(commitment.lineItemTypes().get())
            .containsExactly(Commitment.LineItemType.STANDING_CHARGE)
        assertThat(commitment.overageDescription()).contains("overageDescription")
        assertThat(commitment.overageSurchargePercent()).contains(0.0)
        assertThat(commitment.productIds().get()).containsExactly("string")
        assertThat(commitment.separateOverageUsage()).contains(true)
        assertThat(commitment.startDate()).contains(LocalDate.parse("2019-12-27"))
    }
}
