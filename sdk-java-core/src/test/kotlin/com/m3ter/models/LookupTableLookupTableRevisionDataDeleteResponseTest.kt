// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataDeleteResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataDeleteResponse =
            LookupTableLookupTableRevisionDataDeleteResponse.builder().result("result").build()

        assertThat(lookupTableLookupTableRevisionDataDeleteResponse.result()).contains("result")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataDeleteResponse =
            LookupTableLookupTableRevisionDataDeleteResponse.builder().result("result").build()

        val roundtrippedLookupTableLookupTableRevisionDataDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableLookupTableRevisionDataDeleteResponse),
                jacksonTypeRef<LookupTableLookupTableRevisionDataDeleteResponse>(),
            )

        assertThat(roundtrippedLookupTableLookupTableRevisionDataDeleteResponse)
            .isEqualTo(lookupTableLookupTableRevisionDataDeleteResponse)
    }
}
