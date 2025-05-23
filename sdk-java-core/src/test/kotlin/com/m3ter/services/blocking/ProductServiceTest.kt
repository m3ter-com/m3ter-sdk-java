// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductServiceTest {

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
        val productService = client.products()

        val productResponse =
            productService.create(
                ProductCreateParams.builder()
                    .orgId("orgId")
                    .code("JS!?Q0]r] ]\$]")
                    .name("x")
                    .customFields(
                        ProductCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        productResponse.validate()
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
        val productService = client.products()

        val productResponse =
            productService.retrieve(ProductRetrieveParams.builder().orgId("orgId").id("id").build())

        productResponse.validate()
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
        val productService = client.products()

        val productResponse =
            productService.update(
                ProductUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .code("JS!?Q0]r] ]\$]")
                    .name("x")
                    .customFields(
                        ProductUpdateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        productResponse.validate()
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
        val productService = client.products()

        val page = productService.list()

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
        val productService = client.products()

        val productResponse =
            productService.delete(ProductDeleteParams.builder().orgId("orgId").id("id").build())

        productResponse.validate()
    }
}
