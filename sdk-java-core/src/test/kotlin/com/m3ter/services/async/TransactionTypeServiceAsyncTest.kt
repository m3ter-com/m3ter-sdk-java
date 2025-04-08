// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.TransactionTypeCreateParams
import com.m3ter.models.TransactionTypeDeleteParams
import com.m3ter.models.TransactionTypeRetrieveParams
import com.m3ter.models.TransactionTypeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionTypeServiceAsyncTest {

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
        val transactionTypeServiceAsync = client.transactionTypes()

        val transactionTypeResponseFuture =
            transactionTypeServiceAsync.create(
                TransactionTypeCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val transactionTypeResponse = transactionTypeResponseFuture.get()
        transactionTypeResponse.validate()
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
        val transactionTypeServiceAsync = client.transactionTypes()

        val transactionTypeResponseFuture =
            transactionTypeServiceAsync.retrieve(
                TransactionTypeRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val transactionTypeResponse = transactionTypeResponseFuture.get()
        transactionTypeResponse.validate()
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
        val transactionTypeServiceAsync = client.transactionTypes()

        val transactionTypeResponseFuture =
            transactionTypeServiceAsync.update(
                TransactionTypeUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val transactionTypeResponse = transactionTypeResponseFuture.get()
        transactionTypeResponse.validate()
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
        val transactionTypeServiceAsync = client.transactionTypes()

        val pageFuture = transactionTypeServiceAsync.list()

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
        val transactionTypeServiceAsync = client.transactionTypes()

        val transactionTypeResponseFuture =
            transactionTypeServiceAsync.delete(
                TransactionTypeDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val transactionTypeResponse = transactionTypeResponseFuture.get()
        transactionTypeResponse.validate()
    }
}
