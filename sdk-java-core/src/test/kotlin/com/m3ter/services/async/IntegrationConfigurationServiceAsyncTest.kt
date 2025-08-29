// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.IntegrationConfigurationCreateParams
import com.m3ter.models.IntegrationConfigurationDeleteParams
import com.m3ter.models.IntegrationConfigurationEnableParams
import com.m3ter.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.models.IntegrationConfigurationRetrieveParams
import com.m3ter.models.IntegrationConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntegrationConfigurationServiceAsyncTest {

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
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val integrationConfigurationFuture =
            integrationConfigurationServiceAsync.create(
                IntegrationConfigurationCreateParams.builder()
                    .orgId("orgId")
                    .destination("Stripe")
                    .entityType("Bill")
                    .configData(
                        IntegrationConfigurationCreateParams.ConfigData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .credentials(
                        IntegrationConfigurationCreateParams.Credentials.builder()
                            .type(IntegrationConfigurationCreateParams.Credentials.Type.HTTP_BASIC)
                            .destination(
                                IntegrationConfigurationCreateParams.Credentials.Destination.WEBHOOK
                            )
                            .empty(true)
                            .name("Integration Credentials")
                            .version(0L)
                            .build()
                    )
                    .destinationId("00000000-0000-0000-0000-000000000000")
                    .entityId("00000000-0000-0000-0000-000000000000")
                    .integrationCredentialsId("00000000-0000-0000-0000-000000000000")
                    .name("My Integration")
                    .version(0L)
                    .build()
            )

        val integrationConfiguration = integrationConfigurationFuture.get()
        integrationConfiguration.validate()
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
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val integrationConfigurationResponseFuture =
            integrationConfigurationServiceAsync.retrieve(
                IntegrationConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val integrationConfigurationResponse = integrationConfigurationResponseFuture.get()
        integrationConfigurationResponse.validate()
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
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val integrationConfigurationFuture =
            integrationConfigurationServiceAsync.update(
                IntegrationConfigurationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .destination("Stripe")
                    .entityType("Bill")
                    .configData(
                        IntegrationConfigurationUpdateParams.ConfigData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .credentials(
                        IntegrationConfigurationUpdateParams.Credentials.builder()
                            .type(IntegrationConfigurationUpdateParams.Credentials.Type.HTTP_BASIC)
                            .destination(
                                IntegrationConfigurationUpdateParams.Credentials.Destination.WEBHOOK
                            )
                            .empty(true)
                            .name("Integration Credentials")
                            .version(0L)
                            .build()
                    )
                    .destinationId("00000000-0000-0000-0000-000000000000")
                    .entityId("00000000-0000-0000-0000-000000000000")
                    .integrationCredentialsId("00000000-0000-0000-0000-000000000000")
                    .name("My Integration")
                    .version(0L)
                    .build()
            )

        val integrationConfiguration = integrationConfigurationFuture.get()
        integrationConfiguration.validate()
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
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val pageFuture = integrationConfigurationServiceAsync.list()

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
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val integrationConfigurationFuture =
            integrationConfigurationServiceAsync.delete(
                IntegrationConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val integrationConfiguration = integrationConfigurationFuture.get()
        integrationConfiguration.validate()
    }

    @Test
    fun enable() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val responseFuture =
            integrationConfigurationServiceAsync.enable(
                IntegrationConfigurationEnableParams.builder().orgId("orgId").id("id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getByEntity() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val integrationConfigurationServiceAsync = client.integrationConfigurations()

        val integrationConfigurationResponseFuture =
            integrationConfigurationServiceAsync.getByEntity(
                IntegrationConfigurationGetByEntityParams.builder()
                    .orgId("orgId")
                    .entityType("entityType")
                    .destination("destination")
                    .destinationId("destinationId")
                    .entityId("entityId")
                    .build()
            )

        val integrationConfigurationResponse = integrationConfigurationResponseFuture.get()
        integrationConfigurationResponse.validate()
    }
}
