// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditReasonTest {

    @Test
    fun createCreditReason() {
        val creditReason =
            CreditReason.builder()
                .id("id")
                .version(0L)
                .archived(true)
                .code("code")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()
        assertThat(creditReason).isNotNull
        assertThat(creditReason.id()).isEqualTo("id")
        assertThat(creditReason.version()).isEqualTo(0L)
        assertThat(creditReason.archived()).contains(true)
        assertThat(creditReason.code()).contains("code")
        assertThat(creditReason.createdBy()).contains("createdBy")
        assertThat(creditReason.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReason.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReason.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(creditReason.name()).contains("name")
    }
}
