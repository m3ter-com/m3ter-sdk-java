// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionPolicyRemoveFromUserParamsTest {

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
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PrincipalPermissionRequest.builder().principalId("x").build())
    }

    @Test
    fun getPathParam() {
        val params =
            PermissionPolicyRemoveFromUserParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "permissionPolicyId"
        assertThat(params.getPathParam(1)).isEqualTo("permissionPolicyId")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
