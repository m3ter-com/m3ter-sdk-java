// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillLatestByAccountParamsTest {

    @Test
    fun create() {
        BillLatestByAccountParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .addAdditional("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillLatestByAccountParams.builder().accountId("accountId").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("accountId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BillLatestByAccountParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .addAdditional("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("additional", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillLatestByAccountParams.builder().accountId("accountId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
