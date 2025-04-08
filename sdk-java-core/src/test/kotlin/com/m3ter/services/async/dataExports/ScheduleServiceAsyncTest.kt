// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.DataExportScheduleCreateParams
import com.m3ter.models.DataExportScheduleDeleteParams
import com.m3ter.models.DataExportScheduleRetrieveParams
import com.m3ter.models.DataExportScheduleUpdateParams
import com.m3ter.models.OperationalDataExportScheduleRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScheduleServiceAsyncTest {

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
                        OperationalDataExportScheduleRequest.builder()
                            .addOperationalDataType(
                                OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                            )
                            .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
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
                        OperationalDataExportScheduleRequest.builder()
                            .addOperationalDataType(
                                OperationalDataExportScheduleRequest.OperationalDataType.BILLS
                            )
                            .sourceType(OperationalDataExportScheduleRequest.SourceType.USAGE)
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

        val pageFuture = scheduleServiceAsync.list()

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
