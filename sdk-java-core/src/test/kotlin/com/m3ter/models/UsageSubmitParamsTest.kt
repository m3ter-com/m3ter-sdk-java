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
            .addMeasurement(
                UsageSubmitParams.Measurement.builder()
                    .account("Acme Corp")
                    .meter("string")
                    .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                    .cost(
                        UsageSubmitParams.Measurement.Cost.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                    .income(
                        UsageSubmitParams.Measurement.Income.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .measure(
                        UsageSubmitParams.Measurement.Measure.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .metadata(
                        UsageSubmitParams.Measurement.Metadata.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .other(
                        UsageSubmitParams.Measurement.Other.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .uid("string")
                    .what(
                        UsageSubmitParams.Measurement.What.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .where(
                        UsageSubmitParams.Measurement.Where.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .who(
                        UsageSubmitParams.Measurement.Who.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
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
                .addMeasurement(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
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
                .addMeasurement(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .cost(
                            UsageSubmitParams.Measurement.Cost.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                        .income(
                            UsageSubmitParams.Measurement.Income.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .measure(
                            UsageSubmitParams.Measurement.Measure.builder()
                                .putAdditionalProperty("property1", JsonValue.from(0))
                                .putAdditionalProperty("property2", JsonValue.from(0))
                                .build()
                        )
                        .metadata(
                            UsageSubmitParams.Measurement.Metadata.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .other(
                            UsageSubmitParams.Measurement.Other.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .uid("string")
                        .what(
                            UsageSubmitParams.Measurement.What.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .where(
                            UsageSubmitParams.Measurement.Where.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .who(
                            UsageSubmitParams.Measurement.Who.builder()
                                .putAdditionalProperty("property1", JsonValue.from("string"))
                                .putAdditionalProperty("property2", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.measurements())
            .containsExactly(
                UsageSubmitParams.Measurement.builder()
                    .account("Acme Corp")
                    .meter("string")
                    .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                    .cost(
                        UsageSubmitParams.Measurement.Cost.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .ets(OffsetDateTime.parse("2022-08-24T15:15:22Z"))
                    .income(
                        UsageSubmitParams.Measurement.Income.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .measure(
                        UsageSubmitParams.Measurement.Measure.builder()
                            .putAdditionalProperty("property1", JsonValue.from(0))
                            .putAdditionalProperty("property2", JsonValue.from(0))
                            .build()
                    )
                    .metadata(
                        UsageSubmitParams.Measurement.Metadata.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .other(
                        UsageSubmitParams.Measurement.Other.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .uid("string")
                    .what(
                        UsageSubmitParams.Measurement.What.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .where(
                        UsageSubmitParams.Measurement.Where.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .who(
                        UsageSubmitParams.Measurement.Who.builder()
                            .putAdditionalProperty("property1", JsonValue.from("string"))
                            .putAdditionalProperty("property2", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageSubmitParams.builder()
                .addMeasurement(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.measurements())
            .containsExactly(
                UsageSubmitParams.Measurement.builder()
                    .account("Acme Corp")
                    .meter("string")
                    .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                    .build()
            )
    }
}
