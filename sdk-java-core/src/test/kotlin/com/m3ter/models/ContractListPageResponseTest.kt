// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractListPageResponseTest {

    @Test
    fun create() {
        val contractListPageResponse =
            ContractListPageResponse.builder()
                .addData(
                    ContractResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            ContractResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(LocalDate.parse("2019-12-27"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .purchaseOrderNumber("purchaseOrderNumber")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(contractListPageResponse.data().getOrNull())
            .containsExactly(
                ContractResponse.builder()
                    .id("id")
                    .version(0L)
                    .accountId("accountId")
                    .code("code")
                    .createdBy("createdBy")
                    .customFields(
                        ContractResponse.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endDate(LocalDate.parse("2019-12-27"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
        assertThat(contractListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractListPageResponse =
            ContractListPageResponse.builder()
                .addData(
                    ContractResponse.builder()
                        .id("id")
                        .version(0L)
                        .accountId("accountId")
                        .code("code")
                        .createdBy("createdBy")
                        .customFields(
                            ContractResponse.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .description("description")
                        .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endDate(LocalDate.parse("2019-12-27"))
                        .lastModifiedBy("lastModifiedBy")
                        .name("name")
                        .purchaseOrderNumber("purchaseOrderNumber")
                        .startDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedContractListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractListPageResponse),
                jacksonTypeRef<ContractListPageResponse>(),
            )

        assertThat(roundtrippedContractListPageResponse).isEqualTo(contractListPageResponse)
    }
}
