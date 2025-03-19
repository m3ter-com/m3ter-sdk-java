// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesParams
import com.m3ter.sdk.models.AccountGetChildrenParams
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountUpdateParams
import com.m3ter.sdk.models.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val accountResponse =
            accountService.create(
                AccountCreateParams.builder()
                    .orgId("orgId")
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
                    .autoGenerateStatementMode(AccountCreateParams.AutoGenerateStatementMode.NONE)
                    .billEpoch(LocalDate.parse("2019-12-27"))
                    .configData(
                        AccountCreateParams.ConfigData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addCreditApplicationOrder(
                        AccountCreateParams.CreditApplicationOrder.PREPAYMENT
                    )
                    .currency("USD")
                    .customFields(
                        AccountCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .daysBeforeBillDue(1L)
                    .parentAccountId("parentAccountId")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .statementDefinitionId("statementDefinitionId")
                    .version(0L)
                    .build()
            )

        accountResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val accountResponse =
            accountService.retrieve(AccountRetrieveParams.builder().orgId("orgId").id("id").build())

        accountResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val accountResponse =
            accountService.update(
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
                    .addCreditApplicationOrder(
                        AccountUpdateParams.CreditApplicationOrder.PREPAYMENT
                    )
                    .currency("USD")
                    .customFields(
                        AccountUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .daysBeforeBillDue(1L)
                    .parentAccountId("parentAccountId")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .statementDefinitionId("statementDefinitionId")
                    .version(0L)
                    .build()
            )

        accountResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val page = accountService.list(AccountListParams.builder().orgId("orgId").build())

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val accountResponse =
            accountService.delete(AccountDeleteParams.builder().orgId("orgId").id("id").build())

        accountResponse.validate()
    }

    @Test
    fun endDateBillingEntities() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val response =
            accountService.endDateBillingEntities(
                AccountEndDateBillingEntitiesParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .addBillingEntity(AccountEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .applyToChildren(true)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getChildren() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val accountResponse =
            accountService.getChildren(
                AccountGetChildrenParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .nextToken("nextToken")
                    .pageSize(1L)
                    .build()
            )

        accountResponse.validate()
    }

    @Test
    fun search() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val accountService = client.accounts()

        val response =
            accountService.search(
                AccountSearchParams.builder()
                    .orgId("orgId")
                    .fromDocument(0L)
                    .operator(AccountSearchParams.Operator.AND)
                    .pageSize(1L)
                    .searchQuery("searchQuery")
                    .sortBy("sortBy")
                    .sortOrder(AccountSearchParams.SortOrder.ASC)
                    .build()
            )

        response.validate()
    }
}
