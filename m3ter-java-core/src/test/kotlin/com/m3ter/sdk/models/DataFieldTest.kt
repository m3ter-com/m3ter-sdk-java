// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataFieldTest {

    @Test
    fun createDataField() {
        val dataField =
            DataField.builder()
                .category(DataField.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .build()
        assertThat(dataField).isNotNull
        assertThat(dataField.category()).isEqualTo(DataField.Category.WHO)
        assertThat(dataField.code()).isEqualTo("{1{}}_")
        assertThat(dataField.name()).isEqualTo("x")
        assertThat(dataField.unit()).contains("x")
    }
}
