// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.CounterCreateParams
import com.m3ter.models.CounterDeleteParams
import com.m3ter.models.CounterRetrieveParams
import com.m3ter.models.CounterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CounterServiceTest {

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

        val counterResponse =
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

        counterResponse.validate()
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

        val counterResponse =
            counterService.retrieve(CounterRetrieveParams.builder().orgId("orgId").id("id").build())

        counterResponse.validate()
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

        val counterResponse =
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

        counterResponse.validate()
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

        val page = counterService.list()

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

        val counterResponse =
            counterService.delete(CounterDeleteParams.builder().orgId("orgId").id("id").build())

        counterResponse.validate()
    }
}
