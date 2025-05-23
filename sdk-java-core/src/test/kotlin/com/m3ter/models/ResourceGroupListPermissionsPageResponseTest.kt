// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupListPermissionsPageResponseTest {

    @Test
    fun create() {
        val resourceGroupListPermissionsPageResponse =
            ResourceGroupListPermissionsPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(resourceGroupListPermissionsPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(resourceGroupListPermissionsPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resourceGroupListPermissionsPageResponse =
            ResourceGroupListPermissionsPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedResourceGroupListPermissionsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resourceGroupListPermissionsPageResponse),
                jacksonTypeRef<ResourceGroupListPermissionsPageResponse>(),
            )

        assertThat(roundtrippedResourceGroupListPermissionsPageResponse)
            .isEqualTo(resourceGroupListPermissionsPageResponse)
    }
}
