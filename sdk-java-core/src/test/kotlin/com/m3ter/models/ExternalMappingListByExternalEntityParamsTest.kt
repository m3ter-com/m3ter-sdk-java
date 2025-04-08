// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListByExternalEntityParamsTest {

    @Test
    fun create() {
        ExternalMappingListByExternalEntityParams.builder()
            .orgId("orgId")
            .system("system")
            .externalTable("externalTable")
            .externalId("externalId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("orgId")
        assertThat(params._pathParam(1)).isEqualTo("system")
        assertThat(params._pathParam(2)).isEqualTo("externalTable")
        assertThat(params._pathParam(3)).isEqualTo("externalId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("nextToken", "nextToken").put("pageSize", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExternalMappingListByExternalEntityParams.builder()
                .orgId("orgId")
                .system("system")
                .externalTable("externalTable")
                .externalId("externalId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
