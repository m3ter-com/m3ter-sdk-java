// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserInvitationCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            UserInvitationCreateParams.builder()
                .orgId("orgId")
                .email("dev@stainless.com")
                .firstName("x")
                .lastName("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("x")
        assertThat(body.lastName()).isEqualTo("x")
        assertThat(body.contactNumber()).contains("contactNumber")
        assertThat(body.dtEndAccess()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dtExpiry()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.m3terUser()).contains(true)
        assertThat(body.permissionPolicyIds().getOrNull()).containsExactly("string")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UserInvitationCreateParams.builder()
                .orgId("orgId")
                .email("dev@stainless.com")
                .firstName("x")
                .lastName("x")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.firstName()).isEqualTo("x")
        assertThat(body.lastName()).isEqualTo("x")
    }
}
