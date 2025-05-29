// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.statements

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.StatementJobResponse
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobListPage
import com.m3ter.models.StatementStatementJobListParams
import com.m3ter.models.StatementStatementJobRetrieveParams

interface StatementJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint creates a StatementJob for a single bill within an Organization using the Bill
     * UUID.
     *
     * The Bill Statement is generated asynchronously:
     * - The default format for generating the Statement is in JSON format and according to the Bill
     *   Statement Definition you've specified at either Organization level or Account level.
     * - If you also want to generate the Statement in CSV format, use the `includeCsvFormat`
     *   request body parameter.
     * - The response body provides a time-bound pre-signed URL, which you can use to download the
     *   JSON format Statement.
     * - When you have generated a Statement for a Bill, you can also obtain a time-bound pre-signed
     *   download URL using either the
     *   [Retrieve Bill Statement in JSON Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillJsonStatement)
     *   and
     *   [Retrieve Bill Statement in CSV Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillCsvStatement)
     *   calls found in the [Bill](https://www.m3ter.com/docs/api#tag/Bill) section of this API
     *   Reference.
     *
     * **Notes:**
     * - If the response to the Create StatementJob call shows the `statementJobStatus` as `PENDING`
     *   or `RUNNING`, you will not receive the pre-signed URL in the response. Wait a few minutes
     *   to allow the StatementJob to complete and then use the
     *   [Get StatmentJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/GetStatementJob)
     *   call in this section to obtain the pre-signed download URL for the generated Bill
     *   Statement.
     * - When you have submitted a StatementJob and a Bill Statement has been generated, you can
     *   also download the Statement directly from a Bill Details page in the Console. See
     *   [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
     *   in our user Documentation.
     */
    fun create(params: StatementStatementJobCreateParams): StatementJobResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: StatementStatementJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementJobResponse

    /**
     * Retrieves the details of a specific StatementJob using its UUID.
     *
     * Use this call to obtain the time-bound pre-signed download URL for the generated Bill
     * Statement if the initial
     * [Create StatementJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/CreateStatementJob)
     * returned a response showing the `statementJobStatus` not yet complete and as `PENDING` or
     * `RUNNING`.
     *
     * **Note:** When you have submitted a StatementJob and a Bill Statement has been generated, you
     * can also download the Statement directly from a Bill Details page in the Console. See
     * [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
     * in our user Documentation.
     */
    fun retrieve(id: String): StatementJobResponse =
        retrieve(id, StatementStatementJobRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementJobResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
    ): StatementJobResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: StatementStatementJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementJobResponse

    /** @see [retrieve] */
    fun retrieve(params: StatementStatementJobRetrieveParams): StatementJobResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): StatementJobResponse =
        retrieve(id, StatementStatementJobRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of StatementJobs.
     *
     * Retrieves a list of all StatementJobs for a specific Organization. You can filter the results
     * based on:
     * - StatementJob status.
     * - Whether StatementJob is neither completed nor cancelled but remains active.
     * - The ID of the Bill the StatementJob is associated with.
     *
     * You can also paginate the results for easier management.
     *
     * **WARNING!**
     * - You can use only one of the valid Query parameters: `active`, `status`, or `billId` in any
     *   call. If you use more than one of these Query parameters in the same call, then a 400 Bad
     *   Request is returned with an error message.
     */
    fun list(): StatementStatementJobListPage = list(StatementStatementJobListParams.none())

    /** @see [list] */
    fun list(
        params: StatementStatementJobListParams = StatementStatementJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementStatementJobListPage

    /** @see [list] */
    fun list(
        params: StatementStatementJobListParams = StatementStatementJobListParams.none()
    ): StatementStatementJobListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): StatementStatementJobListPage =
        list(StatementStatementJobListParams.none(), requestOptions)

    /**
     * Cancel the StatementJob with the given UUID.
     *
     * Use this endpoint to halt the execution of a specific StatementJob identified by its UUID.
     * This operation may be useful if you need to stop a StatementJob due to unforeseen issues or
     * changes.
     */
    fun cancel(id: String): StatementJobResponse =
        cancel(id, StatementStatementJobCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        id: String,
        params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementJobResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        id: String,
        params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
    ): StatementJobResponse = cancel(id, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: StatementStatementJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementJobResponse

    /** @see [cancel] */
    fun cancel(params: StatementStatementJobCancelParams): StatementJobResponse =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(id: String, requestOptions: RequestOptions): StatementJobResponse =
        cancel(id, StatementStatementJobCancelParams.none(), requestOptions)

    /**
     * Create a batch of StatementJobs for multiple bills.
     *
     * Initiate the creation of multiple StatementJobs asynchronously for the list of bills with the
     * given UUIDs:
     * - The default format for generating Bill Statements is in JSON format and according to the
     *   Bill Statement Definition you've specified at either Organization level or Account level.
     * - If you also want to generate the Statements in CSV format, use the `includeCsvFormat`
     *   request body parameter.
     * - The response body provides a time-bound pre-signed URL, which you can use to download the
     *   JSON format Statement.
     * - When you have generated a Statement for a Bill, you can also obtain a time-bound pre-signed
     *   download URL using either the
     *   [Retrieve Bill Statement in JSON Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillJsonStatement)
     *   and
     *   [Retrieve Bill Statement in CSV Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillCsvStatement)
     *   calls found in the [Bill](https://www.m3ter.com/docs/api#tag/Bill) section of this API
     *   Reference.
     *
     * **Notes:**
     * - If the response to the Create StatementJob call shows the `statementJobStatus` as `PENDING`
     *   or `RUNNING`, you will not receive the pre-signed URL in the response. Wait a few minutes
     *   to allow the StatementJob to complete and then use the
     *   [Get StatmentJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/GetStatementJob)
     *   call in this section to obtain the pre-signed download URL for the generated Bill
     *   Statement.
     * - When you have submitted a StatementJob and a Bill Statement has been generated, you can
     *   also download the Statement directly from a Bill Details page in the Console. See
     *   [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
     *   in our user Documentation.
     */
    fun createBatch(params: StatementStatementJobCreateBatchParams): List<StatementJobResponse> =
        createBatch(params, RequestOptions.none())

    /** @see [createBatch] */
    fun createBatch(
        params: StatementStatementJobCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<StatementJobResponse>

    /**
     * A view of [StatementJobService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs`, but is
         * otherwise the same as [StatementJobService.create].
         */
        @MustBeClosed
        fun create(
            params: StatementStatementJobCreateParams
        ): HttpResponseFor<StatementJobResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: StatementStatementJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementJobResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementjobs/{id}`, but is
         * otherwise the same as [StatementJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<StatementJobResponse> =
            retrieve(id, StatementStatementJobRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StatementStatementJobRetrieveParams =
                StatementStatementJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementJobResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
        ): HttpResponseFor<StatementJobResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StatementStatementJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementJobResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StatementStatementJobRetrieveParams
        ): HttpResponseFor<StatementJobResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementJobResponse> =
            retrieve(id, StatementStatementJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementjobs`, but is
         * otherwise the same as [StatementJobService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<StatementStatementJobListPage> =
            list(StatementStatementJobListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StatementStatementJobListParams = StatementStatementJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementStatementJobListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StatementStatementJobListParams = StatementStatementJobListParams.none()
        ): HttpResponseFor<StatementStatementJobListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<StatementStatementJobListPage> =
            list(StatementStatementJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs/{id}/cancel`,
         * but is otherwise the same as [StatementJobService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<StatementJobResponse> =
            cancel(id, StatementStatementJobCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            id: String,
            params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementJobResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            id: String,
            params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
        ): HttpResponseFor<StatementJobResponse> = cancel(id, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: StatementStatementJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementJobResponse>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: StatementStatementJobCancelParams
        ): HttpResponseFor<StatementJobResponse> = cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementJobResponse> =
            cancel(id, StatementStatementJobCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs/batch`, but is
         * otherwise the same as [StatementJobService.createBatch].
         */
        @MustBeClosed
        fun createBatch(
            params: StatementStatementJobCreateBatchParams
        ): HttpResponseFor<List<StatementJobResponse>> = createBatch(params, RequestOptions.none())

        /** @see [createBatch] */
        @MustBeClosed
        fun createBatch(
            params: StatementStatementJobCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<StatementJobResponse>>
    }
}
