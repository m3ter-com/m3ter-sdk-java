// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account =
            Account.builder()
                .id("id")
                .version(0L)
                .address(
                    Account.Address.builder()
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
                .autoGenerateStatementMode(Account.AutoGenerateStatementMode.NONE)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .code("code")
                .configData(
                    Account.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .addCreditApplicationOrder(Account.CreditApplicationOrder.PREPAYMENT)
                .currency("USD")
                .customFields(
                    Account.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .daysBeforeBillDue(0L)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailAddress("emailAddress")
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .parentAccountId("parentAccountId")
                .purchaseOrderNumber("purchaseOrderNumber")
                .statementDefinitionId("statementDefinitionId")
                .build()
        assertThat(account).isNotNull
        assertThat(account.id()).isEqualTo("id")
        assertThat(account.version()).isEqualTo(0L)
        assertThat(account.address())
            .contains(
                Account.Address.builder()
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
        assertThat(account.autoGenerateStatementMode())
            .contains(Account.AutoGenerateStatementMode.NONE)
        assertThat(account.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(account.code()).contains("code")
        assertThat(account.configData())
            .contains(
                Account.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(account.createdBy()).contains("createdBy")
        assertThat(account.creditApplicationOrder().get())
            .containsExactly(Account.CreditApplicationOrder.PREPAYMENT)
        assertThat(account.currency()).contains("USD")
        assertThat(account.customFields())
            .contains(
                Account.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(account.daysBeforeBillDue()).contains(0L)
        assertThat(account.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.emailAddress()).contains("emailAddress")
        assertThat(account.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(account.name()).contains("name")
        assertThat(account.parentAccountId()).contains("parentAccountId")
        assertThat(account.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(account.statementDefinitionId()).contains("statementDefinitionId")
    }
}
