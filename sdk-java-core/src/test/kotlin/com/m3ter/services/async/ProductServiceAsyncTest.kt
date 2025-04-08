// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.core.JsonValue
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProductServiceAsyncTest {

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
        val productServiceAsync = client.products()

        val productResponseFuture =
            productServiceAsync.create(
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

        val productResponse = productResponseFuture.get()
        productResponse.validate()
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
        val productServiceAsync = client.products()

        val productResponseFuture =
            productServiceAsync.retrieve(
                ProductRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val productResponse = productResponseFuture.get()
        productResponse.validate()
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
        val productServiceAsync = client.products()

        val productResponseFuture =
            productServiceAsync.update(
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

        val productResponse = productResponseFuture.get()
        productResponse.validate()
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
        val productServiceAsync = client.products()

        val pageFuture = productServiceAsync.list()

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
        val productServiceAsync = client.products()

        val productResponseFuture =
            productServiceAsync.delete(
                ProductDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val productResponse = productResponseFuture.get()
        productResponse.validate()
    }
}
