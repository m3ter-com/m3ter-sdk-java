// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.ScheduledEventConfiguration
import com.m3ter.sdk.models.ScheduledEventConfigurationCreateParams
import com.m3ter.sdk.models.ScheduledEventConfigurationDeleteParams
import com.m3ter.sdk.models.ScheduledEventConfigurationListPageAsync
import com.m3ter.sdk.models.ScheduledEventConfigurationListParams
import com.m3ter.sdk.models.ScheduledEventConfigurationRetrieveParams
import com.m3ter.sdk.models.ScheduledEventConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface ScheduledEventConfigurationServiceAsync {

    /** Create a new ScheduledEventConfiguration. */
    @JvmOverloads
    fun create(
        params: ScheduledEventConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfiguration>

    /** Retrieve a ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: ScheduledEventConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfiguration>

    /** Update a ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
    fun update(
        params: ScheduledEventConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfiguration>

    /** Retrieve a list of ScheduledEventConfiguration entities */
    @JvmOverloads
    fun list(
        params: ScheduledEventConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfigurationListPageAsync>

    /** Delete the ScheduledEventConfiguration for the given UUID. */
    @JvmOverloads
    fun delete(
        params: ScheduledEventConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledEventConfiguration>
}
