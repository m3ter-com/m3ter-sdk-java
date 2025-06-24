// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import com.m3ter.errors.M3terInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DataExportScheduleRetrieveResponseTest {

    @Test
    fun ofOperationalDataExportSchedule() {
        val operationalDataExportSchedule =
            OperationalDataExportScheduleResponse.builder()
                .id("id")
                .addOperationalDataType(
                    OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                )
                .version(0L)
                .build()

        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleRetrieveResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleRetrieveResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofOperationalDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofOperationalDataExportSchedule(
                OperationalDataExportScheduleResponse.builder()
                    .id("id")
                    .addOperationalDataType(
                        OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                    )
                    .version(0L)
                    .build()
            )

        val roundtrippedDataExportScheduleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleRetrieveResponse),
                jacksonTypeRef<DataExportScheduleRetrieveResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleRetrieveResponse)
            .isEqualTo(dataExportScheduleRetrieveResponse)
    }

    @Test
    fun ofUsageDataExportSchedule() {
        val usageDataExportSchedule =
            UsageDataExportScheduleResponse.builder()
                .id("id")
                .addAccountId("string")
                .addAggregation(
                    UsageDataExportScheduleResponse.Aggregation.builder()
                        .fieldCode("x")
                        .fieldType(UsageDataExportScheduleResponse.Aggregation.FieldType.DIMENSION)
                        .function(UsageDataExportScheduleResponse.Aggregation.Function.SUM)
                        .meterId("x")
                        .build()
                )
                .addDimensionFilter(
                    UsageDataExportScheduleResponse.DimensionFilter.builder()
                        .fieldCode("x")
                        .meterId("x")
                        .addValue("string")
                        .build()
                )
                .addGroup(
                    DataExplorerGroup.builder()
                        .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                        .build()
                )
                .addMeterId("string")
                .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
                .version(0L)
                .build()

        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleRetrieveResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleRetrieveResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }

    @Test
    fun ofUsageDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleRetrieveResponse =
            DataExportScheduleRetrieveResponse.ofUsageDataExportSchedule(
                UsageDataExportScheduleResponse.builder()
                    .id("id")
                    .addAccountId("string")
                    .addAggregation(
                        UsageDataExportScheduleResponse.Aggregation.builder()
                            .fieldCode("x")
                            .fieldType(
                                UsageDataExportScheduleResponse.Aggregation.FieldType.DIMENSION
                            )
                            .function(UsageDataExportScheduleResponse.Aggregation.Function.SUM)
                            .meterId("x")
                            .build()
                    )
                    .addDimensionFilter(
                        UsageDataExportScheduleResponse.DimensionFilter.builder()
                            .fieldCode("x")
                            .meterId("x")
                            .addValue("string")
                            .build()
                    )
                    .addGroup(
                        DataExplorerGroup.builder()
                            .groupType(DataExplorerGroup.GroupType.ACCOUNT)
                            .build()
                    )
                    .addMeterId("string")
                    .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
                    .version(0L)
                    .build()
            )

        val roundtrippedDataExportScheduleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleRetrieveResponse),
                jacksonTypeRef<DataExportScheduleRetrieveResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleRetrieveResponse)
            .isEqualTo(dataExportScheduleRetrieveResponse)
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
        val dataExportScheduleRetrieveResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportScheduleRetrieveResponse>())

        val e =
            assertThrows<M3terInvalidDataException> {
                dataExportScheduleRetrieveResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
