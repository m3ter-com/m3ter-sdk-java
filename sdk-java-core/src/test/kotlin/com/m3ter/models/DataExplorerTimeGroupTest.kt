// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExplorerTimeGroupTest {

    @Test
    fun create() {
        val dataExplorerTimeGroup =
            DataExplorerTimeGroup.builder()
                .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                .frequency(DataExplorerTimeGroup.Frequency.DAY)
                .build()

        assertThat(dataExplorerTimeGroup.groupType()).contains(DataExplorerGroup.GroupType.ACCOUNT)
        assertThat(dataExplorerTimeGroup.frequency()).isEqualTo(DataExplorerTimeGroup.Frequency.DAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExplorerTimeGroup =
            DataExplorerTimeGroup.builder()
                .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                .frequency(DataExplorerTimeGroup.Frequency.DAY)
                .build()

        val roundtrippedDataExplorerTimeGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExplorerTimeGroup),
                jacksonTypeRef<DataExplorerTimeGroup>(),
            )

        assertThat(roundtrippedDataExplorerTimeGroup).isEqualTo(dataExplorerTimeGroup)
    }
}
