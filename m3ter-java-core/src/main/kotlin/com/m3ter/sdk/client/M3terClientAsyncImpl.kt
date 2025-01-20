// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.getPackageVersion
import com.m3ter.sdk.services.async.AggregationServiceAsync
import com.m3ter.sdk.services.async.AggregationServiceAsyncImpl
import com.m3ter.sdk.services.async.AuthenticationServiceAsync
import com.m3ter.sdk.services.async.AuthenticationServiceAsyncImpl
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsync
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsyncImpl
import com.m3ter.sdk.services.async.CounterServiceAsync
import com.m3ter.sdk.services.async.CounterServiceAsyncImpl
import com.m3ter.sdk.services.async.MeterServiceAsync
import com.m3ter.sdk.services.async.MeterServiceAsyncImpl
import com.m3ter.sdk.services.async.ProductServiceAsync
import com.m3ter.sdk.services.async.ProductServiceAsyncImpl

class M3terClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : M3terClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: M3terClient by lazy { M3terClientImpl(clientOptions) }

    private val authentication: AuthenticationServiceAsync by lazy {
        AuthenticationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aggregations: AggregationServiceAsync by lazy {
        AggregationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val compoundAggregations: CompoundAggregationServiceAsync by lazy {
        CompoundAggregationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val counters: CounterServiceAsync by lazy {
        CounterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val meters: MeterServiceAsync by lazy {
        MeterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val products: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): M3terClient = sync

    override fun authentication(): AuthenticationServiceAsync = authentication

    override fun aggregations(): AggregationServiceAsync = aggregations

    override fun compoundAggregations(): CompoundAggregationServiceAsync = compoundAggregations

    override fun counters(): CounterServiceAsync = counters

    override fun meters(): MeterServiceAsync = meters

    override fun products(): ProductServiceAsync = products
}
