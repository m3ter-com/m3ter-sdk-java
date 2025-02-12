// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.DebitReason
import com.m3ter.sdk.models.DebitReasonCreateParams
import com.m3ter.sdk.models.DebitReasonDeleteParams
import com.m3ter.sdk.models.DebitReasonListParams
import com.m3ter.sdk.models.DebitReasonListResponse
import com.m3ter.sdk.models.DebitReasonRetrieveParams
import com.m3ter.sdk.models.DebitReasonUpdateParams
import java.util.concurrent.CompletableFuture

interface DebitReasonServiceAsync {

    /**
     * Create a new Debit Reason for your Organization. When you've created a Debit Reason, it
     * becomes available as a debit type for adding Debit line items to Bills. See
     * [Debits](https://www.m3ter.com/docs/api#tag/Debits).
     */
    @JvmOverloads
    fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DebitReason>

    /** Retrieve the Debit Reason with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DebitReason>

    /** Update the Debit Reason with the given UUID. */
    @JvmOverloads
    fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DebitReason>

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    @JvmOverloads
    fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DebitReasonListResponse>

    /** Delete the Debit Reason with the given UUID. */
    @JvmOverloads
    fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DebitReason>
}
