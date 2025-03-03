// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdHocOperationalDataRequestTest {

    @Test
    fun createAdHocOperationalDataRequest() {
        val adHocOperationalDataRequest =
            AdHocOperationalDataRequest.builder()
                .addOperationalDataType(AdHocOperationalDataRequest.OperationalDataType.BILLS)
                .sourceType(AdHocOperationalDataRequest.SourceType.USAGE)
                .version(0L)
                .build()
        assertThat(adHocOperationalDataRequest).isNotNull
        assertThat(adHocOperationalDataRequest.operationalDataTypes())
            .containsExactly(AdHocOperationalDataRequest.OperationalDataType.BILLS)
        assertThat(adHocOperationalDataRequest.sourceType())
            .isEqualTo(AdHocOperationalDataRequest.SourceType.USAGE)
        assertThat(adHocOperationalDataRequest.version()).contains(0L)
    }
}
