// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationResponseTest {

    @Test
    fun create() {
        val invitationResponse =
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

        assertThat(invitationResponse.id()).isEqualTo("id")
        assertThat(invitationResponse.accepted()).contains(true)
        assertThat(invitationResponse.createdBy()).contains("createdBy")
        assertThat(invitationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.dtEndAccess())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.dtExpiry())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invitationResponse.email()).contains("email")
        assertThat(invitationResponse.firstName()).contains("firstName")
        assertThat(invitationResponse.invitingPrincipalId()).contains("invitingPrincipalId")
        assertThat(invitationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(invitationResponse.lastName()).contains("lastName")
        assertThat(invitationResponse.permissionPolicyIds().getOrNull()).containsExactly("string")
        assertThat(invitationResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationResponse =
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

        val roundtrippedInvitationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationResponse),
                jacksonTypeRef<InvitationResponse>(),
            )

        assertThat(roundtrippedInvitationResponse).isEqualTo(invitationResponse)
    }
}
