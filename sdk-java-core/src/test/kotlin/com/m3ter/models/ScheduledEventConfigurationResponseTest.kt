// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventConfigurationResponseTest {

    @Test
    fun create() {
        val scheduledEventConfigurationResponse =
            ScheduledEventConfigurationResponse.builder()
                .id("id")
                .entity("Bill")
                .field("dueDate")
                .name("10 days after bill due date")
                .offset(10)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(scheduledEventConfigurationResponse.id()).isEqualTo("id")
        assertThat(scheduledEventConfigurationResponse.entity()).isEqualTo("Bill")
        assertThat(scheduledEventConfigurationResponse.field()).isEqualTo("dueDate")
        assertThat(scheduledEventConfigurationResponse.name())
            .isEqualTo("10 days after bill due date")
        assertThat(scheduledEventConfigurationResponse.offset()).isEqualTo(10)
        assertThat(scheduledEventConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(scheduledEventConfigurationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfigurationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledEventConfigurationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(scheduledEventConfigurationResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventConfigurationResponse =
            ScheduledEventConfigurationResponse.builder()
                .id("id")
                .entity("Bill")
                .field("dueDate")
                .name("10 days after bill due date")
                .offset(10)
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
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
