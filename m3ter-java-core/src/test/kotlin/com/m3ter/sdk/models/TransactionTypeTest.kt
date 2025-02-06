// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTypeTest {

    @Test
    fun createTransactionType() {
        val transactionType =
            TransactionType.builder()
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
        assertThat(transactionType).isNotNull
        assertThat(transactionType.id()).isEqualTo("id")
        assertThat(transactionType.version()).isEqualTo(0L)
        assertThat(transactionType.archived()).contains(true)
        assertThat(transactionType.code()).contains("code")
        assertThat(transactionType.createdBy()).contains("createdBy")
        assertThat(transactionType.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionType.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionType.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(transactionType.name()).contains("name")
    }
}
