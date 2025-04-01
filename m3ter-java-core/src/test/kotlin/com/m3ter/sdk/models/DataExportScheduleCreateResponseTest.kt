// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.jsonMapper
import com.m3ter.sdk.errors.M3terInvalidDataException
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
                .version(0L)
                .addOperationalDataType(
                    OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                )
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
                    .version(0L)
                    .addOperationalDataType(
                        OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                    )
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
                .version(0L)
                .addAccountId("string")
                .aggregation(UsageDataExportScheduleResponse.Aggregation.SUM)
                .aggregationFrequency(UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL)
                .addMeterId("string")
                .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
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
                    .version(0L)
                    .addAccountId("string")
                    .aggregation(UsageDataExportScheduleResponse.Aggregation.SUM)
                    .aggregationFrequency(
                        UsageDataExportScheduleResponse.AggregationFrequency.ORIGINAL
                    )
                    .addMeterId("string")
                    .timePeriod(UsageDataExportScheduleResponse.TimePeriod.TODAY)
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
