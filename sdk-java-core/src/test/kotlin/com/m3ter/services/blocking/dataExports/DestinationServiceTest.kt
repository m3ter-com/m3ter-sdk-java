// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.DataExportDestinationCreateParams
import com.m3ter.models.DataExportDestinationDeleteParams
import com.m3ter.models.DataExportDestinationRetrieveParams
import com.m3ter.models.DataExportDestinationS3Request
import com.m3ter.models.DataExportDestinationUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DestinationServiceTest {

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
        val destinationService = client.dataExports().destinations()

        val destination =
            destinationService.create(
                DataExportDestinationCreateParams.builder()
                    .orgId("orgId")
                    .body(
                        DataExportDestinationS3Request.builder()
                            .bucketName("xxx")
                            .iamRoleArn("arn:aws:iam::321669910225:role/z")
                            .partitionOrder(
                                DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST
                            )
                            .prefix("prefix")
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        destination.validate()
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
        val destinationService = client.dataExports().destinations()

        val destination =
            destinationService.retrieve(
                DataExportDestinationRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        destination.validate()
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
        val destinationService = client.dataExports().destinations()

        val destination =
            destinationService.update(
                DataExportDestinationUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .body(
                        DataExportDestinationS3Request.builder()
                            .bucketName("xxx")
                            .iamRoleArn("arn:aws:iam::321669910225:role/z")
                            .partitionOrder(
                                DataExportDestinationS3Request.PartitionOrder.TYPE_FIRST
                            )
                            .prefix("prefix")
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        destination.validate()
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
        val destinationService = client.dataExports().destinations()

        val page = destinationService.list()

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
        val destinationService = client.dataExports().destinations()

        val destination =
            destinationService.delete(
                DataExportDestinationDeleteParams.builder().orgId("orgId").id("id").build()
            )

        destination.validate()
    }
}
