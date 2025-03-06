// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreditReasonResponseTest {

    @Test
    fun createCreditReasonResponse() {
        val creditReasonResponse =
            CreditReasonResponse.builder()
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
        assertThat(creditReasonResponse).isNotNull
        assertThat(creditReasonResponse.id()).isEqualTo("id")
        assertThat(creditReasonResponse.version()).isEqualTo(0L)
        assertThat(creditReasonResponse.archived()).contains(true)
        assertThat(creditReasonResponse.code()).contains("code")
        assertThat(creditReasonResponse.createdBy()).contains("createdBy")
        assertThat(creditReasonResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReasonResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(creditReasonResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(creditReasonResponse.name()).contains("name")
    }
}
