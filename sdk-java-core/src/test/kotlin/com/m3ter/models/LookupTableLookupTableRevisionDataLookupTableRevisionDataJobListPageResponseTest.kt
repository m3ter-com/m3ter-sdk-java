// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponseTest {

    @Test
    fun create() {
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.builder()
                .addData(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                        .builder()
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
                            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                                .Status
                                .PENDING
                        )
                        .type(
                            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                                .Type
                                .COPY
                        )
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
                    .data()
                    .getOrNull()
            )
            .containsExactly(
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
                        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                            .Status
                            .PENDING
                    )
                    .type(
                        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                            .Type
                            .COPY
                    )
                    .version(0L)
                    .build()
            )
        assertThat(
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
                    .nextToken()
            )
            .contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.builder()
                .addData(
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                        .builder()
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
                            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                                .Status
                                .PENDING
                        )
                        .type(
                            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse
                                .Type
                                .COPY
                        )
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
                ),
                jacksonTypeRef<
                    LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
                >(),
            )

        assertThat(
                roundtrippedLookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
            )
            .isEqualTo(lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse)
    }
}
