// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.TransactionTypeCreateParams
import com.m3ter.models.TransactionTypeDeleteParams
import com.m3ter.models.TransactionTypeRetrieveParams
import com.m3ter.models.TransactionTypeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransactionTypeServiceTest {

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
        val transactionTypeService = client.transactionTypes()

        val transactionTypeResponse =
            transactionTypeService.create(
                TransactionTypeCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        transactionTypeResponse.validate()
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
        val transactionTypeService = client.transactionTypes()

        val transactionTypeResponse =
            transactionTypeService.retrieve(
                TransactionTypeRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        transactionTypeResponse.validate()
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
        val transactionTypeService = client.transactionTypes()

        val transactionTypeResponse =
            transactionTypeService.update(
                TransactionTypeUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .archived(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        transactionTypeResponse.validate()
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
        val transactionTypeService = client.transactionTypes()

        val page = transactionTypeService.list()

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
        val transactionTypeService = client.transactionTypes()

        val transactionTypeResponse =
            transactionTypeService.delete(
                TransactionTypeDeleteParams.builder().orgId("orgId").id("id").build()
            )

        transactionTypeResponse.validate()
    }
}
