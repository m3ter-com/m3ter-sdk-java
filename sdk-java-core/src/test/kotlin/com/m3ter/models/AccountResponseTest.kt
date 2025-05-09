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

internal class AccountResponseTest {

    @Test
    fun create() {
        val accountResponse =
            AccountResponse.builder()
                .id("id")
                .version(0L)
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
                .autoGenerateStatementMode(AccountResponse.AutoGenerateStatementMode.NONE)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .code("code")
                .configData(
                    AccountResponse.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .addCreditApplicationOrder(AccountResponse.CreditApplicationOrder.PREPAYMENT)
                .currency("USD")
                .customFields(
                    AccountResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .daysBeforeBillDue(0)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailAddress("emailAddress")
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .parentAccountId("parentAccountId")
                .purchaseOrderNumber("purchaseOrderNumber")
                .statementDefinitionId("statementDefinitionId")
                .build()

        assertThat(accountResponse.id()).isEqualTo("id")
        assertThat(accountResponse.version()).isEqualTo(0L)
        assertThat(accountResponse.address())
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
        assertThat(accountResponse.autoGenerateStatementMode())
            .contains(AccountResponse.AutoGenerateStatementMode.NONE)
        assertThat(accountResponse.billEpoch()).contains(LocalDate.parse("2019-12-27"))
        assertThat(accountResponse.code()).contains("code")
        assertThat(accountResponse.configData())
            .contains(
                AccountResponse.ConfigData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(accountResponse.createdBy()).contains("createdBy")
        assertThat(accountResponse.creditApplicationOrder().getOrNull())
            .containsExactly(AccountResponse.CreditApplicationOrder.PREPAYMENT)
        assertThat(accountResponse.currency()).contains("USD")
        assertThat(accountResponse.customFields())
            .contains(
                AccountResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(accountResponse.daysBeforeBillDue()).contains(0)
        assertThat(accountResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountResponse.emailAddress()).contains("emailAddress")
        assertThat(accountResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(accountResponse.name()).contains("name")
        assertThat(accountResponse.parentAccountId()).contains("parentAccountId")
        assertThat(accountResponse.purchaseOrderNumber()).contains("purchaseOrderNumber")
        assertThat(accountResponse.statementDefinitionId()).contains("statementDefinitionId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountResponse =
            AccountResponse.builder()
                .id("id")
                .version(0L)
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
                .autoGenerateStatementMode(AccountResponse.AutoGenerateStatementMode.NONE)
                .billEpoch(LocalDate.parse("2019-12-27"))
                .code("code")
                .configData(
                    AccountResponse.ConfigData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .createdBy("createdBy")
                .addCreditApplicationOrder(AccountResponse.CreditApplicationOrder.PREPAYMENT)
                .currency("USD")
                .customFields(
                    AccountResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .daysBeforeBillDue(0)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .emailAddress("emailAddress")
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .parentAccountId("parentAccountId")
                .purchaseOrderNumber("purchaseOrderNumber")
                .statementDefinitionId("statementDefinitionId")
                .build()

        val roundtrippedAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountResponse),
                jacksonTypeRef<AccountResponse>(),
            )

        assertThat(roundtrippedAccountResponse).isEqualTo(accountResponse)
    }
}
