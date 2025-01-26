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

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
