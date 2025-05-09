// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.EventGetFieldsParams
import com.m3ter.models.EventGetTypesParams
import com.m3ter.models.EventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

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
        val eventServiceAsync = client.events()

        val eventResponseFuture =
            eventServiceAsync.retrieve(
                EventRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val eventResponse = eventResponseFuture.get()
        eventResponse.validate()
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
        val eventServiceAsync = client.events()

        val pageFuture = eventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun getFields() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val eventServiceAsync = client.events()

        val responseFuture =
            eventServiceAsync.getFields(
                EventGetFieldsParams.builder().orgId("orgId").eventName("eventName").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getTypes() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val eventServiceAsync = client.events()

        val responseFuture =
            eventServiceAsync.getTypes(EventGetTypesParams.builder().orgId("orgId").build())

        val response = responseFuture.get()
        response.validate()
    }
}
