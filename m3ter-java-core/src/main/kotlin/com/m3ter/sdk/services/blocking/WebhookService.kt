// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.Webhook
import com.m3ter.sdk.models.WebhookCreateParams
import com.m3ter.sdk.models.WebhookCreateResponse
import com.m3ter.sdk.models.WebhookDeleteParams
import com.m3ter.sdk.models.WebhookListPage
import com.m3ter.sdk.models.WebhookListParams
import com.m3ter.sdk.models.WebhookRetrieveParams
import com.m3ter.sdk.models.WebhookSetActiveParams
import com.m3ter.sdk.models.WebhookSetActiveResponse
import com.m3ter.sdk.models.WebhookUpdateParams
import com.m3ter.sdk.models.WebhookUpdateResponse

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint creates a new webhook destination. A webhook destination is a URL where webhook
     * payloads will be sent.
     */
    @JvmOverloads
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Retrieve the webhook Destination for the UUID. */
    @JvmOverloads
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** Update a destination to be used for a webhook. */
    @JvmOverloads
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse

    /** Retrieve a list of all Destinations created in the Organization. */
    @JvmOverloads
    fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPage

    /** This endpoint deletes a specific webhook destination identified by its UUID. */
    @JvmOverloads
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /**
     * Set the `active` status on a webhook integration destination.
     *
     * Use this endpoint to activate or deactivate a webhook integration destination. It toggles the
     * `active` status of the specific wehbook destination with the given ID.
     */
    @JvmOverloads
    fun setActive(
        params: WebhookSetActiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookSetActiveResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationdestinations/webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookUpdateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationdestinations/webhooks`, but is otherwise the same as
         * [WebhookService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}/active`, but is otherwise
         * the same as [WebhookService.setActive].
         */
        @JvmOverloads
        @MustBeClosed
        fun setActive(
            params: WebhookSetActiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSetActiveResponse>
    }
}
