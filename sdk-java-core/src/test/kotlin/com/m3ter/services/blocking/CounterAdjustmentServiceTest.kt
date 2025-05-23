// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.CounterAdjustmentCreateParams
import com.m3ter.models.CounterAdjustmentDeleteParams
import com.m3ter.models.CounterAdjustmentRetrieveParams
import com.m3ter.models.CounterAdjustmentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CounterAdjustmentServiceTest {

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
        val counterAdjustmentService = client.counterAdjustments()

        val counterAdjustmentResponse =
            counterAdjustmentService.create(
                CounterAdjustmentCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .counterId("x")
                    .date("2022-01-04")
                    .value(0)
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        counterAdjustmentResponse.validate()
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
        val counterAdjustmentService = client.counterAdjustments()

        val counterAdjustmentResponse =
            counterAdjustmentService.retrieve(
                CounterAdjustmentRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        counterAdjustmentResponse.validate()
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
        val counterAdjustmentService = client.counterAdjustments()

        val counterAdjustmentResponse =
            counterAdjustmentService.update(
                CounterAdjustmentUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("x")
                    .counterId("x")
                    .date("2022-01-04")
                    .value(0)
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        counterAdjustmentResponse.validate()
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
        val counterAdjustmentService = client.counterAdjustments()

        val page = counterAdjustmentService.list()

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
        val counterAdjustmentService = client.counterAdjustments()

        val counterAdjustmentResponse =
            counterAdjustmentService.delete(
                CounterAdjustmentDeleteParams.builder().orgId("orgId").id("id").build()
            )

        counterAdjustmentResponse.validate()
    }
}
