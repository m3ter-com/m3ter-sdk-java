// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.ExternalMappingCreateParams
import com.m3ter.models.ExternalMappingDeleteParams
import com.m3ter.models.ExternalMappingListByExternalEntityParams
import com.m3ter.models.ExternalMappingListByM3terEntityParams
import com.m3ter.models.ExternalMappingRetrieveParams
import com.m3ter.models.ExternalMappingUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalMappingServiceTest {

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
        val externalMappingService = client.externalMappings()

        val externalMappingResponse =
            externalMappingService.create(
                ExternalMappingCreateParams.builder()
                    .orgId("orgId")
                    .externalId("cus_00000000000000")
                    .externalSystem("Stripe")
                    .externalTable("Customer")
                    .m3terEntity("Account")
                    .m3terId("00000000-0000-0000-0000-000000000000")
                    .integrationConfigId("00000000-0000-0000-0000-000000000000")
                    .version(0L)
                    .build()
            )

        externalMappingResponse.validate()
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
        val externalMappingService = client.externalMappings()

        val externalMappingResponse =
            externalMappingService.retrieve(
                ExternalMappingRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        externalMappingResponse.validate()
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
        val externalMappingService = client.externalMappings()

        val externalMappingResponse =
            externalMappingService.update(
                ExternalMappingUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .externalId("cus_00000000000000")
                    .externalSystem("Stripe")
                    .externalTable("Customer")
                    .m3terEntity("Account")
                    .m3terId("00000000-0000-0000-0000-000000000000")
                    .integrationConfigId("00000000-0000-0000-0000-000000000000")
                    .version(0L)
                    .build()
            )

        externalMappingResponse.validate()
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
        val externalMappingService = client.externalMappings()

        val page = externalMappingService.list()

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
        val externalMappingService = client.externalMappings()

        val externalMappingResponse =
            externalMappingService.delete(
                ExternalMappingDeleteParams.builder().orgId("orgId").id("id").build()
            )

        externalMappingResponse.validate()
    }

    @Test
    fun listByExternalEntity() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val externalMappingService = client.externalMappings()

        val page =
            externalMappingService.listByExternalEntity(
                ExternalMappingListByExternalEntityParams.builder()
                    .system("system")
                    .externalTable("externalTable")
                    .externalId("externalId")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun listByM3terEntity() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val externalMappingService = client.externalMappings()

        val page =
            externalMappingService.listByM3terEntity(
                ExternalMappingListByM3terEntityParams.builder()
                    .entity("entity")
                    .m3terId("m3terId")
                    .build()
            )

        page.response().validate()
    }
}
