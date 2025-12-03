// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
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
internal class ContractServiceTest {

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

        val contractResponse =
            contractService.create(
                ContractCreateParams.builder()
                    .orgId("orgId")
                    .accountId("x")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .name("x")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .applyContractPeriodLimits(true)
                    .billGroupingKeyId("billGroupingKeyId")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .customFields(
                        ContractCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .addUsageFilter(
                        ContractCreateParams.UsageFilter.builder()
                            .dimensionCode("x")
                            .mode(ContractCreateParams.UsageFilter.Mode.INCLUDE)
                            .value("x")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        contractResponse.validate()
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

        val contractResponse =
            contractService.retrieve(
                ContractRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        contractResponse.validate()
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

        val contractResponse =
            contractService.update(
                ContractUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("x")
                    .endDate(LocalDate.parse("2019-12-27"))
                    .name("x")
                    .startDate(LocalDate.parse("2019-12-27"))
                    .applyContractPeriodLimits(true)
                    .billGroupingKeyId("billGroupingKeyId")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .customFields(
                        ContractUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .description("description")
                    .purchaseOrderNumber("purchaseOrderNumber")
                    .addUsageFilter(
                        ContractUpdateParams.UsageFilter.builder()
                            .dimensionCode("x")
                            .mode(ContractUpdateParams.UsageFilter.Mode.INCLUDE)
                            .value("x")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        contractResponse.validate()
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

        val page = contractService.list()

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

        val contractResponse =
            contractService.delete(ContractDeleteParams.builder().orgId("orgId").id("id").build())

        contractResponse.validate()
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
