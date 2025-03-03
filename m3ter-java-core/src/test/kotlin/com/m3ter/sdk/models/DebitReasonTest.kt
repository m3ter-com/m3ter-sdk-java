// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DebitReasonTest {

    @Test
    fun createDebitReason() {
        val debitReason =
            DebitReason.builder()
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
        assertThat(debitReason).isNotNull
        assertThat(debitReason.id()).isEqualTo("id")
        assertThat(debitReason.version()).isEqualTo(0L)
        assertThat(debitReason.archived()).contains(true)
        assertThat(debitReason.code()).contains("code")
        assertThat(debitReason.createdBy()).contains("createdBy")
        assertThat(debitReason.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitReason.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(debitReason.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(debitReason.name()).contains("name")
    }
}
