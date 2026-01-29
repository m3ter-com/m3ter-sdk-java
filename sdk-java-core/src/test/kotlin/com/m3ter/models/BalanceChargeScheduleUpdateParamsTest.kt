// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChargeScheduleUpdateParamsTest {

    @Test
    fun create() {
        BalanceChargeScheduleUpdateParams.builder()
            .orgId("orgId")
            .balanceId("balanceId")
            .id("id")
            .billFrequency(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
            .billFrequencyInterval(1)
            .billInAdvance(true)
            .chargeDescription("x")
            .code("S?oC\"\$]C] ]]]]]5]")
            .currency("currency")
            .name("x")
            .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .amount(0.0)
            .billEpoch(LocalDate.parse("2019-12-27"))
            .customFields(
                BalanceChargeScheduleUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .unitPrice(0.0)
            .units(0.0)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BalanceChargeScheduleUpdateParams.builder()
                .balanceId("balanceId")
                .id("id")
                .billFrequency(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
                .billFrequencyInterval(1)
                .billInAdvance(true)
                .chargeDescription("x")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("currency")
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("balanceId")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BalanceChargeScheduleUpdateParams.builder()
                .orgId("orgId")
                .balanceId("balanceId")
                .id("id")
                .billFrequency(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
                .billFrequencyInterval(1)
                .billInAdvance(true)
                .chargeDescription("x")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("currency")
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .amount(0.0)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .customFields(
                    BalanceChargeScheduleUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .unitPrice(0.0)
                .units(0.0)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.billFrequency())
            .isEqualTo(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
        assertThat(body.billFrequencyInterval()).isEqualTo(1)
        assertThat(body.billInAdvance()).isEqualTo(true)
        assertThat(body.chargeDescription()).isEqualTo("x")
        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.amount()).contains(0.0)
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.customFields())
            .contains(
                BalanceChargeScheduleUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.unitPrice()).contains(0.0)
        assertThat(body.units()).contains(0.0)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BalanceChargeScheduleUpdateParams.builder()
                .balanceId("balanceId")
                .id("id")
                .billFrequency(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
                .billFrequencyInterval(1)
                .billInAdvance(true)
                .chargeDescription("x")
                .code("S?oC\"\$]C] ]]]]]5]")
                .currency("currency")
                .name("x")
                .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertThat(body.billFrequency())
            .isEqualTo(BalanceChargeScheduleUpdateParams.BillFrequency.DAILY)
        assertThat(body.billFrequencyInterval()).isEqualTo(1)
        assertThat(body.billInAdvance()).isEqualTo(true)
        assertThat(body.chargeDescription()).isEqualTo("x")
        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.servicePeriodEndDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.servicePeriodStartDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
