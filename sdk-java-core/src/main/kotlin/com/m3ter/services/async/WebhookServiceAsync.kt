// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.Webhook
import com.m3ter.models.WebhookCreateParams
import com.m3ter.models.WebhookCreateResponse
import com.m3ter.models.WebhookDeleteParams
import com.m3ter.models.WebhookListPageAsync
import com.m3ter.models.WebhookListParams
import com.m3ter.models.WebhookRetrieveParams
import com.m3ter.models.WebhookSetActiveParams
import com.m3ter.models.WebhookSetActiveResponse
import com.m3ter.models.WebhookUpdateParams
import com.m3ter.models.WebhookUpdateResponse
import java.util.concurrent.CompletableFuture

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint creates a new webhook destination. A webhook destination is a URL where webhook
     * payloads will be sent.
     */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookCreateResponse>

    /** Retrieve the webhook Destination for the UUID. */
    fun retrieve(id: String): CompletableFuture<Webhook> =
        retrieve(id, WebhookRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): CompletableFuture<Webhook> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** @see [retrieve] */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<Webhook> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Webhook> =
        retrieve(id, WebhookRetrieveParams.none(), requestOptions)

    /** Update a destination to be used for a webhook. */
    fun update(id: String, params: WebhookUpdateParams): CompletableFuture<WebhookUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookUpdateResponse>

    /** Retrieve a list of all Destinations created in the Organization. */
    fun list(): CompletableFuture<WebhookListPageAsync> = list(WebhookListParams.none())

    /** @see [list] */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListPageAsync>

    /** @see [list] */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<WebhookListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookListPageAsync> =
        list(WebhookListParams.none(), requestOptions)

    /** This endpoint deletes a specific webhook destination identified by its UUID. */
    fun delete(id: String): CompletableFuture<Webhook> = delete(id, WebhookDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<Webhook> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Webhook>

    /** @see [delete] */
    fun delete(params: WebhookDeleteParams): CompletableFuture<Webhook> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Webhook> =
        delete(id, WebhookDeleteParams.none(), requestOptions)

    /**
     * Set the `active` status on a webhook integration destination.
     *
     * Use this endpoint to activate or deactivate a webhook integration destination. It toggles the
     * `active` status of the specific wehbook destination with the given ID.
     */
    fun setActive(id: String): CompletableFuture<WebhookSetActiveResponse> =
        setActive(id, WebhookSetActiveParams.none())

    /** @see [setActive] */
    fun setActive(
        id: String,
        params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookSetActiveResponse> =
        setActive(params.toBuilder().id(id).build(), requestOptions)

    /** @see [setActive] */
    fun setActive(
        id: String,
        params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
    ): CompletableFuture<WebhookSetActiveResponse> = setActive(id, params, RequestOptions.none())

    /** @see [setActive] */
    fun setActive(
        params: WebhookSetActiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookSetActiveResponse>

    /** @see [setActive] */
    fun setActive(params: WebhookSetActiveParams): CompletableFuture<WebhookSetActiveResponse> =
        setActive(params, RequestOptions.none())

    /** @see [setActive] */
    fun setActive(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookSetActiveResponse> =
        setActive(id, WebhookSetActiveParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationdestinations/webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(id, WebhookRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            retrieve(id, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams,
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationdestinations/webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(WebhookListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponseFor<Webhook>> =
            delete(id, WebhookDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Webhook>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): CompletableFuture<HttpResponseFor<Webhook>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Webhook>> =
            delete(id, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}/active`, but is otherwise
         * the same as [WebhookServiceAsync.setActive].
         */
        @MustBeClosed
        fun setActive(id: String): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>> =
            setActive(id, WebhookSetActiveParams.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            id: String,
            params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>> =
            setActive(params.toBuilder().id(id).build(), requestOptions)

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            id: String,
            params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>> =
            setActive(id, params, RequestOptions.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            params: WebhookSetActiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>>

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            params: WebhookSetActiveParams
        ): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>> =
            setActive(params, RequestOptions.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookSetActiveResponse>> =
            setActive(id, WebhookSetActiveParams.none(), requestOptions)
    }
}
