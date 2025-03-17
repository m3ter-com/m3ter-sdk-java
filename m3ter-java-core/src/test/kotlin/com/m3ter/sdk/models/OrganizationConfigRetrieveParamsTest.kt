// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationConfigRetrieveParamsTest {

    @Test
    fun create() {
        OrganizationConfigRetrieveParams.builder().orgId("orgId").build()
    }

    @Test
    fun getPathParam() {
        val params = OrganizationConfigRetrieveParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
