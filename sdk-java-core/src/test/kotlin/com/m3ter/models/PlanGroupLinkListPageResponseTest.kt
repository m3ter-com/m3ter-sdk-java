// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupLinkListPageResponseTest {

    @Test
    fun create() {
        val planGroupLinkListPageResponse =
            PlanGroupLinkListPageResponse.builder()
                .addData(
                    PlanGroupLinkResponse.builder()
                        .id("id")
                        .version(0L)
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .planGroupId("planGroupId")
                        .planId("planId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(planGroupLinkListPageResponse.data().getOrNull())
            .containsExactly(
                PlanGroupLinkResponse.builder()
                    .id("id")
                    .version(0L)
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .planGroupId("planGroupId")
                    .planId("planId")
                    .build()
            )
        assertThat(planGroupLinkListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planGroupLinkListPageResponse =
            PlanGroupLinkListPageResponse.builder()
                .addData(
                    PlanGroupLinkResponse.builder()
                        .id("id")
                        .version(0L)
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .planGroupId("planGroupId")
                        .planId("planId")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedPlanGroupLinkListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planGroupLinkListPageResponse),
                jacksonTypeRef<PlanGroupLinkListPageResponse>(),
            )

        assertThat(roundtrippedPlanGroupLinkListPageResponse)
            .isEqualTo(planGroupLinkListPageResponse)
    }
}
