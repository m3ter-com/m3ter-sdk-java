// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromUserGroupParamsTest {

    @Test
    fun create() {
        PermissionPolicyRemoveFromUserGroupParams.builder()
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
            PermissionPolicyRemoveFromUserGroupParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("permissionPolicyId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PermissionPolicyRemoveFromUserGroupParams.builder()
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
            PermissionPolicyRemoveFromUserGroupParams.builder()
                .orgId("orgId")
                .permissionPolicyId("permissionPolicyId")
                .principalPermissionRequest(
                    PrincipalPermissionRequest.builder().principalId("x").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PrincipalPermissionRequest.builder().principalId("x").build())
    }
}
