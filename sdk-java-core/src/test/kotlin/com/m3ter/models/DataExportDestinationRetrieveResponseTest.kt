// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DataExportDestinationRetrieveResponseTest {

    @Test
    fun ofExportDestinationS3() {
        val exportDestinationS3 =
            DataExportDestinationRetrieveResponse.ExportDestinationS3Response.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .destinationType(DataExportDestinationResponse.DestinationType.S3)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .bucketName("bucketName")
                .iamRoleArn("iamRoleArn")
                .partitionOrder(
                    DataExportDestinationRetrieveResponse.ExportDestinationS3Response.PartitionOrder
                        .TYPE_FIRST
                )
                .prefix("prefix")
                .build()

        val dataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse.ofExportDestinationS3(exportDestinationS3)

        assertThat(dataExportDestinationRetrieveResponse.exportDestinationS3())
            .contains(exportDestinationS3)
        assertThat(dataExportDestinationRetrieveResponse.exportDestinationGoogleCloudStorage())
            .isEmpty
    }

    @Test
    fun ofExportDestinationS3Roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse.ofExportDestinationS3(
                DataExportDestinationRetrieveResponse.ExportDestinationS3Response.builder()
                    .id("id")
                    .version(0L)
                    .code("code")
                    .createdBy("createdBy")
                    .destinationType(DataExportDestinationResponse.DestinationType.S3)
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .bucketName("bucketName")
                    .iamRoleArn("iamRoleArn")
                    .partitionOrder(
                        DataExportDestinationRetrieveResponse.ExportDestinationS3Response
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .prefix("prefix")
                    .build()
            )

        val roundtrippedDataExportDestinationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationRetrieveResponse),
                jacksonTypeRef<DataExportDestinationRetrieveResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationRetrieveResponse)
            .isEqualTo(dataExportDestinationRetrieveResponse)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorage() {
        val exportDestinationGoogleCloudStorage =
            DataExportDestinationRetrieveResponse.ExportDestinationGoogleCloudStorageResponse
                .builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .destinationType(DataExportDestinationResponse.DestinationType.S3)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .bucketName("bucketName")
                .partitionOrder(
                    DataExportDestinationRetrieveResponse
                        .ExportDestinationGoogleCloudStorageResponse
                        .PartitionOrder
                        .TYPE_FIRST
                )
                .poolId("poolId")
                .prefix("prefix")
                .projectNumber("projectNumber")
                .providerId("providerId")
                .serviceAccountEmail("serviceAccountEmail")
                .build()

        val dataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse.ofExportDestinationGoogleCloudStorage(
                exportDestinationGoogleCloudStorage
            )

        assertThat(dataExportDestinationRetrieveResponse.exportDestinationS3()).isEmpty
        assertThat(dataExportDestinationRetrieveResponse.exportDestinationGoogleCloudStorage())
            .contains(exportDestinationGoogleCloudStorage)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorageRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse.ofExportDestinationGoogleCloudStorage(
                DataExportDestinationRetrieveResponse.ExportDestinationGoogleCloudStorageResponse
                    .builder()
                    .id("id")
                    .version(0L)
                    .code("code")
                    .createdBy("createdBy")
                    .destinationType(DataExportDestinationResponse.DestinationType.S3)
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .bucketName("bucketName")
                    .partitionOrder(
                        DataExportDestinationRetrieveResponse
                            .ExportDestinationGoogleCloudStorageResponse
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .poolId("poolId")
                    .prefix("prefix")
                    .projectNumber("projectNumber")
                    .providerId("providerId")
                    .serviceAccountEmail("serviceAccountEmail")
                    .build()
            )

        val roundtrippedDataExportDestinationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationRetrieveResponse),
                jacksonTypeRef<DataExportDestinationRetrieveResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationRetrieveResponse)
            .isEqualTo(dataExportDestinationRetrieveResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val dataExportDestinationRetrieveResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<DataExportDestinationRetrieveResponse>(),
                )

        val e =
            assertThrows<M3terInvalidDataException> {
                dataExportDestinationRetrieveResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
