// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.BalanceCreateParams
import com.m3ter.sdk.models.BalanceDeleteParams
import com.m3ter.sdk.models.BalanceListParams
import com.m3ter.sdk.models.BalanceRetrieveParams
import com.m3ter.sdk.models.BalanceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val balanceService = client.balances()
        val balance =
            balanceService.create(
                BalanceCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .currency("x")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .balanceDrawDownDescription("balanceDrawDownDescription")
                    .code("JS!?Q0]r] ]\$]")
                    .consumptionsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .description("description")
                    .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .addLineItemType(BalanceCreateParams.LineItemType.STANDING_CHARGE)
                    .name("name")
                    .overageDescription("overageDescription")
                    .overageSurchargePercent(0.0)
                    .addProductId("string")
                    .rolloverAmount(0.0)
                    .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(0L)
                    .build()
            )
        println(balance)
        balance.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val balanceService = client.balances()
        val balance =
            balanceService.retrieve(BalanceRetrieveParams.builder().orgId("orgId").id("id").build())
        println(balance)
        balance.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val balanceService = client.balances()
        val balance =
            balanceService.update(
                BalanceUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("x")
                    .currency("x")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .balanceDrawDownDescription("balanceDrawDownDescription")
                    .code("JS!?Q0]r] ]\$]")
                    .consumptionsAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .description("description")
                    .feesAccountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .addLineItemType(BalanceUpdateParams.LineItemType.STANDING_CHARGE)
                    .name("name")
                    .overageDescription("overageDescription")
                    .overageSurchargePercent(0.0)
                    .addProductId("string")
                    .rolloverAmount(0.0)
                    .rolloverEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(0L)
                    .build()
            )
        println(balance)
        balance.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val balanceService = client.balances()
        val paginatedDataBalanceResponse =
            balanceService.list(BalanceListParams.builder().orgId("orgId").build())
        println(paginatedDataBalanceResponse)
        paginatedDataBalanceResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val balanceService = client.balances()
        val balance =
            balanceService.delete(BalanceDeleteParams.builder().orgId("orgId").id("id").build())
        println(balance)
        balance.validate()
    }
}
