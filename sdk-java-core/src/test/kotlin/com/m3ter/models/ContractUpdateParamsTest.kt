// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractUpdateParamsTest {

    @Test
    fun create() {
        ContractUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .accountId("x")
            .endDate(LocalDate.parse("2019-12-27"))
            .name("x")
            .startDate(LocalDate.parse("2019-12-27"))
            .code("S?oC\"\$]C] ]]]]]5]")
            .customFields(
                ContractUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .description("description")
            .purchaseOrderNumber("purchaseOrderNumber")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ContractUpdateParams.builder()
                .id("id")
                .accountId("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .name("x")
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ContractUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .accountId("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .name("x")
                .startDate(LocalDate.parse("2019-12-27"))
                .code("S?oC\"\$]C] ]]]]]5]")
                .customFields(
                    ContractUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .purchaseOrderNumber("purchaseOrderNumber")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.code()).contains("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.customFields())
            .contains(
                ContractUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractUpdateParams.builder()
                .id("id")
                .accountId("x")
                .endDate(LocalDate.parse("2019-12-27"))
                .name("x")
                .startDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("x")
        assertThat(body.endDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }
}
