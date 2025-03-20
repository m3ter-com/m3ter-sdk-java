// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupLinkUpdateParamsTest {

    @Test
    fun create() {
        PlanGroupLinkUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .planGroupId("x")
            .planId("x")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanGroupLinkUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .planGroupId("x")
                .planId("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanGroupLinkUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .planGroupId("x")
                .planId("x")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.planGroupId()).isEqualTo("x")
        assertThat(body.planId()).isEqualTo("x")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanGroupLinkUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .planGroupId("x")
                .planId("x")
                .build()

        val body = params._body()

        assertThat(body.planGroupId()).isEqualTo("x")
        assertThat(body.planId()).isEqualTo("x")
    }
}
