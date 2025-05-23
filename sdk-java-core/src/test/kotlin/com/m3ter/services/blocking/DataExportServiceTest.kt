// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.AdHocOperationalDataRequest
import com.m3ter.models.DataExportCreateAdhocParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataExportServiceTest {

    @Test
    fun createAdhoc() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val dataExportService = client.dataExports()

        val adHocResponse =
            dataExportService.createAdhoc(
                DataExportCreateAdhocParams.builder()
                    .orgId("orgId")
                    .body(
                        AdHocOperationalDataRequest.builder()
                            .addOperationalDataType(
                                AdHocOperationalDataRequest.OperationalDataType.BILLS
                            )
                            .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        adHocResponse.validate()
    }
}
