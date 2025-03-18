// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyAddToUserGroupResponseTest {

    @Test
    fun create() {
        val permissionPolicyAddToUserGroupResponse =
            PermissionPolicyAddToUserGroupResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToUserGroupResponse.PrincipalType.USER)
                .version(0L)
                .build()

        assertThat(permissionPolicyAddToUserGroupResponse.id()).contains("id")
        assertThat(permissionPolicyAddToUserGroupResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyAddToUserGroupResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToUserGroupResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToUserGroupResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyAddToUserGroupResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyAddToUserGroupResponse.principalId()).contains("principalId")
        assertThat(permissionPolicyAddToUserGroupResponse.principalType())
            .contains(PermissionPolicyAddToUserGroupResponse.PrincipalType.USER)
        assertThat(permissionPolicyAddToUserGroupResponse.version()).contains(0L)
    }
}
