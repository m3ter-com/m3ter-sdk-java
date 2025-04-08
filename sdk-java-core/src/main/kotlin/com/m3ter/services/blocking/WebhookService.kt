// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.Webhook
import com.m3ter.models.WebhookCreateParams
import com.m3ter.models.WebhookCreateResponse
import com.m3ter.models.WebhookDeleteParams
import com.m3ter.models.WebhookListPage
import com.m3ter.models.WebhookListParams
import com.m3ter.models.WebhookRetrieveParams
import com.m3ter.models.WebhookSetActiveParams
import com.m3ter.models.WebhookSetActiveResponse
import com.m3ter.models.WebhookUpdateParams
import com.m3ter.models.WebhookUpdateResponse

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint creates a new webhook destination. A webhook destination is a URL where webhook
     * payloads will be sent.
     */
    fun create(params: WebhookCreateParams): WebhookCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookCreateResponse

    /** Retrieve the webhook Destination for the UUID. */
    fun retrieve(params: WebhookRetrieveParams): Webhook = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** Update a destination to be used for a webhook. */
    fun update(params: WebhookUpdateParams): WebhookUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookUpdateResponse

    /** Retrieve a list of all Destinations created in the Organization. */
    fun list(): WebhookListPage = list(WebhookListParams.none())

    /** @see [list] */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPage

    /** @see [list] */
    fun list(params: WebhookListParams = WebhookListParams.none()): WebhookListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): WebhookListPage =
        list(WebhookListParams.none(), requestOptions)

    /** This endpoint deletes a specific webhook destination identified by its UUID. */
    fun delete(params: WebhookDeleteParams): Webhook = delete(params, RequestOptions.none())

    /** @see [delete] */
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
    fun setActive(params: WebhookSetActiveParams): WebhookSetActiveResponse =
        setActive(params, RequestOptions.none())

    /** @see [setActive] */
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
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<WebhookCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
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
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): HttpResponseFor<Webhook> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
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
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<WebhookUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
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
        @MustBeClosed fun list(): HttpResponseFor<WebhookListPage> = list(WebhookListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): HttpResponseFor<WebhookListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookListPage> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponseFor<Webhook> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
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
        @MustBeClosed
        fun setActive(params: WebhookSetActiveParams): HttpResponseFor<WebhookSetActiveResponse> =
            setActive(params, RequestOptions.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            params: WebhookSetActiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookSetActiveResponse>
    }
}
