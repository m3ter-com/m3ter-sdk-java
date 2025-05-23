// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetTypesResponseTest {

    @Test
    fun create() {
        val eventGetTypesResponse =
            EventGetTypesResponse.builder()
                .events(
                    listOf(
                        "configuration.commitment.created",
                        "configuration.commitment.deleted",
                        "configuration.commitment.updated",
                        "configuration.account.created",
                        "configuration.account.deleted",
                        "configuration.account.updated",
                        "configuration.aggregation.created",
                        "configuration.aggregation.deleted",
                        "configuration.aggregation.updated",
                        "configuration.compoundaggregation.created",
                        "configuration.compoundaggregation.deleted",
                        "configuration.compoundaggregation.updated",
                        "configuration.meter.created",
                        "configuration.meter.deleted",
                        "configuration.meter.updated",
                        "configuration.metergroup.created",
                        "configuration.metergroup.deleted",
                        "configuration.metergroup.updated",
                        "configuration.plan.created",
                        "configuration.plan.deleted",
                        "configuration.plan.updated",
                        "configuration.plantemplate.created",
                        "configuration.plantemplate.deleted",
                        "configuration.plantemplate.updated",
                        "configuration.plangroup.created",
                        "configuration.plangroup.deleted",
                        "configuration.plangroup.updated",
                        "configuration.plangrouplink.created",
                        "configuration.plangrouplink.deleted",
                        "configuration.plangrouplink.updated",
                        "configuration.pricing.created",
                        "configuration.pricing.deleted",
                        "configuration.pricing.updated",
                        "configuration.product.created",
                        "configuration.product.deleted",
                        "configuration.product.updated",
                        "configuration.accountplan.created",
                        "configuration.accountplan.deleted",
                        "configuration.accountplan.updated",
                        "configuration.pricingband.created",
                        "configuration.pricingband.deleted",
                        "configuration.pricingband.updated",
                        "configuration.organization.created",
                        "configuration.organization.deleted",
                        "configuration.organization.updated",
                        "configuration.customfield.created",
                        "configuration.customfield.deleted",
                        "configuration.customfield.updated",
                        "configuration.organizationconfig.created",
                        "configuration.organizationconfig.deleted",
                        "configuration.organizationconfig.updated",
                        "configuration.contract.created",
                        "configuration.contract.deleted",
                        "configuration.contract.updated",
                        "configuration.creditreason.created",
                        "configuration.creditreason.deleted",
                        "configuration.creditreason.updated",
                        "configuration.transactiontype.created",
                        "configuration.transactiontype.deleted",
                        "configuration.transactiontype.updated",
                        "billing.bill.created",
                        "billing.bill.deleted",
                        "billing.bill.updated",
                        "billing.billconfig.created",
                        "billing.billconfig.deleted",
                        "billing.billconfig.updated",
                        "billing.billjob.created",
                        "billing.billjob.deleted",
                        "billing.billjob.updated",
                        "billing.balance.created",
                        "billing.balance.deleted",
                        "billing.balance.updated",
                        "billing.balanceamount.created",
                        "billing.balanceamount.deleted",
                        "billing.balanceamount.updated",
                        "billing.statementjob.created",
                        "billing.statementjob.deleted",
                        "billing.statementjob.updated",
                        "integration.authentication.error",
                        "integration.disabled.error",
                        "integration.missingaccountmapping.error",
                        "integration.perform.error",
                        "integration.validation.error",
                        "ingest.validation.failure",
                        "dataexport.job.failure.",
                    )
                )
                .build()

        assertThat(eventGetTypesResponse.events().getOrNull())
            .containsExactly(
                "configuration.commitment.created",
                "configuration.commitment.deleted",
                "configuration.commitment.updated",
                "configuration.account.created",
                "configuration.account.deleted",
                "configuration.account.updated",
                "configuration.aggregation.created",
                "configuration.aggregation.deleted",
                "configuration.aggregation.updated",
                "configuration.compoundaggregation.created",
                "configuration.compoundaggregation.deleted",
                "configuration.compoundaggregation.updated",
                "configuration.meter.created",
                "configuration.meter.deleted",
                "configuration.meter.updated",
                "configuration.metergroup.created",
                "configuration.metergroup.deleted",
                "configuration.metergroup.updated",
                "configuration.plan.created",
                "configuration.plan.deleted",
                "configuration.plan.updated",
                "configuration.plantemplate.created",
                "configuration.plantemplate.deleted",
                "configuration.plantemplate.updated",
                "configuration.plangroup.created",
                "configuration.plangroup.deleted",
                "configuration.plangroup.updated",
                "configuration.plangrouplink.created",
                "configuration.plangrouplink.deleted",
                "configuration.plangrouplink.updated",
                "configuration.pricing.created",
                "configuration.pricing.deleted",
                "configuration.pricing.updated",
                "configuration.product.created",
                "configuration.product.deleted",
                "configuration.product.updated",
                "configuration.accountplan.created",
                "configuration.accountplan.deleted",
                "configuration.accountplan.updated",
                "configuration.pricingband.created",
                "configuration.pricingband.deleted",
                "configuration.pricingband.updated",
                "configuration.organization.created",
                "configuration.organization.deleted",
                "configuration.organization.updated",
                "configuration.customfield.created",
                "configuration.customfield.deleted",
                "configuration.customfield.updated",
                "configuration.organizationconfig.created",
                "configuration.organizationconfig.deleted",
                "configuration.organizationconfig.updated",
                "configuration.contract.created",
                "configuration.contract.deleted",
                "configuration.contract.updated",
                "configuration.creditreason.created",
                "configuration.creditreason.deleted",
                "configuration.creditreason.updated",
                "configuration.transactiontype.created",
                "configuration.transactiontype.deleted",
                "configuration.transactiontype.updated",
                "billing.bill.created",
                "billing.bill.deleted",
                "billing.bill.updated",
                "billing.billconfig.created",
                "billing.billconfig.deleted",
                "billing.billconfig.updated",
                "billing.billjob.created",
                "billing.billjob.deleted",
                "billing.billjob.updated",
                "billing.balance.created",
                "billing.balance.deleted",
                "billing.balance.updated",
                "billing.balanceamount.created",
                "billing.balanceamount.deleted",
                "billing.balanceamount.updated",
                "billing.statementjob.created",
                "billing.statementjob.deleted",
                "billing.statementjob.updated",
                "integration.authentication.error",
                "integration.disabled.error",
                "integration.missingaccountmapping.error",
                "integration.perform.error",
                "integration.validation.error",
                "ingest.validation.failure",
                "dataexport.job.failure.",
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventGetTypesResponse =
            EventGetTypesResponse.builder()
                .events(
                    listOf(
                        "configuration.commitment.created",
                        "configuration.commitment.deleted",
                        "configuration.commitment.updated",
                        "configuration.account.created",
                        "configuration.account.deleted",
                        "configuration.account.updated",
                        "configuration.aggregation.created",
                        "configuration.aggregation.deleted",
                        "configuration.aggregation.updated",
                        "configuration.compoundaggregation.created",
                        "configuration.compoundaggregation.deleted",
                        "configuration.compoundaggregation.updated",
                        "configuration.meter.created",
                        "configuration.meter.deleted",
                        "configuration.meter.updated",
                        "configuration.metergroup.created",
                        "configuration.metergroup.deleted",
                        "configuration.metergroup.updated",
                        "configuration.plan.created",
                        "configuration.plan.deleted",
                        "configuration.plan.updated",
                        "configuration.plantemplate.created",
                        "configuration.plantemplate.deleted",
                        "configuration.plantemplate.updated",
                        "configuration.plangroup.created",
                        "configuration.plangroup.deleted",
                        "configuration.plangroup.updated",
                        "configuration.plangrouplink.created",
                        "configuration.plangrouplink.deleted",
                        "configuration.plangrouplink.updated",
                        "configuration.pricing.created",
                        "configuration.pricing.deleted",
                        "configuration.pricing.updated",
                        "configuration.product.created",
                        "configuration.product.deleted",
                        "configuration.product.updated",
                        "configuration.accountplan.created",
                        "configuration.accountplan.deleted",
                        "configuration.accountplan.updated",
                        "configuration.pricingband.created",
                        "configuration.pricingband.deleted",
                        "configuration.pricingband.updated",
                        "configuration.organization.created",
                        "configuration.organization.deleted",
                        "configuration.organization.updated",
                        "configuration.customfield.created",
                        "configuration.customfield.deleted",
                        "configuration.customfield.updated",
                        "configuration.organizationconfig.created",
                        "configuration.organizationconfig.deleted",
                        "configuration.organizationconfig.updated",
                        "configuration.contract.created",
                        "configuration.contract.deleted",
                        "configuration.contract.updated",
                        "configuration.creditreason.created",
                        "configuration.creditreason.deleted",
                        "configuration.creditreason.updated",
                        "configuration.transactiontype.created",
                        "configuration.transactiontype.deleted",
                        "configuration.transactiontype.updated",
                        "billing.bill.created",
                        "billing.bill.deleted",
                        "billing.bill.updated",
                        "billing.billconfig.created",
                        "billing.billconfig.deleted",
                        "billing.billconfig.updated",
                        "billing.billjob.created",
                        "billing.billjob.deleted",
                        "billing.billjob.updated",
                        "billing.balance.created",
                        "billing.balance.deleted",
                        "billing.balance.updated",
                        "billing.balanceamount.created",
                        "billing.balanceamount.deleted",
                        "billing.balanceamount.updated",
                        "billing.statementjob.created",
                        "billing.statementjob.deleted",
                        "billing.statementjob.updated",
                        "integration.authentication.error",
                        "integration.disabled.error",
                        "integration.missingaccountmapping.error",
                        "integration.perform.error",
                        "integration.validation.error",
                        "ingest.validation.failure",
                        "dataexport.job.failure.",
                    )
                )
                .build()

        val roundtrippedEventGetTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventGetTypesResponse),
                jacksonTypeRef<EventGetTypesResponse>(),
            )

        assertThat(roundtrippedEventGetTypesResponse).isEqualTo(eventGetTypesResponse)
    }
}
