// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductResponseTest {

    @Test
    fun create() {
        val productResponse =
            ProductResponse.builder()
                .id("id")
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
                .version(0L)
                .build()

        assertThat(productResponse.id()).isEqualTo("id")
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
        assertThat(productResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productResponse =
            ProductResponse.builder()
                .id("id")
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
                .version(0L)
                .build()

        val roundtrippedProductResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productResponse),
                jacksonTypeRef<ProductResponse>(),
            )

        assertThat(roundtrippedProductResponse).isEqualTo(productResponse)
    }
}
