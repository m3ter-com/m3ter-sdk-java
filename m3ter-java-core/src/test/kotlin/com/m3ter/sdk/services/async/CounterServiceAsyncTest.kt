// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterDeleteParams
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterServiceAsyncTest {

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
        val counterServiceAsync = client.counters()

        val counterResponseFuture =
            counterServiceAsync.create(
                CounterCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .unit("x")
                    .code("JS!?Q0]r] ]\$]")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        val counterResponse = counterResponseFuture.get()
        counterResponse.validate()
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
        val counterServiceAsync = client.counters()

        val counterResponseFuture =
            counterServiceAsync.retrieve(
                CounterRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val counterResponse = counterResponseFuture.get()
        counterResponse.validate()
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
        val counterServiceAsync = client.counters()

        val counterResponseFuture =
            counterServiceAsync.update(
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

        val counterResponse = counterResponseFuture.get()
        counterResponse.validate()
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
        val counterServiceAsync = client.counters()

        val pageFuture =
            counterServiceAsync.list(CounterListParams.builder().orgId("orgId").build())

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
        val counterServiceAsync = client.counters()

        val counterResponseFuture =
            counterServiceAsync.delete(
                CounterDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val counterResponse = counterResponseFuture.get()
        counterResponse.validate()
    }
}
