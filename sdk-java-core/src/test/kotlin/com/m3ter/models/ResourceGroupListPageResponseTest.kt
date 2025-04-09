// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupListPageResponseTest {

    @Test
    fun create() {
        val resourceGroupListPageResponse =
            ResourceGroupListPageResponse.builder()
                .addData(
                    ResourceGroupResponse.builder()
                        .id("id")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(resourceGroupListPageResponse.data().getOrNull())
            .containsExactly(
                ResourceGroupResponse.builder()
                    .id("id")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .version(0L)
                    .build()
            )
        assertThat(resourceGroupListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resourceGroupListPageResponse =
            ResourceGroupListPageResponse.builder()
                .addData(
                    ResourceGroupResponse.builder()
                        .id("id")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedResourceGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resourceGroupListPageResponse),
                jacksonTypeRef<ResourceGroupListPageResponse>(),
            )

        assertThat(roundtrippedResourceGroupListPageResponse)
            .isEqualTo(resourceGroupListPageResponse)
    }
}
