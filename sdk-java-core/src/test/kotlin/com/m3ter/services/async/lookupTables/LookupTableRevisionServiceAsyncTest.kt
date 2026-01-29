// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.LookupTableLookupTableRevisionCreateParams
import com.m3ter.models.LookupTableLookupTableRevisionDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionUpdateStatusParams
import com.m3ter.models.LookupTableRevisionRequest
import com.m3ter.models.LookupTableRevisionStatusRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupTableRevisionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val lookupTableRevisionResponseFuture =
            lookupTableRevisionServiceAsync.create(
                LookupTableLookupTableRevisionCreateParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionRequest(
                        LookupTableRevisionRequest.builder()
                            .addField(
                                LookupTableRevisionRequest.Field.builder()
                                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                                    .name("lookupfield")
                                    .build()
                            )
                            .addField(
                                LookupTableRevisionRequest.Field.builder()
                                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                                    .name("lookupfield")
                                    .build()
                            )
                            .keys(listOf("foo", "bar", "baz"))
                            .name("x")
                            .customFields(
                                LookupTableRevisionRequest.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val lookupTableRevisionResponse = lookupTableRevisionResponseFuture.get()
        lookupTableRevisionResponse.validate()
    }

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
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val lookupTableRevisionResponseFuture =
            lookupTableRevisionServiceAsync.retrieve(
                LookupTableLookupTableRevisionRetrieveParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .id("id")
                    .build()
            )

        val lookupTableRevisionResponse = lookupTableRevisionResponseFuture.get()
        lookupTableRevisionResponse.validate()
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
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val lookupTableRevisionResponseFuture =
            lookupTableRevisionServiceAsync.update(
                LookupTableLookupTableRevisionUpdateParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .id("id")
                    .lookupTableRevisionRequest(
                        LookupTableRevisionRequest.builder()
                            .addField(
                                LookupTableRevisionRequest.Field.builder()
                                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                                    .name("lookupfield")
                                    .build()
                            )
                            .addField(
                                LookupTableRevisionRequest.Field.builder()
                                    .type(LookupTableRevisionRequest.Field.Type.STRING)
                                    .name("lookupfield")
                                    .build()
                            )
                            .keys(listOf("foo", "bar", "baz"))
                            .name("x")
                            .customFields(
                                LookupTableRevisionRequest.CustomFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val lookupTableRevisionResponse = lookupTableRevisionResponseFuture.get()
        lookupTableRevisionResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val pageFuture = lookupTableRevisionServiceAsync.list("lookupTableId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val lookupTableRevisionResponseFuture =
            lookupTableRevisionServiceAsync.delete(
                LookupTableLookupTableRevisionDeleteParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .id("id")
                    .build()
            )

        val lookupTableRevisionResponse = lookupTableRevisionResponseFuture.get()
        lookupTableRevisionResponse.validate()
    }

    @Test
    fun updateStatus() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionServiceAsync = client.lookupTables().lookupTableRevisions()

        val lookupTableRevisionResponseFuture =
            lookupTableRevisionServiceAsync.updateStatus(
                LookupTableLookupTableRevisionUpdateStatusParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .id("id")
                    .lookupTableRevisionStatusRequest(
                        LookupTableRevisionStatusRequest.builder()
                            .status(LookupTableRevisionStatusRequest.Status.DRAFT)
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val lookupTableRevisionResponse = lookupTableRevisionResponseFuture.get()
        lookupTableRevisionResponse.validate()
    }
}
