// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClient
import com.m3ter.core.JsonValue
import com.m3ter.models.LookupTableLookupTableRevisionDataArchieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataCopyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupTableRevisionDataServiceTest {

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
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val lookupTableRevisionData =
            lookupTableRevisionDataService.retrieve(
                LookupTableLookupTableRevisionDataRetrieveParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .addAdditional("string")
                    .limit(0)
                    .build()
            )

        lookupTableRevisionData.validate()
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
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val lookupTableRevisionData =
            lookupTableRevisionDataService.update(
                LookupTableLookupTableRevisionDataUpdateParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .addAdditional("string")
                    .addItem(
                        LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        lookupTableRevisionData.validate()
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
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val lookupTableRevisionData =
            lookupTableRevisionDataService.delete(
                LookupTableLookupTableRevisionDataDeleteParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .build()
            )

        lookupTableRevisionData.validate()
    }

    @Test
    fun archieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.archieve(
                LookupTableLookupTableRevisionDataArchieveParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .contentType(
                        LookupTableLookupTableRevisionDataArchieveParams.ContentType
                            .APPLICATION_JSONL
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun copy() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.copy(
                LookupTableLookupTableRevisionDataCopyParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .revisionId("revisionId")
                    .build()
            )

        response.validate()
    }

    @Test
    fun deleteKey() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.deleteKey(
                LookupTableLookupTableRevisionDataDeleteKeyParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .lookupKey("lookupKey")
                    .version(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun generateDownloadUrl() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.generateDownloadUrl(
                LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .contentLength(1L)
                    .contentType(
                        LookupTableLookupTableRevisionDataGenerateDownloadUrlParams.ContentType
                            .APPLICATION_JSONL
                    )
                    .fileName("x")
                    .version(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun retrieveKey() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.retrieveKey(
                LookupTableLookupTableRevisionDataRetrieveKeyParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .lookupKey("lookupKey")
                    .build()
            )

        response.validate()
    }

    @Test
    fun updateKey() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val lookupTableRevisionDataService = client.lookupTables().lookupTableRevisionData()

        val response =
            lookupTableRevisionDataService.updateKey(
                LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                    .orgId("orgId")
                    .lookupTableId("lookupTableId")
                    .lookupTableRevisionId("lookupTableRevisionId")
                    .lookupKey("lookupKey")
                    .addAdditional("string")
                    .item(
                        LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        response.validate()
    }
}
