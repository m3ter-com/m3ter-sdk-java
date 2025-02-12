// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.DebitReasonCreateParams
import com.m3ter.sdk.models.DebitReasonDeleteParams
import com.m3ter.sdk.models.DebitReasonListParams
import com.m3ter.sdk.models.DebitReasonRetrieveParams
import com.m3ter.sdk.models.DebitReasonUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DebitReasonServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val debitReasonService = client.debitReasons()
        val debitReason =
            debitReasonService.create(
                DebitReasonCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(debitReason)
        debitReason.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val debitReasonService = client.debitReasons()
        val debitReason =
            debitReasonService.retrieve(
                DebitReasonRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(debitReason)
        debitReason.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val debitReasonService = client.debitReasons()
        val debitReason =
            debitReasonService.update(
                DebitReasonUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(debitReason)
        debitReason.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val debitReasonService = client.debitReasons()
        val paginatedDataDebitReasonResponse =
            debitReasonService.list(DebitReasonListParams.builder().orgId("orgId").build())
        println(paginatedDataDebitReasonResponse)
        paginatedDataDebitReasonResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val debitReasonService = client.debitReasons()
        val debitReason =
            debitReasonService.delete(
                DebitReasonDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(debitReason)
        debitReason.validate()
    }
}
