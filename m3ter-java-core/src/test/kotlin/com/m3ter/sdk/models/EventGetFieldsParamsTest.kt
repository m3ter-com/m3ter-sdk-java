// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetFieldsParamsTest {

    @Test
    fun create() {
        EventGetFieldsParams.builder().orgId("orgId").eventName("eventName").build()
    }

    @Test
    fun queryParams() {
        val params = EventGetFieldsParams.builder().orgId("orgId").eventName("eventName").build()
        val expected = QueryParams.builder()
        expected.put("eventName", "eventName")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventGetFieldsParams.builder().orgId("orgId").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = EventGetFieldsParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
