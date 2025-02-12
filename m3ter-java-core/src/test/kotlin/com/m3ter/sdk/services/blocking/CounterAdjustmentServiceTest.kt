// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CounterAdjustmentCreateParams
import com.m3ter.sdk.models.CounterAdjustmentDeleteParams
import com.m3ter.sdk.models.CounterAdjustmentListParams
import com.m3ter.sdk.models.CounterAdjustmentRetrieveParams
import com.m3ter.sdk.models.CounterAdjustmentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterAdjustmentServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val counterAdjustmentService = client.counterAdjustments()
        val counterAdjustment =
            counterAdjustmentService.create(
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
        println(counterAdjustment)
        counterAdjustment.validate()
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
        val counterAdjustmentService = client.counterAdjustments()
        val counterAdjustment =
            counterAdjustmentService.retrieve(
                CounterAdjustmentRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(counterAdjustment)
        counterAdjustment.validate()
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
        val counterAdjustmentService = client.counterAdjustments()
        val counterAdjustment =
            counterAdjustmentService.update(
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
        println(counterAdjustment)
        counterAdjustment.validate()
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
        val counterAdjustmentService = client.counterAdjustments()
        val paginatedDataCounterAdjustmentResponse =
            counterAdjustmentService.list(
                CounterAdjustmentListParams.builder().orgId("orgId").build()
            )
        println(paginatedDataCounterAdjustmentResponse)
        paginatedDataCounterAdjustmentResponse.data().forEach { it.validate() }
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
        val counterAdjustmentService = client.counterAdjustments()
        val counterAdjustment =
            counterAdjustmentService.delete(
                CounterAdjustmentDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(counterAdjustment)
        counterAdjustment.validate()
    }
}
