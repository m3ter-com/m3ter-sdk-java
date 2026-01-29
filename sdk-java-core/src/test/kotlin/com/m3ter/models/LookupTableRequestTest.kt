// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableRequestTest {

    @Test
    fun create() {
        val lookupTableRequest =
            LookupTableRequest.builder()
                .code("S?oC\"\$]C] ]]]]]5]")
                .name("x")
                .customFields(
                    LookupTableRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .version(0L)
                .build()

        assertThat(lookupTableRequest.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(lookupTableRequest.name()).isEqualTo("x")
        assertThat(lookupTableRequest.customFields())
            .contains(
                LookupTableRequest.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(lookupTableRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableRequest =
            LookupTableRequest.builder()
                .code("S?oC\"\$]C] ]]]]]5]")
                .name("x")
                .customFields(
                    LookupTableRequest.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .version(0L)
                .build()

        val roundtrippedLookupTableRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupTableRequest),
                jacksonTypeRef<LookupTableRequest>(),
            )

        assertThat(roundtrippedLookupTableRequest).isEqualTo(lookupTableRequest)
    }
}
