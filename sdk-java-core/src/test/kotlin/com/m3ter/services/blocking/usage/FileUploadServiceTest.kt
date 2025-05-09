// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.usage

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.UsageFileUploadGenerateUploadUrlParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileUploadServiceTest {

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
                    .contentLength(1L)
                    .contentType(
                        UsageFileUploadGenerateUploadUrlParams.ContentType.APPLICATION_JSON
                    )
                    .fileName("x")
                    .build()
            )

        response.validate()
    }
}
