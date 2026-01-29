// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .orgId("orgId")
            .code("S?oC\"\$]C] ]]]]]5]")
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
            .autoGenerateStatementMode(AccountCreateParams.AutoGenerateStatementMode.NONE)
            .billEpoch(LocalDate.parse("2019-12-27"))
            .addCreditApplicationOrder(AccountCreateParams.CreditApplicationOrder.PREPAYMENT)
            .currency("USD")
            .customFields(
                AccountCreateParams.CustomFields.builder()
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
            AccountCreateParams.builder()
                .code("S?oC\"\$]C] ]]]]]5]")
                .emailAddress("dev@stainless.com")
                .name("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .orgId("orgId")
                .code("S?oC\"\$]C] ]]]]]5]")
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
                .autoGenerateStatementMode(AccountCreateParams.AutoGenerateStatementMode.NONE)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .addCreditApplicationOrder(AccountCreateParams.CreditApplicationOrder.PREPAYMENT)
                .currency("USD")
                .customFields(
                    AccountCreateParams.CustomFields.builder()
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

        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
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
            .contains(AccountCreateParams.AutoGenerateStatementMode.NONE)
        assertThat(body.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.creditApplicationOrder().getOrNull())
            .containsExactly(AccountCreateParams.CreditApplicationOrder.PREPAYMENT)
        assertThat(body.currency()).contains("USD")
        assertThat(body.customFields())
            .contains(
                AccountCreateParams.CustomFields.builder()
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
            AccountCreateParams.builder()
                .code("S?oC\"\$]C] ]]]]]5]")
                .emailAddress("dev@stainless.com")
                .name("x")
                .build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("S?oC\"\$]C] ]]]]]5]")
        assertThat(body.emailAddress()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("x")
    }
}
