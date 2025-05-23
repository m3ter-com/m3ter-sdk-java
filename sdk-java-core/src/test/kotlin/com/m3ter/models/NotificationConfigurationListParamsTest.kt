// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationConfigurationListParamsTest {

    @Test
    fun create() {
        NotificationConfigurationListParams.builder()
            .orgId("orgId")
            .active(true)
            .eventName("eventName")
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = NotificationConfigurationListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NotificationConfigurationListParams.builder()
                .orgId("orgId")
                .active(true)
                .eventName("eventName")
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("active", "true")
                    .put("eventName", "eventName")
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotificationConfigurationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
