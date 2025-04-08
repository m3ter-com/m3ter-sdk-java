// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.BillConfigRetrieveParams
import com.m3ter.models.BillConfigUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillConfigServiceTest {

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
        val billConfigService = client.billConfig()

        val billConfigResponse =
            billConfigService.retrieve(BillConfigRetrieveParams.builder().orgId("orgId").build())

        billConfigResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billConfigService = client.billConfig()

        val billConfigResponse =
            billConfigService.update(
                BillConfigUpdateParams.builder()
                    .orgId("orgId")
                    .billLockDate(LocalDate.parse("2019-12-27"))
                    .version(0L)
                    .build()
            )

        billConfigResponse.validate()
    }
}
