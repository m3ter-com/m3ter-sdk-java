// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupListContentsPageResponseTest {

    @Test
    fun create() {
        val resourceGroupListContentsPageResponse =
            ResourceGroupListContentsPageResponse.builder()
                .addData(
                    ResourceGroupListContentsResponse.builder()
                        .id("id")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .targetId("targetId")
                        .targetType(ResourceGroupListContentsResponse.TargetType.ITEM)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(resourceGroupListContentsPageResponse.data().getOrNull())
            .containsExactly(
                ResourceGroupListContentsResponse.builder()
                    .id("id")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .targetId("targetId")
                    .targetType(ResourceGroupListContentsResponse.TargetType.ITEM)
                    .version(0L)
                    .build()
            )
        assertThat(resourceGroupListContentsPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resourceGroupListContentsPageResponse =
            ResourceGroupListContentsPageResponse.builder()
                .addData(
                    ResourceGroupListContentsResponse.builder()
                        .id("id")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .targetId("targetId")
                        .targetType(ResourceGroupListContentsResponse.TargetType.ITEM)
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedResourceGroupListContentsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resourceGroupListContentsPageResponse),
                jacksonTypeRef<ResourceGroupListContentsPageResponse>(),
            )

        assertThat(roundtrippedResourceGroupListContentsPageResponse)
            .isEqualTo(resourceGroupListContentsPageResponse)
    }
}
