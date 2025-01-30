// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterService = client.counters()
        val counter =
            counterService.create(
                CounterCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .unit("x")
                    .code("JS!?Q0]r] ]\$]")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )
        println(counter)
        counter.validate()
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
        val counterService = client.counters()
        val counter =
            counterService.retrieve(CounterRetrieveParams.builder().orgId("orgId").id("id").build())
        println(counter)
        counter.validate()
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
        val counterService = client.counters()
        val counter =
            counterService.update(
                CounterUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .unit("x")
                    .code("JS!?Q0]r] ]\$]")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )
        println(counter)
        counter.validate()
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
        val counterService = client.counters()
        val paginatedDataCounterResponse =
            counterService.list(CounterListParams.builder().orgId("orgId").build())
        println(paginatedDataCounterResponse)
        paginatedDataCounterResponse.data().forEach { it.validate() }
    }
}
