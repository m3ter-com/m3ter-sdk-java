// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventConfigurationListPageResponseTest {

    @Test
    fun create() {
        val scheduledEventConfigurationListPageResponse =
            ScheduledEventConfigurationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(scheduledEventConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(scheduledEventConfigurationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventConfigurationListPageResponse =
            ScheduledEventConfigurationListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedScheduledEventConfigurationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventConfigurationListPageResponse),
                jacksonTypeRef<ScheduledEventConfigurationListPageResponse>(),
            )

        assertThat(roundtrippedScheduledEventConfigurationListPageResponse)
            .isEqualTo(scheduledEventConfigurationListPageResponse)
    }
}
