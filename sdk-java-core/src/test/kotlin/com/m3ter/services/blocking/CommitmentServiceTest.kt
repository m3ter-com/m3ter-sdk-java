// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.CommitmentCreateParams
import com.m3ter.models.CommitmentDeleteParams
import com.m3ter.models.CommitmentFee
import com.m3ter.models.CommitmentRetrieveParams
import com.m3ter.models.CommitmentSearchParams
import com.m3ter.models.CommitmentUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CommitmentServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val commitmentResponse =
            commitmentService.create(
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
                    .billingInterval(1)
                    .billingOffset(0)
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
                            .servicePeriodStartDate(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
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
            )

        commitmentResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val commitmentResponse =
            commitmentService.retrieve(
                CommitmentRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        commitmentResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val commitmentResponse =
            commitmentService.update(
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
                    .billingInterval(1)
                    .billingOffset(0)
                    .billingPlanId("billingPlanId")
                    .childBillingMode(CommitmentUpdateParams.ChildBillingMode.PARENT_SUMMARY)
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
                            .servicePeriodStartDate(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
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
            )

        commitmentResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val page = commitmentService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val commitmentResponse =
            commitmentService.delete(
                CommitmentDeleteParams.builder().orgId("orgId").id("id").build()
            )

        commitmentResponse.validate()
    }

    @Test
    fun search() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val commitmentService = client.commitments()

        val response =
            commitmentService.search(
                CommitmentSearchParams.builder()
                    .orgId("orgId")
                    .fromDocument(0)
                    .operator(CommitmentSearchParams.Operator.AND)
                    .pageSize(1)
                    .searchQuery("searchQuery")
                    .sortBy("sortBy")
                    .sortOrder(CommitmentSearchParams.SortOrder.ASC)
                    .build()
            )

        response.validate()
    }
}
