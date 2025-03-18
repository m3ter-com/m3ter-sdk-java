// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
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
                        .build()
                )
                .destination("destination")
                .destinationId("destinationId")
                .entityId("entityId")
                .entityType("entityType")
                .integrationCredentialsId("integrationCredentialsId")
                .name("name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.configData())
            .isEqualTo(
                IntegrationConfigurationUpdateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .isEqualTo(
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
        assertThat(body.destination()).isEqualTo("destination")
        assertThat(body.destinationId()).isEqualTo("destinationId")
        assertThat(body.entityId()).isEqualTo("entityId")
        assertThat(body.entityType()).isEqualTo("entityType")
        assertThat(body.integrationCredentialsId()).isEqualTo("integrationCredentialsId")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                        .build()
                )
                .destination("destination")
                .destinationId("destinationId")
                .entityId("entityId")
                .entityType("entityType")
                .integrationCredentialsId("integrationCredentialsId")
                .name("name")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.configData())
            .isEqualTo(
                IntegrationConfigurationUpdateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .isEqualTo(
                IntegrationConfigurationUpdateParams.Credentials.builder()
                    .type(IntegrationConfigurationUpdateParams.Credentials.Type.HTTP_BASIC)
                    .build()
            )
        assertThat(body.destination()).isEqualTo("destination")
        assertThat(body.destinationId()).isEqualTo("destinationId")
        assertThat(body.entityId()).isEqualTo("entityId")
        assertThat(body.entityType()).isEqualTo("entityType")
        assertThat(body.integrationCredentialsId()).isEqualTo("integrationCredentialsId")
        assertThat(body.name()).isEqualTo("name")
    }
}
