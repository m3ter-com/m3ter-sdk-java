// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListPageResponseTest {

    @Test
    fun create() {
        val eventListPageResponse =
            EventListPageResponse.builder()
                .addData(
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
                                                    "orgId" to
                                                        "396d788d-5174-XXXX-9d69-YYYY4671fc33",
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
                                                    "accountId" to
                                                        "1cf2a754-476c-498c-b05a-7d41abfc404d",
                                                    "dtCreated" to "2022-10-28T13:54:48.081781Z",
                                                    "amountPrePaid" to 0,
                                                    "productIds" to
                                                        listOf(
                                                            "bec371ef-dbad-4e73-a56a-dadecff2287c"
                                                        ),
                                                    "createdBy" to
                                                        "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                                    "contractId" to
                                                        "68595d6d-261f-496b-bf88-51fc7d2b5ccc",
                                                    "commitmentUsageDescription" to "",
                                                    "startDate" to "2023-01-01",
                                                    "dtLastModified" to
                                                        "2022-10-28T13:54:48.081781Z",
                                                )
                                        ),
                                    "eventTime" to "2022-10-28T13:54:48.087Z",
                                    "eventName" to "configuration.commitment.created",
                                )
                            )
                        )
                        .build()
                )
                .nextToken(
                    "MTY2MDMxNTYyNjQ1NCNERUxJTSNhNTIxMDQ0Zi0zMzA0LTQ0ZjEtYTBkYy05YzQyMjIzZGFhMWE="
                )
                .build()

        assertThat(eventListPageResponse.data().getOrNull())
            .containsExactly(
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
                                                "accountId" to
                                                    "1cf2a754-476c-498c-b05a-7d41abfc404d",
                                                "dtCreated" to "2022-10-28T13:54:48.081781Z",
                                                "amountPrePaid" to 0,
                                                "productIds" to
                                                    listOf("bec371ef-dbad-4e73-a56a-dadecff2287c"),
                                                "createdBy" to
                                                    "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                                "contractId" to
                                                    "68595d6d-261f-496b-bf88-51fc7d2b5ccc",
                                                "commitmentUsageDescription" to "",
                                                "startDate" to "2023-01-01",
                                                "dtLastModified" to "2022-10-28T13:54:48.081781Z",
                                            )
                                    ),
                                "eventTime" to "2022-10-28T13:54:48.087Z",
                                "eventName" to "configuration.commitment.created",
                            )
                        )
                    )
                    .build()
            )
        assertThat(eventListPageResponse.nextToken())
            .contains(
                "MTY2MDMxNTYyNjQ1NCNERUxJTSNhNTIxMDQ0Zi0zMzA0LTQ0ZjEtYTBkYy05YzQyMjIzZGFhMWE="
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListPageResponse =
            EventListPageResponse.builder()
                .addData(
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
                                                    "orgId" to
                                                        "396d788d-5174-XXXX-9d69-YYYY4671fc33",
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
                                                    "accountId" to
                                                        "1cf2a754-476c-498c-b05a-7d41abfc404d",
                                                    "dtCreated" to "2022-10-28T13:54:48.081781Z",
                                                    "amountPrePaid" to 0,
                                                    "productIds" to
                                                        listOf(
                                                            "bec371ef-dbad-4e73-a56a-dadecff2287c"
                                                        ),
                                                    "createdBy" to
                                                        "USER_810e3a43-XXXX-4dab-YYYY-470977405b58",
                                                    "contractId" to
                                                        "68595d6d-261f-496b-bf88-51fc7d2b5ccc",
                                                    "commitmentUsageDescription" to "",
                                                    "startDate" to "2023-01-01",
                                                    "dtLastModified" to
                                                        "2022-10-28T13:54:48.081781Z",
                                                )
                                        ),
                                    "eventTime" to "2022-10-28T13:54:48.087Z",
                                    "eventName" to "configuration.commitment.created",
                                )
                            )
                        )
                        .build()
                )
                .nextToken(
                    "MTY2MDMxNTYyNjQ1NCNERUxJTSNhNTIxMDQ0Zi0zMzA0LTQ0ZjEtYTBkYy05YzQyMjIzZGFhMWE="
                )
                .build()

        val roundtrippedEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListPageResponse),
                jacksonTypeRef<EventListPageResponse>(),
            )

        assertThat(roundtrippedEventListPageResponse).isEqualTo(eventListPageResponse)
    }
}
