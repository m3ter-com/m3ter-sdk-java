// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationConfigResponseTest {

    @Test
    fun create() {
        val organizationConfigResponse =
            OrganizationConfigResponse.builder()
                .id("id")
                .version(0L)
                .autoApproveBillsGracePeriod(0L)
                .autoApproveBillsGracePeriodUnit(
                    OrganizationConfigResponse.AutoApproveBillsGracePeriodUnit.MINUTES
                )
                .autoGenerateStatementMode(
                    OrganizationConfigResponse.AutoGenerateStatementMode.NONE
                )
                .billPrefix("billPrefix")
                .commitmentFeeBillInAdvance(true)
                .consolidateBills(true)
                .createdBy("createdBy")
                .addCreditApplicationOrder(
                    OrganizationConfigResponse.CreditApplicationOrder.PREPAYMENT
                )
                .currency("currency")
                .addCurrencyConversion(
                    CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                )
                .dayEpoch(LocalDate.parse("2019-12-27"))
                .daysBeforeBillDue(0L)
                .defaultStatementDefinitionId("defaultStatementDefinitionId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalInvoiceDate(
                    OrganizationConfigResponse.ExternalInvoiceDate.LAST_DAY_OF_ARREARS
                )
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

        assertThat(organizationConfigResponse.id()).isEqualTo("id")
        assertThat(organizationConfigResponse.version()).isEqualTo(0L)
        assertThat(organizationConfigResponse.autoApproveBillsGracePeriod()).contains(0L)
        assertThat(organizationConfigResponse.autoApproveBillsGracePeriodUnit())
            .contains(OrganizationConfigResponse.AutoApproveBillsGracePeriodUnit.MINUTES)
        assertThat(organizationConfigResponse.autoGenerateStatementMode())
            .contains(OrganizationConfigResponse.AutoGenerateStatementMode.NONE)
        assertThat(organizationConfigResponse.billPrefix()).contains("billPrefix")
        assertThat(organizationConfigResponse.commitmentFeeBillInAdvance()).contains(true)
        assertThat(organizationConfigResponse.consolidateBills()).contains(true)
        assertThat(organizationConfigResponse.createdBy()).contains("createdBy")
        assertThat(organizationConfigResponse.creditApplicationOrder().getOrNull())
            .containsExactly(OrganizationConfigResponse.CreditApplicationOrder.PREPAYMENT)
        assertThat(organizationConfigResponse.currency()).contains("currency")
        assertThat(organizationConfigResponse.currencyConversions().getOrNull())
            .containsExactly(
                CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
            )
        assertThat(organizationConfigResponse.dayEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfigResponse.daysBeforeBillDue()).contains(0L)
        assertThat(organizationConfigResponse.defaultStatementDefinitionId())
            .contains("defaultStatementDefinitionId")
        assertThat(organizationConfigResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationConfigResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organizationConfigResponse.externalInvoiceDate())
            .contains(OrganizationConfigResponse.ExternalInvoiceDate.LAST_DAY_OF_ARREARS)
        assertThat(organizationConfigResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(organizationConfigResponse.minimumSpendBillInAdvance()).contains(true)
        assertThat(organizationConfigResponse.monthEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfigResponse.scheduledBillInterval()).contains(0.0)
        assertThat(organizationConfigResponse.sequenceStartNumber()).contains(0L)
        assertThat(organizationConfigResponse.standingChargeBillInAdvance()).contains(true)
        assertThat(organizationConfigResponse.suppressedEmptyBills()).contains(true)
        assertThat(organizationConfigResponse.timezone()).contains("UTC")
        assertThat(organizationConfigResponse.weekEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(organizationConfigResponse.yearEpoch()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationConfigResponse =
            OrganizationConfigResponse.builder()
                .id("id")
                .version(0L)
                .autoApproveBillsGracePeriod(0L)
                .autoApproveBillsGracePeriodUnit(
                    OrganizationConfigResponse.AutoApproveBillsGracePeriodUnit.MINUTES
                )
                .autoGenerateStatementMode(
                    OrganizationConfigResponse.AutoGenerateStatementMode.NONE
                )
                .billPrefix("billPrefix")
                .commitmentFeeBillInAdvance(true)
                .consolidateBills(true)
                .createdBy("createdBy")
                .addCreditApplicationOrder(
                    OrganizationConfigResponse.CreditApplicationOrder.PREPAYMENT
                )
                .currency("currency")
                .addCurrencyConversion(
                    CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
                )
                .dayEpoch(LocalDate.parse("2019-12-27"))
                .daysBeforeBillDue(0L)
                .defaultStatementDefinitionId("defaultStatementDefinitionId")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalInvoiceDate(
                    OrganizationConfigResponse.ExternalInvoiceDate.LAST_DAY_OF_ARREARS
                )
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

        val roundtrippedOrganizationConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationConfigResponse),
                jacksonTypeRef<OrganizationConfigResponse>(),
            )

        assertThat(roundtrippedOrganizationConfigResponse).isEqualTo(organizationConfigResponse)
    }
}
