// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventResponseTest {

    @Test
    fun create() {
        val eventResponse =
            EventResponse.builder()
                .id("9cb46d85-7cb6-4637-80a1-d4ec38e4ab30")
                .dtActioned(OffsetDateTime.parse("2022-10-28T13:56:49.557Z"))
                .eventName("configuration.commitment.created")
                .eventTime(OffsetDateTime.parse("2022-10-28T13:54:49.557Z"))
                .m3terEvent(
                    JsonValue.from(
                        mapOf(
                            "eventData" to
                                mapOf(
                                    "newDto" to
                                        mapOf(
                                            "commitmentFeeDescription" to "",
                                            "endDate" to "2024-12-31",
                                            "billingInterval" to 1,
                                            "orgId" to "396d788d-5174-XXXX-9d69-YYYY4671fc33",
                                            "overageSurchargePercent" to 5,
                                            "overageDescription" to "",
                                            "currency" to "USD",
                                            "id" to "480d317e-2030-416b-b64b-c07577c418b4",
                                            "amountSpent" to 0,
                                            "accountCode" to "doetech_premium",
                                            "amount" to 15000,
                                            "billingOffset" to 0,
                                            "lastModifiedBy" to
                                                "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                            "billingPlanId" to
                                                "0409e75a-8a87-43de-aa58-fc6ec823ce37",
                                            "version" to 1,
                                            "accountId" to "1cf2a754-476c-498c-b05a-7d41abfc404d",
                                            "dtCreated" to "2022-10-28T13:54:48.081781Z",
                                            "amountPrePaid" to 0,
                                            "productIds" to
                                                listOf("bec371ef-dbad-4e73-a56a-dadecff2287c"),
                                            "createdBy" to
                                                "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                            "contractId" to "68595d6d-261f-496b-bf88-51fc7d2b5ccc",
                                            "commitmentUsageDescription" to "",
                                            "startDate" to "2023-01-01",
                                            "dtLastModified" to "2022-10-28T13:54:48.081781Z",
                                        )
                                )
                        )
                    )
                )
                .build()

        assertThat(eventResponse.id()).isEqualTo("9cb46d85-7cb6-4637-80a1-d4ec38e4ab30")
        assertThat(eventResponse.dtActioned())
            .isEqualTo(OffsetDateTime.parse("2022-10-28T13:56:49.557Z"))
        assertThat(eventResponse.eventName()).isEqualTo("configuration.commitment.created")
        assertThat(eventResponse.eventTime())
            .isEqualTo(OffsetDateTime.parse("2022-10-28T13:54:49.557Z"))
        assertThat(eventResponse._m3terEvent())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "eventData" to
                            mapOf(
                                "newDto" to
                                    mapOf(
                                        "commitmentFeeDescription" to "",
                                        "endDate" to "2024-12-31",
                                        "billingInterval" to 1,
                                        "orgId" to "396d788d-5174-XXXX-9d69-YYYY4671fc33",
                                        "overageSurchargePercent" to 5,
                                        "overageDescription" to "",
                                        "currency" to "USD",
                                        "id" to "480d317e-2030-416b-b64b-c07577c418b4",
                                        "amountSpent" to 0,
                                        "accountCode" to "doetech_premium",
                                        "amount" to 15000,
                                        "billingOffset" to 0,
                                        "lastModifiedBy" to
                                            "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                        "billingPlanId" to "0409e75a-8a87-43de-aa58-fc6ec823ce37",
                                        "version" to 1,
                                        "accountId" to "1cf2a754-476c-498c-b05a-7d41abfc404d",
                                        "dtCreated" to "2022-10-28T13:54:48.081781Z",
                                        "amountPrePaid" to 0,
                                        "productIds" to
                                            listOf("bec371ef-dbad-4e73-a56a-dadecff2287c"),
                                        "createdBy" to "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                        "contractId" to "68595d6d-261f-496b-bf88-51fc7d2b5ccc",
                                        "commitmentUsageDescription" to "",
                                        "startDate" to "2023-01-01",
                                        "dtLastModified" to "2022-10-28T13:54:48.081781Z",
                                    )
                            )
                    )
                )
            )
    }
}
