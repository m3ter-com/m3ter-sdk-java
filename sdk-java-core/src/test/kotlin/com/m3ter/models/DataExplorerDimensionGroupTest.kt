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
                .fieldCode("x")
                .meterId("x")
                .groupType(DataExplorerDimensionGroup.GroupType.ACCOUNT)
                .build()

        assertThat(dataExplorerDimensionGroup.fieldCode()).isEqualTo("x")
        assertThat(dataExplorerDimensionGroup.meterId()).isEqualTo("x")
        assertThat(dataExplorerDimensionGroup.groupType())
            .contains(DataExplorerDimensionGroup.GroupType.ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExplorerDimensionGroup =
            DataExplorerDimensionGroup.builder()
                .fieldCode("x")
                .meterId("x")
                .groupType(DataExplorerDimensionGroup.GroupType.ACCOUNT)
                .build()

        val roundtrippedDataExplorerDimensionGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExplorerDimensionGroup),
                jacksonTypeRef<DataExplorerDimensionGroup>(),
            )

        assertThat(roundtrippedDataExplorerDimensionGroup).isEqualTo(dataExplorerDimensionGroup)
    }
}
