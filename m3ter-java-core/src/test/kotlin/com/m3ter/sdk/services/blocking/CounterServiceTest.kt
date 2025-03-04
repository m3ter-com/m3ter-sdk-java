// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterDeleteParams
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterServiceTest {

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

        counter.validate()
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
        val counterService = client.counters()

        val counter =
            counterService.retrieve(CounterRetrieveParams.builder().orgId("orgId").id("id").build())

        counter.validate()
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

        counter.validate()
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
        val counterService = client.counters()

        val page = counterService.list(CounterListParams.builder().orgId("orgId").build())

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
        val counterService = client.counters()

        val counter =
            counterService.delete(CounterDeleteParams.builder().orgId("orgId").id("id").build())

        counter.validate()
    }
}
