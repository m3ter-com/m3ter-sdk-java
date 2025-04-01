// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageQueryResponseTest {

    @Test
    fun create() {
        val usageQueryResponse =
            UsageQueryResponse.builder()
                .addData(
                    UsageQueryResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .hasMoreData(true)
                .build()

        assertThat(usageQueryResponse.data().getOrNull())
            .containsExactly(
                UsageQueryResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(usageQueryResponse.hasMoreData()).contains(true)
    }
}
