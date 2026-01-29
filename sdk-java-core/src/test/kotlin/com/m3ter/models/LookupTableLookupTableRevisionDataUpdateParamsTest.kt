// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LookupTableLookupTableRevisionDataUpdateParamsTest {

    @Test
    fun create() {
        LookupTableLookupTableRevisionDataUpdateParams.builder()
            .orgId("orgId")
            .lookupTableId("lookupTableId")
            .lookupTableRevisionId("lookupTableRevisionId")
            .addAdditional("string")
            .addItem(
                LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LookupTableLookupTableRevisionDataUpdateParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("lookupTableId")
        assertThat(params._pathParam(2)).isEqualTo("lookupTableRevisionId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupTableLookupTableRevisionDataUpdateParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addAdditional("string")
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
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
            LookupTableLookupTableRevisionDataUpdateParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
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
            LookupTableLookupTableRevisionDataUpdateParams.builder()
                .orgId("orgId")
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addAdditional("string")
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LookupTableLookupTableRevisionDataUpdateParams.builder()
                .lookupTableId("lookupTableId")
                .lookupTableRevisionId("lookupTableRevisionId")
                .addItem(
                    LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.items())
            .containsExactly(
                LookupTableLookupTableRevisionDataUpdateParams.Item.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
