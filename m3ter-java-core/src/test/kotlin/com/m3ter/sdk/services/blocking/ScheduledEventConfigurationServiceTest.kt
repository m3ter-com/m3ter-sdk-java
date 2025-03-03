// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduledEventConfigurationServiceTest {

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

        val scheduledEventConfiguration =
            scheduledEventConfigurationService.create(
                ScheduledEventConfigurationCreateParams.builder()
                    .orgId("orgId")
                    .entity("Bill")
                    .field("endDate")
                    .name("scheduled.bill.enddateEvent")
                    .offset(5L)
                    .version(0L)
                    .build()
            )

        scheduledEventConfiguration.validate()
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

        val scheduledEventConfiguration =
            scheduledEventConfigurationService.retrieve(
                ScheduledEventConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        scheduledEventConfiguration.validate()
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

        val scheduledEventConfiguration =
            scheduledEventConfigurationService.update(
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

        scheduledEventConfiguration.validate()
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

        val page =
            scheduledEventConfigurationService.list(
                ScheduledEventConfigurationListParams.builder().orgId("orgId").build()
            )

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

        val scheduledEventConfiguration =
            scheduledEventConfigurationService.delete(
                ScheduledEventConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        scheduledEventConfiguration.validate()
    }
}
