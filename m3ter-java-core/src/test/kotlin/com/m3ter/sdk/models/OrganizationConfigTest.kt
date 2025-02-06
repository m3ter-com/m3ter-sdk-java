// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationConfigTest {

    @Test
    fun createOrganizationConfig() {
        val organizationConfig =
            OrganizationConfig.builder()
                .id("id")
                .version(0L)
                .autoApproveBillsGracePeriod(0L)
                .autoApproveBillsGracePeriodUnit(
                    OrganizationConfig.AutoApproveBillsGracePeriodUnit.MINUTES
                )
                .autoGenerateStatementMode(OrganizationConfig.AutoGenerateStatementMode.NONE)
                .billPrefix("billPrefix")
                .commitmentFeeBillInAdvance(true)
                .consolidateBills(true)
                .createdBy("createdBy")
                .addCreditApplicationOrder(OrganizationConfig.CreditApplicationOrder.PREPAYMENT)
                .currency("currency")
                .addCurrencyConversion(
                    OrganizationConfig.CurrencyConversion.builder()
                        .from("EUR")
                        .to("USD")
                        .multiplier(1.0)
                        .build()
                )
                .dayEpoch(LocalDate.parse("2019-12-27"))
                .daysBeforeBillDue(0L)
                .defaultStatementDefinitionId("defaultStatementDefinitionId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalInvoiceDate(OrganizationConfig.ExternalInvoiceDate.LAST_DAY_OF_ARREARS)
                .lastModifiedBy("lastModifiedBy")
                .minimumSpendBillInAdvance(true)
                .monthEpoch(LocalDate.parse("2019-12-27"))
                .scheduledBillInterval(0.0)
                .sequenceStartNumber(0L)
                .standingChargeBillInAdvance(true)
                .suppressedEmptyBills(true)
                .timezone("UTC")
                .weekEpoch(LocalDate.parse("2019-12-27"))
                .yearEpoch(LocalDate.parse("2019-12-27"))
                .build()
        assertThat(organizationConfig).isNotNull
        assertThat(organizationConfig.id()).isEqualTo("id")
        assertThat(organizationConfig.version()).isEqualTo(0L)
        assertThat(organizationConfig.autoApproveBillsGracePeriod()).contains(0L)
        assertThat(organizationConfig.autoApproveBillsGracePeriodUnit())
            .contains(OrganizationConfig.AutoApproveBillsGracePeriodUnit.MINUTES)
        assertThat(organizationConfig.autoGenerateStatementMode())
            .contains(OrganizationConfig.AutoGenerateStatementMode.NONE)
        assertThat(organizationConfig.billPrefix()).contains("billPrefix")
        assertThat(organizationConfig.commitmentFeeBillInAdvance()).contains(true)
        assertThat(organizationConfig.consolidateBills()).contains(true)
        assertThat(organizationConfig.createdBy()).contains("createdBy")
        assertThat(organizationConfig.creditApplicationOrder().get())
            .containsExactly(OrganizationConfig.CreditApplicationOrder.PREPAYMENT)
        assertThat(organizationConfig.currency()).contains("currency")
        assertThat(organizationConfig.currencyConversions().get())
            .containsExactly(
                OrganizationConfig.CurrencyConversion.builder()
                    .from("EUR")
                    .to("USD")
                    .multiplier(1.0)
                    .build()
            )
        assertThat(organizationConfig.dayEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfig.daysBeforeBillDue()).contains(0L)
        assertThat(organizationConfig.defaultStatementDefinitionId())
            .contains("defaultStatementDefinitionId")
        assertThat(organizationConfig.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationConfig.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationConfig.externalInvoiceDate())
            .contains(OrganizationConfig.ExternalInvoiceDate.LAST_DAY_OF_ARREARS)
        assertThat(organizationConfig.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(organizationConfig.minimumSpendBillInAdvance()).contains(true)
        assertThat(organizationConfig.monthEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfig.scheduledBillInterval()).contains(0.0)
        assertThat(organizationConfig.sequenceStartNumber()).contains(0L)
        assertThat(organizationConfig.standingChargeBillInAdvance()).contains(true)
        assertThat(organizationConfig.suppressedEmptyBills()).contains(true)
        assertThat(organizationConfig.timezone()).contains("UTC")
        assertThat(organizationConfig.weekEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfig.yearEpoch()).contains(LocalDate.parse("2019-12-27"))
    }
}
