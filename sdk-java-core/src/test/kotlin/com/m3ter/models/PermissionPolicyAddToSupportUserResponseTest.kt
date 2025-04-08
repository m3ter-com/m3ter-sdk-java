// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyAddToSupportUserResponseTest {

    @Test
    fun create() {
        val permissionPolicyAddToSupportUserResponse =
            PermissionPolicyAddToSupportUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToSupportUserResponse.PrincipalType.USER)
                .version(0L)
                .build()

        assertThat(permissionPolicyAddToSupportUserResponse.id()).contains("id")
        assertThat(permissionPolicyAddToSupportUserResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyAddToSupportUserResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToSupportUserResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyAddToSupportUserResponse.lastModifiedBy())
            .contains("lastModifiedBy")
        assertThat(permissionPolicyAddToSupportUserResponse.permissionPolicyId())
            .contains("permissionPolicyId")
        assertThat(permissionPolicyAddToSupportUserResponse.principalId()).contains("principalId")
        assertThat(permissionPolicyAddToSupportUserResponse.principalType())
            .contains(PermissionPolicyAddToSupportUserResponse.PrincipalType.USER)
        assertThat(permissionPolicyAddToSupportUserResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionPolicyAddToSupportUserResponse =
            PermissionPolicyAddToSupportUserResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .permissionPolicyId("permissionPolicyId")
                .principalId("principalId")
                .principalType(PermissionPolicyAddToSupportUserResponse.PrincipalType.USER)
                .version(0L)
                .build()

        val roundtrippedPermissionPolicyAddToSupportUserResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionPolicyAddToSupportUserResponse),
                jacksonTypeRef<PermissionPolicyAddToSupportUserResponse>(),
            )

        assertThat(roundtrippedPermissionPolicyAddToSupportUserResponse)
            .isEqualTo(permissionPolicyAddToSupportUserResponse)
    }
}
