// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.usage

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FileUploadServiceTest {

    @Test
    fun generateUploadUrl() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val fileUploadService = client.usage().fileUploads()

        val response =
            fileUploadService.generateUploadUrl(
                UsageFileUploadGenerateUploadUrlParams.builder()
                    .orgId("orgId")
                    .contentType("x")
                    .fileName("x")
                    .contentLength(1L)
                    .build()
            )

        response.validate()
    }
}
