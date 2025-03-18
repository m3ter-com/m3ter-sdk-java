// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountEndDateBillingEntitiesParamsTest {

    @Test
    fun create() {
        AccountEndDateBillingEntitiesParams.builder()
            .orgId("orgId")
            .id("id")
            .addBillingEntity(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .applyToChildren(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applyToChildren(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingEntities())
            .containsExactly(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.applyToChildren()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountEndDateBillingEntitiesParams.builder()
                .orgId("orgId")
                .id("id")
                .addBillingEntity(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billingEntities())
            .containsExactly(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
