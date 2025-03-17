// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.CounterAdjustmentCreateParams
import com.m3ter.sdk.models.CounterAdjustmentDeleteParams
import com.m3ter.sdk.models.CounterAdjustmentListParams
import com.m3ter.sdk.models.CounterAdjustmentRetrieveParams
import com.m3ter.sdk.models.CounterAdjustmentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CounterAdjustmentServiceAsyncTest {

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
        val counterAdjustmentServiceAsync = client.counterAdjustments()

        val counterAdjustmentResponseFuture =
            counterAdjustmentServiceAsync.create(
                CounterAdjustmentCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .counterId("x")
                    .date("2022-01-04")
                    .value(0L)
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        val counterAdjustmentResponse = counterAdjustmentResponseFuture.get()
        counterAdjustmentResponse.validate()
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
        val counterAdjustmentServiceAsync = client.counterAdjustments()

        val counterAdjustmentResponseFuture =
            counterAdjustmentServiceAsync.retrieve(
                CounterAdjustmentRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val counterAdjustmentResponse = counterAdjustmentResponseFuture.get()
        counterAdjustmentResponse.validate()
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
        val counterAdjustmentServiceAsync = client.counterAdjustments()

        val counterAdjustmentResponseFuture =
            counterAdjustmentServiceAsync.update(
                CounterAdjustmentUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("x")
                    .counterId("x")
                    .date("2022-01-04")
                    .value(0L)
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        val counterAdjustmentResponse = counterAdjustmentResponseFuture.get()
        counterAdjustmentResponse.validate()
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
        val counterAdjustmentServiceAsync = client.counterAdjustments()

        val pageFuture =
            counterAdjustmentServiceAsync.list(
                CounterAdjustmentListParams.builder().orgId("orgId").build()
            )

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
        val counterAdjustmentServiceAsync = client.counterAdjustments()

        val counterAdjustmentResponseFuture =
            counterAdjustmentServiceAsync.delete(
                CounterAdjustmentDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val counterAdjustmentResponse = counterAdjustmentResponseFuture.get()
        counterAdjustmentResponse.validate()
    }
}
