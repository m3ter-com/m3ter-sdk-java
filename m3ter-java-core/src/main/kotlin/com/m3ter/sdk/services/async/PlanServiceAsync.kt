// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.Plan
import com.m3ter.sdk.models.PlanCreateParams
import com.m3ter.sdk.models.PlanDeleteParams
import com.m3ter.sdk.models.PlanListPageAsync
import com.m3ter.sdk.models.PlanListParams
import com.m3ter.sdk.models.PlanRetrieveParams
import com.m3ter.sdk.models.PlanUpdateParams
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Plan. */
    @JvmOverloads
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** Retrieve the Plan with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /**
     * Update the Plan with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update
     * the Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
    @JvmOverloads
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /** Delete the Plan with the given UUID. */
    @JvmOverloads
    fun delete(
        params: PlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Plan>

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plans/{id}`, but is
         * otherwise the same as [PlanServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Plan>>
    }
}
