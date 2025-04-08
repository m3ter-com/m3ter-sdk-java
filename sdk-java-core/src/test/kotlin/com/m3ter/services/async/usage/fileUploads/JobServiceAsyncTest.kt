// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.usage.fileUploads

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.models.UsageFileUploadJobRetrieveParams
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
        val jobServiceAsync = client.usage().fileUploads().jobs()

        val fileUploadJobResponseFuture =
            jobServiceAsync.retrieve(
                UsageFileUploadJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val fileUploadJobResponse = fileUploadJobResponseFuture.get()
        fileUploadJobResponse.validate()
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
        val jobServiceAsync = client.usage().fileUploads().jobs()

        val pageFuture = jobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun getOriginalDownloadUrl() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val jobServiceAsync = client.usage().fileUploads().jobs()

        val responseFuture =
            jobServiceAsync.getOriginalDownloadUrl(
                UsageFileUploadJobGetOriginalDownloadUrlParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
