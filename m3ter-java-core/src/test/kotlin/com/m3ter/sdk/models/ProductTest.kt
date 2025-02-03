// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductTest {

    @Test
    fun createProduct() {
        val product =
            Product.builder()
                .id("id")
                .version(0L)
                .code("code")
                .createdBy("createdBy")
                .customFields(
                    Product.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastModifiedBy("lastModifiedBy")
                .name("name")
                .build()
        assertThat(product).isNotNull
        assertThat(product.id()).isEqualTo("id")
        assertThat(product.version()).isEqualTo(0L)
        assertThat(product.code()).contains("code")
        assertThat(product.createdBy()).contains("createdBy")
        assertThat(product.customFields())
            .contains(
                Product.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(product.dtCreated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(product.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(product.name()).contains("name")
    }
}
