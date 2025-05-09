// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

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
        val jobServiceAsync = client.dataExports().jobs()

        val dataExportJobResponseFuture =
            jobServiceAsync.retrieve(
                DataExportJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val dataExportJobResponse = dataExportJobResponseFuture.get()
        dataExportJobResponse.validate()
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
        val jobServiceAsync = client.dataExports().jobs()

        val pageFuture = jobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun getDownloadUrl() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val jobServiceAsync = client.dataExports().jobs()

        val responseFuture =
            jobServiceAsync.getDownloadUrl(
                DataExportJobGetDownloadUrlParams.builder().orgId("orgId").jobId("jobId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
