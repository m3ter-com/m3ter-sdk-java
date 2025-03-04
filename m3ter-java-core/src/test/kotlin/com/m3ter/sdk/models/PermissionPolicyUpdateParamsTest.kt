// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionPolicyUpdateParamsTest {

    @Test
    fun create() {
        PermissionPolicyUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .name("x")
            .addPermissionPolicy(
                PermissionStatement.builder()
                    .addAction(PermissionStatement.Action.ALL)
                    .effect(PermissionStatement.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            PermissionPolicyUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .addPermissionPolicy(
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
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
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PermissionPolicyUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .addPermissionPolicy(
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
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
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            PermissionPolicyUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .name("x")
                .addPermissionPolicy(
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
