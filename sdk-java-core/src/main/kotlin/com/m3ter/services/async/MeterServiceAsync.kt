// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.MeterCreateParams
import com.m3ter.models.MeterDeleteParams
import com.m3ter.models.MeterListPageAsync
import com.m3ter.models.MeterListParams
import com.m3ter.models.MeterResponse
import com.m3ter.models.MeterRetrieveParams
import com.m3ter.models.MeterUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeterServiceAsync

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
    fun create(params: MeterCreateParams): CompletableFuture<MeterResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse>

    /** Retrieve the Meter with the given UUID. */
    fun retrieve(id: String): CompletableFuture<MeterResponse> =
        retrieve(id, MeterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MeterRetrieveParams = MeterRetrieveParams.none(),
    ): CompletableFuture<MeterResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse>

    /** @see retrieve */
    fun retrieve(params: MeterRetrieveParams): CompletableFuture<MeterResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<MeterResponse> =
        retrieve(id, MeterRetrieveParams.none(), requestOptions)

    /**
     * Update the Meter with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update
     * the Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    fun update(id: String, params: MeterUpdateParams): CompletableFuture<MeterResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: MeterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: MeterUpdateParams): CompletableFuture<MeterResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MeterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse>

    /** Retrieve a list of Meters that can be filtered by Product, Meter ID, or Meter short code. */
    fun list(): CompletableFuture<MeterListPageAsync> = list(MeterListParams.none())

    /** @see list */
    fun list(
        params: MeterListParams = MeterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterListPageAsync>

    /** @see list */
    fun list(
        params: MeterListParams = MeterListParams.none()
    ): CompletableFuture<MeterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MeterListPageAsync> =
        list(MeterListParams.none(), requestOptions)

    /** Delete the Meter with the given UUID. */
    fun delete(id: String): CompletableFuture<MeterResponse> = delete(id, MeterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MeterDeleteParams = MeterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MeterDeleteParams = MeterDeleteParams.none(),
    ): CompletableFuture<MeterResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MeterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MeterResponse>

    /** @see delete */
    fun delete(params: MeterDeleteParams): CompletableFuture<MeterResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<MeterResponse> =
        delete(id, MeterDeleteParams.none(), requestOptions)

    /** A view of [MeterServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/meters`, but is otherwise
         * the same as [MeterServiceAsync.create].
         */
        fun create(params: MeterCreateParams): CompletableFuture<HttpResponseFor<MeterResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<MeterResponse>> =
            retrieve(id, MeterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MeterRetrieveParams = MeterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MeterRetrieveParams
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            retrieve(id, MeterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterServiceAsync.update].
         */
        fun update(
            id: String,
            params: MeterUpdateParams,
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: MeterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: MeterUpdateParams): CompletableFuture<HttpResponseFor<MeterResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MeterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/meters`, but is otherwise the
         * same as [MeterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(MeterListParams.none())

        /** @see list */
        fun list(
            params: MeterListParams = MeterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>>

        /** @see list */
        fun list(
            params: MeterListParams = MeterListParams.none()
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>> =
            list(MeterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/meters/{id}`, but is
         * otherwise the same as [MeterServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MeterResponse>> =
            delete(id, MeterDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MeterDeleteParams = MeterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MeterDeleteParams = MeterDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MeterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MeterResponse>>

        /** @see delete */
        fun delete(params: MeterDeleteParams): CompletableFuture<HttpResponseFor<MeterResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeterResponse>> =
            delete(id, MeterDeleteParams.none(), requestOptions)
    }
}
