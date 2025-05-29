// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.statements

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementJobServiceAsyncTest {

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
        val statementJobServiceAsync = client.statements().statementJobs()

        val statementJobResponseFuture =
            statementJobServiceAsync.create(
                StatementStatementJobCreateParams.builder()
                    .orgId("orgId")
                    .billId("x")
                    .includeCsvFormat(true)
                    .version(0L)
                    .build()
            )

        val statementJobResponse = statementJobResponseFuture.get()
        statementJobResponse.validate()
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
        val statementJobServiceAsync = client.statements().statementJobs()

        val statementJobResponseFuture =
            statementJobServiceAsync.retrieve(
                StatementStatementJobRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val statementJobResponse = statementJobResponseFuture.get()
        statementJobResponse.validate()
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
        val statementJobServiceAsync = client.statements().statementJobs()

        val pageFuture = statementJobServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementJobServiceAsync = client.statements().statementJobs()

        val statementJobResponseFuture =
            statementJobServiceAsync.cancel(
                StatementStatementJobCancelParams.builder().orgId("orgId").id("id").build()
            )

        val statementJobResponse = statementJobResponseFuture.get()
        statementJobResponse.validate()
    }

    @Test
    fun createBatch() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementJobServiceAsync = client.statements().statementJobs()

        val statementJobResponsesFuture =
            statementJobServiceAsync.createBatch(
                StatementStatementJobCreateBatchParams.builder()
                    .orgId("orgId")
                    .addBillId("string")
                    .includeCsvFormat(true)
                    .version(0L)
                    .build()
            )

        val statementJobResponses = statementJobResponsesFuture.get()
        statementJobResponses.forEach { it.validate() }
    }
}
