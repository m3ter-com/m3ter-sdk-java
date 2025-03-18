// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromServiceUserResponseTest {

    @Test
    fun create() {
        val permissionPolicyRemoveFromServiceUserResponse =
            PermissionPolicyRemoveFromServiceUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyRemoveFromServiceUserResponse.PrincipalType.USER)
                .version(0L)
                .build()

        assertThat(permissionPolicyRemoveFromServiceUserResponse.id()).contains("id")
        assertThat(permissionPolicyRemoveFromServiceUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyRemoveFromServiceUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromServiceUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromServiceUserResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyRemoveFromServiceUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyRemoveFromServiceUserResponse.principalId())
            .contains("principalId")
        assertThat(permissionPolicyRemoveFromServiceUserResponse.principalType())
            .contains(PermissionPolicyRemoveFromServiceUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyRemoveFromServiceUserResponse.version()).contains(0L)
    }
}
