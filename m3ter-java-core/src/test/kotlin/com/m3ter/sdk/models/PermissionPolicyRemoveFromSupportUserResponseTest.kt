// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromSupportUserResponseTest {

    @Test
    fun createPermissionPolicyRemoveFromSupportUserResponse() {
        val permissionPolicyRemoveFromSupportUserResponse =
            PermissionPolicyRemoveFromSupportUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyRemoveFromSupportUserResponse.PrincipalType.USER)
                .version(0L)
                .build()
        assertThat(permissionPolicyRemoveFromSupportUserResponse).isNotNull
        assertThat(permissionPolicyRemoveFromSupportUserResponse.id()).contains("id")
        assertThat(permissionPolicyRemoveFromSupportUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyRemoveFromSupportUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromSupportUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromSupportUserResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyRemoveFromSupportUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyRemoveFromSupportUserResponse.principalId())
            .contains("principalId")
        assertThat(permissionPolicyRemoveFromSupportUserResponse.principalType())
            .contains(PermissionPolicyRemoveFromSupportUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyRemoveFromSupportUserResponse.version()).contains(0L)
    }
}
