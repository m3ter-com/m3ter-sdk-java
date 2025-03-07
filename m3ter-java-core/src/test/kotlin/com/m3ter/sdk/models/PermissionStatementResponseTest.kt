// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionStatementResponseTest {

    @Test
    fun createPermissionStatementResponse() {
        val permissionStatementResponse =
            PermissionStatementResponse.builder()
                .addAction(PermissionStatementResponse.Action.ALL)
                .effect(PermissionStatementResponse.Effect.ALLOW)
                .addResource("string")
                .build()
        assertThat(permissionStatementResponse).isNotNull
        assertThat(permissionStatementResponse.action())
            .containsExactly(PermissionStatementResponse.Action.ALL)
        assertThat(permissionStatementResponse.effect())
            .isEqualTo(PermissionStatementResponse.Effect.ALLOW)
        assertThat(permissionStatementResponse.resource()).containsExactly("string")
    }
}
