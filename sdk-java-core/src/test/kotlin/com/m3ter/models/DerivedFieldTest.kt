// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DerivedFieldTest {

    @Test
    fun create() {
        val derivedField =
            DerivedField.builder()
                .category(DataField.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .calculation("x")
                .build()

        assertThat(derivedField.category()).isEqualTo(DataField.Category.WHO)
        assertThat(derivedField.code()).isEqualTo("{1{}}_")
        assertThat(derivedField.name()).isEqualTo("x")
        assertThat(derivedField.unit()).contains("x")
        assertThat(derivedField.calculation()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val derivedField =
            DerivedField.builder()
                .category(DataField.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .calculation("x")
                .build()

        val roundtrippedDerivedField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(derivedField),
                jacksonTypeRef<DerivedField>(),
            )

        assertThat(roundtrippedDerivedField).isEqualTo(derivedField)
    }
}
