// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserUpdateParamsTest {

    @Test
    fun create() {
        UserUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val params = UserUpdateParams.builder().orgId("orgId").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(body.dtEndAccess()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.permissionPolicy().getOrNull())
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
        val params = UserUpdateParams.builder().orgId("orgId").id("id").build()

        val body = params._body()
    }
}
