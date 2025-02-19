// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Currency
import com.m3ter.sdk.models.CurrencyCreateParams
import com.m3ter.sdk.models.CurrencyDeleteParams
import com.m3ter.sdk.models.CurrencyListPage
import com.m3ter.sdk.models.CurrencyListParams
import com.m3ter.sdk.models.CurrencyRetrieveParams
import com.m3ter.sdk.models.CurrencyUpdateParams

interface CurrencyService {

    /**
     * Creates a new Currency for the specified Organization.
     *
     * Used to create a Currency that your Organization will start to use.
     */
    @JvmOverloads
    fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Currency

    /**
     * Retrieve the specified Currency with the given UUID. Used to obtain the details of a
     * specified existing Currency in your Organization.
     */
    @JvmOverloads
    fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Currency

    /**
     * Update a Currency with the given UUID.
     *
     * Used to update the attributes of the specified Currency for the specified Organization.
     */
    @JvmOverloads
    fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Currency

    /**
     * Retrieve a list of Currencies.
     *
     * Retrieves a list of Currencies for the specified Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Currencies based on Currency
     * ID, and short codes.
     */
    @JvmOverloads
    fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyListPage

    /**
     * Delete the Currency with the given UUID.
     *
     * Used to remove an existing Currency from your Organization that is no longer required.
     */
    @JvmOverloads
    fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Currency
}
