// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupLinkCreateParamsTest {

    @Test
    fun create() {
        PlanGroupLinkCreateParams.builder()
            .orgId("orgId")
            .planGroupId("x")
            .planId("x")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanGroupLinkCreateParams.builder().orgId("orgId").planGroupId("x").planId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanGroupLinkCreateParams.builder()
                .orgId("orgId")
                .planGroupId("x")
                .planId("x")
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.planGroupId()).isEqualTo("x")
        assertThat(body.planId()).isEqualTo("x")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanGroupLinkCreateParams.builder().orgId("orgId").planGroupId("x").planId("x").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.planGroupId()).isEqualTo("x")
        assertThat(body.planId()).isEqualTo("x")
    }
}
