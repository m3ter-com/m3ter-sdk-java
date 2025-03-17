// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationConfigurationUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.eventName()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.active()).contains(true)
        assertThat(body.alwaysFireEvent()).contains(true)
        assertThat(body.calculation()).contains("calculation")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationConfigurationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("x")
                .description("x")
                .eventName("x")
                .name("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.eventName()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            NotificationConfigurationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("x")
                .description("x")
                .eventName("x")
                .name("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
