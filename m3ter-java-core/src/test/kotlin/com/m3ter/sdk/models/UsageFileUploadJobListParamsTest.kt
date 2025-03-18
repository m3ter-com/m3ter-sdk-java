// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageFileUploadJobListParamsTest {

    @Test
    fun create() {
        UsageFileUploadJobListParams.builder()
            .orgId("orgId")
            .dateCreatedEnd("dateCreatedEnd")
            .dateCreatedStart("dateCreatedStart")
            .fileKey("fileKey")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UsageFileUploadJobListParams.builder()
                .orgId("orgId")
                .dateCreatedEnd("dateCreatedEnd")
                .dateCreatedStart("dateCreatedStart")
                .fileKey("fileKey")
                .nextToken("nextToken")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dateCreatedEnd", "dateCreatedEnd")
                    .put("dateCreatedStart", "dateCreatedStart")
                    .put("fileKey", "fileKey")
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageFileUploadJobListParams.builder().orgId("orgId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params = UsageFileUploadJobListParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
