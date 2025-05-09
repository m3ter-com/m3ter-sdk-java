// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateParamsTest {

    @Test
    fun create() {
        AccountUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .code("JS!?Q0]r] ]\$]")
            .emailAddress("dev@stainless.com")
            .name("x")
            .address(
                Address.builder()
                    .addressLine1("addressLine1")
                    .addressLine2("addressLine2")
                    .addressLine3("addressLine3")
                    .addressLine4("addressLine4")
                    .country("country")
                    .locality("locality")
                    .postCode("postCode")
                    .region("region")
                    .build()
            )
            .autoGenerateStatementMode(AccountUpdateParams.AutoGenerateStatementMode.NONE)
            .billEpoch(LocalDate.parse("2019-12-27"))
            .configData(
                AccountUpdateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addCreditApplicationOrder(AccountUpdateParams.CreditApplicationOrder.PREPAYMENT)
            .currency("USD")
            .customFields(
                AccountUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .daysBeforeBillDue(1)
            .parentAccountId("parentAccountId")
            .purchaseOrderNumber("purchaseOrderNumber")
            .statementDefinitionId("statementDefinitionId")
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AccountUpdateParams.builder()
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .emailAddress("dev@stainless.com")
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .emailAddress("dev@stainless.com")
                .name("x")
                .address(
                    Address.builder()
                        .addressLine1("addressLine1")
                        .addressLine2("addressLine2")
                        .addressLine3("addressLine3")
                        .addressLine4("addressLine4")
                        .country("country")
                        .locality("locality")
                        .postCode("postCode")
                        .region("region")
                        .build()
                )
                .autoGenerateStatementMode(AccountUpdateParams.AutoGenerateStatementMode.NONE)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .configData(
                    AccountUpdateParams.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addCreditApplicationOrder(AccountUpdateParams.CreditApplicationOrder.PREPAYMENT)
                .currency("USD")
                .customFields(
                    AccountUpdateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .daysBeforeBillDue(1)
                .parentAccountId("parentAccountId")
                .purchaseOrderNumber("purchaseOrderNumber")
                .statementDefinitionId("statementDefinitionId")
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.emailAddress()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.address())
            .contains(
                Address.builder()
                    .addressLine1("addressLine1")
                    .addressLine2("addressLine2")
                    .addressLine3("addressLine3")
                    .addressLine4("addressLine4")
                    .country("country")
                    .locality("locality")
                    .postCode("postCode")
                    .region("region")
                    .build()
            )
        assertThat(body.autoGenerateStatementMode())
            .contains(AccountUpdateParams.AutoGenerateStatementMode.NONE)
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.configData())
            .contains(
                AccountUpdateParams.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.creditApplicationOrder().getOrNull())
            .containsExactly(AccountUpdateParams.CreditApplicationOrder.PREPAYMENT)
        assertThat(body.currency()).contains("USD")
        assertThat(body.customFields())
            .contains(
                AccountUpdateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.daysBeforeBillDue()).contains(1)
        assertThat(body.parentAccountId()).contains("parentAccountId")
        assertThat(body.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(body.statementDefinitionId()).contains("statementDefinitionId")
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountUpdateParams.builder()
                .id("id")
                .code("JS!?Q0]r] ]\$]")
                .emailAddress("dev@stainless.com")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("JS!?Q0]r] ]\$]")
        assertThat(body.emailAddress()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
