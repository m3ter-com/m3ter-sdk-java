// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.IntegrationConfigurationCreateParams
import com.m3ter.sdk.models.IntegrationConfigurationDeleteParams
import com.m3ter.sdk.models.IntegrationConfigurationEnableParams
import com.m3ter.sdk.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.sdk.models.IntegrationConfigurationListParams
import com.m3ter.sdk.models.IntegrationConfigurationRetrieveParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntegrationConfigurationServiceTest {

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

        val integrationConfiguration =
            integrationConfigurationService.retrieve(
                IntegrationConfigurationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        integrationConfiguration.validate()
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

        val page =
            integrationConfigurationService.list(
                IntegrationConfigurationListParams.builder().orgId("orgId").build()
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

        val integrationConfiguration =
            integrationConfigurationService.getByEntity(
                IntegrationConfigurationGetByEntityParams.builder()
                    .orgId("orgId")
                    .entityType("entityType")
                    .entityId("entityId")
                    .build()
            )

        integrationConfiguration.validate()
    }
}
