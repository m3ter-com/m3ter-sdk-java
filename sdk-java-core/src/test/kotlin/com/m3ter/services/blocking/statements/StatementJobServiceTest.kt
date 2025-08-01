// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.statements

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementJobServiceTest {

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
        val statementJobService = client.statements().statementJobs()

        val statementJobResponse =
            statementJobService.create(
                StatementStatementJobCreateParams.builder()
                    .orgId("orgId")
                    .billId("x")
                    .includeCsvFormat(true)
                    .version(0L)
                    .build()
            )

        statementJobResponse.validate()
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
        val statementJobService = client.statements().statementJobs()

        val statementJobResponse =
            statementJobService.retrieve(
                StatementStatementJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        statementJobResponse.validate()
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
        val statementJobService = client.statements().statementJobs()

        val page = statementJobService.list()

        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementJobService = client.statements().statementJobs()

        val statementJobResponse =
            statementJobService.cancel(
                StatementStatementJobCancelParams.builder().orgId("orgId").id("id").build()
            )

        statementJobResponse.validate()
    }

    @Test
    fun createBatch() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementJobService = client.statements().statementJobs()

        val statementJobResponses =
            statementJobService.createBatch(
                StatementStatementJobCreateBatchParams.builder()
                    .orgId("orgId")
                    .addBillId("string")
                    .includeCsvFormat(true)
                    .version(0L)
                    .build()
            )

        statementJobResponses.forEach { it.validate() }
    }
}
