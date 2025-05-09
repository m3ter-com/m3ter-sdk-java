// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentListPageResponseTest {

    @Test
    fun create() {
        val counterAdjustmentListPageResponse =
            CounterAdjustmentListPageResponse.builder()
                .addData(
                    CounterAdjustmentResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .counterId("counterId")
                        .createdBy("createdBy")
                        .date(LocalDate.parse("2019-12-27"))
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .purchaseOrderNumber("purchaseOrderNumber")
                        .value(0)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(counterAdjustmentListPageResponse.data().getOrNull())
            .containsExactly(
                CounterAdjustmentResponse.builder()
                    .id("id")
                    .version(0L)
                    .accountId("accountId")
                    .counterId("counterId")
                    .createdBy("createdBy")
                    .date(LocalDate.parse("2019-12-27"))
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .value(0)
                    .build()
            )
        assertThat(counterAdjustmentListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterAdjustmentListPageResponse =
            CounterAdjustmentListPageResponse.builder()
                .addData(
                    CounterAdjustmentResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .counterId("counterId")
                        .createdBy("createdBy")
                        .date(LocalDate.parse("2019-12-27"))
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastModifiedBy("lastModifiedBy")
                        .purchaseOrderNumber("purchaseOrderNumber")
                        .value(0)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedCounterAdjustmentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterAdjustmentListPageResponse),
                jacksonTypeRef<CounterAdjustmentListPageResponse>(),
            )

        assertThat(roundtrippedCounterAdjustmentListPageResponse)
            .isEqualTo(counterAdjustmentListPageResponse)
    }
}
