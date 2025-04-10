// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubmitMeasurementsRequestTest {

    @Test
    fun create() {
        val submitMeasurementsRequest =
            SubmitMeasurementsRequest.builder()
                .addMeasurement(
                    MeasurementRequest.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .cost(
                            MeasurementRequest.Cost.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                        .income(
                            MeasurementRequest.Income.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .measure(
                            MeasurementRequest.Measure.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .metadata(
                            MeasurementRequest.Metadata.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .other(
                            MeasurementRequest.Other.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .uid("string")
                        .what(
                            MeasurementRequest.What.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .where(
                            MeasurementRequest.Where.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .who(
                            MeasurementRequest.Who.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(submitMeasurementsRequest.measurements())
            .containsExactly(
                MeasurementRequest.builder()
                    .account("Acme Corp")
                    .meter("string")
                    .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                    .cost(
                        MeasurementRequest.Cost.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                    .income(
                        MeasurementRequest.Income.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .measure(
                        MeasurementRequest.Measure.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .metadata(
                        MeasurementRequest.Metadata.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .other(
                        MeasurementRequest.Other.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .uid("string")
                    .what(
                        MeasurementRequest.What.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .where(
                        MeasurementRequest.Where.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .who(
                        MeasurementRequest.Who.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val submitMeasurementsRequest =
            SubmitMeasurementsRequest.builder()
                .addMeasurement(
                    MeasurementRequest.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .cost(
                            MeasurementRequest.Cost.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                        .income(
                            MeasurementRequest.Income.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .measure(
                            MeasurementRequest.Measure.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .metadata(
                            MeasurementRequest.Metadata.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .other(
                            MeasurementRequest.Other.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .uid("string")
                        .what(
                            MeasurementRequest.What.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .where(
                            MeasurementRequest.Where.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .who(
                            MeasurementRequest.Who.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSubmitMeasurementsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(submitMeasurementsRequest),
                jacksonTypeRef<SubmitMeasurementsRequest>(),
            )

        assertThat(roundtrippedSubmitMeasurementsRequest).isEqualTo(submitMeasurementsRequest)
    }
}
