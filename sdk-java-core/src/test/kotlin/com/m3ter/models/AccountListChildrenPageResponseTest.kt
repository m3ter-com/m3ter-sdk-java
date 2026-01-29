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

internal class AccountListChildrenPageResponseTest {

    @Test
    fun create() {
        val accountListChildrenPageResponse =
            AccountListChildrenPageResponse.builder()
                .addData(
                    AccountResponse.builder()
                        .id("id")
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
                        .createdBy("createdBy")
                        .addCreditApplicationOrder(
                            AccountResponse.CreditApplicationOrder.PREPAYMENT
                        )
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
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        assertThat(accountListChildrenPageResponse.data().getOrNull())
            .containsExactly(
                AccountResponse.builder()
                    .id("id")
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
                    .version(0L)
                    .build()
            )
        assertThat(accountListChildrenPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountListChildrenPageResponse =
            AccountListChildrenPageResponse.builder()
                .addData(
                    AccountResponse.builder()
                        .id("id")
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
                        .createdBy("createdBy")
                        .addCreditApplicationOrder(
                            AccountResponse.CreditApplicationOrder.PREPAYMENT
                        )
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
                        .version(0L)
                        .build()
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedAccountListChildrenPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountListChildrenPageResponse),
                jacksonTypeRef<AccountListChildrenPageResponse>(),
            )

        assertThat(roundtrippedAccountListChildrenPageResponse)
            .isEqualTo(accountListChildrenPageResponse)
    }
}
