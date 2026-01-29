// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables.lookupTableRevisionData

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupTableRevisionDataJobServiceTest {

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
        val lookupTableRevisionDataJobService =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val lookupTableRevisionDataJob =
            lookupTableRevisionDataJobService.retrieve(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .id("id")
                    .build()
            )

        lookupTableRevisionDataJob.validate()
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
        val lookupTableRevisionDataJobService =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val page =
            lookupTableRevisionDataJobService.list(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.builder()
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .build()
            )

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
        val lookupTableRevisionDataJobService =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val lookupTableRevisionDataJob =
            lookupTableRevisionDataJobService.delete(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .id("id")
                    .build()
            )

        lookupTableRevisionDataJob.validate()
    }

    @Test
    fun download() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataJobService =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val response =
            lookupTableRevisionDataJobService.download(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .contentType(
                        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
                            .ContentType
                            .APPLICATION_JSONL
                    )
                    .build()
            )

        response.validate()
    }
}
