// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventConfigurationUpdateParamsTest {

    @Test
    fun create() {
        ScheduledEventConfigurationUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .entity("Bill")
            .field("endDate")
            .name("scheduled.bill.enddateEvent")
            .offset(5)
            .version(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ScheduledEventConfigurationUpdateParams.builder()
                .id("id")
                .entity("Bill")
                .field("endDate")
                .name("scheduled.bill.enddateEvent")
                .offset(5)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ScheduledEventConfigurationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .entity("Bill")
                .field("endDate")
                .name("scheduled.bill.enddateEvent")
                .offset(5)
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.entity()).isEqualTo("Bill")
        assertThat(body.field()).isEqualTo("endDate")
        assertThat(body.name()).isEqualTo("scheduled.bill.enddateEvent")
        assertThat(body.offset()).isEqualTo(5)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScheduledEventConfigurationUpdateParams.builder()
                .id("id")
                .entity("Bill")
                .field("endDate")
                .name("scheduled.bill.enddateEvent")
                .offset(5)
                .build()

        val body = params._body()

        assertThat(body.entity()).isEqualTo("Bill")
        assertThat(body.field()).isEqualTo("endDate")
        assertThat(body.name()).isEqualTo("scheduled.bill.enddateEvent")
        assertThat(body.offset()).isEqualTo(5)
    }
}
