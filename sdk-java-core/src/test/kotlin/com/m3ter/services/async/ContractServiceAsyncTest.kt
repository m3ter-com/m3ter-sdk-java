// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.ContractCreateParams
import com.m3ter.models.ContractDeleteParams
import com.m3ter.models.ContractEndDateBillingEntitiesParams
import com.m3ter.models.ContractRetrieveParams
import com.m3ter.models.ContractUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ContractServiceAsyncTest {

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

        val contractResponseFuture =
            contractServiceAsync.create(
                ContractCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .name("x")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .code("S?oC\"\$]C] ]]]]]5]")
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

        val contractResponse = contractResponseFuture.get()
        contractResponse.validate()
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

        val contractResponseFuture =
            contractServiceAsync.retrieve(
                ContractRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val contractResponse = contractResponseFuture.get()
        contractResponse.validate()
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

        val contractResponseFuture =
            contractServiceAsync.update(
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
            )

        val contractResponse = contractResponseFuture.get()
        contractResponse.validate()
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

        val pageFuture = contractServiceAsync.list()

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

        val contractResponseFuture =
            contractServiceAsync.delete(
                ContractDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val contractResponse = contractResponseFuture.get()
        contractResponse.validate()
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
