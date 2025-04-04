// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountEndDateBillingEntitiesResponseTest {

    @Test
    fun create() {
        val accountEndDateBillingEntitiesResponse =
            AccountEndDateBillingEntitiesResponse.builder()
                .failedEntities(
                    AccountEndDateBillingEntitiesResponse.FailedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .statusMessage("statusMessage")
                .updatedEntities(
                    AccountEndDateBillingEntitiesResponse.UpdatedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .build()

        assertThat(accountEndDateBillingEntitiesResponse.failedEntities())
            .contains(
                AccountEndDateBillingEntitiesResponse.FailedEntities.builder()
                    .accountplan(SetString.builder().empty(true).build())
                    .contract(SetString.builder().empty(true).build())
                    .counterPricings(SetString.builder().empty(true).build())
                    .prepayment(SetString.builder().empty(true).build())
                    .pricings(SetString.builder().empty(true).build())
                    .build()
            )
        assertThat(accountEndDateBillingEntitiesResponse.statusMessage()).contains("statusMessage")
        assertThat(accountEndDateBillingEntitiesResponse.updatedEntities())
            .contains(
                AccountEndDateBillingEntitiesResponse.UpdatedEntities.builder()
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
        val accountEndDateBillingEntitiesResponse =
            AccountEndDateBillingEntitiesResponse.builder()
                .failedEntities(
                    AccountEndDateBillingEntitiesResponse.FailedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .statusMessage("statusMessage")
                .updatedEntities(
                    AccountEndDateBillingEntitiesResponse.UpdatedEntities.builder()
                        .accountplan(SetString.builder().empty(true).build())
                        .contract(SetString.builder().empty(true).build())
                        .counterPricings(SetString.builder().empty(true).build())
                        .prepayment(SetString.builder().empty(true).build())
                        .pricings(SetString.builder().empty(true).build())
                        .build()
                )
                .build()

        val roundtrippedAccountEndDateBillingEntitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountEndDateBillingEntitiesResponse),
                jacksonTypeRef<AccountEndDateBillingEntitiesResponse>(),
            )

        assertThat(roundtrippedAccountEndDateBillingEntitiesResponse)
            .isEqualTo(accountEndDateBillingEntitiesResponse)
    }
}
