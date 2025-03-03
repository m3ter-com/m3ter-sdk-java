// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResourceGroupTest {

    @Test
    fun createResourceGroup() {
        val resourceGroup =
            ResourceGroup.builder()
                .id("id")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()
        assertThat(resourceGroup).isNotNull
        assertThat(resourceGroup.id()).contains("id")
        assertThat(resourceGroup.createdBy()).contains("createdBy")
        assertThat(resourceGroup.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroup.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(resourceGroup.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(resourceGroup.name()).contains("name")
        assertThat(resourceGroup.version()).contains(0L)
    }
}
