// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.ContractCreateParams
import com.m3ter.sdk.models.ContractDeleteParams
import com.m3ter.sdk.models.ContractEndDateBillingEntitiesParams
import com.m3ter.sdk.models.ContractListParams
import com.m3ter.sdk.models.ContractRetrieveParams
import com.m3ter.sdk.models.ContractUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ContractServiceTest {

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
        val contractService = client.contracts()

        val contract =
            contractService.create(
                ContractCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .name("x")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        ContractCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        contract.validate()
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
        val contractService = client.contracts()

        val contract =
            contractService.retrieve(
                ContractRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        contract.validate()
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
        val contractService = client.contracts()

        val contract =
            contractService.update(
                ContractUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("x")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .name("x")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .code("JS!?Q0]r] ]\$]")
                    .customFields(
                        ContractUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .version(0L)
                    .build()
            )

        contract.validate()
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
        val contractService = client.contracts()

        val page = contractService.list(ContractListParams.builder().orgId("orgId").build())

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
        val contractService = client.contracts()

        val contract =
            contractService.delete(ContractDeleteParams.builder().orgId("orgId").id("id").build())

        contract.validate()
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
        val contractService = client.contracts()

        val response =
            contractService.endDateBillingEntities(
                ContractEndDateBillingEntitiesParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .applyToChildren(true)
                    .build()
            )

        response.validate()
    }
}
