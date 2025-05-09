// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.usage

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.UsageFileUploadGenerateUploadUrlParams
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
                    .contentLength(1L)
                    .contentType(
                        UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON
                    )
                    .fileName("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
