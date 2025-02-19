// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdHocUsageDataRequestTest {

    @Test
    fun createAdHocUsageDataRequest() {
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
        assertThat(adHocUsageDataRequest).isNotNull
        assertThat(adHocUsageDataRequest.aggregationFrequency())
            .isEqualTo(AdHocUsageDataRequest.AggregationFrequency.ORIGINAL)
        assertThat(adHocUsageDataRequest.sourceType())
            .isEqualTo(AdHocUsageDataRequest.SourceType.USAGE)
        assertThat(adHocUsageDataRequest.accountIds().get()).containsExactly("string")
        assertThat(adHocUsageDataRequest.aggregation())
            .contains(AdHocUsageDataRequest.Aggregation.SUM)
        assertThat(adHocUsageDataRequest.meterIds().get()).containsExactly("string")
        assertThat(adHocUsageDataRequest.timePeriod())
            .contains(AdHocUsageDataRequest.TimePeriod.TODAY)
        assertThat(adHocUsageDataRequest.version()).contains(0L)
    }
}
