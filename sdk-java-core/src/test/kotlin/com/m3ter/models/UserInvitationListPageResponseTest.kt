// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInvitationListPageResponseTest {

    @Test
    fun create() {
        val userInvitationListPageResponse =
            UserInvitationListPageResponse.builder()
                .addData(
                    InvitationResponse.builder()
                        .id("id")
                        .accepted(true)
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstName("firstName")
                        .invitingPrincipalId("invitingPrincipalId")
                        .lastModifiedBy("lastModifiedBy")
                        .lastName("lastName")
                        .addPermissionPolicyId("string")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(userInvitationListPageResponse.data().getOrNull())
            .containsExactly(
                InvitationResponse.builder()
                    .id("id")
                    .accepted(true)
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .firstName("firstName")
                    .invitingPrincipalId("invitingPrincipalId")
                    .lastModifiedBy("lastModifiedBy")
                    .lastName("lastName")
                    .addPermissionPolicyId("string")
                    .version(0L)
                    .build()
            )
        assertThat(userInvitationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userInvitationListPageResponse =
            UserInvitationListPageResponse.builder()
                .addData(
                    InvitationResponse.builder()
                        .id("id")
                        .accepted(true)
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstName("firstName")
                        .invitingPrincipalId("invitingPrincipalId")
                        .lastModifiedBy("lastModifiedBy")
                        .lastName("lastName")
                        .addPermissionPolicyId("string")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedUserInvitationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userInvitationListPageResponse),
                jacksonTypeRef<UserInvitationListPageResponse>(),
            )

        assertThat(roundtrippedUserInvitationListPageResponse)
            .isEqualTo(userInvitationListPageResponse)
    }
}
