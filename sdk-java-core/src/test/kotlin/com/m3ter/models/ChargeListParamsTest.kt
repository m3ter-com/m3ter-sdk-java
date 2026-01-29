// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeListParamsTest {

    @Test
    fun create() {
        ChargeListParams.builder()
            .orgId("orgId")
            .accountId("accountId")
            .billDate(LocalDate.parse("2019-12-27"))
            .entityId("entityId")
            .entityType(ChargeListParams.EntityType.AD_HOC)
            .addId("string")
            .nextToken("nextToken")
            .pageSize(1)
            .scheduleId("scheduleId")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ChargeListParams.builder().build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ChargeListParams.builder()
                .orgId("orgId")
                .accountId("accountId")
                .billDate(LocalDate.parse("2019-12-27"))
                .entityId("entityId")
                .entityType(ChargeListParams.EntityType.AD_HOC)
                .addId("string")
                .nextToken("nextToken")
                .pageSize(1)
                .scheduleId("scheduleId")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("billDate", "2019-12-27")
                    .put("entityId", "entityId")
                    .put("entityType", "AD_HOC")
                    .put("ids", listOf("string").joinToString(","))
                    .put("nextToken", "nextToken")
                    .put("pageSize", "1")
                    .put("scheduleId", "scheduleId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChargeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
