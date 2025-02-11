// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.CreditReason
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonListResponse
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams

interface CreditReasonService {

    /**
     * Create a new Credit Reason for your Organization. When you've created a Credit Reason, it
     * becomes available as a credit type for adding Credit line items to Bills. See
     * [Credits](https://www.m3ter.com/docs/api#tag/Credits).
     */
    @JvmOverloads
    fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreditReason

    /** Retrieve the Credit Reason with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreditReason

    /** Update the Credit Reason with the given UUID. */
    @JvmOverloads
    fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreditReason

    /**
     * Retrieve a list of the Credit Reason entities created for your Organization. You can filter
     * the list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive
     * status.
     */
    @JvmOverloads
    fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreditReasonListResponse

    /** Delete the Credit Reason with the given UUID. */
    @JvmOverloads
    fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CreditReason
}
