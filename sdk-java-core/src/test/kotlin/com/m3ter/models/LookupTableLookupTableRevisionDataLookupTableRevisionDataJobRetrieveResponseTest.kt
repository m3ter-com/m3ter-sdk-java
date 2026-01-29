// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.builder()
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
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                        .Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                        .Type
                        .COPY
                )
                .version(0L)
                .build()

        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.id()
            )
            .contains("id")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .destinationLookupTableRevisionId()
            )
            .contains("destinationLookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .downloadUrl()
            )
            .contains("downloadUrl")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .downloadUrlExpiry()
            )
            .contains("downloadUrlExpiry")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .failureReason()
            )
            .contains("failureReason")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .fileName()
            )
            .contains("fileName")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .jobDate()
            )
            .contains("jobDate")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .lookupTableId()
            )
            .contains("lookupTableId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .lookupTableRevisionId()
            )
            .contains("lookupTableRevisionId")
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .status()
            )
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.Status
                    .PENDING
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.type()
            )
            .contains(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.Type
                    .COPY
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .version()
            )
            .contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.builder()
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
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                        .Status
                        .PENDING
                )
                .type(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                        .Type
                        .COPY
                )
                .version(0L)
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                ),
                jacksonTypeRef<
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                >(),
            )

        assertThat(
                roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            )
            .isEqualTo(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse)
    }
}
