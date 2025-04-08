// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSetActiveParamsTest {

    @Test
    fun create() {
        WebhookSetActiveParams.builder().orgId("orgId").id("id").active(true).build()
    }

    @Test
    fun pathParams() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").active(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("active", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
