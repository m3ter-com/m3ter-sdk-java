// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductResponseTest {

    @Test
    fun createProductResponse() {
        val productResponse =
            ProductResponse.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    ProductResponse.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()
        assertThat(productResponse).isNotNull
        assertThat(productResponse.id()).isEqualTo("id")
        assertThat(productResponse.version()).isEqualTo(0L)
        assertThat(productResponse.code()).contains("code")
        assertThat(productResponse.createdBy()).contains("createdBy")
        assertThat(productResponse.customFields())
            .contains(
                ProductResponse.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(productResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(productResponse.name()).contains("name")
    }
}
