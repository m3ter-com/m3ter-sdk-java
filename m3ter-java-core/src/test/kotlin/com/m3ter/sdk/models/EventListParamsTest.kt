// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Test
    fun create() {
        EventListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .eventName("eventName")
            .eventType("eventType")
            .addId("string")
            .includeActioned(true)
            .nextToken("nextToken")
            .notificationCode("notificationCode")
            .notificationId("notificationId")
            .pageSize(1L)
            .resourceId("resourceId")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .eventName("eventName")
                .eventType("eventType")
                .addId("string")
                .includeActioned(true)
                .nextToken("nextToken")
                .notificationCode("notificationCode")
                .notificationId("notificationId")
                .pageSize(1L)
                .resourceId("resourceId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("eventName", "eventName")
                    .put("eventType", "eventType")
                    .put("ids", listOf("string").joinToString(","))
                    .put("includeActioned", "true")
                    .put("nextToken", "nextToken")
                    .put("notificationCode", "notificationCode")
                    .put("notificationId", "notificationId")
                    .put("pageSize", "1")
                    .put("resourceId", "resourceId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = EventListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
