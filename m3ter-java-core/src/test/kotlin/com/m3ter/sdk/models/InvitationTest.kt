// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvitationTest {

    @Test
    fun createInvitation() {
        val invitation =
            Invitation.builder()
                .id("id")
                .accepted(true)
                .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("email")
                .firstName("firstName")
                .invitingPrincipalId("invitingPrincipalId")
                .lastName("lastName")
                .addPermissionPolicyId("string")
                .version(0L)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(invitation).isNotNull
        assertThat(invitation.id()).isEqualTo("id")
        assertThat(invitation.accepted()).isEqualTo(true)
        assertThat(invitation.dtEndAccess())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.dtExpiry())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.email()).isEqualTo("email")
        assertThat(invitation.firstName()).isEqualTo("firstName")
        assertThat(invitation.invitingPrincipalId()).isEqualTo("invitingPrincipalId")
        assertThat(invitation.lastName()).isEqualTo("lastName")
        assertThat(invitation.permissionPolicyIds()).containsExactly("string")
        assertThat(invitation.version()).isEqualTo(0L)
        assertThat(invitation.createdBy()).contains("createdBy")
        assertThat(invitation.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitation.lastModifiedBy()).contains("lastModifiedBy")
    }
}
