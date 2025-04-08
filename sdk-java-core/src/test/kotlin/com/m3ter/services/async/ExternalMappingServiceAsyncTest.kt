// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.ExternalMappingCreateParams
import com.m3ter.models.ExternalMappingDeleteParams
import com.m3ter.models.ExternalMappingListByExternalEntityParams
import com.m3ter.models.ExternalMappingListByM3terEntityParams
import com.m3ter.models.ExternalMappingRetrieveParams
import com.m3ter.models.ExternalMappingUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExternalMappingServiceAsyncTest {

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
        val externalMappingServiceAsync = client.externalMappings()

        val externalMappingResponseFuture =
            externalMappingServiceAsync.create(
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

        val externalMappingResponse = externalMappingResponseFuture.get()
        externalMappingResponse.validate()
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
        val externalMappingServiceAsync = client.externalMappings()

        val externalMappingResponseFuture =
            externalMappingServiceAsync.retrieve(
                ExternalMappingRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val externalMappingResponse = externalMappingResponseFuture.get()
        externalMappingResponse.validate()
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
        val externalMappingServiceAsync = client.externalMappings()

        val externalMappingResponseFuture =
            externalMappingServiceAsync.update(
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

        val externalMappingResponse = externalMappingResponseFuture.get()
        externalMappingResponse.validate()
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
        val externalMappingServiceAsync = client.externalMappings()

        val pageFuture = externalMappingServiceAsync.list()

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
        val externalMappingServiceAsync = client.externalMappings()

        val externalMappingResponseFuture =
            externalMappingServiceAsync.delete(
                ExternalMappingDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val externalMappingResponse = externalMappingResponseFuture.get()
        externalMappingResponse.validate()
    }

    @Test
    fun listByExternalEntity() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val externalMappingServiceAsync = client.externalMappings()

        val pageFuture =
            externalMappingServiceAsync.listByExternalEntity(
                ExternalMappingListByExternalEntityParams.builder()
                    .system("system")
                    .externalTable("externalTable")
                    .externalId("externalId")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listByM3terEntity() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val externalMappingServiceAsync = client.externalMappings()

        val pageFuture =
            externalMappingServiceAsync.listByM3terEntity(
                ExternalMappingListByM3terEntityParams.builder()
                    .entity("entity")
                    .m3terId("m3terId")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
