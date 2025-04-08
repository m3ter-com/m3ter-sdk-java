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

internal class DataExportScheduleDeleteResponseTest {

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

        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofOperationalDataExportSchedule(
                operationalDataExportSchedule
            )

        assertThat(dataExportScheduleDeleteResponse.operationalDataExportSchedule())
            .contains(operationalDataExportSchedule)
        assertThat(dataExportScheduleDeleteResponse.usageDataExportSchedule()).isEmpty
    }

    @Test
    fun ofOperationalDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofOperationalDataExportSchedule(
                OperationalDataExportScheduleResponse.builder()
                    .id("id")
                    .version(0L)
                    .addOperationalDataType(
                        OperationalDataExportScheduleResponse.OperationalDataType.BILLS
                    )
                    .build()
            )

        val roundtrippedDataExportScheduleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleDeleteResponse),
                jacksonTypeRef<DataExportScheduleDeleteResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleDeleteResponse)
            .isEqualTo(dataExportScheduleDeleteResponse)
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

        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofUsageDataExportSchedule(usageDataExportSchedule)

        assertThat(dataExportScheduleDeleteResponse.operationalDataExportSchedule()).isEmpty
        assertThat(dataExportScheduleDeleteResponse.usageDataExportSchedule())
            .contains(usageDataExportSchedule)
    }

    @Test
    fun ofUsageDataExportScheduleRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportScheduleDeleteResponse =
            DataExportScheduleDeleteResponse.ofUsageDataExportSchedule(
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

        val roundtrippedDataExportScheduleDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportScheduleDeleteResponse),
                jacksonTypeRef<DataExportScheduleDeleteResponse>(),
            )

        assertThat(roundtrippedDataExportScheduleDeleteResponse)
            .isEqualTo(dataExportScheduleDeleteResponse)
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
        val dataExportScheduleDeleteResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DataExportScheduleDeleteResponse>())

        val e =
            assertThrows<M3terInvalidDataException> { dataExportScheduleDeleteResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
