// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.ScheduledEventConfigurationCreateParams
import com.m3ter.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.models.ScheduledEventConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduledEventConfigurationServiceAsyncTest {

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
        val scheduledEventConfigurationServiceAsync = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponseFuture =
            scheduledEventConfigurationServiceAsync.create(
                ScheduledEventConfigurationCreateParams.builder()
                    .orgId("orgId")
                    .entity("Bill")
                    .field("endDate")
                    .name("scheduled.bill.enddateEvent")
                    .offset(5L)
                    .version(0L)
                    .build()
            )

        val scheduledEventConfigurationResponse = scheduledEventConfigurationResponseFuture.get()
        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationServiceAsync = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponseFuture =
            scheduledEventConfigurationServiceAsync.retrieve(
                ScheduledEventConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val scheduledEventConfigurationResponse = scheduledEventConfigurationResponseFuture.get()
        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationServiceAsync = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponseFuture =
            scheduledEventConfigurationServiceAsync.update(
                ScheduledEventConfigurationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .entity("Bill")
                    .field("endDate")
                    .name("scheduled.bill.enddateEvent")
                    .offset(5L)
                    .version(0L)
                    .build()
            )

        val scheduledEventConfigurationResponse = scheduledEventConfigurationResponseFuture.get()
        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationServiceAsync = client.scheduledEventConfigurations()

        val pageFuture = scheduledEventConfigurationServiceAsync.list()

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
        val scheduledEventConfigurationServiceAsync = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponseFuture =
            scheduledEventConfigurationServiceAsync.delete(
                ScheduledEventConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val scheduledEventConfigurationResponse = scheduledEventConfigurationResponseFuture.get()
        scheduledEventConfigurationResponse.validate()
    }
}
