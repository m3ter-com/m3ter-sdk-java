// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyAddToSupportUserParamsTest {

    @Test
    fun create() {
        PermissionPolicyAddToSupportUserParams.builder()
            .orgId("orgId")
            .permissionPolicyId("permissionPolicyId")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PermissionPolicyAddToSupportUserParams.builder()
                .permissionPolicyId("permissionPolicyId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("permissionPolicyId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PermissionPolicyAddToSupportUserParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PermissionPolicyAddToSupportUserParams.builder()
                .permissionPolicyId("permissionPolicyId")
                .build()

        val body = params._body()
    }
}
