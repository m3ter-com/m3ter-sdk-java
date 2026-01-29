// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables.lookupTableRevisionData

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupTableRevisionDataJobServiceAsyncTest {

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
        val lookupTableRevisionDataJobServiceAsync =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val lookupTableRevisionDataJobFuture =
            lookupTableRevisionDataJobServiceAsync.retrieve(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .id("id")
                    .build()
            )

        val lookupTableRevisionDataJob = lookupTableRevisionDataJobFuture.get()
        lookupTableRevisionDataJob.validate()
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
        val lookupTableRevisionDataJobServiceAsync =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val pageFuture =
            lookupTableRevisionDataJobServiceAsync.list(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.builder()
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .build()
            )

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
        val lookupTableRevisionDataJobServiceAsync =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val lookupTableRevisionDataJobFuture =
            lookupTableRevisionDataJobServiceAsync.delete(
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .id("id")
                    .build()
            )

        val lookupTableRevisionDataJob = lookupTableRevisionDataJobFuture.get()
        lookupTableRevisionDataJob.validate()
    }

    @Test
    fun download() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataJobServiceAsync =
            client.lookupTables().lookupTableRevisionData().lookupTableRevisionDataJobs()

        val responseFuture =
            lookupTableRevisionDataJobServiceAsync.download(
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

        val response = responseFuture.get()
        response.validate()
    }
}
