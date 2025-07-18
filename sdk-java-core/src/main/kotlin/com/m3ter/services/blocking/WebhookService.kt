// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.Webhook
import com.m3ter.models.WebhookCreateParams
import com.m3ter.models.WebhookDeleteParams
import com.m3ter.models.WebhookListPage
import com.m3ter.models.WebhookListParams
import com.m3ter.models.WebhookRetrieveParams
import com.m3ter.models.WebhookSetActiveParams
import com.m3ter.models.WebhookUpdateParams
import java.util.function.Consumer

interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /**
     * This endpoint creates a new webhook destination. A webhook destination is a URL where webhook
     * payloads will be sent.
     */
    fun create(params: WebhookCreateParams): Webhook = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** Retrieve the webhook Destination for the UUID. */
    fun retrieve(id: String): Webhook = retrieve(id, WebhookRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): Webhook = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** @see [retrieve] */
    fun retrieve(params: WebhookRetrieveParams): Webhook = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): Webhook =
        retrieve(id, WebhookRetrieveParams.none(), requestOptions)

    /** Update a destination to be used for a webhook. */
    fun update(id: String, params: WebhookUpdateParams): Webhook =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: WebhookUpdateParams): Webhook = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

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
    fun delete(id: String): Webhook = delete(id, WebhookDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(id: String, params: WebhookDeleteParams = WebhookDeleteParams.none()): Webhook =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** @see [delete] */
    fun delete(params: WebhookDeleteParams): Webhook = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): Webhook =
        delete(id, WebhookDeleteParams.none(), requestOptions)

    /**
     * Set the `active` status on a webhook integration destination.
     *
     * Use this endpoint to activate or deactivate a webhook integration destination. It toggles the
     * `active` status of the specific wehbook destination with the given ID.
     */
    fun setActive(id: String): Webhook = setActive(id, WebhookSetActiveParams.none())

    /** @see [setActive] */
    fun setActive(
        id: String,
        params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook = setActive(params.toBuilder().id(id).build(), requestOptions)

    /** @see [setActive] */
    fun setActive(
        id: String,
        params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
    ): Webhook = setActive(id, params, RequestOptions.none())

    /** @see [setActive] */
    fun setActive(
        params: WebhookSetActiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Webhook

    /** @see [setActive] */
    fun setActive(params: WebhookSetActiveParams): Webhook =
        setActive(params, RequestOptions.none())

    /** @see [setActive] */
    fun setActive(id: String, requestOptions: RequestOptions): Webhook =
        setActive(id, WebhookSetActiveParams.none(), requestOptions)

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationdestinations/webhooks`, but is otherwise the same as
         * [WebhookService.create].
         */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<Webhook> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Webhook> =
            retrieve(id, WebhookRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): HttpResponseFor<Webhook> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): HttpResponseFor<Webhook> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Webhook> =
            retrieve(id, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}`, but is otherwise the same
         * as [WebhookService.update].
         */
        @MustBeClosed
        fun update(id: String, params: WebhookUpdateParams): HttpResponseFor<Webhook> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<Webhook> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

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
        fun delete(id: String): HttpResponseFor<Webhook> = delete(id, WebhookDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): HttpResponseFor<Webhook> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponseFor<Webhook> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<Webhook> =
            delete(id, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/integrationdestinations/webhooks/{id}/active`, but is otherwise
         * the same as [WebhookService.setActive].
         */
        @MustBeClosed
        fun setActive(id: String): HttpResponseFor<Webhook> =
            setActive(id, WebhookSetActiveParams.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            id: String,
            params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook> = setActive(params.toBuilder().id(id).build(), requestOptions)

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            id: String,
            params: WebhookSetActiveParams = WebhookSetActiveParams.none(),
        ): HttpResponseFor<Webhook> = setActive(id, params, RequestOptions.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(
            params: WebhookSetActiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Webhook>

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(params: WebhookSetActiveParams): HttpResponseFor<Webhook> =
            setActive(params, RequestOptions.none())

        /** @see [setActive] */
        @MustBeClosed
        fun setActive(id: String, requestOptions: RequestOptions): HttpResponseFor<Webhook> =
            setActive(id, WebhookSetActiveParams.none(), requestOptions)
    }
}
