// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyResponseTest {

    @Test
    fun create() {
        val permissionPolicyResponse =
            PermissionPolicyResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .managedPolicy(true)
                .name("name")
                .addPermissionPolicy(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .version(0L)
                .build()

        assertThat(permissionPolicyResponse.id()).contains("id")
        assertThat(permissionPolicyResponse.createdBy()).contains("createdBy")
        assertThat(permissionPolicyResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicyResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(permissionPolicyResponse.managedPolicy()).contains(true)
        assertThat(permissionPolicyResponse.name()).contains("name")
        assertThat(permissionPolicyResponse.permissionPolicy().getOrNull())
            .containsExactly(
                PermissionStatementResponse.builder()
                    .addAction(PermissionStatementResponse.Action.ALL)
                    .effect(PermissionStatementResponse.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
        assertThat(permissionPolicyResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionPolicyResponse =
            PermissionPolicyResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .managedPolicy(true)
                .name("name")
                .addPermissionPolicy(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .version(0L)
                .build()

        val roundtrippedPermissionPolicyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionPolicyResponse),
                jacksonTypeRef<PermissionPolicyResponse>(),
            )

        assertThat(roundtrippedPermissionPolicyResponse).isEqualTo(permissionPolicyResponse)
    }
}
