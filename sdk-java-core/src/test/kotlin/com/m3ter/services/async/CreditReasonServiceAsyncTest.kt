// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.CreditReasonCreateParams
import com.m3ter.models.CreditReasonDeleteParams
import com.m3ter.models.CreditReasonRetrieveParams
import com.m3ter.models.CreditReasonUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CreditReasonServiceAsyncTest {

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
        val creditReasonServiceAsync = client.creditReasons()

        val creditReasonResponseFuture =
            creditReasonServiceAsync.create(
                CreditReasonCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val creditReasonResponse = creditReasonResponseFuture.get()
        creditReasonResponse.validate()
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
        val creditReasonServiceAsync = client.creditReasons()

        val creditReasonResponseFuture =
            creditReasonServiceAsync.retrieve(
                CreditReasonRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val creditReasonResponse = creditReasonResponseFuture.get()
        creditReasonResponse.validate()
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
        val creditReasonServiceAsync = client.creditReasons()

        val creditReasonResponseFuture =
            creditReasonServiceAsync.update(
                CreditReasonUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val creditReasonResponse = creditReasonResponseFuture.get()
        creditReasonResponse.validate()
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
        val creditReasonServiceAsync = client.creditReasons()

        val pageFuture = creditReasonServiceAsync.list()

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
        val creditReasonServiceAsync = client.creditReasons()

        val creditReasonResponseFuture =
            creditReasonServiceAsync.delete(
                CreditReasonDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val creditReasonResponse = creditReasonResponseFuture.get()
        creditReasonResponse.validate()
    }
}
