// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CreditReason
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListPageAsync
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams
import java.util.concurrent.CompletableFuture

interface CreditReasonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Credit Reason for your Organization. When you've created a Credit Reason, it
     * becomes available as a credit type for adding Credit line items to Bills. See
     * [Credits](https://www.m3ter.com/docs/api#tag/Credits).
     */
    @JvmOverloads
    fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReason>

    /** Retrieve the Credit Reason with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReason>

    /** Update the Credit Reason with the given UUID. */
    @JvmOverloads
    fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReason>

    /**
     * Retrieve a list of the Credit Reason entities created for your Organization. You can filter
     * the list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive
     * status.
     */
    @JvmOverloads
    fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonListPageAsync>

    /** Delete the Credit Reason with the given UUID. */
    @JvmOverloads
    fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReason>

    /**
     * A view of [CreditReasonServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/creditreasons`,
         * but is otherwise the same as [CreditReasonServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReason>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReason>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReason>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/creditreasons`, but
         * is otherwise the same as [CreditReasonServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CreditReasonListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReason>>
    }
}
