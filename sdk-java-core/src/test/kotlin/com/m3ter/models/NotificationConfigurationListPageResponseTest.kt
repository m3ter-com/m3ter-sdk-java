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
                )
                .nextToken("nextToken")
                .build()

        assertThat(notificationConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
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
