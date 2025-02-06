// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractTest {

    @Test
    fun createContract() {
        val contract =
            Contract.builder()
                .id("id")
                .version(0L)
                .accountId("accountId")
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    Contract.CustomFields.builder()
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
        assertThat(contract).isNotNull
        assertThat(contract.id()).isEqualTo("id")
        assertThat(contract.version()).isEqualTo(0L)
        assertThat(contract.accountId()).contains("accountId")
        assertThat(contract.code()).contains("code")
        assertThat(contract.createdBy()).contains("createdBy")
        assertThat(contract.customFields())
            .contains(
                Contract.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contract.description()).contains("description")
        assertThat(contract.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contract.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contract.endDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(contract.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(contract.name()).contains("name")
        assertThat(contract.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(contract.startDate()).contains(LocalDate.parse("2019-12-27"))
    }
}
