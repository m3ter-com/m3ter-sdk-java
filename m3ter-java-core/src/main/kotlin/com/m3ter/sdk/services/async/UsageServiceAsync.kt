// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DownloadUrlResponse
import com.m3ter.sdk.models.SubmitMeasurementsResponse
import com.m3ter.sdk.models.UsageGetFailedIngestDownloadUrlParams
import com.m3ter.sdk.models.UsageQueryParams
import com.m3ter.sdk.models.UsageQueryResponse
import com.m3ter.sdk.models.UsageSubmitParams
import com.m3ter.sdk.services.async.usage.FileUploadServiceAsync
import java.util.concurrent.CompletableFuture

interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun fileUploads(): FileUploadServiceAsync

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
    @JvmOverloads
    fun getFailedIngestDownloadUrl(
        params: UsageGetFailedIngestDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DownloadUrlResponse>

    /** Query and filter usage data */
    @JvmOverloads
    fun query(
        params: UsageQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageQueryResponse>

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
     *   [Submittting Usage Data for Non-Existent Accounts](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-for-non-existent-accounts)
     *   in our main documentation.
     * - **Usage Data Adjustments.** If you need to make corrections for billing retrospectively
     *   against an Account, you can use date/time values in the past for the `ts` (timestamp)
     *   request parameter to submit positive or negative usage data amounts to correct and
     *   reconcile earlier billing anomalies. For more details, see
     *   [Submittting Usage Data Adjustments Using Timestamp](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-adjustments-using-timestamp)
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
    @JvmOverloads
    fun submit(
        params: UsageSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubmitMeasurementsResponse>

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun fileUploads(): FileUploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/measurements/failedIngest/getDownloadUrl`, but is otherwise the
         * same as [UsageServiceAsync.getFailedIngestDownloadUrl].
         */
        @JvmOverloads
        @MustBeClosed
        fun getFailedIngestDownloadUrl(
            params: UsageGetFailedIngestDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DownloadUrlResponse>>

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/usage/query`, but is
         * otherwise the same as [UsageServiceAsync.query].
         */
        @JvmOverloads
        @MustBeClosed
        fun query(
            params: UsageQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageQueryResponse>>

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/measurements`, but is
         * otherwise the same as [UsageServiceAsync.submit].
         */
        @JvmOverloads
        @MustBeClosed
        fun submit(
            params: UsageSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubmitMeasurementsResponse>>
    }
}
