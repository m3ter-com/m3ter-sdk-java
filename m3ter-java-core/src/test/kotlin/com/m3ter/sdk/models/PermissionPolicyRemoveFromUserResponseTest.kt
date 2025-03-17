// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromUserResponseTest {

    @Test
    fun createPermissionPolicyRemoveFromUserResponse() {
        val permissionPolicyRemoveFromUserResponse =
            PermissionPolicyRemoveFromUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyRemoveFromUserResponse.PrincipalType.USER)
                .version(0L)
                .build()
        assertThat(permissionPolicyRemoveFromUserResponse).isNotNull
        assertThat(permissionPolicyRemoveFromUserResponse.id()).contains("id")
        assertThat(permissionPolicyRemoveFromUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyRemoveFromUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromUserResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyRemoveFromUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyRemoveFromUserResponse.principalId()).contains("principalId")
        assertThat(permissionPolicyRemoveFromUserResponse.principalType())
            .contains(PermissionPolicyRemoveFromUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyRemoveFromUserResponse.version()).contains(0L)
    }
}
