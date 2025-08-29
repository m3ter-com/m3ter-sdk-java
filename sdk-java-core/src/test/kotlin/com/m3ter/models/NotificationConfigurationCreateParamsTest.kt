// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationConfigurationCreateParamsTest {

    @Test
    fun create() {
        NotificationConfigurationCreateParams.builder()
            .orgId("orgId")
            .code("commitment_under_10_percent")
            .description("Commitment amount fell below 10%")
            .eventName("configuration.commitment.updated")
            .name("Commitment has under 10% remaining")
            .active(true)
            .alwaysFireEvent(false)
            .calculation(
                "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
            )
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotificationConfigurationCreateParams.builder()
                .code("commitment_under_10_percent")
                .description("Commitment amount fell below 10%")
                .eventName("configuration.commitment.updated")
                .name("Commitment has under 10% remaining")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationConfigurationCreateParams.builder()
                .orgId("orgId")
                .code("commitment_under_10_percent")
                .description("Commitment amount fell below 10%")
                .eventName("configuration.commitment.updated")
                .name("Commitment has under 10% remaining")
                .active(true)
                .alwaysFireEvent(false)
                .calculation(
                    "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("commitment_under_10_percent")
        assertThat(body.description()).isEqualTo("Commitment amount fell below 10%")
        assertThat(body.eventName()).isEqualTo("configuration.commitment.updated")
        assertThat(body.name()).isEqualTo("Commitment has under 10% remaining")
        assertThat(body.active()).contains(true)
        assertThat(body.alwaysFireEvent()).contains(false)
        assertThat(body.calculation())
            .contains(
                "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationConfigurationCreateParams.builder()
                .code("commitment_under_10_percent")
                .description("Commitment amount fell below 10%")
                .eventName("configuration.commitment.updated")
                .name("Commitment has under 10% remaining")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("commitment_under_10_percent")
        assertThat(body.description()).isEqualTo("Commitment amount fell below 10%")
        assertThat(body.eventName()).isEqualTo("configuration.commitment.updated")
        assertThat(body.name()).isEqualTo("Commitment has under 10% remaining")
    }
}
