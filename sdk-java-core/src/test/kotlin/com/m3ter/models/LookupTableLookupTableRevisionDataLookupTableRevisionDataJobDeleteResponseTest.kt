// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.builder()
                .id("id")
                .destinationLookupTableRevisionId("destinationLookupTableRevisionId")
                .downloadUrl("downloadUrl")
                .downloadUrlExpiry("downloadUrlExpiry")
                .failureReason("failureReason")
                .fileName("fileName")
                .jobDate("jobDate")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .status(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                        .Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.Type
                        .COPY
                )
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.id())
            .contains("id")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .destinationLookupTableRevisionId()
            )
            .contains("destinationLookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .downloadUrl()
            )
            .contains("downloadUrl")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .downloadUrlExpiry()
            )
            .contains("downloadUrlExpiry")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .failureReason()
            )
            .contains("failureReason")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .fileName()
            )
            .contains("fileName")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.jobDate()
            )
            .contains("jobDate")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .lookupTableId()
            )
            .contains("lookupTableId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                    .lookupTableRevisionId()
            )
            .contains("lookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.status()
            )
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.Status
                    .PENDING
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.type()
            )
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.Type.COPY
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.version()
            )
            .contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.builder()
                .id("id")
                .destinationLookupTableRevisionId("destinationLookupTableRevisionId")
                .downloadUrl("downloadUrl")
                .downloadUrlExpiry("downloadUrlExpiry")
                .failureReason("failureReason")
                .fileName("fileName")
                .jobDate("jobDate")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .status(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                        .Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse.Type
                        .COPY
                )
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                ),
                jacksonTypeRef<
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
                >(),
            )

        assertThat(
                roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
            )
            .isEqualTo(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse)
    }
}
