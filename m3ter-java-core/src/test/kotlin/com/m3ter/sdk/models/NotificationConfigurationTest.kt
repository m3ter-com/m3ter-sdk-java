// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NotificationConfigurationTest {

    @Test
    fun createNotificationConfiguration() {
        val notificationConfiguration =
            NotificationConfiguration.builder()
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
        assertThat(notificationConfiguration).isNotNull
        assertThat(notificationConfiguration.id()).isEqualTo("id")
        assertThat(notificationConfiguration.code()).isEqualTo("x")
        assertThat(notificationConfiguration.description()).isEqualTo("x")
        assertThat(notificationConfiguration.name()).isEqualTo("x")
        assertThat(notificationConfiguration.version()).isEqualTo(0L)
        assertThat(notificationConfiguration.active()).contains(true)
        assertThat(notificationConfiguration.alwaysFireEvent()).contains(true)
        assertThat(notificationConfiguration.calculation()).contains("calculation")
        assertThat(notificationConfiguration.createdBy()).contains("createdBy")
        assertThat(notificationConfiguration.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfiguration.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfiguration.eventName()).contains("eventName")
        assertThat(notificationConfiguration.lastModifiedBy()).contains("lastModifiedBy")
    }
}
