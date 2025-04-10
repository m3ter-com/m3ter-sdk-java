// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataFieldTest {

    @Test
    fun create() {
        val dataField =
            DataField.builder()
                .category(DataField.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .build()

        assertThat(dataField.category()).isEqualTo(DataField.Category.WHO)
        assertThat(dataField.code()).isEqualTo("{1{}}_")
        assertThat(dataField.name()).isEqualTo("x")
        assertThat(dataField.unit()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataField =
            DataField.builder()
                .category(DataField.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .build()

        val roundtrippedDataField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataField),
                jacksonTypeRef<DataField>(),
            )

        assertThat(roundtrippedDataField).isEqualTo(dataField)
    }
}
