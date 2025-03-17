// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageQueryResponseTest {

    @Test
    fun createUsageQueryResponse() {
        val usageQueryResponse =
            UsageQueryResponse.builder()
                .addData(
                    UsageQueryResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .hasMoreData(true)
                .build()
        assertThat(usageQueryResponse).isNotNull
        assertThat(usageQueryResponse.data().get())
            .containsExactly(
                UsageQueryResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(usageQueryResponse.hasMoreData()).contains(true)
    }
}
