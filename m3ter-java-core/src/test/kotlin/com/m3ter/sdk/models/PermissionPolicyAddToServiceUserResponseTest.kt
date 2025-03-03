// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionPolicyAddToServiceUserResponseTest {

    @Test
    fun createPermissionPolicyAddToServiceUserResponse() {
        val permissionPolicyAddToServiceUserResponse =
            PermissionPolicyAddToServiceUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToServiceUserResponse.PrincipalType.USER)
                .version(0L)
                .build()
        assertThat(permissionPolicyAddToServiceUserResponse).isNotNull
        assertThat(permissionPolicyAddToServiceUserResponse.id()).contains("id")
        assertThat(permissionPolicyAddToServiceUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyAddToServiceUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToServiceUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToServiceUserResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyAddToServiceUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyAddToServiceUserResponse.principalId()).contains("principalId")
        assertThat(permissionPolicyAddToServiceUserResponse.principalType())
            .contains(PermissionPolicyAddToServiceUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyAddToServiceUserResponse.version()).contains(0L)
    }
}
