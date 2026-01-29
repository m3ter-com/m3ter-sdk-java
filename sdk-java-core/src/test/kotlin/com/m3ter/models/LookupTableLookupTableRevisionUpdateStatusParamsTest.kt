// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionUpdateStatusParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionUpdateStatusParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .id("id")
            .lookupTableRevisionStatusRequest(
                LookupTableRevisionStatusRequest.builder()
                    .status(LookupTableRevisionStatusRequest.Status.DRAFT)
                    .version(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionUpdateStatusParams.builder()
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionStatusRequest(
                    LookupTableRevisionStatusRequest.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LookupTableLookupTableRevisionUpdateStatusParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionStatusRequest(
                    LookupTableRevisionStatusRequest.builder()
                        .status(LookupTableRevisionStatusRequest.Status.DRAFT)
                        .version(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LookupTableRevisionStatusRequest.builder()
                    .status(LookupTableRevisionStatusRequest.Status.DRAFT)
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionUpdateStatusParams.builder()
                .lookupTableId("lookupTableId")
                .id("id")
                .lookupTableRevisionStatusRequest(
                    LookupTableRevisionStatusRequest.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(LookupTableRevisionStatusRequest.builder().build())
    }
}
