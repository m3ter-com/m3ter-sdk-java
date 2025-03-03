// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UsageSubmitParamsTest {

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

        assertNotNull(body)
        assertThat(body.measurements())
            .isEqualTo(
                listOf(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UsageSubmitParams.builder()
                .orgId("orgId")
                .addMeasurement(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.measurements())
            .isEqualTo(
                listOf(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            UsageSubmitParams.builder()
                .orgId("orgId")
                .addMeasurement(
                    UsageSubmitParams.Measurement.builder()
                        .account("Acme Corp")
                        .meter("string")
                        .ts(OffsetDateTime.parse("2022-08-24T14:15:22Z"))
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
