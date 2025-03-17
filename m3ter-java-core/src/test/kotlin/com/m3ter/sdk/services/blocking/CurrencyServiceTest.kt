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
internal class CurrencyServiceTest {

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
        val currencyService = client.currencies()

        val currencyResponse =
            currencyService.create(
                CurrencyCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .maxDecimalPlaces(0L)
                    .roundingMode(CurrencyCreateParams.RoundingMode.UP)
                    .version(0L)
                    .build()
            )

        currencyResponse.validate()
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
        val currencyService = client.currencies()

        val currencyResponse =
            currencyService.retrieve(
                CurrencyRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        currencyResponse.validate()
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
        val currencyService = client.currencies()

        val currencyResponse =
            currencyService.update(
                CurrencyUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .maxDecimalPlaces(0L)
                    .roundingMode(CurrencyUpdateParams.RoundingMode.UP)
                    .version(0L)
                    .build()
            )

        currencyResponse.validate()
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
        val currencyService = client.currencies()

        val page = currencyService.list(CurrencyListParams.builder().orgId("orgId").build())

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
        val currencyService = client.currencies()

        val currencyResponse =
            currencyService.delete(CurrencyDeleteParams.builder().orgId("orgId").id("id").build())

        currencyResponse.validate()
    }
}
