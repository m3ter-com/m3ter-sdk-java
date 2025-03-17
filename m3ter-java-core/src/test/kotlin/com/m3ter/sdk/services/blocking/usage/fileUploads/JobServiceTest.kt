// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.usage.fileUploads

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

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
        val jobService = client.usage().fileUploads().jobs()

        val fileUploadJobResponse =
            jobService.retrieve(
                UsageFileUploadJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        fileUploadJobResponse.validate()
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
        val jobService = client.usage().fileUploads().jobs()

        val page = jobService.list(UsageFileUploadJobListParams.builder().orgId("orgId").build())

        page.response().validate()
    }

    @Test
    fun getOriginalDownloadUrl() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val jobService = client.usage().fileUploads().jobs()

        val response =
            jobService.getOriginalDownloadUrl(
                UsageFileUploadJobGetOriginalDownloadUrlParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .build()
            )

        response.validate()
    }
}
