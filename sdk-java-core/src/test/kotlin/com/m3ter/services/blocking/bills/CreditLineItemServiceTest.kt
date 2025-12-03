// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.BillCreditLineItemCreateParams
import com.m3ter.models.BillCreditLineItemDeleteParams
import com.m3ter.models.BillCreditLineItemRetrieveParams
import com.m3ter.models.BillCreditLineItemUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditLineItemServiceTest {

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
        val creditLineItemService = client.bills().creditLineItems()

        val creditLineItemResponse =
            creditLineItemService.create(
                BillCreditLineItemCreateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .accountingProductId("accountingProductId")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amountToApplyOnBill(0.0)
                    .creditReasonId("creditReasonId")
                    .lineItemType(BillCreditLineItemCreateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        creditLineItemResponse.validate()
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
        val creditLineItemService = client.bills().creditLineItems()

        val creditLineItemResponse =
            creditLineItemService.retrieve(
                BillCreditLineItemRetrieveParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        creditLineItemResponse.validate()
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
        val creditLineItemService = client.bills().creditLineItems()

        val creditLineItemResponse =
            creditLineItemService.update(
                BillCreditLineItemUpdateParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .accountingProductId("accountingProductId")
                    .amount(1.0)
                    .description("x")
                    .productId("productId")
                    .referencedBillId("referencedBillId")
                    .referencedLineItemId("referencedLineItemId")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amountToApplyOnBill(0.0)
                    .creditReasonId("creditReasonId")
                    .lineItemType(BillCreditLineItemUpdateParams.LineItemType.STANDING_CHARGE)
                    .reasonId("reasonId")
                    .version(0L)
                    .build()
            )

        creditLineItemResponse.validate()
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
        val creditLineItemService = client.bills().creditLineItems()

        val page = creditLineItemService.list("billId")

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
        val creditLineItemService = client.bills().creditLineItems()

        val creditLineItemResponse =
            creditLineItemService.delete(
                BillCreditLineItemDeleteParams.builder()
                    .orgId("orgId")
                    .billId("billId")
                    .id("id")
                    .build()
            )

        creditLineItemResponse.validate()
    }
}
