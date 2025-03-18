// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractResponseTest {

    @Test
    fun create() {
        val contractResponse =
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

        assertThat(contractResponse.id()).isEqualTo("id")
        assertThat(contractResponse.version()).isEqualTo(0L)
        assertThat(contractResponse.accountId()).contains("accountId")
        assertThat(contractResponse.code()).contains("code")
        assertThat(contractResponse.createdBy()).contains("createdBy")
        assertThat(contractResponse.customFields())
            .contains(
                ContractResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contractResponse.description()).contains("description")
        assertThat(contractResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contractResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contractResponse.endDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(contractResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(contractResponse.name()).contains("name")
        assertThat(contractResponse.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(contractResponse.startDate()).contains(LocalDate.parse("2019-12-27"))
    }
}
