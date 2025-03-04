// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractEndDateBillingEntitiesResponseTest {

    @Test
    fun createContractEndDateBillingEntitiesResponse() {
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
        assertThat(contractEndDateBillingEntitiesResponse).isNotNull
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
}
