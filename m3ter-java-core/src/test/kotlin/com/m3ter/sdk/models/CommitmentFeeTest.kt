// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitmentFeeTest {

    @Test
    fun create() {
        val commitmentFee =
            CommitmentFee.builder()
                .amount(1.0)
                .date(LocalDate.parse("2019-12-27"))
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(commitmentFee.amount()).isEqualTo(1.0)
        assertThat(commitmentFee.date()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(commitmentFee.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(commitmentFee.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitmentFee =
            CommitmentFee.builder()
                .amount(1.0)
                .date(LocalDate.parse("2019-12-27"))
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCommitmentFee =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitmentFee),
                jacksonTypeRef<CommitmentFee>(),
            )

        assertThat(roundtrippedCommitmentFee).isEqualTo(commitmentFee)
    }
}
