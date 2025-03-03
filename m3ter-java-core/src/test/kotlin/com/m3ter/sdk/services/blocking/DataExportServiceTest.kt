// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.AdHocOperationalDataRequest
import com.m3ter.sdk.models.DataExportCreateAdhocParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DataExportServiceTest {

    @Test
    fun callCreateAdhoc() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val dataExportService = client.dataExports()
        val adhocExport =
            dataExportService.createAdhoc(
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
        println(adhocExport)
        adhocExport.validate()
    }
}
