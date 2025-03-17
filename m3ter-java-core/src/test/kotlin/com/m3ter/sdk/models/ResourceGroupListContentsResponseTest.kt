// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupListContentsResponseTest {

    @Test
    fun createResourceGroupListContentsResponse() {
        val resourceGroupListContentsResponse =
            ResourceGroupListContentsResponse.builder()
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .targetId("targetId")
                .targetType(ResourceGroupListContentsResponse.TargetType.ITEM)
                .build()
        assertThat(resourceGroupListContentsResponse).isNotNull
        assertThat(resourceGroupListContentsResponse.createdBy()).contains("createdBy")
        assertThat(resourceGroupListContentsResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroupListContentsResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroupListContentsResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(resourceGroupListContentsResponse.targetId()).contains("targetId")
        assertThat(resourceGroupListContentsResponse.targetType())
            .contains(ResourceGroupListContentsResponse.TargetType.ITEM)
    }
}
