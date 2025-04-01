// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DestinationServiceAsyncTest {

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
        val destinationServiceAsync = client.dataExports().destinations()

        val destinationFuture =
            destinationServiceAsync.create(
                DataExportDestinationCreateParams.builder()
                    .orgId("orgId")
                    .bucketName("xxx")
                    .code("JS!?Q0]r] ]\$]")
                    .iamRoleArn("arn:aws:iam::321669910225:role/z")
                    .name("x")
                    .partitionOrder(DataExportDestinationCreateParams.PartitionOrder.TYPE_FIRST)
                    .prefix("prefix")
                    .version(0L)
                    .build()
            )

        val destination = destinationFuture.get()
        destination.validate()
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
        val destinationServiceAsync = client.dataExports().destinations()

        val destinationFuture =
            destinationServiceAsync.retrieve(
                DataExportDestinationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val destination = destinationFuture.get()
        destination.validate()
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
        val destinationServiceAsync = client.dataExports().destinations()

        val destinationFuture =
            destinationServiceAsync.update(
                DataExportDestinationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .bucketName("xxx")
                    .code("JS!?Q0]r] ]\$]")
                    .iamRoleArn("arn:aws:iam::321669910225:role/z")
                    .name("x")
                    .partitionOrder(DataExportDestinationUpdateParams.PartitionOrder.TYPE_FIRST)
                    .prefix("prefix")
                    .version(0L)
                    .build()
            )

        val destination = destinationFuture.get()
        destination.validate()
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
        val destinationServiceAsync = client.dataExports().destinations()

        val pageFuture =
            destinationServiceAsync.list(
                DataExportDestinationListParams.builder().orgId("orgId").build()
            )

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
        val destinationServiceAsync = client.dataExports().destinations()

        val destinationFuture =
            destinationServiceAsync.delete(
                DataExportDestinationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val destination = destinationFuture.get()
        destination.validate()
    }
}
