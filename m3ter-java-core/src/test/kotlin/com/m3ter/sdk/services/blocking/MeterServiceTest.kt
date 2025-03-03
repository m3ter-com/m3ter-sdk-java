// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.models.MeterCreateParams
import com.m3ter.sdk.models.MeterDeleteParams
import com.m3ter.sdk.models.MeterListParams
import com.m3ter.sdk.models.MeterRetrieveParams
import com.m3ter.sdk.models.MeterUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MeterServiceTest {

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
        val meterService = client.meters()

        val meter =
            meterService.create(
                MeterCreateParams.builder()
                    .orgId("orgId")
                    .code("JS!?Q0]r] ]\$]")
                    .addDataField(
                        MeterCreateParams.DataField.builder()
                            .category(MeterCreateParams.DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .build()
                    )
                    .addDerivedField(
                        MeterCreateParams.DerivedField.builder()
                            .calculation("x")
                            .category(MeterCreateParams.DerivedField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
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

        meter.validate()
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
        val meterService = client.meters()

        val meter =
            meterService.retrieve(MeterRetrieveParams.builder().orgId("orgId").id("id").build())

        meter.validate()
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
        val meterService = client.meters()

        val meter =
            meterService.update(
                MeterUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("JS!?Q0]r] ]\$]")
                    .addDataField(
                        MeterUpdateParams.DataField.builder()
                            .category(MeterUpdateParams.DataField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
                            .build()
                    )
                    .addDerivedField(
                        MeterUpdateParams.DerivedField.builder()
                            .calculation("x")
                            .category(MeterUpdateParams.DerivedField.Category.WHO)
                            .code("{1{}}_")
                            .name("x")
                            .unit("x")
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

        meter.validate()
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
        val meterService = client.meters()

        val page = meterService.list(MeterListParams.builder().orgId("orgId").build())

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
        val meterService = client.meters()

        val meter = meterService.delete(MeterDeleteParams.builder().orgId("orgId").id("id").build())

        meter.validate()
    }
}
