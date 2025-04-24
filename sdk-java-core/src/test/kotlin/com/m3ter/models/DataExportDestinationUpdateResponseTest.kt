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

internal class DataExportDestinationUpdateResponseTest {

    @Test
    fun ofExportDestinationS3() {
        val exportDestinationS3 =
            DataExportDestinationUpdateResponse.ExportDestinationS3Response.builder()
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
                    DataExportDestinationUpdateResponse.ExportDestinationS3Response.PartitionOrder
                        .TYPE_FIRST
                )
                .prefix("prefix")
                .build()

        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.ofExportDestinationS3(exportDestinationS3)

        assertThat(dataExportDestinationUpdateResponse.exportDestinationS3())
            .contains(exportDestinationS3)
        assertThat(dataExportDestinationUpdateResponse.exportDestinationGoogleCloudStorage())
            .isEmpty
    }

    @Test
    fun ofExportDestinationS3Roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.ofExportDestinationS3(
                DataExportDestinationUpdateResponse.ExportDestinationS3Response.builder()
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
                        DataExportDestinationUpdateResponse.ExportDestinationS3Response
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .prefix("prefix")
                    .build()
            )

        val roundtrippedDataExportDestinationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationUpdateResponse),
                jacksonTypeRef<DataExportDestinationUpdateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationUpdateResponse)
            .isEqualTo(dataExportDestinationUpdateResponse)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorage() {
        val exportDestinationGoogleCloudStorage =
            DataExportDestinationUpdateResponse.ExportDestinationGoogleCloudStorageResponse
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
                    DataExportDestinationUpdateResponse.ExportDestinationGoogleCloudStorageResponse
                        .PartitionOrder
                        .TYPE_FIRST
                )
                .poolId("poolId")
                .prefix("prefix")
                .projectNumber("projectNumber")
                .providerId("providerId")
                .serviceAccountEmail("serviceAccountEmail")
                .build()

        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.ofExportDestinationGoogleCloudStorage(
                exportDestinationGoogleCloudStorage
            )

        assertThat(dataExportDestinationUpdateResponse.exportDestinationS3()).isEmpty
        assertThat(dataExportDestinationUpdateResponse.exportDestinationGoogleCloudStorage())
            .contains(exportDestinationGoogleCloudStorage)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorageRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationUpdateResponse =
            DataExportDestinationUpdateResponse.ofExportDestinationGoogleCloudStorage(
                DataExportDestinationUpdateResponse.ExportDestinationGoogleCloudStorageResponse
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
                        DataExportDestinationUpdateResponse
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

        val roundtrippedDataExportDestinationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationUpdateResponse),
                jacksonTypeRef<DataExportDestinationUpdateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationUpdateResponse)
            .isEqualTo(dataExportDestinationUpdateResponse)
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
        val dataExportDestinationUpdateResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportDestinationUpdateResponse>())

        val e =
            assertThrows<M3terInvalidDataException> {
                dataExportDestinationUpdateResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
