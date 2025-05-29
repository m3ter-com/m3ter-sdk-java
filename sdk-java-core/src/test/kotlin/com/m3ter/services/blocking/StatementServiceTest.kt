// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.StatementCreateCsvParams
import com.m3ter.models.StatementGetCsvParams
import com.m3ter.models.StatementGetJsonParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementServiceTest {

    @Test
    fun createCsv() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementService = client.statements()

        val objectUrlResponse =
            statementService.createCsv(
                StatementCreateCsvParams.builder().orgId("orgId").id("id").build()
            )

        objectUrlResponse.validate()
    }

    @Test
    fun getCsv() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementService = client.statements()

        val objectUrlResponse =
            statementService.getCsv(StatementGetCsvParams.builder().orgId("orgId").id("id").build())

        objectUrlResponse.validate()
    }

    @Test
    fun getJson() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementService = client.statements()

        val objectUrlResponse =
            statementService.getJson(
                StatementGetJsonParams.builder().orgId("orgId").id("id").build()
            )

        objectUrlResponse.validate()
    }
}
