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
                .code("commitment_under_10_percent")
                .description("Commitment amount fell below 10%")
                .name("Commitment has under 10% remaining")
                .active(true)
                .alwaysFireEvent(false)
                .calculation(
                    "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("configuration.commitment.updated")
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()

        assertThat(notificationConfigurationResponse.id()).isEqualTo("id")
        assertThat(notificationConfigurationResponse.code())
            .isEqualTo("commitment_under_10_percent")
        assertThat(notificationConfigurationResponse.description())
            .isEqualTo("Commitment amount fell below 10%")
        assertThat(notificationConfigurationResponse.name())
            .isEqualTo("Commitment has under 10% remaining")
        assertThat(notificationConfigurationResponse.active()).contains(true)
        assertThat(notificationConfigurationResponse.alwaysFireEvent()).contains(false)
        assertThat(notificationConfigurationResponse.calculation())
            .contains(
                "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
            )
        assertThat(notificationConfigurationResponse.createdBy()).contains("createdBy")
        assertThat(notificationConfigurationResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfigurationResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationConfigurationResponse.eventName())
            .contains("configuration.commitment.updated")
        assertThat(notificationConfigurationResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(notificationConfigurationResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationConfigurationResponse =
            NotificationConfigurationResponse.builder()
                .id("id")
                .code("commitment_under_10_percent")
                .description("Commitment amount fell below 10%")
                .name("Commitment has under 10% remaining")
                .active(true)
                .alwaysFireEvent(false)
                .calculation(
                    "(new.amountSpent >= ((new.amount*90)/100)) \nAND ((old.amountSpent <= ((old.amount*90)/100)) OR (old.amountSpent == null))"
                )
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("configuration.commitment.updated")
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
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
