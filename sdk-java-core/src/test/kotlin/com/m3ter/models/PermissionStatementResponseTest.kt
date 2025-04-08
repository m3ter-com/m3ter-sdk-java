// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionStatementResponseTest {

    @Test
    fun create() {
        val permissionStatementResponse =
            PermissionStatementResponse.builder()
                .addAction(PermissionStatementResponse.Action.ALL)
                .effect(PermissionStatementResponse.Effect.ALLOW)
                .addResource("string")
                .build()

        assertThat(permissionStatementResponse.action())
            .containsExactly(PermissionStatementResponse.Action.ALL)
        assertThat(permissionStatementResponse.effect())
            .isEqualTo(PermissionStatementResponse.Effect.ALLOW)
        assertThat(permissionStatementResponse.resource()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permissionStatementResponse =
            PermissionStatementResponse.builder()
                .addAction(PermissionStatementResponse.Action.ALL)
                .effect(PermissionStatementResponse.Effect.ALLOW)
                .addResource("string")
                .build()

        val roundtrippedPermissionStatementResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permissionStatementResponse),
                jacksonTypeRef<PermissionStatementResponse>(),
            )

        assertThat(roundtrippedPermissionStatementResponse).isEqualTo(permissionStatementResponse)
    }
}
