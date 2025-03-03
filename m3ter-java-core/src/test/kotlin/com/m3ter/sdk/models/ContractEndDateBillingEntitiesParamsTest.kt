// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractEndDateBillingEntitiesParamsTest {

    @Test
    fun create() {
        ContractEndDateBillingEntitiesParams.builder()
            .orgId("orgId")
            .id("id")
            .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .applyToChildren(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            ContractEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applyToChildren(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingEntities())
            .isEqualTo(listOf(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT))
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.applyToChildren()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingEntities())
            .isEqualTo(listOf(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT))
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getPathParam() {
        val params =
            ContractEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
