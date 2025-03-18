// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromSupportUserParamsTest {

    @Test
    fun create() {
        PermissionPolicyRemoveFromSupportUserParams.builder()
            .orgId("orgId")
            .permissionPolicyId("permissionPolicyId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PermissionPolicyRemoveFromSupportUserParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("permissionPolicyId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
