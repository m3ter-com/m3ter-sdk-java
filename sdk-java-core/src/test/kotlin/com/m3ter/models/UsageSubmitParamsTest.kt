// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageSubmitParamsTest {

    @Test
    fun create() {
        UsageSubmitParams.builder()
            .orgId("orgId")
            .submitMeasurementsRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UsageSubmitParams.builder()
                .submitMeasurementsRequest(
                    SubmitMeasurementsRequest.builder()
                        .addMeasurement(
                            MeasurementRequest.builder()
                                .account("Acme Corp")
                                .meter("string")
                                .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UsageSubmitParams.builder()
                .orgId("orgId")
                .submitMeasurementsRequest(
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
                                        .putAdditionalProperty(
                                            "property1",
                                            JsonValue.from("string"),
                                        )
                                        .putAdditionalProperty(
                                            "property2",
                                            JsonValue.from("string"),
                                        )
                                        .build()
                                )
                                .other(
                                    MeasurementRequest.Other.builder()
                                        .putAdditionalProperty(
                                            "property1",
                                            JsonValue.from("string"),
                                        )
                                        .putAdditionalProperty(
                                            "property2",
                                            JsonValue.from("string"),
                                        )
                                        .build()
                                )
                                .uid("string")
                                .what(
                                    MeasurementRequest.What.builder()
                                        .putAdditionalProperty(
                                            "property1",
                                            JsonValue.from("string"),
                                        )
                                        .putAdditionalProperty(
                                            "property2",
                                            JsonValue.from("string"),
                                        )
                                        .build()
                                )
                                .where(
                                    MeasurementRequest.Where.builder()
                                        .putAdditionalProperty(
                                            "property1",
                                            JsonValue.from("string"),
                                        )
                                        .putAdditionalProperty(
                                            "property2",
                                            JsonValue.from("string"),
                                        )
                                        .build()
                                )
                                .who(
                                    MeasurementRequest.Who.builder()
                                        .putAdditionalProperty(
                                            "property1",
                                            JsonValue.from("string"),
                                        )
                                        .putAdditionalProperty(
                                            "property2",
                                            JsonValue.from("string"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageSubmitParams.builder()
                .submitMeasurementsRequest(
                    SubmitMeasurementsRequest.builder()
                        .addMeasurement(
                            MeasurementRequest.builder()
                                .account("Acme Corp")
                                .meter("string")
                                .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubmitMeasurementsRequest.builder()
                    .addMeasurement(
                        MeasurementRequest.builder()
                            .account("Acme Corp")
                            .meter("string")
                            .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                            .build()
                    )
                    .build()
            )
    }
}
