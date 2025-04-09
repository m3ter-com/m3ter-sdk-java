// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationConfigurationListPageResponseTest {

    @Test
    fun create() {
        val notificationConfigurationListPageResponse =
            NotificationConfigurationListPageResponse.builder()
                .addData(
                    NotificationConfigurationResponse.builder()
                        .id("id")
                        .code("x")
                        .description("x")
                        .name("x")
                        .version(0L)
                        .active(true)
                        .alwaysFireEvent(true)
                        .calculation("calculation")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("eventName")
                        .lastModifiedBy("lastModifiedBy")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(notificationConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
                NotificationConfigurationResponse.builder()
                    .id("id")
                    .code("x")
                    .description("x")
                    .name("x")
                    .version(0L)
                    .active(true)
                    .alwaysFireEvent(true)
                    .calculation("calculation")
                    .createdBy("createdBy")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventName("eventName")
                    .lastModifiedBy("lastModifiedBy")
                    .build()
            )
        assertThat(notificationConfigurationListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationConfigurationListPageResponse =
            NotificationConfigurationListPageResponse.builder()
                .addData(
                    NotificationConfigurationResponse.builder()
                        .id("id")
                        .code("x")
                        .description("x")
                        .name("x")
                        .version(0L)
                        .active(true)
                        .alwaysFireEvent(true)
                        .calculation("calculation")
                        .createdBy("createdBy")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("eventName")
                        .lastModifiedBy("lastModifiedBy")
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedNotificationConfigurationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationConfigurationListPageResponse),
                jacksonTypeRef<NotificationConfigurationListPageResponse>(),
            )

        assertThat(roundtrippedNotificationConfigurationListPageResponse)
            .isEqualTo(notificationConfigurationListPageResponse)
    }
}
