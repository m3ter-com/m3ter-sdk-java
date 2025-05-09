// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationConfigurationGetByEntityParamsTest {

    @Test
    fun create() {
        IntegrationConfigurationGetByEntityParams.builder()
            .orgId("orgId")
            .entityType("entityType")
            .destination("destination")
            .destinationId("destinationId")
            .entityId("entityId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder().entityType("entityType").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("entityType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder()
                .orgId("orgId")
                .entityType("entityType")
                .destination("destination")
                .destinationId("destinationId")
                .entityId("entityId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("destination", "destination")
                    .put("destinationId", "destinationId")
                    .put("entityId", "entityId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            IntegrationConfigurationGetByEntityParams.builder().entityType("entityType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
