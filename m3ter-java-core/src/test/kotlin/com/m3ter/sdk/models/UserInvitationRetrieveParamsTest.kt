// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserInvitationRetrieveParamsTest {

    @Test
    fun create() {
        UserInvitationRetrieveParams.builder().orgId("orgId").id("id").build()
    }

    @Test
    fun getPathParam() {
        val params = UserInvitationRetrieveParams.builder().orgId("orgId").id("id").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
