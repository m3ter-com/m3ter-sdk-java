// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationResponseTest {

    @Test
    fun create() {
        val invitationResponse =
            InvitationResponse.builder()
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

        assertThat(invitationResponse.id()).isEqualTo("id")
        assertThat(invitationResponse.accepted()).isEqualTo(true)
        assertThat(invitationResponse.dtEndAccess())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.dtExpiry())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.email()).isEqualTo("email")
        assertThat(invitationResponse.firstName()).isEqualTo("firstName")
        assertThat(invitationResponse.invitingPrincipalId()).isEqualTo("invitingPrincipalId")
        assertThat(invitationResponse.lastName()).isEqualTo("lastName")
        assertThat(invitationResponse.permissionPolicyIds()).containsExactly("string")
        assertThat(invitationResponse.version()).isEqualTo(0L)
        assertThat(invitationResponse.createdBy()).contains("createdBy")
        assertThat(invitationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.lastModifiedBy()).contains("lastModifiedBy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationResponse =
            InvitationResponse.builder()
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

        val roundtrippedInvitationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationResponse),
                jacksonTypeRef<InvitationResponse>(),
            )

        assertThat(roundtrippedInvitationResponse).isEqualTo(invitationResponse)
    }
}
