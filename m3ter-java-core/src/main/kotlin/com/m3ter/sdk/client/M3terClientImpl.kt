// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.getPackageVersion
import com.m3ter.sdk.services.blocking.AggregationService
import com.m3ter.sdk.services.blocking.AggregationServiceImpl
import com.m3ter.sdk.services.blocking.AuthenticationService
import com.m3ter.sdk.services.blocking.AuthenticationServiceImpl
import com.m3ter.sdk.services.blocking.CompoundAggregationService
import com.m3ter.sdk.services.blocking.CompoundAggregationServiceImpl
import com.m3ter.sdk.services.blocking.CounterService
import com.m3ter.sdk.services.blocking.CounterServiceImpl
import com.m3ter.sdk.services.blocking.MeterService
import com.m3ter.sdk.services.blocking.MeterServiceImpl
import com.m3ter.sdk.services.blocking.ProductService
import com.m3ter.sdk.services.blocking.ProductServiceImpl

class M3terClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : M3terClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: M3terClientAsync by lazy { M3terClientAsyncImpl(clientOptions) }

    private val authentication: AuthenticationService by lazy {
        AuthenticationServiceImpl(clientOptionsWithUserAgent)
    }

    private val aggregations: AggregationService by lazy {
        AggregationServiceImpl(clientOptionsWithUserAgent)
    }

    private val compoundAggregations: CompoundAggregationService by lazy {
        CompoundAggregationServiceImpl(clientOptionsWithUserAgent)
    }

    private val counters: CounterService by lazy { CounterServiceImpl(clientOptionsWithUserAgent) }

    private val meters: MeterService by lazy { MeterServiceImpl(clientOptionsWithUserAgent) }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): M3terClientAsync = async

    override fun authentication(): AuthenticationService = authentication

    override fun aggregations(): AggregationService = aggregations

    override fun compoundAggregations(): CompoundAggregationService = compoundAggregations

    override fun counters(): CounterService = counters

    override fun meters(): MeterService = meters

    override fun products(): ProductService = products
}
