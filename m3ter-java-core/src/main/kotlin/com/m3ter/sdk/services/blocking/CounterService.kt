// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Counter
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterListPage
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams

interface CounterService {

    /** Create a new Counter. */
    @JvmOverloads
    fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Counter

    /** Retrieve a Counter for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Counter

    /** Update Counter for the given UUID. */
    @JvmOverloads
    fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Counter

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    @JvmOverloads
    fun list(
        params: CounterListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CounterListPage
}
