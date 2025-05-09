// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.DebitReasonCreateParams
import com.m3ter.models.DebitReasonDeleteParams
import com.m3ter.models.DebitReasonRetrieveParams
import com.m3ter.models.DebitReasonUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DebitReasonServiceAsyncTest {

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
        val debitReasonServiceAsync = client.debitReasons()

        val debitReasonResponseFuture =
            debitReasonServiceAsync.create(
                DebitReasonCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val debitReasonResponse = debitReasonResponseFuture.get()
        debitReasonResponse.validate()
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
        val debitReasonServiceAsync = client.debitReasons()

        val debitReasonResponseFuture =
            debitReasonServiceAsync.retrieve(
                DebitReasonRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val debitReasonResponse = debitReasonResponseFuture.get()
        debitReasonResponse.validate()
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
        val debitReasonServiceAsync = client.debitReasons()

        val debitReasonResponseFuture =
            debitReasonServiceAsync.update(
                DebitReasonUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val debitReasonResponse = debitReasonResponseFuture.get()
        debitReasonResponse.validate()
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
        val debitReasonServiceAsync = client.debitReasons()

        val pageFuture = debitReasonServiceAsync.list()

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
        val debitReasonServiceAsync = client.debitReasons()

        val debitReasonResponseFuture =
            debitReasonServiceAsync.delete(
                DebitReasonDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val debitReasonResponse = debitReasonResponseFuture.get()
        debitReasonResponse.validate()
    }
}
