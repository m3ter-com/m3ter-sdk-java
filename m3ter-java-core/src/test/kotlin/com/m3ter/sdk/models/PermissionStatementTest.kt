// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionStatementTest {

    @Test
    fun createPermissionStatement() {
        val permissionStatement =
            PermissionStatement.builder()
                .addAction(PermissionStatement.Action.ALL)
                .effect(PermissionStatement.Effect.ALLOW)
                .addResource("string")
                .build()
        assertThat(permissionStatement).isNotNull
        assertThat(permissionStatement.action()).containsExactly(PermissionStatement.Action.ALL)
        assertThat(permissionStatement.effect()).isEqualTo(PermissionStatement.Effect.ALLOW)
        assertThat(permissionStatement.resource()).containsExactly("string")
    }
}
