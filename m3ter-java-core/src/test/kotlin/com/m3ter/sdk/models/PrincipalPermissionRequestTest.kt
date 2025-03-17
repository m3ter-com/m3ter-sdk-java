// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrincipalPermissionRequestTest {

    @Test
    fun createPrincipalPermissionRequest() {
        val principalPermissionRequest =
            PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
        assertThat(principalPermissionRequest).isNotNull
        assertThat(principalPermissionRequest.principalId()).isEqualTo("x")
        assertThat(principalPermissionRequest.version()).contains(0L)
    }
}
