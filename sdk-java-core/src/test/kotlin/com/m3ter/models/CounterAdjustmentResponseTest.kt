// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterAdjustmentResponseTest {

    @Test
    fun create() {
        val counterAdjustmentResponse =
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

        assertThat(counterAdjustmentResponse.id()).isEqualTo("id")
        assertThat(counterAdjustmentResponse.version()).isEqualTo(0L)
        assertThat(counterAdjustmentResponse.accountId()).contains("accountId")
        assertThat(counterAdjustmentResponse.counterId()).contains("counterId")
        assertThat(counterAdjustmentResponse.createdBy()).contains("createdBy")
        assertThat(counterAdjustmentResponse.date()).contains(LocalDate.parse("2019-12-27"))
        assertThat(counterAdjustmentResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterAdjustmentResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterAdjustmentResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counterAdjustmentResponse.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(counterAdjustmentResponse.value()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterAdjustmentResponse =
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

        val roundtrippedCounterAdjustmentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterAdjustmentResponse),
                jacksonTypeRef<CounterAdjustmentResponse>(),
            )

        assertThat(roundtrippedCounterAdjustmentResponse).isEqualTo(counterAdjustmentResponse)
    }
}
