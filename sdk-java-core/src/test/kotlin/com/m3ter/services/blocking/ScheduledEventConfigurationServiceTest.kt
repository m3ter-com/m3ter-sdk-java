// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.ScheduledEventConfigurationCreateParams
import com.m3ter.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.models.ScheduledEventConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduledEventConfigurationServiceTest {

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
        val scheduledEventConfigurationService = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponse =
            scheduledEventConfigurationService.create(
                ScheduledEventConfigurationCreateParams.builder()
                    .orgId("orgId")
                    .entity("Bill")
                    .field("endDate")
                    .name("scheduled.bill.enddateEvent")
                    .offset(5)
                    .version(0L)
                    .build()
            )

        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationService = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponse =
            scheduledEventConfigurationService.retrieve(
                ScheduledEventConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationService = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponse =
            scheduledEventConfigurationService.update(
                ScheduledEventConfigurationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .entity("Bill")
                    .field("endDate")
                    .name("scheduled.bill.enddateEvent")
                    .offset(5)
                    .version(0L)
                    .build()
            )

        scheduledEventConfigurationResponse.validate()
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
        val scheduledEventConfigurationService = client.scheduledEventConfigurations()

        val page = scheduledEventConfigurationService.list()

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
        val scheduledEventConfigurationService = client.scheduledEventConfigurations()

        val scheduledEventConfigurationResponse =
            scheduledEventConfigurationService.delete(
                ScheduledEventConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        scheduledEventConfigurationResponse.validate()
    }
}
