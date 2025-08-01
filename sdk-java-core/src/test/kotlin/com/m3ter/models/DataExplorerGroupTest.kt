// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExplorerGroupTest {

    @Test
    fun create() {
        val dataExplorerGroup =
            DataExplorerGroup.builder().groupType(DataExplorerGroup.GroupType.ACCOUNT).build()

        assertThat(dataExplorerGroup.groupType()).contains(DataExplorerGroup.GroupType.ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExplorerGroup =
            DataExplorerGroup.builder().groupType(DataExplorerGroup.GroupType.ACCOUNT).build()

        val roundtrippedDataExplorerGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExplorerGroup),
                jacksonTypeRef<DataExplorerGroup>(),
            )

        assertThat(roundtrippedDataExplorerGroup).isEqualTo(dataExplorerGroup)
    }
}
