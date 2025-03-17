// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupUpdateParamsTest {

    @Test
    fun create() {
        ResourceGroupUpdateParams.builder()
            .orgId("orgId")
            .type("type")
            .id("id")
            .name("x")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ResourceGroupUpdateParams.builder()
                .orgId("orgId")
                .type("type")
                .id("id")
                .name("x")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResourceGroupUpdateParams.builder()
                .orgId("orgId")
                .type("type")
                .id("id")
                .name("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            ResourceGroupUpdateParams.builder()
                .orgId("orgId")
                .type("type")
                .id("id")
                .name("x")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "type"
        assertThat(params.getPathParam(1)).isEqualTo("type")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
