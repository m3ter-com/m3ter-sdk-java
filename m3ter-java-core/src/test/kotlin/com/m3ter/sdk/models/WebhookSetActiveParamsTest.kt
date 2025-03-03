// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WebhookSetActiveParamsTest {

    @Test
    fun create() {
        WebhookSetActiveParams.builder().orgId("orgId").id("id").active(true).build()
    }

    @Test
    fun queryParams() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").active(true).build()
        val expected = QueryParams.builder()
        expected.put("active", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = WebhookSetActiveParams.builder().orgId("orgId").id("id").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
