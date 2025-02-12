// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionTypeServiceTest {

    @Test
    fun callCreate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val transactionTypeService = client.transactionTypes()
        val transactionType =
            transactionTypeService.create(
                TransactionTypeCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(transactionType)
        transactionType.validate()
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
        val transactionTypeService = client.transactionTypes()
        val transactionType =
            transactionTypeService.retrieve(
                TransactionTypeRetrieveParams.builder().orgId("orgId").id("id").build()
            )
        println(transactionType)
        transactionType.validate()
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
        val transactionTypeService = client.transactionTypes()
        val transactionType =
            transactionTypeService.update(
                TransactionTypeUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("{1{}}_")
                    .version(0L)
                    .build()
            )
        println(transactionType)
        transactionType.validate()
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
        val transactionTypeService = client.transactionTypes()
        val paginatedDataTransactionTypeResponse =
            transactionTypeService.list(TransactionTypeListParams.builder().orgId("orgId").build())
        println(paginatedDataTransactionTypeResponse)
        paginatedDataTransactionTypeResponse.data().forEach { it.validate() }
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
        val transactionTypeService = client.transactionTypes()
        val transactionType =
            transactionTypeService.delete(
                TransactionTypeDeleteParams.builder().orgId("orgId").id("id").build()
            )
        println(transactionType)
        transactionType.validate()
    }
}
