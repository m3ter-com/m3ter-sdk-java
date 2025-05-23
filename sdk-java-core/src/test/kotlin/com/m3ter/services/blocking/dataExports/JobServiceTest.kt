// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobRetrieveParams
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
        val jobService = client.dataExports().jobs()

        val dataExportJobResponse =
            jobService.retrieve(
                DataExportJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        dataExportJobResponse.validate()
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
        val jobService = client.dataExports().jobs()

        val page = jobService.list()

        page.response().validate()
    }

    @Test
    fun getDownloadUrl() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val jobService = client.dataExports().jobs()

        val response =
            jobService.getDownloadUrl(
                DataExportJobGetDownloadUrlParams.builder().orgId("orgId").jobId("jobId").build()
            )

        response.validate()
    }
}
