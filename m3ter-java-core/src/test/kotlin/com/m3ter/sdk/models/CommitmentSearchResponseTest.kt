// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentSearchResponseTest {

    @Test
    fun createCommitmentSearchResponse() {
        val commitmentSearchResponse =
            CommitmentSearchResponse.builder()
                .addData(
                    CommitmentResponse.builder()
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
                                .servicePeriodEndDate(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .servicePeriodStartDate(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
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
                        .build()
                )
                .nextToken("nextToken")
                .build()
        assertThat(commitmentSearchResponse).isNotNull
        assertThat(commitmentSearchResponse.data().get())
            .containsExactly(
                CommitmentResponse.builder()
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
                            .servicePeriodStartDate(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
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
                    .build()
            )
        assertThat(commitmentSearchResponse.nextToken()).contains("nextToken")
    }
}
