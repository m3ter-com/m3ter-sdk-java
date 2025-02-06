// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationConfigUpdateParamsTest {

    @Test
    fun create() {
        OrganizationConfigUpdateParams.builder()
            .orgId("orgId")
            .currency("USD")
            .dayEpoch("2022-01-01")
            .daysBeforeBillDue(1L)
            .monthEpoch("2022-01-01")
            .timezone("UTC")
            .weekEpoch("2022-01-04")
            .yearEpoch("2022-01-01")
            .autoApproveBillsGracePeriod(1L)
            .autoApproveBillsGracePeriodUnit("DAYS")
            .autoGenerateStatementMode(
                OrganizationConfigUpdateParams.AutoGenerateStatementMode.NONE
            )
            .billPrefix("Bill-")
            .commitmentFeeBillInAdvance(true)
            .consolidateBills(true)
            .addCreditApplicationOrder(
                OrganizationConfigUpdateParams.CreditApplicationOrder.PREPAYMENT
            )
            .addCurrencyConversion(
                OrganizationConfigUpdateParams.CurrencyConversion.builder()
                    .from("EUR")
                    .to("USD")
                    .multiplier(1.0)
                    .build()
            )
            .defaultStatementDefinitionId("defaultStatementDefinitionId")
            .externalInvoiceDate("LAST_DAY_OF_ARREARS")
            .minimumSpendBillInAdvance(true)
            .scheduledBillInterval(0.0)
            .sequenceStartNumber(1000L)
            .standingChargeBillInAdvance(true)
            .suppressedEmptyBills(true)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .orgId("orgId")
                .currency("USD")
                .dayEpoch("2022-01-01")
                .daysBeforeBillDue(1L)
                .monthEpoch("2022-01-01")
                .timezone("UTC")
                .weekEpoch("2022-01-04")
                .yearEpoch("2022-01-01")
                .autoApproveBillsGracePeriod(1L)
                .autoApproveBillsGracePeriodUnit("DAYS")
                .autoGenerateStatementMode(
                    OrganizationConfigUpdateParams.AutoGenerateStatementMode.NONE
                )
                .billPrefix("Bill-")
                .commitmentFeeBillInAdvance(true)
                .consolidateBills(true)
                .addCreditApplicationOrder(
                    OrganizationConfigUpdateParams.CreditApplicationOrder.PREPAYMENT
                )
                .addCurrencyConversion(
                    OrganizationConfigUpdateParams.CurrencyConversion.builder()
                        .from("EUR")
                        .to("USD")
                        .multiplier(1.0)
                        .build()
                )
                .defaultStatementDefinitionId("defaultStatementDefinitionId")
                .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                .minimumSpendBillInAdvance(true)
                .scheduledBillInterval(0.0)
                .sequenceStartNumber(1000L)
                .standingChargeBillInAdvance(true)
                .suppressedEmptyBills(true)
                .version(0L)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.dayEpoch()).isEqualTo("2022-01-01")
        assertThat(body.daysBeforeBillDue()).isEqualTo(1L)
        assertThat(body.monthEpoch()).isEqualTo("2022-01-01")
        assertThat(body.timezone()).isEqualTo("UTC")
        assertThat(body.weekEpoch()).isEqualTo("2022-01-04")
        assertThat(body.yearEpoch()).isEqualTo("2022-01-01")
        assertThat(body.autoApproveBillsGracePeriod()).contains(1L)
        assertThat(body.autoApproveBillsGracePeriodUnit()).contains("DAYS")
        assertThat(body.autoGenerateStatementMode())
            .contains(OrganizationConfigUpdateParams.AutoGenerateStatementMode.NONE)
        assertThat(body.billPrefix()).contains("Bill-")
        assertThat(body.commitmentFeeBillInAdvance()).contains(true)
        assertThat(body.consolidateBills()).contains(true)
        assertThat(body.creditApplicationOrder())
            .contains(listOf(OrganizationConfigUpdateParams.CreditApplicationOrder.PREPAYMENT))
        assertThat(body.currencyConversions())
            .contains(
                listOf(
                    OrganizationConfigUpdateParams.CurrencyConversion.builder()
                        .from("EUR")
                        .to("USD")
                        .multiplier(1.0)
                        .build()
                )
            )
        assertThat(body.defaultStatementDefinitionId()).contains("defaultStatementDefinitionId")
        assertThat(body.externalInvoiceDate()).contains("LAST_DAY_OF_ARREARS")
        assertThat(body.minimumSpendBillInAdvance()).contains(true)
        assertThat(body.scheduledBillInterval()).contains(0.0)
        assertThat(body.sequenceStartNumber()).contains(1000L)
        assertThat(body.standingChargeBillInAdvance()).contains(true)
        assertThat(body.suppressedEmptyBills()).contains(true)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .orgId("orgId")
                .currency("USD")
                .dayEpoch("2022-01-01")
                .daysBeforeBillDue(1L)
                .monthEpoch("2022-01-01")
                .timezone("UTC")
                .weekEpoch("2022-01-04")
                .yearEpoch("2022-01-01")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.dayEpoch()).isEqualTo("2022-01-01")
        assertThat(body.daysBeforeBillDue()).isEqualTo(1L)
        assertThat(body.monthEpoch()).isEqualTo("2022-01-01")
        assertThat(body.timezone()).isEqualTo("UTC")
        assertThat(body.weekEpoch()).isEqualTo("2022-01-04")
        assertThat(body.yearEpoch()).isEqualTo("2022-01-01")
    }

    @Test
    fun getPathParam() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .orgId("orgId")
                .currency("USD")
                .dayEpoch("2022-01-01")
                .daysBeforeBillDue(1L)
                .monthEpoch("2022-01-01")
                .timezone("UTC")
                .weekEpoch("2022-01-04")
                .yearEpoch("2022-01-01")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
