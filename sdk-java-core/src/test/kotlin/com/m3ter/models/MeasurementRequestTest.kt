// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeasurementRequestTest {

    @Test
    fun create() {
        val measurementRequest =
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

        assertThat(measurementRequest.account()).isEqualTo("Acme Corp")
        assertThat(measurementRequest.meter()).isEqualTo("string")
        assertThat(measurementRequest.ts()).isEqualTo(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
        assertThat(measurementRequest.cost())
            .contains(
                MeasurementRequest.Cost.builder()
                    .putAdditionalProperty("property1", JsonValue.from(0))
                    .putAdditionalProperty("property2", JsonValue.from(0))
                    .build()
            )
        assertThat(measurementRequest.ets()).contains(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
        assertThat(measurementRequest.income())
            .contains(
                MeasurementRequest.Income.builder()
                    .putAdditionalProperty("property1", JsonValue.from(0))
                    .putAdditionalProperty("property2", JsonValue.from(0))
                    .build()
            )
        assertThat(measurementRequest.measure())
            .contains(
                MeasurementRequest.Measure.builder()
                    .putAdditionalProperty("property1", JsonValue.from(0))
                    .putAdditionalProperty("property2", JsonValue.from(0))
                    .build()
            )
        assertThat(measurementRequest.metadata())
            .contains(
                MeasurementRequest.Metadata.builder()
                    .putAdditionalProperty("property1", JsonValue.from("string"))
                    .putAdditionalProperty("property2", JsonValue.from("string"))
                    .build()
            )
        assertThat(measurementRequest.other())
            .contains(
                MeasurementRequest.Other.builder()
                    .putAdditionalProperty("property1", JsonValue.from("string"))
                    .putAdditionalProperty("property2", JsonValue.from("string"))
                    .build()
            )
        assertThat(measurementRequest.uid()).contains("string")
        assertThat(measurementRequest.what())
            .contains(
                MeasurementRequest.What.builder()
                    .putAdditionalProperty("property1", JsonValue.from("string"))
                    .putAdditionalProperty("property2", JsonValue.from("string"))
                    .build()
            )
        assertThat(measurementRequest.where())
            .contains(
                MeasurementRequest.Where.builder()
                    .putAdditionalProperty("property1", JsonValue.from("string"))
                    .putAdditionalProperty("property2", JsonValue.from("string"))
                    .build()
            )
        assertThat(measurementRequest.who())
            .contains(
                MeasurementRequest.Who.builder()
                    .putAdditionalProperty("property1", JsonValue.from("string"))
                    .putAdditionalProperty("property2", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val measurementRequest =
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

        val roundtrippedMeasurementRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(measurementRequest),
                jacksonTypeRef<MeasurementRequest>(),
            )

        assertThat(roundtrippedMeasurementRequest).isEqualTo(measurementRequest)
    }
}
