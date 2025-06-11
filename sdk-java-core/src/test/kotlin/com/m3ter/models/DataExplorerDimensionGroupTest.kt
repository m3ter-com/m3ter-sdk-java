// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExplorerDimensionGroupTest {

    @Test
    fun create() {
        val dataExplorerDimensionGroup =
            DataExplorerDimensionGroup.builder()
                .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                .fieldCode("x")
                .meterId("x")
                .build()

        assertThat(dataExplorerDimensionGroup.groupType())
            .contains(DataExplorerGroup.GroupType.ACCOUNT)
        assertThat(dataExplorerDimensionGroup.fieldCode()).isEqualTo("x")
        assertThat(dataExplorerDimensionGroup.meterId()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExplorerDimensionGroup =
            DataExplorerDimensionGroup.builder()
                .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                .fieldCode("x")
                .meterId("x")
                .build()

        val roundtrippedDataExplorerDimensionGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExplorerDimensionGroup),
                jacksonTypeRef<DataExplorerDimensionGroup>(),
            )

        assertThat(roundtrippedDataExplorerDimensionGroup).isEqualTo(dataExplorerDimensionGroup)
    }
}
