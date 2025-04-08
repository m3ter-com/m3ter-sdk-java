// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.MeterCreateParams
import com.m3ter.models.MeterDeleteParams
import com.m3ter.models.MeterListPage
import com.m3ter.models.MeterListParams
import com.m3ter.models.MeterResponse
import com.m3ter.models.MeterRetrieveParams
import com.m3ter.models.MeterUpdateParams

interface MeterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Meter.
     *
     * When you create a Meter, you can define two types of field for usage data collection and
     * ingest into the platform:
     * - `dataFields` to collect raw usage data measures - numeric quantitative data values or
     *   non-numeric point data values.
     * - `derivedFields` to derive usage data measures that are the result of applying a calculation
     *   to `dataFields`, `customFields`, or system `Timestamp` fields.
     *
     * You can also:
     * - Create `customFields` for a Meter, which allows you to attach custom data to the Meter as
     *   name/value pairs.
     * - Create Global Meters, which are not tied to a specific Product and allow you collect to
     *   usage data that will form the basis of usage-based pricing across more than one of your
     *   Products.
     *
     * **IMPORTANT! - use of PII:** The use of any of your end-customers' Personally Identifiable
     * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please
     * ensure that any fields you configure for Meters, such as Data Fields or Derived Fields, do
     * not contain any end-customer PII data. See the
     * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
     * details.
     *
     * See also:
     * - [Reviewing Meter
     *   Options](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/reviewing-meter-options).
     */
    fun create(params: MeterCreateParams): MeterResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterResponse

    /** Retrieve the Meter with the given UUID. */
    fun retrieve(params: MeterRetrieveParams): MeterResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterResponse

    /**
     * Update the Meter with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update
     * the Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    fun update(params: MeterUpdateParams): MeterResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: MeterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterResponse

    /** Retrieve a list of Meters that can be filtered by Product, Meter ID, or Meter short code. */
    fun list(): MeterListPage = list(MeterListParams.none())

    /** @see [list] */
    fun list(
        params: MeterListParams = MeterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterListPage

    /** @see [list] */
    fun list(params: MeterListParams = MeterListParams.none()): MeterListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): MeterListPage =
        list(MeterListParams.none(), requestOptions)

    /** Delete the Meter with the given UUID. */
    fun delete(params: MeterDeleteParams): MeterResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: MeterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeterResponse

    /** A view of [MeterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/meters`, but is otherwise
         * the same as [MeterService.create].
         */
        @MustBeClosed
        fun create(params: MeterCreateParams): HttpResponseFor<MeterResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: MeterRetrieveParams): HttpResponseFor<MeterResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterService.update].
         */
        @MustBeClosed
        fun update(params: MeterUpdateParams): HttpResponseFor<MeterResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: MeterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/meters`, but is otherwise the
         * same as [MeterService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<MeterListPage> = list(MeterListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MeterListParams = MeterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: MeterListParams = MeterListParams.none()): HttpResponseFor<MeterListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeterListPage> =
            list(MeterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterService.delete].
         */
        @MustBeClosed
        fun delete(params: MeterDeleteParams): HttpResponseFor<MeterResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: MeterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeterResponse>
    }
}
