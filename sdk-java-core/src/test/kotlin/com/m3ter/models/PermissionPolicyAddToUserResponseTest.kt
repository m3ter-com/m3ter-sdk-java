// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyAddToUserResponseTest {

    @Test
    fun create() {
        val permissionPolicyAddToUserResponse =
            PermissionPolicyAddToUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToUserResponse.PrincipalType.USER)
                .version(0L)
                .build()

        assertThat(permissionPolicyAddToUserResponse.id()).contains("id")
        assertThat(permissionPolicyAddToUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyAddToUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToUserResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(permissionPolicyAddToUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyAddToUserResponse.principalId()).contains("principalId")
        assertThat(permissionPolicyAddToUserResponse.principalType())
            .contains(PermissionPolicyAddToUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyAddToUserResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionPolicyAddToUserResponse =
            PermissionPolicyAddToUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToUserResponse.PrincipalType.USER)
                .version(0L)
                .build()

        val roundtrippedPermissionPolicyAddToUserResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionPolicyAddToUserResponse),
                jacksonTypeRef<PermissionPolicyAddToUserResponse>(),
            )

        assertThat(roundtrippedPermissionPolicyAddToUserResponse)
            .isEqualTo(permissionPolicyAddToUserResponse)
    }
}
