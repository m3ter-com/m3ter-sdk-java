// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Counter
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterListPageAsync
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterServiceAsync {

    /** Create a new Counter. */
    @JvmOverloads
    fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counter>

    /** Retrieve a Counter for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counter>

    /** Update Counter for the given UUID. */
    @JvmOverloads
    fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Counter>

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    @JvmOverloads
    fun list(
        params: CounterListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CounterListPageAsync>
}
