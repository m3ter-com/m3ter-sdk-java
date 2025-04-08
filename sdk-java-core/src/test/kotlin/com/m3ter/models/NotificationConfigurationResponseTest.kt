// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationConfigurationResponseTest {

    @Test
    fun create() {
        val notificationConfigurationResponse =
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

        assertThat(notificationConfigurationResponse.id()).isEqualTo("id")
        assertThat(notificationConfigurationResponse.code()).isEqualTo("x")
        assertThat(notificationConfigurationResponse.description()).isEqualTo("x")
        assertThat(notificationConfigurationResponse.name()).isEqualTo("x")
        assertThat(notificationConfigurationResponse.version()).isEqualTo(0L)
        assertThat(notificationConfigurationResponse.active()).contains(true)
        assertThat(notificationConfigurationResponse.alwaysFireEvent()).contains(true)
        assertThat(notificationConfigurationResponse.calculation()).contains("calculation")
        assertThat(notificationConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(notificationConfigurationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfigurationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfigurationResponse.eventName()).contains("eventName")
        assertThat(notificationConfigurationResponse.lastModifiedBy()).contains("lastModifiedBy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationConfigurationResponse =
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

        val roundtrippedNotificationConfigurationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationConfigurationResponse),
                jacksonTypeRef<NotificationConfigurationResponse>(),
            )

        assertThat(roundtrippedNotificationConfigurationResponse)
            .isEqualTo(notificationConfigurationResponse)
    }
}
