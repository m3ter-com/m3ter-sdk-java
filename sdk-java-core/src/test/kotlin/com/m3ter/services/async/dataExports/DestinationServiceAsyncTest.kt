// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.DataExportDestinationCreateParams
import com.m3ter.models.DataExportDestinationDeleteParams
import com.m3ter.models.DataExportDestinationRetrieveParams
import com.m3ter.models.DataExportDestinationS3Request
import com.m3ter.models.DataExportDestinationUpdateParams
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
                    .body(
                        DataExportDestinationS3Request.builder()
                            .bucketName("xxx")
                            .iamRoleArn("arn:aws:iam::321669910225:role/z")
                            .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                            .partitionOrder(
                                DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST
                            )
                            .prefix("prefix")
                            .version(0L)
                            .build()
                    )
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
                    .body(
                        DataExportDestinationS3Request.builder()
                            .bucketName("xxx")
                            .iamRoleArn("arn:aws:iam::321669910225:role/z")
                            .destinationType(DataExportDestinationS3Request.DestinationType.S3)
                            .partitionOrder(
                                DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST
                            )
                            .prefix("prefix")
                            .version(0L)
                            .build()
                    )
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

        val pageFuture = destinationServiceAsync.list()

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
