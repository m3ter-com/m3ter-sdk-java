// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdHocUsageDataRequestTest {

    @Test
    fun create() {
        val adHocUsageDataRequest =
            AdHocUsageDataRequest.builder()
                .aggregationFrequency(AdHocUsageDataRequest.AggregationFrequency.ORIGINAL)
                .sourceType(AdHocUsageDataRequest.SourceType.USAGE)
                .addAccountId("string")
                .aggregation(AdHocUsageDataRequest.Aggregation.SUM)
                .addMeterId("string")
                .timePeriod(AdHocUsageDataRequest.TimePeriod.TODAY)
                .version(0L)
                .build()

        assertThat(adHocUsageDataRequest.aggregationFrequency())
            .isEqualTo(AdHocUsageDataRequest.AggregationFrequency.ORIGINAL)
        assertThat(adHocUsageDataRequest.sourceType())
            .isEqualTo(AdHocUsageDataRequest.SourceType.USAGE)
        assertThat(adHocUsageDataRequest.accountIds().getOrNull()).containsExactly("string")
        assertThat(adHocUsageDataRequest.aggregation())
            .contains(AdHocUsageDataRequest.Aggregation.SUM)
        assertThat(adHocUsageDataRequest.meterIds().getOrNull()).containsExactly("string")
        assertThat(adHocUsageDataRequest.timePeriod())
            .contains(AdHocUsageDataRequest.TimePeriod.TODAY)
        assertThat(adHocUsageDataRequest.version()).contains(0L)
    }
}
