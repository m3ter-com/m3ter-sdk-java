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
}
