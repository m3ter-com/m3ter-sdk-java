// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrincipalPermissionRequestTest {

    @Test
    fun create() {
        val principalPermissionRequest =
            PrincipalPermissionRequest.builder().principalId("x").version(0L).build()

        assertThat(principalPermissionRequest.principalId()).isEqualTo("x")
        assertThat(principalPermissionRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val principalPermissionRequest =
            PrincipalPermissionRequest.builder().principalId("x").version(0L).build()

        val roundtrippedPrincipalPermissionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(principalPermissionRequest),
                jacksonTypeRef<PrincipalPermissionRequest>(),
            )

        assertThat(roundtrippedPrincipalPermissionRequest).isEqualTo(principalPermissionRequest)
    }
}
