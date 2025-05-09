// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionPolicyCreateParamsTest {

    @Test
    fun create() {
        PermissionPolicyCreateParams.builder()
            .orgId("orgId")
            .name("x")
            .addPermissionPolicy(
                PermissionStatementResponse.builder()
                    .addAction(PermissionStatementResponse.Action.ALL)
                    .effect(PermissionStatementResponse.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PermissionPolicyCreateParams.builder()
                .name("x")
                .addPermissionPolicy(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PermissionPolicyCreateParams.builder()
                .orgId("orgId")
                .name("x")
                .addPermissionPolicy(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.permissionPolicy())
            .containsExactly(
                PermissionStatementResponse.builder()
                    .addAction(PermissionStatementResponse.Action.ALL)
                    .effect(PermissionStatementResponse.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PermissionPolicyCreateParams.builder()
                .name("x")
                .addPermissionPolicy(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.permissionPolicy())
            .containsExactly(
                PermissionStatementResponse.builder()
                    .addAction(PermissionStatementResponse.Action.ALL)
                    .effect(PermissionStatementResponse.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
    }
}
