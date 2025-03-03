// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.DataExportScheduleCreateParams
import com.m3ter.sdk.models.DataExportScheduleDeleteParams
import com.m3ter.sdk.models.DataExportScheduleListParams
import com.m3ter.sdk.models.DataExportScheduleRetrieveParams
import com.m3ter.sdk.models.DataExportScheduleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScheduleServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val scheduleServiceAsync = client.dataExports().schedules()

        val scheduleFuture =
            scheduleServiceAsync.create(
                DataExportScheduleCreateParams.builder()
                    .orgId("orgId")
                    .body(
                        DataExportScheduleCreateParams.Body.UnionMember0.builder()
                            .addOperationalDataType(
                                DataExportScheduleCreateParams.Body.UnionMember0.OperationalDataType
                                    .BILLS
                            )
                            .sourceType(
                                DataExportScheduleCreateParams.Body.UnionMember0.SourceType.USAGE
                            )
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val schedule = scheduleFuture.get()
        schedule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val scheduleServiceAsync = client.dataExports().schedules()

        val scheduleFuture =
            scheduleServiceAsync.retrieve(
                DataExportScheduleRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val schedule = scheduleFuture.get()
        schedule.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val scheduleServiceAsync = client.dataExports().schedules()

        val scheduleFuture =
            scheduleServiceAsync.update(
                DataExportScheduleUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .body(
                        DataExportScheduleUpdateParams.Body.UnionMember0.builder()
                            .addOperationalDataType(
                                DataExportScheduleUpdateParams.Body.UnionMember0.OperationalDataType
                                    .BILLS
                            )
                            .sourceType(
                                DataExportScheduleUpdateParams.Body.UnionMember0.SourceType.USAGE
                            )
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val schedule = scheduleFuture.get()
        schedule.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val scheduleServiceAsync = client.dataExports().schedules()

        val pageFuture =
            scheduleServiceAsync.list(DataExportScheduleListParams.builder().orgId("orgId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val scheduleServiceAsync = client.dataExports().schedules()

        val scheduleFuture =
            scheduleServiceAsync.delete(
                DataExportScheduleDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val schedule = scheduleFuture.get()
        schedule.validate()
    }
}
