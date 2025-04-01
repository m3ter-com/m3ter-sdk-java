// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyRemoveFromUserGroupResponseTest {

    @Test
    fun create() {
        val permissionPolicyRemoveFromUserGroupResponse =
            PermissionPolicyRemoveFromUserGroupResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyRemoveFromUserGroupResponse.PrincipalType.USER)
                .version(0L)
                .build()

        assertThat(permissionPolicyRemoveFromUserGroupResponse.id()).contains("id")
        assertThat(permissionPolicyRemoveFromUserGroupResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyRemoveFromUserGroupResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromUserGroupResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyRemoveFromUserGroupResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyRemoveFromUserGroupResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyRemoveFromUserGroupResponse.principalId())
            .contains("principalId")
        assertThat(permissionPolicyRemoveFromUserGroupResponse.principalType())
            .contains(PermissionPolicyRemoveFromUserGroupResponse.PrincipalType.USER)
        assertThat(permissionPolicyRemoveFromUserGroupResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionPolicyRemoveFromUserGroupResponse =
            PermissionPolicyRemoveFromUserGroupResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyRemoveFromUserGroupResponse.PrincipalType.USER)
                .version(0L)
                .build()

        val roundtrippedPermissionPolicyRemoveFromUserGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionPolicyRemoveFromUserGroupResponse),
                jacksonTypeRef<PermissionPolicyRemoveFromUserGroupResponse>(),
            )

        assertThat(roundtrippedPermissionPolicyRemoveFromUserGroupResponse)
            .isEqualTo(permissionPolicyRemoveFromUserGroupResponse)
    }
}
