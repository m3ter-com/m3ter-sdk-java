// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlanGroupLinkTest {

    @Test
    fun createPlanGroupLink() {
        val planGroupLink =
            PlanGroupLink.builder()
                .id("id")
                .version(0L)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .planGroupId("planGroupId")
                .planId("planId")
                .build()
        assertThat(planGroupLink).isNotNull
        assertThat(planGroupLink.id()).isEqualTo("id")
        assertThat(planGroupLink.version()).isEqualTo(0L)
        assertThat(planGroupLink.createdBy()).contains("createdBy")
        assertThat(planGroupLink.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupLink.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planGroupLink.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(planGroupLink.planGroupId()).contains("planGroupId")
        assertThat(planGroupLink.planId()).contains("planId")
    }
}
