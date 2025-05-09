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

internal class DataExportDestinationDeleteResponseTest {

    @Test
    fun ofExportDestinationS3() {
        val exportDestinationS3 =
            DataExportDestinationDeleteResponse.ExportDestinationS3Response.builder()
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
                    DataExportDestinationDeleteResponse.ExportDestinationS3Response.PartitionOrder
                        .TYPE_FIRST
                )
                .prefix("prefix")
                .build()

        val dataExportDestinationDeleteResponse =
            DataExportDestinationDeleteResponse.ofExportDestinationS3(exportDestinationS3)

        assertThat(dataExportDestinationDeleteResponse.exportDestinationS3())
            .contains(exportDestinationS3)
        assertThat(dataExportDestinationDeleteResponse.exportDestinationGoogleCloudStorage())
            .isEmpty
    }

    @Test
    fun ofExportDestinationS3Roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationDeleteResponse =
            DataExportDestinationDeleteResponse.ofExportDestinationS3(
                DataExportDestinationDeleteResponse.ExportDestinationS3Response.builder()
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
                        DataExportDestinationDeleteResponse.ExportDestinationS3Response
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .prefix("prefix")
                    .build()
            )

        val roundtrippedDataExportDestinationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationDeleteResponse),
                jacksonTypeRef<DataExportDestinationDeleteResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationDeleteResponse)
            .isEqualTo(dataExportDestinationDeleteResponse)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorage() {
        val exportDestinationGoogleCloudStorage =
            DataExportDestinationDeleteResponse.ExportDestinationGoogleCloudStorageResponse
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
                    DataExportDestinationDeleteResponse.ExportDestinationGoogleCloudStorageResponse
                        .PartitionOrder
                        .TYPE_FIRST
                )
                .poolId("poolId")
                .prefix("prefix")
                .projectNumber("projectNumber")
                .providerId("providerId")
                .serviceAccountEmail("serviceAccountEmail")
                .build()

        val dataExportDestinationDeleteResponse =
            DataExportDestinationDeleteResponse.ofExportDestinationGoogleCloudStorage(
                exportDestinationGoogleCloudStorage
            )

        assertThat(dataExportDestinationDeleteResponse.exportDestinationS3()).isEmpty
        assertThat(dataExportDestinationDeleteResponse.exportDestinationGoogleCloudStorage())
            .contains(exportDestinationGoogleCloudStorage)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorageRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationDeleteResponse =
            DataExportDestinationDeleteResponse.ofExportDestinationGoogleCloudStorage(
                DataExportDestinationDeleteResponse.ExportDestinationGoogleCloudStorageResponse
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
                        DataExportDestinationDeleteResponse
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

        val roundtrippedDataExportDestinationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationDeleteResponse),
                jacksonTypeRef<DataExportDestinationDeleteResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationDeleteResponse)
            .isEqualTo(dataExportDestinationDeleteResponse)
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
        val dataExportDestinationDeleteResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportDestinationDeleteResponse>())

        val e =
            assertThrows<M3terInvalidDataException> {
                dataExportDestinationDeleteResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
