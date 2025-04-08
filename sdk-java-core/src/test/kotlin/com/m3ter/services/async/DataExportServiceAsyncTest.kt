// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.AdHocOperationalDataRequest
import com.m3ter.models.DataExportCreateAdhocParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataExportServiceAsyncTest {

    @Test
    fun createAdhoc() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val dataExportServiceAsync = client.dataExports()

        val adHocResponseFuture =
            dataExportServiceAsync.createAdhoc(
                DataExportCreateAdhocParams.builder()
                    .orgId("orgId")
                    .body(
                        AdHocOperationalDataRequest.builder()
                            .addOperationalDataType(
                                AdHocOperationalDataRequest.OperationalDataType.BILLS
                            )
                            .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val adHocResponse = adHocResponseFuture.get()
        adHocResponse.validate()
    }
}
