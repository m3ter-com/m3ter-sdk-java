// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentResponseTest {

    @Test
    fun create() {
        val commitmentResponse =
            CommitmentResponse.builder()
                .id("id")
                .accountId("accountId")
                .accountingProductId("accountingProductId")
                .amount(0.0)
                .amountFirstBill(0.0)
                .amountPrePaid(0.0)
                .amountSpent(0.0)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billingInterval(0)
                .billingOffset(0)
                .billingPlanId("billingPlanId")
                .childBillingMode(CommitmentResponse.ChildBillingMode.PARENT_SUMMARY)
                .commitmentFeeBillInAdvance(true)
                .commitmentFeeDescription("commitmentFeeDescription")
                .commitmentUsageDescription("commitmentUsageDescription")
                .contractId("contractId")
                .createdBy("createdBy")
                .currency("currency")
                .drawdownsAccountingProductId("drawdownsAccountingProductId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(LocalDate.parse("2019-12-27"))
                .addFeeDate(
                    CommitmentFee.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .feesAccountingProductId("feesAccountingProductId")
                .lastModifiedBy("lastModifiedBy")
                .addLineItemType(CommitmentResponse.LineItemType.STANDING_CHARGE)
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .separateOverageUsage(true)
                .startDate(LocalDate.parse("2019-12-27"))
                .version(0L)
                .build()

        assertThat(commitmentResponse.id()).isEqualTo("id")
        assertThat(commitmentResponse.accountId()).contains("accountId")
        assertThat(commitmentResponse.accountingProductId()).contains("accountingProductId")
        assertThat(commitmentResponse.amount()).contains(0.0)
        assertThat(commitmentResponse.amountFirstBill()).contains(0.0)
        assertThat(commitmentResponse.amountPrePaid()).contains(0.0)
        assertThat(commitmentResponse.amountSpent()).contains(0.0)
        assertThat(commitmentResponse.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(commitmentResponse.billingInterval()).contains(0)
        assertThat(commitmentResponse.billingOffset()).contains(0)
        assertThat(commitmentResponse.billingPlanId()).contains("billingPlanId")
        assertThat(commitmentResponse.childBillingMode())
            .contains(CommitmentResponse.ChildBillingMode.PARENT_SUMMARY)
        assertThat(commitmentResponse.commitmentFeeBillInAdvance()).contains(true)
        assertThat(commitmentResponse.commitmentFeeDescription())
            .contains("commitmentFeeDescription")
        assertThat(commitmentResponse.commitmentUsageDescription())
            .contains("commitmentUsageDescription")
        assertThat(commitmentResponse.contractId()).contains("contractId")
        assertThat(commitmentResponse.createdBy()).contains("createdBy")
        assertThat(commitmentResponse.currency()).contains("currency")
        assertThat(commitmentResponse.drawdownsAccountingProductId())
            .contains("drawdownsAccountingProductId")
        assertThat(commitmentResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitmentResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitmentResponse.endDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(commitmentResponse.feeDates().getOrNull())
            .containsExactly(
                CommitmentFee.builder()
                    .amount(1.0)
                    .date(LocalDate.parse("2019-12-27"))
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(commitmentResponse.feesAccountingProductId()).contains("feesAccountingProductId")
        assertThat(commitmentResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(commitmentResponse.lineItemTypes().getOrNull())
            .containsExactly(CommitmentResponse.LineItemType.STANDING_CHARGE)
        assertThat(commitmentResponse.overageDescription()).contains("overageDescription")
        assertThat(commitmentResponse.overageSurchargePercent()).contains(0.0)
        assertThat(commitmentResponse.productIds().getOrNull()).containsExactly("string")
        assertThat(commitmentResponse.separateOverageUsage()).contains(true)
        assertThat(commitmentResponse.startDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(commitmentResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitmentResponse =
            CommitmentResponse.builder()
                .id("id")
                .accountId("accountId")
                .accountingProductId("accountingProductId")
                .amount(0.0)
                .amountFirstBill(0.0)
                .amountPrePaid(0.0)
                .amountSpent(0.0)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .billingInterval(0)
                .billingOffset(0)
                .billingPlanId("billingPlanId")
                .childBillingMode(CommitmentResponse.ChildBillingMode.PARENT_SUMMARY)
                .commitmentFeeBillInAdvance(true)
                .commitmentFeeDescription("commitmentFeeDescription")
                .commitmentUsageDescription("commitmentUsageDescription")
                .contractId("contractId")
                .createdBy("createdBy")
                .currency("currency")
                .drawdownsAccountingProductId("drawdownsAccountingProductId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDate(LocalDate.parse("2019-12-27"))
                .addFeeDate(
                    CommitmentFee.builder()
                        .amount(1.0)
                        .date(LocalDate.parse("2019-12-27"))
                        .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .feesAccountingProductId("feesAccountingProductId")
                .lastModifiedBy("lastModifiedBy")
                .addLineItemType(CommitmentResponse.LineItemType.STANDING_CHARGE)
                .overageDescription("overageDescription")
                .overageSurchargePercent(0.0)
                .addProductId("string")
                .separateOverageUsage(true)
                .startDate(LocalDate.parse("2019-12-27"))
                .version(0L)
                .build()

        val roundtrippedCommitmentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitmentResponse),
                jacksonTypeRef<CommitmentResponse>(),
            )

        assertThat(roundtrippedCommitmentResponse).isEqualTo(commitmentResponse)
    }
}
