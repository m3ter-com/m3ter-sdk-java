// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.NotificationConfigurationCreateParams
import com.m3ter.models.NotificationConfigurationDeleteParams
import com.m3ter.models.NotificationConfigurationRetrieveParams
import com.m3ter.models.NotificationConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationConfigurationServiceTest {

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
        val notificationConfigurationService = client.notificationConfigurations()

        val notificationConfigurationResponse =
            notificationConfigurationService.create(
                NotificationConfigurationCreateParams.builder()
                    .orgId("orgId")
                    .code("x")
                    .description("x")
                    .eventName("x")
                    .name("x")
                    .active(true)
                    .alwaysFireEvent(true)
                    .calculation("calculation")
                    .version(0L)
                    .build()
            )

        notificationConfigurationResponse.validate()
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
        val notificationConfigurationService = client.notificationConfigurations()

        val notificationConfigurationResponse =
            notificationConfigurationService.retrieve(
                NotificationConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        notificationConfigurationResponse.validate()
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
        val notificationConfigurationService = client.notificationConfigurations()

        val notificationConfigurationResponse =
            notificationConfigurationService.update(
                NotificationConfigurationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("x")
                    .description("x")
                    .eventName("x")
                    .name("x")
                    .active(true)
                    .alwaysFireEvent(true)
                    .calculation("calculation")
                    .version(0L)
                    .build()
            )

        notificationConfigurationResponse.validate()
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
        val notificationConfigurationService = client.notificationConfigurations()

        val page = notificationConfigurationService.list()

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
        val notificationConfigurationService = client.notificationConfigurations()

        val notificationConfigurationResponse =
            notificationConfigurationService.delete(
                NotificationConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        notificationConfigurationResponse.validate()
    }
}
