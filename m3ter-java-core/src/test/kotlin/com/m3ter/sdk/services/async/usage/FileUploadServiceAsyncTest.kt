// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.usage

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileUploadServiceAsyncTest {

    @Test
    fun generateUploadUrl() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val fileUploadServiceAsync = client.usage().fileUploads()

        val responseFuture =
            fileUploadServiceAsync.generateUploadUrl(
                UsageFileUploadGenerateUploadUrlParams.builder()
                    .orgId("orgId")
                    .contentType("x")
                    .fileName("x")
                    .contentLength(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
