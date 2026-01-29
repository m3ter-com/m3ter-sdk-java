// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataUpdateKeyParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .lookupKey("lookupKey")
            .addAdditional("string")
            .item(
                LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .item(
                    LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("lookupTableRevisionId")
        assertThat(params._pathParam(3)).isEqualTo("lookupKey")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .addAdditional("string")
                .item(
                    LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("additional", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .item(
                    LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .addAdditional("string")
                .item(
                    LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.item())
            .isEqualTo(
                LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataUpdateKeyParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .lookupKey("lookupKey")
                .item(
                    LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.item())
            .isEqualTo(
                LookupTableLookupTableRevisionDataUpdateKeyParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
