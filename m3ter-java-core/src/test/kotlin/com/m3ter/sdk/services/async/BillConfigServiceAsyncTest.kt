// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.BillConfigRetrieveParams
import com.m3ter.sdk.models.BillConfigUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillConfigServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billConfigServiceAsync = client.billConfig()

        val billConfigResponseFuture =
            billConfigServiceAsync.retrieve(
                BillConfigRetrieveParams.builder().orgId("orgId").build()
            )

        val billConfigResponse = billConfigResponseFuture.get()
        billConfigResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val billConfigServiceAsync = client.billConfig()

        val billConfigResponseFuture =
            billConfigServiceAsync.update(
                BillConfigUpdateParams.builder()
                    .orgId("orgId")
                    .billLockDate(LocalDate.parse("2019-12-27"))
                    .version(0L)
                    .build()
            )

        val billConfigResponse = billConfigResponseFuture.get()
        billConfigResponse.validate()
    }
}
