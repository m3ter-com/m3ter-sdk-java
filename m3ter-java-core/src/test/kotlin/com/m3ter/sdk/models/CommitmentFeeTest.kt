// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitmentFeeTest {

    @Test
    fun createCommitmentFee() {
        val commitmentFee =
            CommitmentFee.builder()
                .amount(1.0)
                .date(LocalDate.parse("2019-12-27"))
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(commitmentFee).isNotNull
        assertThat(commitmentFee.amount()).isEqualTo(1.0)
        assertThat(commitmentFee.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(commitmentFee.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitmentFee.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
