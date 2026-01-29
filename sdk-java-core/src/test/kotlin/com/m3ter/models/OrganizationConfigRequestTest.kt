// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationConfigRequestTest {

    @Test
    fun create() {
        val organizationConfigRequest =
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
                .autoGenerateStatementMode(OrganizationConfigRequest.AutoGenerateStatementMode.NONE)
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

        assertThat(organizationConfigRequest.currency()).isEqualTo("USD")
        assertThat(organizationConfigRequest.dayEpoch()).isEqualTo("2022-01-01")
        assertThat(organizationConfigRequest.daysBeforeBillDue()).isEqualTo(1)
        assertThat(organizationConfigRequest.monthEpoch()).isEqualTo("2022-01-01")
        assertThat(organizationConfigRequest.timezone()).isEqualTo("UTC")
        assertThat(organizationConfigRequest.weekEpoch()).isEqualTo("2022-01-04")
        assertThat(organizationConfigRequest.yearEpoch()).isEqualTo("2022-01-01")
        assertThat(organizationConfigRequest.allowNegativeBalances()).contains(false)
        assertThat(organizationConfigRequest.allowOverlappingPlans()).contains(false)
        assertThat(organizationConfigRequest.autoApproveBillsGracePeriod()).contains(2)
        assertThat(organizationConfigRequest.autoApproveBillsGracePeriodUnit()).contains("DAYS")
        assertThat(organizationConfigRequest.autoGenerateStatementMode())
            .contains(OrganizationConfigRequest.AutoGenerateStatementMode.NONE)
        assertThat(organizationConfigRequest.billPrefix()).contains("Bill-")
        assertThat(organizationConfigRequest.commitmentFeeBillInAdvance()).contains(true)
        assertThat(organizationConfigRequest.consolidateBills()).contains(true)
        assertThat(organizationConfigRequest.creditApplicationOrder().getOrNull())
            .containsExactly(OrganizationConfigRequest.CreditApplicationOrder.PREPAYMENT)
        assertThat(organizationConfigRequest.currencyConversions().getOrNull())
            .containsExactly(
                CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
            )
        assertThat(organizationConfigRequest.defaultStatementDefinitionId())
            .contains("defaultStatementDefinitionId")
        assertThat(organizationConfigRequest.externalInvoiceDate()).contains("LAST_DAY_OF_ARREARS")
        assertThat(organizationConfigRequest.minimumSpendBillInAdvance()).contains(true)
        assertThat(organizationConfigRequest.scheduledBillInterval()).contains(0.0)
        assertThat(organizationConfigRequest.scheduledBillOffset()).contains(0)
        assertThat(organizationConfigRequest.sequenceStartNumber()).contains(1000)
        assertThat(organizationConfigRequest.standingChargeBillInAdvance()).contains(true)
        assertThat(organizationConfigRequest.suppressedEmptyBills()).contains(true)
        assertThat(organizationConfigRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationConfigRequest =
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
                .autoGenerateStatementMode(OrganizationConfigRequest.AutoGenerateStatementMode.NONE)
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

        val roundtrippedOrganizationConfigRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationConfigRequest),
                jacksonTypeRef<OrganizationConfigRequest>(),
            )

        assertThat(roundtrippedOrganizationConfigRequest).isEqualTo(organizationConfigRequest)
    }
}
