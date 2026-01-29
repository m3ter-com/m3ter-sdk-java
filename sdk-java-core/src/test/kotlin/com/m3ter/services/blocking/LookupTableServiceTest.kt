// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.LookupTableCreateParams
import com.m3ter.models.LookupTableDeleteParams
import com.m3ter.models.LookupTableRequest
import com.m3ter.models.LookupTableRetrieveParams
import com.m3ter.models.LookupTableUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupTableServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableService = client.lookupTables()

        val lookupTableResponse =
            lookupTableService.create(
                LookupTableCreateParams.builder()
                    .orgId("orgId")
                    .lookupTableRequest(
                        LookupTableRequest.builder()
                            .code("S?oC\"\$]C] ]]]]]5]")
                            .name("x")
                            .customFields(
                                LookupTableRequest.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        lookupTableResponse.validate()
    }

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
        val lookupTableService = client.lookupTables()

        val lookupTableResponse =
            lookupTableService.retrieve(
                LookupTableRetrieveParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .addAdditional("string")
                    .build()
            )

        lookupTableResponse.validate()
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
        val lookupTableService = client.lookupTables()

        val lookupTableResponse =
            lookupTableService.update(
                LookupTableUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .lookupTableRequest(
                        LookupTableRequest.builder()
                            .code("S?oC\"\$]C] ]]]]]5]")
                            .name("x")
                            .customFields(
                                LookupTableRequest.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        lookupTableResponse.validate()
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
        val lookupTableService = client.lookupTables()

        val page = lookupTableService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableService = client.lookupTables()

        val lookupTableResponse =
            lookupTableService.delete(
                LookupTableDeleteParams.builder().orgId("orgId").id("id").build()
            )

        lookupTableResponse.validate()
    }
}
