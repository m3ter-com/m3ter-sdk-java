// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CurrencyCreateParams
import com.m3ter.sdk.models.CurrencyDeleteParams
import com.m3ter.sdk.models.CurrencyListParams
import com.m3ter.sdk.models.CurrencyRetrieveParams
import com.m3ter.sdk.models.CurrencyUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CurrencyServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val currencyService = client.currencies()
        val currency =
            currencyService.create(
                CurrencyCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .maxDecimalPlaces(0L)
                    .roundingMode(CurrencyCreateParams.RoundingMode.UP)
                    .version(0L)
                    .build()
            )
        println(currency)
        currency.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val currencyService = client.currencies()
        val currency =
            currencyService.retrieve(
                CurrencyRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(currency)
        currency.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val currencyService = client.currencies()
        val currency =
            currencyService.update(
                CurrencyUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .maxDecimalPlaces(0L)
                    .roundingMode(CurrencyUpdateParams.RoundingMode.UP)
                    .version(0L)
                    .build()
            )
        println(currency)
        currency.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val currencyService = client.currencies()
        val paginatedDataCurrencyResponse =
            currencyService.list(CurrencyListParams.builder().orgId("orgId").build())
        println(paginatedDataCurrencyResponse)
        paginatedDataCurrencyResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val currencyService = client.currencies()
        val currency =
            currencyService.delete(CurrencyDeleteParams.builder().orgId("orgId").id("id").build())
        println(currency)
        currency.validate()
    }
}
