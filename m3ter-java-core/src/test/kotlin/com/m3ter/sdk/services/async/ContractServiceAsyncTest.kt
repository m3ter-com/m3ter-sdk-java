// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
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
class ContractServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val contractFuture =
            contractServiceAsync.create(
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

        val contract = contractFuture.get()
        contract.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val contractFuture =
            contractServiceAsync.retrieve(
                ContractRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val contract = contractFuture.get()
        contract.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val contractFuture =
            contractServiceAsync.update(
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

        val contract = contractFuture.get()
        contract.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val pageFuture =
            contractServiceAsync.list(ContractListParams.builder().orgId("orgId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val contractFuture =
            contractServiceAsync.delete(
                ContractDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val contract = contractFuture.get()
        contract.validate()
    }

    @Test
    fun endDateBillingEntities() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val contractServiceAsync = client.contracts()

        val responseFuture =
            contractServiceAsync.endDateBillingEntities(
                ContractEndDateBillingEntitiesParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .addBillingEntity(ContractEndDateBillingEntitiesParams.BillingEntity.CONTRACT)
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .applyToChildren(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
