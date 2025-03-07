// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillConfigResponseTest {

    @Test
    fun createBillConfigResponse() {
        val billConfigResponse =
            BillConfigResponse.builder()
                .id("id")
                .billLockDate(LocalDate.parse("2019-12-27"))
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .version(0L)
                .build()
        assertThat(billConfigResponse).isNotNull
        assertThat(billConfigResponse.id()).contains("id")
        assertThat(billConfigResponse.billLockDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(billConfigResponse.createdBy()).contains("createdBy")
        assertThat(billConfigResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billConfigResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(billConfigResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(billConfigResponse.version()).contains(0L)
    }
}
