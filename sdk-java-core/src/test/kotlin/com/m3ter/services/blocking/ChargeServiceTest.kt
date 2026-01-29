// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.ChargeCreateParams
import com.m3ter.models.ChargeDeleteParams
import com.m3ter.models.ChargeRetrieveParams
import com.m3ter.models.ChargeUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargeServiceTest {

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
        val chargeService = client.charges()

        val charge =
            chargeService.create(
                ChargeCreateParams.builder()
                    .orgId("orgId")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .currency("x")
                    .entityType(ChargeCreateParams.EntityType.AD_HOC)
                    .lineItemType(ChargeCreateParams.LineItemType.BALANCE_FEE)
                    .name("x")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .amount(0.0)
                    .billDate("2022-01-04")
                    .contractId("contractId")
                    .description("description")
                    .entityId("entityId")
                    .notes("notes")
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )

        charge.validate()
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
        val chargeService = client.charges()

        val charge =
            chargeService.retrieve(ChargeRetrieveParams.builder().orgId("orgId").id("id").build())

        charge.validate()
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
        val chargeService = client.charges()

        val charge =
            chargeService.update(
                ChargeUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .accountId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .code("S?oC\"\$]C] ]]]]]5]")
                    .currency("x")
                    .entityType(ChargeUpdateParams.EntityType.AD_HOC)
                    .lineItemType(ChargeUpdateParams.LineItemType.BALANCE_FEE)
                    .name("x")
                    .servicePeriodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .servicePeriodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accountingProductId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .amount(0.0)
                    .billDate("2022-01-04")
                    .contractId("contractId")
                    .description("description")
                    .entityId("entityId")
                    .notes("notes")
                    .unitPrice(0.0)
                    .units(0.0)
                    .version(0L)
                    .build()
            )

        charge.validate()
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
        val chargeService = client.charges()

        val page = chargeService.list()

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
        val chargeService = client.charges()

        val charge =
            chargeService.delete(ChargeDeleteParams.builder().orgId("orgId").id("id").build())

        charge.validate()
    }
}
