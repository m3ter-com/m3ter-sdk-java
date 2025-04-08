// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupRetrieveParamsTest {

    @Test
    fun create() {
        ResourceGroupRetrieveParams.builder().orgId("orgId").type("type").id("id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ResourceGroupRetrieveParams.builder().orgId("orgId").type("type").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("type")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
