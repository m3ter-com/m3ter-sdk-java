// File generated from our OpenAPI spec by Stainless.

package com.m3ter.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import com.m3ter.models.DataExportDestinationCreateResponse
import com.m3ter.models.DataExportDestinationResponse
import com.m3ter.models.ProductResponse
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/sdk-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            M3terOkHttpClient.builder()
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.authentication()).isNotNull()
        assertThat(client.accounts()).isNotNull()
        assertThat(client.accountPlans()).isNotNull()
        assertThat(client.aggregations()).isNotNull()
        assertThat(client.balances()).isNotNull()
        assertThat(client.bills()).isNotNull()
        assertThat(client.billConfig()).isNotNull()
        assertThat(client.commitments()).isNotNull()
        assertThat(client.billJobs()).isNotNull()
        assertThat(client.compoundAggregations()).isNotNull()
        assertThat(client.contracts()).isNotNull()
        assertThat(client.counters()).isNotNull()
        assertThat(client.counterAdjustments()).isNotNull()
        assertThat(client.counterPricings()).isNotNull()
        assertThat(client.creditReasons()).isNotNull()
        assertThat(client.currencies()).isNotNull()
        assertThat(client.customFields()).isNotNull()
        assertThat(client.dataExports()).isNotNull()
        assertThat(client.debitReasons()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.externalMappings()).isNotNull()
        assertThat(client.integrationConfigurations()).isNotNull()
        assertThat(client.meters()).isNotNull()
        assertThat(client.notificationConfigurations()).isNotNull()
        assertThat(client.organizationConfig()).isNotNull()
        assertThat(client.permissionPolicies()).isNotNull()
        assertThat(client.plans()).isNotNull()
        assertThat(client.planGroups()).isNotNull()
        assertThat(client.planGroupLinks()).isNotNull()
        assertThat(client.planTemplates()).isNotNull()
        assertThat(client.pricings()).isNotNull()
        assertThat(client.products()).isNotNull()
        assertThat(client.resourceGroups()).isNotNull()
        assertThat(client.scheduledEventConfigurations()).isNotNull()
        assertThat(client.statements()).isNotNull()
        assertThat(client.transactionTypes()).isNotNull()
        assertThat(client.usage()).isNotNull()
        assertThat(client.users()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun productResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val productResponse =
            ProductResponse.builder()
                .id("id")
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    ProductResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .version(0L)
                .build()

        val roundtrippedProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productResponse),
                jacksonTypeRef<ProductResponse>(),
            )

        assertThat(roundtrippedProductResponse).isEqualTo(productResponse)
    }

    @Test
    fun dataExportDestinationCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataExportDestinationCreateResponse =
            DataExportDestinationCreateResponse.ofExportDestinationS3(
                DataExportDestinationCreateResponse.ExportDestinationS3Response.builder()
                    .id("id")
                    .code("code")
                    .createdBy("createdBy")
                    .destinationType(DataExportDestinationResponse.DestinationType.S3)
                    .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastModifiedBy("lastModifiedBy")
                    .name("name")
                    .version(0L)
                    .bucketName("bucketName")
                    .iamRoleArn("iamRoleArn")
                    .partitionOrder(
                        DataExportDestinationCreateResponse.ExportDestinationS3Response
                            .PartitionOrder
                            .TYPE_FIRST
                    )
                    .prefix("prefix")
                    .build()
            )

        val roundtrippedDataExportDestinationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataExportDestinationCreateResponse),
                jacksonTypeRef<DataExportDestinationCreateResponse>(),
            )

        assertThat(roundtrippedDataExportDestinationCreateResponse)
            .isEqualTo(dataExportDestinationCreateResponse)
    }
}
