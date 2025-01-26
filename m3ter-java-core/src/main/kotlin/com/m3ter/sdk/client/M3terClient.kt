// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.services.blocking.AggregationService
import com.m3ter.sdk.services.blocking.AuthenticationService
import com.m3ter.sdk.services.blocking.CompoundAggregationService
import com.m3ter.sdk.services.blocking.CounterService
import com.m3ter.sdk.services.blocking.MeterService
import com.m3ter.sdk.services.blocking.ProductService

interface M3terClient {

    fun async(): M3terClientAsync

    fun authentication(): AuthenticationService

    fun aggregations(): AggregationService

    fun compoundAggregations(): CompoundAggregationService

    fun counters(): CounterService

    fun meters(): MeterService

    fun products(): ProductService

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
