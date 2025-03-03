// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PermissionPolicyTest {

    @Test
    fun createPermissionPolicy() {
        val permissionPolicy =
            PermissionPolicy.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .managedPolicy(true)
                .name("name")
                .addPermissionPolicy(
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .version(0L)
                .build()
        assertThat(permissionPolicy).isNotNull
        assertThat(permissionPolicy.id()).contains("id")
        assertThat(permissionPolicy.createdBy()).contains("createdBy")
        assertThat(permissionPolicy.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicy.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(permissionPolicy.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(permissionPolicy.managedPolicy()).contains(true)
        assertThat(permissionPolicy.name()).contains("name")
        assertThat(permissionPolicy.permissionPolicy().get())
            .containsExactly(
                PermissionStatement.builder()
                    .addAction(PermissionStatement.Action.ALL)
                    .effect(PermissionStatement.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
        assertThat(permissionPolicy.version()).contains(0L)
    }
}
