// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataExportDestinationGoogleCloudStorageRequestTest {

    @Test
    fun create() {
        val dataExportDestinationGoogleCloudStorageRequest =
            DataExportDestinationGoogleCloudStorageRequest.builder()
                .bucketName("xxx")
                .poolId("x")
                .projectNumber("x")
                .providerId("x")
                .partitionOrder(
                    DataExportDestinationGoogleCloudStorageRequest.PartitionOrder.TYPE_FIRST
                )
                .prefix("prefix")
                .serviceAccountEmail("serviceAccountEmail")
                .version(0L)
                .build()

        assertThat(dataExportDestinationGoogleCloudStorageRequest.bucketName()).isEqualTo("xxx")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.poolId()).isEqualTo("x")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.projectNumber()).isEqualTo("x")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.providerId()).isEqualTo("x")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.partitionOrder())
            .contains(DataExportDestinationGoogleCloudStorageRequest.PartitionOrder.TYPE_FIRST)
        assertThat(dataExportDestinationGoogleCloudStorageRequest.prefix()).contains("prefix")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.serviceAccountEmail())
            .contains("serviceAccountEmail")
        assertThat(dataExportDestinationGoogleCloudStorageRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationGoogleCloudStorageRequest =
            DataExportDestinationGoogleCloudStorageRequest.builder()
                .bucketName("xxx")
                .poolId("x")
                .projectNumber("x")
                .providerId("x")
                .partitionOrder(
                    DataExportDestinationGoogleCloudStorageRequest.PartitionOrder.TYPE_FIRST
                )
                .prefix("prefix")
                .serviceAccountEmail("serviceAccountEmail")
                .version(0L)
                .build()

        val roundtrippedDataExportDestinationGoogleCloudStorageRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationGoogleCloudStorageRequest),
                jacksonTypeRef<DataExportDestinationGoogleCloudStorageRequest>(),
            )

        assertThat(roundtrippedDataExportDestinationGoogleCloudStorageRequest)
            .isEqualTo(dataExportDestinationGoogleCloudStorageRequest)
    }
}
