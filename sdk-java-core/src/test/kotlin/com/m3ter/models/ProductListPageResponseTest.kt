// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.JsonValue
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductListPageResponseTest {

    @Test
    fun create() {
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(productListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(productListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productListPageResponse =
            ProductListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedProductListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productListPageResponse),
                jacksonTypeRef<ProductListPageResponse>(),
            )

        assertThat(roundtrippedProductListPageResponse).isEqualTo(productListPageResponse)
    }
}
