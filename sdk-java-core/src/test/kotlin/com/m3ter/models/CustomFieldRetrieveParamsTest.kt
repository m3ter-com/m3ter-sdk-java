// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldRetrieveParamsTest {

    @Test
    fun create() {
        CustomFieldRetrieveParams.builder().orgId("orgId").build()
    }

    @Test
    fun pathParams() {
        val params = CustomFieldRetrieveParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
