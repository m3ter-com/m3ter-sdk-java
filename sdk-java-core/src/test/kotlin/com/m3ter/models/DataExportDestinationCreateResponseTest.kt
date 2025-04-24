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

internal class DataExportDestinationCreateResponseTest {

    @Test
    fun ofExportDestinationS3() {
        val exportDestinationS3 =
            DataExportDestinationCreateResponse.ExportDestinationS3Response.builder()
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
                    DataExportDestinationCreateResponse.ExportDestinationS3Response.PartitionOrder
                        .TYPE_FIRST
                )
                .prefix("prefix")
                .build()

        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.ofExportDestinationS3(exportDestinationS3)

        assertThat(dataExportDestinationCreateResponse.exportDestinationS3())
            .contains(exportDestinationS3)
        assertThat(dataExportDestinationCreateResponse.exportDestinationGoogleCloudStorage())
            .isEmpty
    }

    @Test
    fun ofExportDestinationS3Roundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.ofExportDestinationS3(
                DataExportDestinationCreateResponse.ExportDestinationS3Response.builder()
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
                        DataExportDestinationCreateResponse.ExportDestinationS3Response
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .prefix("prefix")
                    .build()
            )

        val roundtrippedDataExportDestinationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationCreateResponse),
                jacksonTypeRef<DataExportDestinationCreateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationCreateResponse)
            .isEqualTo(dataExportDestinationCreateResponse)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorage() {
        val exportDestinationGoogleCloudStorage =
            DataExportDestinationCreateResponse.ExportDestinationGoogleCloudStorageResponse
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
                    DataExportDestinationCreateResponse.ExportDestinationGoogleCloudStorageResponse
                        .PartitionOrder
                        .TYPE_FIRST
                )
                .poolId("poolId")
                .prefix("prefix")
                .projectNumber("projectNumber")
                .providerId("providerId")
                .serviceAccountEmail("serviceAccountEmail")
                .build()

        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.ofExportDestinationGoogleCloudStorage(
                exportDestinationGoogleCloudStorage
            )

        assertThat(dataExportDestinationCreateResponse.exportDestinationS3()).isEmpty
        assertThat(dataExportDestinationCreateResponse.exportDestinationGoogleCloudStorage())
            .contains(exportDestinationGoogleCloudStorage)
    }

    @Test
    fun ofExportDestinationGoogleCloudStorageRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.ofExportDestinationGoogleCloudStorage(
                DataExportDestinationCreateResponse.ExportDestinationGoogleCloudStorageResponse
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
                        DataExportDestinationCreateResponse
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

        val roundtrippedDataExportDestinationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationCreateResponse),
                jacksonTypeRef<DataExportDestinationCreateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationCreateResponse)
            .isEqualTo(dataExportDestinationCreateResponse)
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
        val dataExportDestinationCreateResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportDestinationCreateResponse>())

        val e =
            assertThrows<M3terInvalidDataException> {
                dataExportDestinationCreateResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
