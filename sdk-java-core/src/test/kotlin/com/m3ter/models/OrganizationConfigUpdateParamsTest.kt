// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationConfigUpdateParamsTest {

    @Test
    fun create() {
        OrganizationConfigUpdateParams.builder()
            .orgId("orgId")
            .organizationConfigRequest(
                OrganizationConfigRequest.builder()
                    .currency("USD")
                    .dayEpoch("2022-01-01")
                    .daysBeforeBillDue(1)
                    .monthEpoch("2022-01-01")
                    .timezone("UTC")
                    .weekEpoch("2022-01-04")
                    .yearEpoch("2022-01-01")
                    .allowNegativeBalances(false)
                    .allowOverlappingPlans(false)
                    .autoApproveBillsGracePeriod(2)
                    .autoApproveBillsGracePeriodUnit("DAYS")
                    .autoGenerateStatementMode(
                        OrganizationConfigRequest.AutoGenerateStatementMode.NONE
                    )
                    .billPrefix("Bill-")
                    .commitmentFeeBillInAdvance(true)
                    .consolidateBills(true)
                    .addCreditApplicationOrder(
                        OrganizationConfigRequest.CreditApplicationOrder.PREPAYMENT
                    )
                    .addCurrencyConversion(
                        CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                    )
                    .defaultStatementDefinitionId("defaultStatementDefinitionId")
                    .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                    .minimumSpendBillInAdvance(true)
                    .scheduledBillInterval(0.0)
                    .scheduledBillOffset(0)
                    .sequenceStartNumber(1000)
                    .standingChargeBillInAdvance(true)
                    .suppressedEmptyBills(true)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .organizationConfigRequest(
                    OrganizationConfigRequest.builder()
                        .currency("USD")
                        .dayEpoch("2022-01-01")
                        .daysBeforeBillDue(1)
                        .monthEpoch("2022-01-01")
                        .timezone("UTC")
                        .weekEpoch("2022-01-04")
                        .yearEpoch("2022-01-01")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .orgId("orgId")
                .organizationConfigRequest(
                    OrganizationConfigRequest.builder()
                        .currency("USD")
                        .dayEpoch("2022-01-01")
                        .daysBeforeBillDue(1)
                        .monthEpoch("2022-01-01")
                        .timezone("UTC")
                        .weekEpoch("2022-01-04")
                        .yearEpoch("2022-01-01")
                        .allowNegativeBalances(false)
                        .allowOverlappingPlans(false)
                        .autoApproveBillsGracePeriod(2)
                        .autoApproveBillsGracePeriodUnit("DAYS")
                        .autoGenerateStatementMode(
                            OrganizationConfigRequest.AutoGenerateStatementMode.NONE
                        )
                        .billPrefix("Bill-")
                        .commitmentFeeBillInAdvance(true)
                        .consolidateBills(true)
                        .addCreditApplicationOrder(
                            OrganizationConfigRequest.CreditApplicationOrder.PREPAYMENT
                        )
                        .addCurrencyConversion(
                            CurrencyConversion.builder()
                                .from("EUR")
                                .to("USD")
                                .multiplier(1.12)
                                .build()
                        )
                        .defaultStatementDefinitionId("defaultStatementDefinitionId")
                        .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                        .minimumSpendBillInAdvance(true)
                        .scheduledBillInterval(0.0)
                        .scheduledBillOffset(0)
                        .sequenceStartNumber(1000)
                        .standingChargeBillInAdvance(true)
                        .suppressedEmptyBills(true)
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OrganizationConfigRequest.builder()
                    .currency("USD")
                    .dayEpoch("2022-01-01")
                    .daysBeforeBillDue(1)
                    .monthEpoch("2022-01-01")
                    .timezone("UTC")
                    .weekEpoch("2022-01-04")
                    .yearEpoch("2022-01-01")
                    .allowNegativeBalances(false)
                    .allowOverlappingPlans(false)
                    .autoApproveBillsGracePeriod(2)
                    .autoApproveBillsGracePeriodUnit("DAYS")
                    .autoGenerateStatementMode(
                        OrganizationConfigRequest.AutoGenerateStatementMode.NONE
                    )
                    .billPrefix("Bill-")
                    .commitmentFeeBillInAdvance(true)
                    .consolidateBills(true)
                    .addCreditApplicationOrder(
                        OrganizationConfigRequest.CreditApplicationOrder.PREPAYMENT
                    )
                    .addCurrencyConversion(
                        CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                    )
                    .defaultStatementDefinitionId("defaultStatementDefinitionId")
                    .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                    .minimumSpendBillInAdvance(true)
                    .scheduledBillInterval(0.0)
                    .scheduledBillOffset(0)
                    .sequenceStartNumber(1000)
                    .standingChargeBillInAdvance(true)
                    .suppressedEmptyBills(true)
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationConfigUpdateParams.builder()
                .organizationConfigRequest(
                    OrganizationConfigRequest.builder()
                        .currency("USD")
                        .dayEpoch("2022-01-01")
                        .daysBeforeBillDue(1)
                        .monthEpoch("2022-01-01")
                        .timezone("UTC")
                        .weekEpoch("2022-01-04")
                        .yearEpoch("2022-01-01")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OrganizationConfigRequest.builder()
                    .currency("USD")
                    .dayEpoch("2022-01-01")
                    .daysBeforeBillDue(1)
                    .monthEpoch("2022-01-01")
                    .timezone("UTC")
                    .weekEpoch("2022-01-04")
                    .yearEpoch("2022-01-01")
                    .build()
            )
    }
}
