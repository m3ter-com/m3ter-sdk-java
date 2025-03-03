// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
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
}
