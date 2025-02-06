// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillConfigTest {

    @Test
    fun createBillConfig() {
        val billConfig =
            BillConfig.builder()
                .id("id")
                .billLockDate(LocalDate.parse("2019-12-27"))
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()
        assertThat(billConfig).isNotNull
        assertThat(billConfig.id()).contains("id")
        assertThat(billConfig.billLockDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billConfig.createdBy()).contains("createdBy")
        assertThat(billConfig.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billConfig.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billConfig.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(billConfig.version()).contains(0L)
    }
}
