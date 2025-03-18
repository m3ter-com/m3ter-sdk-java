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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("eventName", "eventName").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventGetFieldsParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
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
