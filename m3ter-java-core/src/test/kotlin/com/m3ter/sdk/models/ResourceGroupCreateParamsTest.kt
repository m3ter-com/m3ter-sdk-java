// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupCreateParamsTest {

    @Test
    fun create() {
        ResourceGroupCreateParams.builder()
            .orgId("orgId")
            .type("type")
            .name("x")
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ResourceGroupCreateParams.builder()
                .orgId("orgId")
                .type("type")
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
            ResourceGroupCreateParams.builder().orgId("orgId").type("type").name("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            ResourceGroupCreateParams.builder().orgId("orgId").type("type").name("x").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "type"
        assertThat(params.getPathParam(1)).isEqualTo("type")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
