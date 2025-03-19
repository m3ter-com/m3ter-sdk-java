// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupResponseTest {

    @Test
    fun createResourceGroupResponse() {
        val resourceGroupResponse =
            ResourceGroupResponse.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()
        assertThat(resourceGroupResponse).isNotNull
        assertThat(resourceGroupResponse.id()).contains("id")
        assertThat(resourceGroupResponse.createdBy()).contains("createdBy")
        assertThat(resourceGroupResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroupResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroupResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(resourceGroupResponse.name()).contains("name")
        assertThat(resourceGroupResponse.version()).contains(0L)
    }
}
