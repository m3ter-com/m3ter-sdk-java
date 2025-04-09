// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListPageResponseTest {

    @Test
    fun create() {
        val userListPageResponse =
            UserListPageResponse.builder()
                .addData(
                    UserResponse.builder()
                        .id("id")
                        .contactNumber("contactNumber")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstAcceptedTermsAndConditions(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .firstName("firstName")
                        .lastAcceptedTermsAndConditions(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .lastModifiedBy("lastModifiedBy")
                        .lastName("lastName")
                        .addOrganization("string")
                        .addPermissionPolicy(
                            PermissionStatementResponse.builder()
                                .addAction(PermissionStatementResponse.Action.ALL)
                                .effect(PermissionStatementResponse.Effect.ALLOW)
                                .addResource("string")
                                .build()
                        )
                        .supportUser(true)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(userListPageResponse.data().getOrNull())
            .containsExactly(
                UserResponse.builder()
                    .id("id")
                    .contactNumber("contactNumber")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .firstAcceptedTermsAndConditions(
                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                    )
                    .firstName("firstName")
                    .lastAcceptedTermsAndConditions(
                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                    )
                    .lastModifiedBy("lastModifiedBy")
                    .lastName("lastName")
                    .addOrganization("string")
                    .addPermissionPolicy(
                        PermissionStatementResponse.builder()
                            .addAction(PermissionStatementResponse.Action.ALL)
                            .effect(PermissionStatementResponse.Effect.ALLOW)
                            .addResource("string")
                            .build()
                    )
                    .supportUser(true)
                    .version(0L)
                    .build()
            )
        assertThat(userListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListPageResponse =
            UserListPageResponse.builder()
                .addData(
                    UserResponse.builder()
                        .id("id")
                        .contactNumber("contactNumber")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstAcceptedTermsAndConditions(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .firstName("firstName")
                        .lastAcceptedTermsAndConditions(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .lastModifiedBy("lastModifiedBy")
                        .lastName("lastName")
                        .addOrganization("string")
                        .addPermissionPolicy(
                            PermissionStatementResponse.builder()
                                .addAction(PermissionStatementResponse.Action.ALL)
                                .effect(PermissionStatementResponse.Effect.ALLOW)
                                .addResource("string")
                                .build()
                        )
                        .supportUser(true)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedUserListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListPageResponse),
                jacksonTypeRef<UserListPageResponse>(),
            )

        assertThat(roundtrippedUserListPageResponse).isEqualTo(userListPageResponse)
    }
}
