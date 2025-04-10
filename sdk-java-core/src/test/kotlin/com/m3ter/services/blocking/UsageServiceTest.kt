// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.MeasurementRequest
import com.m3ter.models.SubmitMeasurementsRequest
import com.m3ter.models.UsageGetFailedIngestDownloadUrlParams
import com.m3ter.models.UsageQueryParams
import com.m3ter.models.UsageSubmitParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UsageServiceTest {

    @Test
    fun getFailedIngestDownloadUrl() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val usageService = client.usage()

        val downloadUrlResponse =
            usageService.getFailedIngestDownloadUrl(
                UsageGetFailedIngestDownloadUrlParams.builder().orgId("orgId").file("file").build()
            )

        downloadUrlResponse.validate()
    }

    @Test
    fun query() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val usageService = client.usage()

        val usageQueryResponse =
            usageService.query(
                UsageQueryParams.builder()
                    .orgId("orgId")
                    .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addAccountId("string")
                    .addAggregation(
                        UsageQueryParams.Aggregation.builder()
                            .fieldCode("x")
                            .fieldType(UsageQueryParams.Aggregation.FieldType.DIMENSION)
                            .function(UsageQueryParams.Aggregation.Function.SUM)
                            .meterId("x")
                            .build()
                    )
                    .addDimensionFilter(
                        UsageQueryParams.DimensionFilter.builder()
                            .fieldCode("x")
                            .meterId("x")
                            .addValue("string")
                            .build()
                    )
                    .addGroup(
                        UsageQueryParams.Group.DataExplorerAccountGroup.builder()
                            .groupType(
                                UsageQueryParams.Group.DataExplorerAccountGroup.GroupType.ACCOUNT
                            )
                            .build()
                    )
                    .limit(1L)
                    .addMeterId("string")
                    .build()
            )

        usageQueryResponse.validate()
    }

    @Test
    fun submit() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val usageService = client.usage()

        val submitMeasurementsResponse =
            usageService.submit(
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
            )

        submitMeasurementsResponse.validate()
    }
}
