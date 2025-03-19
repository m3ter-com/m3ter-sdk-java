// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.EventGetFieldsParams
import com.m3ter.sdk.models.EventGetTypesParams
import com.m3ter.sdk.models.EventListParams
import com.m3ter.sdk.models.EventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceTest {

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
        val eventService = client.events()

        val eventResponse =
            eventService.retrieve(EventRetrieveParams.builder().orgId("orgId").id("id").build())

        eventResponse.validate()
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
        val eventService = client.events()

        val page = eventService.list(EventListParams.builder().orgId("orgId").build())

        page.response().validate()
    }

    @Test
    fun getFields() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val eventService = client.events()

        val response =
            eventService.getFields(
                EventGetFieldsParams.builder().orgId("orgId").eventName("eventName").build()
            )

        response.validate()
    }

    @Test
    fun getTypes() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val eventService = client.events()

        val response = eventService.getTypes(EventGetTypesParams.builder().orgId("orgId").build())

        response.validate()
    }
}
