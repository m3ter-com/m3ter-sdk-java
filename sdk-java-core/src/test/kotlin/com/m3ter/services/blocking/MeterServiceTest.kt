// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
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
internal class MeterServiceTest {

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

        val meterResponse =
            meterService.create(
                MeterCreateParams.builder()
                    .orgId("orgId")
                    .code("S?oC\"\$]C] ]]]]]5]")
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

        meterResponse.validate()
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

        val meterResponse =
            meterService.retrieve(MeterRetrieveParams.builder().orgId("orgId").id("id").build())

        meterResponse.validate()
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

        val meterResponse =
            meterService.update(
                MeterUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("S?oC\"\$]C] ]]]]]5]")
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

        meterResponse.validate()
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

        val page = meterService.list()

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

        val meterResponse =
            meterService.delete(MeterDeleteParams.builder().orgId("orgId").id("id").build())

        meterResponse.validate()
    }
}
