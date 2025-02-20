// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CreditReasonServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val creditReasonService = client.creditReasons()
        val creditReason =
            creditReasonService.create(
                CreditReasonCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(creditReason)
        creditReason.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val creditReasonService = client.creditReasons()
        val creditReason =
            creditReasonService.retrieve(
                CreditReasonRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(creditReason)
        creditReason.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val creditReasonService = client.creditReasons()
        val creditReason =
            creditReasonService.update(
                CreditReasonUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(creditReason)
        creditReason.validate()
    }

    @Test
    fun callList() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val creditReasonService = client.creditReasons()
        val paginatedDataCreditReasonResponse =
            creditReasonService.list(CreditReasonListParams.builder().orgId("orgId").build())
        println(paginatedDataCreditReasonResponse)
        paginatedDataCreditReasonResponse.data().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val creditReasonService = client.creditReasons()
        val creditReason =
            creditReasonService.delete(
                CreditReasonDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(creditReason)
        creditReason.validate()
    }
}
