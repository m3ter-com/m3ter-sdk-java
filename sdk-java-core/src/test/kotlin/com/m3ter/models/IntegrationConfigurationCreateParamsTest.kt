// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationConfigurationCreateParams.builder()
                .configData(
                    IntegrationConfigurationCreateParams.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentials(
                    IntegrationConfigurationCreateParams.Credentials.builder()
                        .type(IntegrationConfigurationCreateParams.Credentials.Type.HTTP_BASIC)
                        .build()
                )
                .destination("destination")
                .destinationId("destinationId")
                .entityId("entityId")
                .entityType("entityType")
                .integrationCredentialsId("integrationCredentialsId")
                .name("name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.configData())
            .isEqualTo(
                IntegrationConfigurationCreateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .isEqualTo(
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
            IntegrationConfigurationCreateParams.builder()
                .configData(
                    IntegrationConfigurationCreateParams.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .credentials(
                    IntegrationConfigurationCreateParams.Credentials.builder()
                        .type(IntegrationConfigurationCreateParams.Credentials.Type.HTTP_BASIC)
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

        assertThat(body.configData())
            .isEqualTo(
                IntegrationConfigurationCreateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .isEqualTo(
                IntegrationConfigurationCreateParams.Credentials.builder()
                    .type(IntegrationConfigurationCreateParams.Credentials.Type.HTTP_BASIC)
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
