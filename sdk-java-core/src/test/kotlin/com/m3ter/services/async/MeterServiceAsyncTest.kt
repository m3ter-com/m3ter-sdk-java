// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.DataField
import com.m3ter.models.DerivedField
import com.m3ter.models.MeterCreateParams
import com.m3ter.models.MeterDeleteParams
import com.m3ter.models.MeterRetrieveParams
import com.m3ter.models.MeterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeterServiceAsyncTest {

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
        val meterServiceAsync = client.meters()

        val meterResponseFuture =
            meterServiceAsync.create(
                MeterCreateParams.builder()
                    .orgId("orgId")
                    .code("JS!?Q0]r] ]\$]")
                    .addDataField(
                        DataField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .build()
                    )
                    .addDerivedField(
                        DerivedField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .calculation("x")
                            .build()
                    )
                    .name("x")
                    .customFields(
                        MeterCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .groupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        val meterResponse = meterResponseFuture.get()
        meterResponse.validate()
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
        val meterServiceAsync = client.meters()

        val meterResponseFuture =
            meterServiceAsync.retrieve(
                MeterRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val meterResponse = meterResponseFuture.get()
        meterResponse.validate()
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
        val meterServiceAsync = client.meters()

        val meterResponseFuture =
            meterServiceAsync.update(
                MeterUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("JS!?Q0]r] ]\$]")
                    .addDataField(
                        DataField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .build()
                    )
                    .addDerivedField(
                        DerivedField.builder()
                            .category(DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .calculation("x")
                            .build()
                    )
                    .name("x")
                    .customFields(
                        MeterUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .groupId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .productId("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .version(0L)
                    .build()
            )

        val meterResponse = meterResponseFuture.get()
        meterResponse.validate()
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
        val meterServiceAsync = client.meters()

        val pageFuture = meterServiceAsync.list()

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
        val meterServiceAsync = client.meters()

        val meterResponseFuture =
            meterServiceAsync.delete(MeterDeleteParams.builder().orgId("orgId").id("id").build())

        val meterResponse = meterResponseFuture.get()
        meterResponse.validate()
    }
}
