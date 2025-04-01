// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.NotificationConfigurationCreateParams
import com.m3ter.sdk.models.NotificationConfigurationDeleteParams
import com.m3ter.sdk.models.NotificationConfigurationListParams
import com.m3ter.sdk.models.NotificationConfigurationRetrieveParams
import com.m3ter.sdk.models.NotificationConfigurationUpdateParams
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

        val page =
            notificationConfigurationService.list(
                NotificationConfigurationListParams.builder().orgId("orgId").build()
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
        val notificationConfigurationService = client.notificationConfigurations()

        val notificationConfigurationResponse =
            notificationConfigurationService.delete(
                NotificationConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        notificationConfigurationResponse.validate()
    }
}
