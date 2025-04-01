// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventConfigurationResponseTest {

    @Test
    fun create() {
        val scheduledEventConfigurationResponse =
            ScheduledEventConfigurationResponse.builder()
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

        assertThat(scheduledEventConfigurationResponse.id()).isEqualTo("id")
        assertThat(scheduledEventConfigurationResponse.entity()).isEqualTo("x")
        assertThat(scheduledEventConfigurationResponse.field()).isEqualTo("x")
        assertThat(scheduledEventConfigurationResponse.name()).isEqualTo("x")
        assertThat(scheduledEventConfigurationResponse.offset()).isEqualTo(0L)
        assertThat(scheduledEventConfigurationResponse.version()).isEqualTo(0L)
        assertThat(scheduledEventConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(scheduledEventConfigurationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfigurationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfigurationResponse.lastModifiedBy()).contains("lastModifiedBy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventConfigurationResponse =
            ScheduledEventConfigurationResponse.builder()
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

        val roundtrippedScheduledEventConfigurationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventConfigurationResponse),
                jacksonTypeRef<ScheduledEventConfigurationResponse>(),
            )

        assertThat(roundtrippedScheduledEventConfigurationResponse)
            .isEqualTo(scheduledEventConfigurationResponse)
    }
}
