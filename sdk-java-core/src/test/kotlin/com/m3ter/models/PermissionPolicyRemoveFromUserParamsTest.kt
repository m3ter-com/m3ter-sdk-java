// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromUserParamsTest {

    @Test
    fun create() {
        PermissionPolicyRemoveFromUserParams.builder()
            .orgId("orgId")
            .permissionPolicyId("permissionPolicyId")
            .principalPermissionRequest(
                PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PermissionPolicyRemoveFromUserParams.builder()
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("permissionPolicyId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PermissionPolicyRemoveFromUserParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PrincipalPermissionRequest.builder().principalId("x").version(0L).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PermissionPolicyRemoveFromUserParams.builder()
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PrincipalPermissionRequest.builder().principalId("x").build())
    }
}
