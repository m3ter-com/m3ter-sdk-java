// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.builder()
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
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Type
                        .COPY
                )
                .version(0L)
                .build()

        assertThat(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.id())
            .contains("id")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .destinationLookupTableRevisionId()
            )
            .contains("destinationLookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .downloadUrl()
            )
            .contains("downloadUrl")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .downloadUrlExpiry()
            )
            .contains("downloadUrlExpiry")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .failureReason()
            )
            .contains("failureReason")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.fileName()
            )
            .contains("fileName")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.jobDate()
            )
            .contains("jobDate")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .lookupTableId()
            )
            .contains("lookupTableId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                    .lookupTableRevisionId()
            )
            .contains("lookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.status()
            )
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Status
                    .PENDING
            )
        assertThat(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.type())
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Type.COPY
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.version()
            )
            .contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.builder()
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
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse.Type
                        .COPY
                )
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                ),
                jacksonTypeRef<
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                >(),
            )

        assertThat(
                roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
            )
            .isEqualTo(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse)
    }
}
