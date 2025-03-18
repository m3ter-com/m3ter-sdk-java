// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMappingListByM3terEntityParamsTest {

    @Test
    fun create() {
        ExternalMappingListByM3terEntityParams.builder()
            .orgId("orgId")
            .entity("entity")
            .m3terId("m3terId")
            .nextToken("nextToken")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalMappingListByM3terEntityParams.builder()
                .orgId("orgId")
                .entity("entity")
                .m3terId("m3terId")
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
            ExternalMappingListByM3terEntityParams.builder()
                .orgId("orgId")
                .entity("entity")
                .m3terId("m3terId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalMappingListByM3terEntityParams.builder()
                .orgId("orgId")
                .entity("entity")
                .m3terId("m3terId")
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "entity"
        assertThat(params.getPathParam(1)).isEqualTo("entity")
        // path param "m3terId"
        assertThat(params.getPathParam(2)).isEqualTo("m3terId")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
