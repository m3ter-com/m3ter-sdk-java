// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
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

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.permissionPolicy())
            .isEqualTo(
                listOf(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
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
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.permissionPolicy())
            .isEqualTo(
                listOf(
                    PermissionStatementResponse.builder()
                        .addAction(PermissionStatementResponse.Action.ALL)
                        .effect(PermissionStatementResponse.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
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
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
