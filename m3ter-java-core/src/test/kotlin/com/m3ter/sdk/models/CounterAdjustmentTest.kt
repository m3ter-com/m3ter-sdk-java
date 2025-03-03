// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterAdjustmentTest {

    @Test
    fun createCounterAdjustment() {
        val counterAdjustment =
            CounterAdjustment.builder()
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
                .value(0L)
                .build()
        assertThat(counterAdjustment).isNotNull
        assertThat(counterAdjustment.id()).isEqualTo("id")
        assertThat(counterAdjustment.version()).isEqualTo(0L)
        assertThat(counterAdjustment.accountId()).contains("accountId")
        assertThat(counterAdjustment.counterId()).contains("counterId")
        assertThat(counterAdjustment.createdBy()).contains("createdBy")
        assertThat(counterAdjustment.date()).contains(LocalDate.parse("2019-12-27"))
        assertThat(counterAdjustment.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterAdjustment.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterAdjustment.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(counterAdjustment.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(counterAdjustment.value()).contains(0L)
    }
}
