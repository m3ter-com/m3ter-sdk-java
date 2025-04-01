// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractEndDateBillingEntitiesResponseTest {

    @Test
    fun create() {
        val contractEndDateBillingEntitiesResponse =
            ContractEndDateBillingEntitiesResponse.builder()
                .failedEntities(
                    ContractEndDateBillingEntitiesResponse.FailedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .statusMessage("statusMessage")
                .updatedEntities(
                    ContractEndDateBillingEntitiesResponse.UpdatedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .build()

        assertThat(contractEndDateBillingEntitiesResponse.failedEntities())
            .contains(
                ContractEndDateBillingEntitiesResponse.FailedEntities.builder()
                    .accountplan(SetString.builder().empty(true).build())
                    .contract(SetString.builder().empty(true).build())
                    .counterPricings(SetString.builder().empty(true).build())
                    .prepayment(SetString.builder().empty(true).build())
                    .pricings(SetString.builder().empty(true).build())
                    .build()
            )
        assertThat(contractEndDateBillingEntitiesResponse.statusMessage()).contains("statusMessage")
        assertThat(contractEndDateBillingEntitiesResponse.updatedEntities())
            .contains(
                ContractEndDateBillingEntitiesResponse.UpdatedEntities.builder()
                    .accountplan(SetString.builder().empty(true).build())
                    .contract(SetString.builder().empty(true).build())
                    .counterPricings(SetString.builder().empty(true).build())
                    .prepayment(SetString.builder().empty(true).build())
                    .pricings(SetString.builder().empty(true).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractEndDateBillingEntitiesResponse =
            ContractEndDateBillingEntitiesResponse.builder()
                .failedEntities(
                    ContractEndDateBillingEntitiesResponse.FailedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .statusMessage("statusMessage")
                .updatedEntities(
                    ContractEndDateBillingEntitiesResponse.UpdatedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .build()

        val roundtrippedContractEndDateBillingEntitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractEndDateBillingEntitiesResponse),
                jacksonTypeRef<ContractEndDateBillingEntitiesResponse>(),
            )

        assertThat(roundtrippedContractEndDateBillingEntitiesResponse)
            .isEqualTo(contractEndDateBillingEntitiesResponse)
    }
}
