// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun createUser() {
        val user =
            User.builder()
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
                    PermissionStatement.builder()
                        .addAction(PermissionStatement.Action.ALL)
                        .effect(PermissionStatement.Effect.ALLOW)
                        .addResource("string")
                        .build()
                )
                .supportUser(true)
                .version(0L)
                .build()
        assertThat(user).isNotNull
        assertThat(user.id()).contains("id")
        assertThat(user.contactNumber()).contains("contactNumber")
        assertThat(user.createdBy()).contains("createdBy")
        assertThat(user.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.dtEndAccess()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.dtLastModified()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.email()).contains("email")
        assertThat(user.firstAcceptedTermsAndConditions())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.firstName()).contains("firstName")
        assertThat(user.lastAcceptedTermsAndConditions())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(user.lastName()).contains("lastName")
        assertThat(user.organizations().get()).containsExactly("string")
        assertThat(user.permissionPolicy().get())
            .containsExactly(
                PermissionStatement.builder()
                    .addAction(PermissionStatement.Action.ALL)
                    .effect(PermissionStatement.Effect.ALLOW)
                    .addResource("string")
                    .build()
            )
        assertThat(user.supportUser()).contains(true)
        assertThat(user.version()).contains(0L)
    }
}
