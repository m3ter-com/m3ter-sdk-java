// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.services.async.AggregationServiceAsync
import com.m3ter.sdk.services.async.AuthenticationServiceAsync
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsync
import com.m3ter.sdk.services.async.CounterServiceAsync
import com.m3ter.sdk.services.async.MeterServiceAsync
import com.m3ter.sdk.services.async.ProductServiceAsync

interface M3terClientAsync {

    fun sync(): M3terClient

    fun authentication(): AuthenticationServiceAsync

    fun aggregations(): AggregationServiceAsync

    fun compoundAggregations(): CompoundAggregationServiceAsync

    fun counters(): CounterServiceAsync

    fun meters(): MeterServiceAsync

    fun products(): ProductServiceAsync
}
