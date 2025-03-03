// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanGroupLinkCreateParamsTest {

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

    @Test
    fun getPathParam() {
        val params =
            PlanGroupLinkCreateParams.builder().orgId("orgId").planGroupId("x").planId("x").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
