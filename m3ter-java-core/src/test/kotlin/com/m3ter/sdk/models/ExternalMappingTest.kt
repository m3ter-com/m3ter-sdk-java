// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalMappingTest {

    @Test
    fun createExternalMapping() {
        val externalMapping =
            ExternalMapping.builder()
                .id("id")
                .externalId("x")
                .externalSystem("x")
                .externalTable("x")
                .m3terEntity("x")
                .m3terId("x")
                .version(0L)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .integrationConfigId("integrationConfigId")
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(externalMapping).isNotNull
        assertThat(externalMapping.id()).isEqualTo("id")
        assertThat(externalMapping.externalId()).isEqualTo("x")
        assertThat(externalMapping.externalSystem()).isEqualTo("x")
        assertThat(externalMapping.externalTable()).isEqualTo("x")
        assertThat(externalMapping.m3terEntity()).isEqualTo("x")
        assertThat(externalMapping.m3terId()).isEqualTo("x")
        assertThat(externalMapping.version()).isEqualTo(0L)
        assertThat(externalMapping.createdBy()).contains("createdBy")
        assertThat(externalMapping.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMapping.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMapping.integrationConfigId()).contains("integrationConfigId")
        assertThat(externalMapping.lastModifiedBy()).contains("lastModifiedBy")
    }
}
