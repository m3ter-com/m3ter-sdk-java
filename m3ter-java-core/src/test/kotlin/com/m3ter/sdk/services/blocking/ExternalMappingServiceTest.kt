// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.ExternalMappingCreateParams
import com.m3ter.sdk.models.ExternalMappingDeleteParams
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityParams
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityParams
import com.m3ter.sdk.models.ExternalMappingListParams
import com.m3ter.sdk.models.ExternalMappingRetrieveParams
import com.m3ter.sdk.models.ExternalMappingUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalMappingServiceTest {

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
                    .externalId("JS!?Q0]r] ]\$]")
                    .externalSystem("JS!?Q0]r] ]\$]")
                    .externalTable("JS!?Q0]r] ]\$]")
                    .m3terEntity("JS!?Q0]r] ]\$]")
                    .m3terId("JS!?Q0]r] ]\$]")
                    .integrationConfigId("integrationConfigId")
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
                    .externalId("JS!?Q0]r] ]\$]")
                    .externalSystem("JS!?Q0]r] ]\$]")
                    .externalTable("JS!?Q0]r] ]\$]")
                    .m3terEntity("JS!?Q0]r] ]\$]")
                    .m3terId("JS!?Q0]r] ]\$]")
                    .integrationConfigId("integrationConfigId")
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

        val page =
            externalMappingService.list(ExternalMappingListParams.builder().orgId("orgId").build())

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
                    .orgId("orgId")
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
                    .orgId("orgId")
                    .entity("entity")
                    .m3terId("m3terId")
                    .build()
            )

        page.response().validate()
    }
}
