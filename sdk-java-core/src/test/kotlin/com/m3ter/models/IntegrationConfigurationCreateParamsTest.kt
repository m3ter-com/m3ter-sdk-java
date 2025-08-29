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
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationConfigurationCreateParams.builder()
                .destination("Stripe")
                .entityType("Bill")
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

        val body = params._body()

        assertThat(body.destination()).isEqualTo("Stripe")
        assertThat(body.entityType()).isEqualTo("Bill")
        assertThat(body.configData())
            .contains(
                IntegrationConfigurationCreateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .contains(
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
        assertThat(body.destinationId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.entityId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.integrationCredentialsId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.name()).contains("My Integration")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegrationConfigurationCreateParams.builder()
                .destination("Stripe")
                .entityType("Bill")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("Stripe")
        assertThat(body.entityType()).isEqualTo("Bill")
    }
}
