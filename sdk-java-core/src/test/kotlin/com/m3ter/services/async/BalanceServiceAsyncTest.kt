// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.BalanceCreateParams
import com.m3ter.models.BalanceDeleteParams
import com.m3ter.models.BalanceRetrieveParams
import com.m3ter.models.BalanceUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BalanceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val balanceServiceAsync = client.balances()

        val balanceFuture =
            balanceServiceAsync.create(
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

        val balance = balanceFuture.get()
        balance.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val balanceServiceAsync = client.balances()

        val balanceFuture =
            balanceServiceAsync.retrieve(
                BalanceRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val balance = balanceFuture.get()
        balance.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val balanceServiceAsync = client.balances()

        val balanceFuture =
            balanceServiceAsync.update(
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

        val balance = balanceFuture.get()
        balance.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val balanceServiceAsync = client.balances()

        val pageFuture = balanceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val balanceServiceAsync = client.balances()

        val balanceFuture =
            balanceServiceAsync.delete(
                BalanceDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val balance = balanceFuture.get()
        balance.validate()
    }
}
