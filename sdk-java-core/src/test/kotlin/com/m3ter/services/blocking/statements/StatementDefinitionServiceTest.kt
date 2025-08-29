// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.statements

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.models.StatementStatementDefinitionCreateParams
import com.m3ter.models.StatementStatementDefinitionDeleteParams
import com.m3ter.models.StatementStatementDefinitionRetrieveParams
import com.m3ter.models.StatementStatementDefinitionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatementDefinitionServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementDefinitionService = client.statements().statementDefinitions()

        val statementDefinitionResponse =
            statementDefinitionService.create(
                StatementStatementDefinitionCreateParams.builder()
                    .orgId("orgId")
                    .aggregationFrequency(
                        StatementStatementDefinitionCreateParams.AggregationFrequency.DAY
                    )
                    .addDimension(
                        StatementStatementDefinitionCreateParams.Dimension.builder()
                            .addFilter("string")
                            .name("x")
                            .addAttribute("string")
                            .meterId("meterId")
                            .build()
                    )
                    .generateSlimStatements(true)
                    .includePricePerUnit(true)
                    .addMeasure(
                        StatementStatementDefinitionCreateParams.Measure.builder()
                            .addAggregation(
                                StatementStatementDefinitionCreateParams.Measure.Aggregation.SUM
                            )
                            .meterId("meterId")
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .version(0L)
                    .build()
            )

        statementDefinitionResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementDefinitionService = client.statements().statementDefinitions()

        val statementDefinitionResponse =
            statementDefinitionService.retrieve(
                StatementStatementDefinitionRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        statementDefinitionResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementDefinitionService = client.statements().statementDefinitions()

        val statementDefinitionResponse =
            statementDefinitionService.update(
                StatementStatementDefinitionUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .aggregationFrequency(
                        StatementStatementDefinitionUpdateParams.AggregationFrequency.DAY
                    )
                    .addDimension(
                        StatementStatementDefinitionUpdateParams.Dimension.builder()
                            .addFilter("string")
                            .name("x")
                            .addAttribute("string")
                            .meterId("meterId")
                            .build()
                    )
                    .generateSlimStatements(true)
                    .includePricePerUnit(true)
                    .addMeasure(
                        StatementStatementDefinitionUpdateParams.Measure.builder()
                            .addAggregation(
                                StatementStatementDefinitionUpdateParams.Measure.Aggregation.SUM
                            )
                            .meterId("meterId")
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .version(0L)
                    .build()
            )

        statementDefinitionResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementDefinitionService = client.statements().statementDefinitions()

        val page = statementDefinitionService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val statementDefinitionService = client.statements().statementDefinitions()

        val statementDefinitionResponse =
            statementDefinitionService.delete(
                StatementStatementDefinitionDeleteParams.builder().orgId("orgId").id("id").build()
            )

        statementDefinitionResponse.validate()
    }
}
