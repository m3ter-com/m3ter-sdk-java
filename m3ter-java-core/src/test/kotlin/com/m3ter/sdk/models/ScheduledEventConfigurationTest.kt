// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScheduledEventConfigurationTest {

    @Test
    fun createScheduledEventConfiguration() {
        val scheduledEventConfiguration =
            ScheduledEventConfiguration.builder()
                .id("id")
                .entity("x")
                .field("x")
                .name("x")
                .offset(0L)
                .version(0L)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .build()
        assertThat(scheduledEventConfiguration).isNotNull
        assertThat(scheduledEventConfiguration.id()).isEqualTo("id")
        assertThat(scheduledEventConfiguration.entity()).isEqualTo("x")
        assertThat(scheduledEventConfiguration.field()).isEqualTo("x")
        assertThat(scheduledEventConfiguration.name()).isEqualTo("x")
        assertThat(scheduledEventConfiguration.offset()).isEqualTo(0L)
        assertThat(scheduledEventConfiguration.version()).isEqualTo(0L)
        assertThat(scheduledEventConfiguration.createdBy()).contains("createdBy")
        assertThat(scheduledEventConfiguration.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfiguration.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfiguration.lastModifiedBy()).contains("lastModifiedBy")
    }
}
