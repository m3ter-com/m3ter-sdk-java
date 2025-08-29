// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationConfigurationUpdateParams.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
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

        val body = params._body()

        assertThat(body.destination()).isEqualTo("Stripe")
        assertThat(body.entityType()).isEqualTo("Bill")
        assertThat(body.configData())
            .contains(
                IntegrationConfigurationUpdateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.credentials())
            .contains(
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
        assertThat(body.destinationId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.entityId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.integrationCredentialsId()).contains("00000000-0000-0000-0000-000000000000")
        assertThat(body.name()).contains("My Integration")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegrationConfigurationUpdateParams.builder()
                .id("id")
                .destination("Stripe")
                .entityType("Bill")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("Stripe")
        assertThat(body.entityType()).isEqualTo("Bill")
    }
}
