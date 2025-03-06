// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanGroupLinkResponseTest {

    @Test
    fun createPlanGroupLinkResponse() {
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
        assertThat(planGroupLinkResponse).isNotNull
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
}
