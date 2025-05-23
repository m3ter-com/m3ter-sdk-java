// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.users

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.UserInvitationCreateParams
import com.m3ter.models.UserInvitationRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvitationServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val invitationService = client.users().invitations()

        val invitationResponse =
            invitationService.create(
                UserInvitationCreateParams.builder()
                    .orgId("orgId")
                    .email("dev@stainless.com")
                    .firstName("x")
                    .lastName("x")
                    .contactNumber("contactNumber")
                    .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtExpiry(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .m3terUser(true)
                    .addPermissionPolicyId("string")
                    .version(0L)
                    .build()
            )

        invitationResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val invitationService = client.users().invitations()

        val invitationResponse =
            invitationService.retrieve(
                UserInvitationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        invitationResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val invitationService = client.users().invitations()

        val page = invitationService.list()

        page.response().validate()
    }
}
