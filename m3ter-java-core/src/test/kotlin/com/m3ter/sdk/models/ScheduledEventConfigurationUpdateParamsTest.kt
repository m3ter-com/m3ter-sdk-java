// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScheduledEventConfigurationUpdateParamsTest {

    @Test
    fun create() {
        ScheduledEventConfigurationUpdateParams.builder()
            .orgId("orgId")
            .id("id")
            .entity("Bill")
            .field("endDate")
            .name("scheduled.bill.enddateEvent")
            .offset(5L)
            .version(0L)
            .build()
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
                .offset(5L)
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entity()).isEqualTo("Bill")
        assertThat(body.field()).isEqualTo("endDate")
        assertThat(body.name()).isEqualTo("scheduled.bill.enddateEvent")
        assertThat(body.offset()).isEqualTo(5L)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScheduledEventConfigurationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .entity("Bill")
                .field("endDate")
                .name("scheduled.bill.enddateEvent")
                .offset(5L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entity()).isEqualTo("Bill")
        assertThat(body.field()).isEqualTo("endDate")
        assertThat(body.name()).isEqualTo("scheduled.bill.enddateEvent")
        assertThat(body.offset()).isEqualTo(5L)
    }

    @Test
    fun getPathParam() {
        val params =
            ScheduledEventConfigurationUpdateParams.builder()
                .orgId("orgId")
                .id("id")
                .entity("Bill")
                .field("endDate")
                .name("scheduled.bill.enddateEvent")
                .offset(5L)
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
