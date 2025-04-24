// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
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
internal class IntegrationConfigurationServiceTest {

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
        val integrationConfigurationService = client.integrationConfigurations()

        val integrationConfiguration =
            integrationConfigurationService.create(
                IntegrationConfigurationCreateParams.builder()
                    .orgId("orgId")
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
                            .name("name")
                            .version(0L)
                            .build()
                    )
                    .destination("destination")
                    .destinationId("destinationId")
                    .entityId("entityId")
                    .entityType("entityType")
                    .integrationCredentialsId("integrationCredentialsId")
                    .name("name")
                    .version(0L)
                    .build()
            )

        integrationConfiguration.validate()
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
        val integrationConfigurationService = client.integrationConfigurations()

        val integrationConfigurationResponse =
            integrationConfigurationService.retrieve(
                IntegrationConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        integrationConfigurationResponse.validate()
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
        val integrationConfigurationService = client.integrationConfigurations()

        val integrationConfiguration =
            integrationConfigurationService.update(
                IntegrationConfigurationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
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
                            .name("name")
                            .version(0L)
                            .build()
                    )
                    .destination("destination")
                    .destinationId("destinationId")
                    .entityId("entityId")
                    .entityType("entityType")
                    .integrationCredentialsId("integrationCredentialsId")
                    .name("name")
                    .version(0L)
                    .build()
            )

        integrationConfiguration.validate()
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
        val integrationConfigurationService = client.integrationConfigurations()

        val page = integrationConfigurationService.list()

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
        val integrationConfigurationService = client.integrationConfigurations()

        val integrationConfiguration =
            integrationConfigurationService.delete(
                IntegrationConfigurationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        integrationConfiguration.validate()
    }

    @Test
    fun enable() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val integrationConfigurationService = client.integrationConfigurations()

        val response =
            integrationConfigurationService.enable(
                IntegrationConfigurationEnableParams.builder().orgId("orgId").id("id").build()
            )

        response.validate()
    }

    @Test
    fun getByEntity() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val integrationConfigurationService = client.integrationConfigurations()

        val integrationConfigurationResponse =
            integrationConfigurationService.getByEntity(
                IntegrationConfigurationGetByEntityParams.builder()
                    .orgId("orgId")
                    .entityType("entityType")
                    .destination("destination")
                    .destinationId("destinationId")
                    .entityId("entityId")
                    .build()
            )

        integrationConfigurationResponse.validate()
    }
}
