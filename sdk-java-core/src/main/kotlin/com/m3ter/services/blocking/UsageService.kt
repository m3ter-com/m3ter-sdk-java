// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DownloadUrlResponse
import com.m3ter.models.SubmitMeasurementsRequest
import com.m3ter.models.SubmitMeasurementsResponse
import com.m3ter.models.UsageGetFailedIngestDownloadUrlParams
import com.m3ter.models.UsageQueryParams
import com.m3ter.models.UsageQueryResponse
import com.m3ter.models.UsageSubmitParams
import com.m3ter.services.blocking.usage.FileUploadService
import java.util.function.Consumer

interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    fun fileUploads(): FileUploadService

    /**
     * Returns a presigned download URL for failed ingest file download based on the file path
     * provided.
     *
     * If a usage data ingest measurement you submit to the m3ter platform fails, an
     * `ingest.validation.failure` Event is generated. Use this call to obtain a download URL which
     * you can then use to download a file containing details of what went wrong with the attempted
     * usage data measurement ingest, and allowing you to follow-up and resolve the issue.
     *
     * To obtain the `file` query parameter:
     * - Use the [List Events](https://www.m3ter.com/docs/api#tag/Events/operation/ListEventFields)
     *   call with the `ingest.validation.failure` for the `eventName` query parameter.
     * - The response contains a `getDownloadUrl` response parameter and this contains the file path
     *   you can use to obtain the failed ingest file download URL.
     *
     * **Notes:**
     * - The presigned Url returned to use for failed ingest file download is time-bound and expires
     *   after 5 minutes.
     * - If you make a List Events call for `ingest.validation.failure` Events in your Organization,
     *   then you can perform this **GET** call using the full URL returned for any ingest failure
     *   Event to obtain a failed ingest file download URL for the Event.
     */
    fun getFailedIngestDownloadUrl(): DownloadUrlResponse =
        getFailedIngestDownloadUrl(UsageGetFailedIngestDownloadUrlParams.none())

    /** @see getFailedIngestDownloadUrl */
    fun getFailedIngestDownloadUrl(
        params: UsageGetFailedIngestDownloadUrlParams =
            UsageGetFailedIngestDownloadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DownloadUrlResponse

    /** @see getFailedIngestDownloadUrl */
    fun getFailedIngestDownloadUrl(
        params: UsageGetFailedIngestDownloadUrlParams = UsageGetFailedIngestDownloadUrlParams.none()
    ): DownloadUrlResponse = getFailedIngestDownloadUrl(params, RequestOptions.none())

    /** @see getFailedIngestDownloadUrl */
    fun getFailedIngestDownloadUrl(requestOptions: RequestOptions): DownloadUrlResponse =
        getFailedIngestDownloadUrl(UsageGetFailedIngestDownloadUrlParams.none(), requestOptions)

    /**
     * Query and filter usage data collected for your Organization.
     *
     * You can use several parameters to filter the range of usage data returned:
     * - **Time period.** Use `startDate` and `endDate` to define a period. The query references the
     *   `timestamp` values of usage data submissions for applying the defined time period, and not
     *   the time submissions were `receivedAt` by the platform. Only usage data with a `timestamp`
     *   that falls in the defined time period are returned.(Required)
     * - **Meters.** Specify the Meters you want the query to return data for.
     * - **Accounts.** Specify the Accounts you want the query to return data for.
     * - **Dimension Filters.** Specify values for Dimension data fields on included Meters. Only
     *   data that match the specified Dimension field values will be returned for the query.
     *
     * You can apply Aggregations functions to the usage data returned for the query. If you apply
     * Aggregations, you can select to group the data by:
     * - **Account**
     * - **Time**
     * - **Dimension**
     */
    fun query(): UsageQueryResponse = query(UsageQueryParams.none())

    /** @see query */
    fun query(
        params: UsageQueryParams = UsageQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageQueryResponse

    /** @see query */
    fun query(params: UsageQueryParams = UsageQueryParams.none()): UsageQueryResponse =
        query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): UsageQueryResponse =
        query(UsageQueryParams.none(), requestOptions)

    /**
     * Submit a measurement or multiple measurements to the m3ter platform. The maximum size of the
     * payload needs to be less than 512,000 bytes.
     *
     * **NOTES:**
     * - **Non-existent Accounts.** The `account` request parameter is required. However, if you
     *   want to submit a usage data measurement for an Account which does not yet exist in your
     *   Organization, you can use an `account` code for a non-existent Account. A new skeleton
     *   Account will be automatically created. The usage data measurement is accepted and ingested
     *   as data belonging to the new auto-created Account. At a later date, you can edit the
     *   Account's Code,??Name, and??e-mail address. For more details, see
     *   [Submitting Usage Data for Non-Existent Accounts](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-for-non-existent-accounts)
     *   in our main documentation.
     * - **Usage Data Adjustments.** If you need to make corrections for billing retrospectively
     *   against an Account, you can use date/time values in the past for the `ts` (timestamp)
     *   request parameter to submit positive or negative usage data amounts to correct and
     *   reconcile earlier billing anomalies. For more details, see
     *   [Submitting Usage Data Adjustments Using Timestamp](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-adjustments-using-timestamp)
     *   in our main documentation.
     * - **Ingest Validation Failure Events.** After the intial submission of a usage data
     *   measurement to the Ingest API, a data enrichment stage is performed to check for any errors
     *   in the usage data measurement, such as a missing field. If an error is identified, this
     *   might result in the submission being rejected. In these cases, an _ingest validation
     *   failure_ Event is generated, which you can review on the
     *   [Ingest Events](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/reviewing-and-resolving-ingest-events)
     *   page in the Console. See also the [Events](https://www.m3ter.com/docs/api#tag/Events)
     *   section in this API Reference.
     *
     * **IMPORTANT! - Use of PII:** The use of any of your end-customers' Personally Identifiable
     * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please
     * ensure that any measurements you submit do not contain any end-customer PII data. See the
     * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
     * details.
     */
    fun submit(params: UsageSubmitParams): SubmitMeasurementsResponse =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: UsageSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubmitMeasurementsResponse

    /** @see submit */
    fun submit(
        submitMeasurementsRequest: SubmitMeasurementsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubmitMeasurementsResponse =
        submit(
            UsageSubmitParams.builder()
                .submitMeasurementsRequest(submitMeasurementsRequest)
                .build(),
            requestOptions,
        )

    /** @see submit */
    fun submit(submitMeasurementsRequest: SubmitMeasurementsRequest): SubmitMeasurementsResponse =
        submit(submitMeasurementsRequest, RequestOptions.none())

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        fun fileUploads(): FileUploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/measurements/failedIngest/getDownloadUrl`, but is otherwise the
         * same as [UsageService.getFailedIngestDownloadUrl].
         */
        @MustBeClosed
        fun getFailedIngestDownloadUrl(): HttpResponseFor<DownloadUrlResponse> =
            getFailedIngestDownloadUrl(UsageGetFailedIngestDownloadUrlParams.none())

        /** @see getFailedIngestDownloadUrl */
        @MustBeClosed
        fun getFailedIngestDownloadUrl(
            params: UsageGetFailedIngestDownloadUrlParams =
                UsageGetFailedIngestDownloadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DownloadUrlResponse>

        /** @see getFailedIngestDownloadUrl */
        @MustBeClosed
        fun getFailedIngestDownloadUrl(
            params: UsageGetFailedIngestDownloadUrlParams =
                UsageGetFailedIngestDownloadUrlParams.none()
        ): HttpResponseFor<DownloadUrlResponse> =
            getFailedIngestDownloadUrl(params, RequestOptions.none())

        /** @see getFailedIngestDownloadUrl */
        @MustBeClosed
        fun getFailedIngestDownloadUrl(
            requestOptions: RequestOptions
        ): HttpResponseFor<DownloadUrlResponse> =
            getFailedIngestDownloadUrl(UsageGetFailedIngestDownloadUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/usage/query`, but is
         * otherwise the same as [UsageService.query].
         */
        @MustBeClosed
        fun query(): HttpResponseFor<UsageQueryResponse> = query(UsageQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: UsageQueryParams = UsageQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(
            params: UsageQueryParams = UsageQueryParams.none()
        ): HttpResponseFor<UsageQueryResponse> = query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<UsageQueryResponse> =
            query(UsageQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/measurements`, but is
         * otherwise the same as [UsageService.submit].
         */
        @MustBeClosed
        fun submit(params: UsageSubmitParams): HttpResponseFor<SubmitMeasurementsResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: UsageSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubmitMeasurementsResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(
            submitMeasurementsRequest: SubmitMeasurementsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubmitMeasurementsResponse> =
            submit(
                UsageSubmitParams.builder()
                    .submitMeasurementsRequest(submitMeasurementsRequest)
                    .build(),
                requestOptions,
            )

        /** @see submit */
        @MustBeClosed
        fun submit(
            submitMeasurementsRequest: SubmitMeasurementsRequest
        ): HttpResponseFor<SubmitMeasurementsResponse> =
            submit(submitMeasurementsRequest, RequestOptions.none())
    }
}
