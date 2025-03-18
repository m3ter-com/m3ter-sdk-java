// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserResponseTest {

    @Test
    fun createUserResponse() {
        val userResponse =
            UserResponse.builder()
                .id("id")
                .contactNumber("contactNumber")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .firstAcceptedTermsAndConditions(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstName("firstName")
                .lastAcceptedTermsAndConditions(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        assertThat(userResponse).isNotNull
        assertThat(userResponse.id()).contains("id")
        assertThat(userResponse.contactNumber()).contains("contactNumber")
        assertThat(userResponse.createdBy()).contains("createdBy")
        assertThat(userResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userResponse.dtEndAccess())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userResponse.email()).contains("email")
        assertThat(userResponse.firstAcceptedTermsAndConditions())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userResponse.firstName()).contains("firstName")
        assertThat(userResponse.lastAcceptedTermsAndConditions())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(userResponse.lastName()).contains("lastName")
        assertThat(userResponse.organizations().getOrNull()).containsExactly("string")
        assertThat(userResponse.permissionPolicy().getOrNull())
            .containsExactly(
                PermissionStatementResponse.builder()
                    .addAction(PermissionStatementResponse.Action.ALL)
                    .effect(PermissionStatementResponse.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
        assertThat(userResponse.supportUser()).contains(true)
        assertThat(userResponse.version()).contains(0L)
    }
}
