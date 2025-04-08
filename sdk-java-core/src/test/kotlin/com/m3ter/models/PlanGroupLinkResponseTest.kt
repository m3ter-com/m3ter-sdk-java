// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGroupLinkResponseTest {

    @Test
    fun create() {
        val planGroupLinkResponse =
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

        assertThat(planGroupLinkResponse.id()).isEqualTo("id")
        assertThat(planGroupLinkResponse.version()).isEqualTo(0L)
        assertThat(planGroupLinkResponse.createdBy()).contains("createdBy")
        assertThat(planGroupLinkResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupLinkResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupLinkResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planGroupLinkResponse.planGroupId()).contains("planGroupId")
        assertThat(planGroupLinkResponse.planId()).contains("planId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planGroupLinkResponse =
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

        val roundtrippedPlanGroupLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planGroupLinkResponse),
                jacksonTypeRef<PlanGroupLinkResponse>(),
            )

        assertThat(roundtrippedPlanGroupLinkResponse).isEqualTo(planGroupLinkResponse)
    }
}
