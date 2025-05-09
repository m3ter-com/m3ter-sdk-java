// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdHocOperationalDataRequestTest {

    @Test
    fun create() {
        val adHocOperationalDataRequest =
            AdHocOperationalDataRequest.builder()
                .addOperationalDataType(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                .version(0L)
                .build()

        assertThat(adHocOperationalDataRequest.operationalDataTypes())
            .containsExactly(AdHocOperationalDataRequest.OperationalDataType.BILLS)
        assertThat(adHocOperationalDataRequest.sourceType())
            .isEqualTo(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
        assertThat(adHocOperationalDataRequest.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adHocOperationalDataRequest =
            AdHocOperationalDataRequest.builder()
                .addOperationalDataType(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                .sourceType(AdHocOperationalDataRequest.SourceType.OPERATIONAL)
                .version(0L)
                .build()

        val roundtrippedAdHocOperationalDataRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adHocOperationalDataRequest),
                jacksonTypeRef<AdHocOperationalDataRequest>(),
            )

        assertThat(roundtrippedAdHocOperationalDataRequest).isEqualTo(adHocOperationalDataRequest)
    }
}
