// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
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
    fun pathParams() {
        val params =
            ExternalMappingListByM3terEntityParams.builder()
                .entity("entity")
                .m3terId("m3terId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("entity")
        assertThat(params._pathParam(2)).isEqualTo("m3terId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
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
                .entity("entity")
                .m3terId("m3terId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
