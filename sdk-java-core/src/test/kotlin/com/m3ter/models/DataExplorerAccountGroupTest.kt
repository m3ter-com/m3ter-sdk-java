// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExplorerAccountGroupTest {

    @Test
    fun create() {
        val dataExplorerAccountGroup =
            DataExplorerAccountGroup.builder()
                .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                .build()

        assertThat(dataExplorerAccountGroup.groupType())
            .contains(DataExplorerAccountGroup.GroupType.ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExplorerAccountGroup =
            DataExplorerAccountGroup.builder()
                .groupType(DataExplorerAccountGroup.GroupType.ACCOUNT)
                .build()

        val roundtrippedDataExplorerAccountGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExplorerAccountGroup),
                jacksonTypeRef<DataExplorerAccountGroup>(),
            )

        assertThat(roundtrippedDataExplorerAccountGroup).isEqualTo(dataExplorerAccountGroup)
    }
}
