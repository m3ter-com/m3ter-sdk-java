// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillConfigUpdateParamsTest {

    @Test
    fun create() {
        BillConfigUpdateParams.builder()
            .orgId("orgId")
            .billLockDate(LocalDate.parse("2019-12-27"))
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BillConfigUpdateParams.builder()
                .orgId("orgId")
                .billLockDate(LocalDate.parse("2019-12-27"))
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.billLockDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillConfigUpdateParams.builder().orgId("orgId").build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = BillConfigUpdateParams.builder().orgId("orgId").build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
