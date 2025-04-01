// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetFieldsResponseTest {

    @Test
    fun create() {
        val eventGetFieldsResponse =
            EventGetFieldsResponse.builder()
                .events(
                    EventGetFieldsResponse.Events.builder()
                        .putAdditionalProperty(
                            "configuration.commitment.created",
                            JsonValue.from(
                                mapOf(
                                    "new.accountCode" to "string",
                                    "new.accountId" to "string",
                                    "new.accountingProductId" to "string",
                                    "new.amount" to "double",
                                    "new.amountFirstBill" to "double",
                                    "new.amountPrePaid" to "double",
                                    "new.amountSpent" to "double",
                                    "new.billEpoch" to "string",
                                    "new.billingInterval" to "int",
                                    "new.billingOffset" to "int",
                                    "new.billingPlanId" to "string",
                                    "new.commitmentFeeBillInAdvance" to "boolean",
                                    "new.commitmentFeeDescription" to "string",
                                    "new.commitmentUsageDescription" to "string",
                                    "new.contractId" to "string",
                                    "new.currency" to "string",
                                    "new.customFields" to "map",
                                    "new.endDate" to "string",
                                    "new.feeDates" to "array",
                                    "new.id" to "string",
                                    "new.overageDescription" to "string",
                                    "new.overageSurchargePercent" to "double",
                                    "new.productIds" to "array",
                                    "new.startDate" to "string",
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(eventGetFieldsResponse.events())
            .contains(
                EventGetFieldsResponse.Events.builder()
                    .putAdditionalProperty(
                        "configuration.commitment.created",
                        JsonValue.from(
                            mapOf(
                                "new.accountCode" to "string",
                                "new.accountId" to "string",
                                "new.accountingProductId" to "string",
                                "new.amount" to "double",
                                "new.amountFirstBill" to "double",
                                "new.amountPrePaid" to "double",
                                "new.amountSpent" to "double",
                                "new.billEpoch" to "string",
                                "new.billingInterval" to "int",
                                "new.billingOffset" to "int",
                                "new.billingPlanId" to "string",
                                "new.commitmentFeeBillInAdvance" to "boolean",
                                "new.commitmentFeeDescription" to "string",
                                "new.commitmentUsageDescription" to "string",
                                "new.contractId" to "string",
                                "new.currency" to "string",
                                "new.customFields" to "map",
                                "new.endDate" to "string",
                                "new.feeDates" to "array",
                                "new.id" to "string",
                                "new.overageDescription" to "string",
                                "new.overageSurchargePercent" to "double",
                                "new.productIds" to "array",
                                "new.startDate" to "string",
                            )
                        ),
                    )
                    .build()
            )
    }
}
