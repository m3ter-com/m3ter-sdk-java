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

internal class DataExportScheduleCreateResponseTest {

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

        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleCreateResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleCreateResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofOperationalDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofOperationalDataExportSchedule(
                OperationalDataExportScheduleResponse.builder()
                    .id("id")
                    .addOperationalDataType(
                        OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                    )
                    .version(0L)
                    .build()
            )

        val roundtrippedDataExportScheduleCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleCreateResponse),
                jacksonTypeRef<DataExportScheduleCreateResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleCreateResponse)
            .isEqualTo(dataExportScheduleCreateResponse)
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

        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleCreateResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleCreateResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }

    @Test
    fun ofUsageDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleCreateResponse =
            DataExportScheduleCreateResponse.ofUsageDataExportSchedule(
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

        val roundtrippedDataExportScheduleCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleCreateResponse),
                jacksonTypeRef<DataExportScheduleCreateResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleCreateResponse)
            .isEqualTo(dataExportScheduleCreateResponse)
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
        val dataExportScheduleCreateResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportScheduleCreateResponse>())

        val e =
            assertThrows<M3terInvalidDataException> { dataExportScheduleCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
