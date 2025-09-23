// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.statements

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.StatementJobResponse
import com.m3ter.models.StatementStatementJobCancelParams
import com.m3ter.models.StatementStatementJobCreateBatchParams
import com.m3ter.models.StatementStatementJobCreateParams
import com.m3ter.models.StatementStatementJobListPageAsync
import com.m3ter.models.StatementStatementJobListParams
import com.m3ter.models.StatementStatementJobRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatementJobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementJobServiceAsync

    /**
     * This endpoint creates a StatementJob for a single bill within an Organization using the Bill
     * UUID.
     *
     * The Bill Statement is generated asynchronously:
     * * The default format for generating the Statement is in JSON format and according to the Bill
     *   Statement Definition you've specified at either Organization level or Account level.
     * * If you also want to generate the Statement in CSV format, use the `includeCsvFormat`
     *   request body parameter.
     * * The response body provides a time-bound pre-signed URL, which you can use to download the
     *   JSON format Statement.
     * * When you have generated a Statement for a Bill, you can also obtain a time-bound pre-signed
     *   download URL using either the
     *   [Retrieve Bill Statement in JSON Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillJsonStatement)
     *   and
     *   [Retrieve Bill Statement in CSV Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillCsvStatement)
     *   calls found in the [Bill](https://www.m3ter.com/docs/api#tag/Bill) section of this API
     *   Reference.
     *
     * **Notes:**
     * * If the response to the Create StatementJob call shows the `statementJobStatus` as `PENDING`
     *   or `RUNNING`, you will not receive the pre-signed URL in the response. Wait a few minutes
     *   to allow the StatementJob to complete and then use the
     *   [Get StatmentJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/GetStatementJob)
     *   call in this section to obtain the pre-signed download URL for the generated Bill
     *   Statement.
     * * When you have submitted a StatementJob and a Bill Statement has been generated, you can
     *   also download the Statement directly from a Bill Details page in the Console. See
     *   [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
     *   in our user Documentation.
     */
    fun create(params: StatementStatementJobCreateParams): CompletableFuture<StatementJobResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StatementStatementJobCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementJobResponse>

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
    fun retrieve(id: String): CompletableFuture<StatementJobResponse> =
        retrieve(id, StatementStatementJobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementJobResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
    ): CompletableFuture<StatementJobResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatementStatementJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementJobResponse>

    /** @see retrieve */
    fun retrieve(
        params: StatementStatementJobRetrieveParams
    ): CompletableFuture<StatementJobResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementJobResponse> =
        retrieve(id, StatementStatementJobRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of StatementJobs.
     *
     * Retrieves a list of all StatementJobs for a specific Organization. You can filter the results
     * based on:
     * * StatementJob status.
     * * Whether StatementJob is neither completed nor cancelled but remains active.
     * * The ID of the Bill the StatementJob is associated with.
     *
     * You can also paginate the results for easier management.
     *
     * **WARNING!**
     * * You can use only one of the valid Query parameters: `active`, `status`, or `billId` in any
     *   call. If you use more than one of these Query parameters in the same call, then a 400 Bad
     *   Request is returned with an error message.
     */
    fun list(): CompletableFuture<StatementStatementJobListPageAsync> =
        list(StatementStatementJobListParams.none())

    /** @see list */
    fun list(
        params: StatementStatementJobListParams = StatementStatementJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementStatementJobListPageAsync>

    /** @see list */
    fun list(
        params: StatementStatementJobListParams = StatementStatementJobListParams.none()
    ): CompletableFuture<StatementStatementJobListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<StatementStatementJobListPageAsync> =
        list(StatementStatementJobListParams.none(), requestOptions)

    /**
     * Cancel the StatementJob with the given UUID.
     *
     * Use this endpoint to halt the execution of a specific StatementJob identified by its UUID.
     * This operation may be useful if you need to stop a StatementJob due to unforeseen issues or
     * changes.
     */
    fun cancel(id: String): CompletableFuture<StatementJobResponse> =
        cancel(id, StatementStatementJobCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementJobResponse> =
        cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
    ): CompletableFuture<StatementJobResponse> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: StatementStatementJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementJobResponse>

    /** @see cancel */
    fun cancel(params: StatementStatementJobCancelParams): CompletableFuture<StatementJobResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementJobResponse> =
        cancel(id, StatementStatementJobCancelParams.none(), requestOptions)

    /**
     * Create a batch of StatementJobs for multiple bills.
     *
     * Initiate the creation of multiple StatementJobs asynchronously for the list of bills with the
     * given UUIDs:
     * * The default format for generating Bill Statements is in JSON format and according to the
     *   Bill Statement Definition you've specified at either Organization level or Account level.
     * * If you also want to generate the Statements in CSV format, use the `includeCsvFormat`
     *   request body parameter.
     * * The response body provides a time-bound pre-signed URL, which you can use to download the
     *   JSON format Statement.
     * * When you have generated a Statement for a Bill, you can also obtain a time-bound pre-signed
     *   download URL using either the
     *   [Retrieve Bill Statement in JSON Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillJsonStatement)
     *   and
     *   [Retrieve Bill Statement in CSV Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillCsvStatement)
     *   calls found in the [Bill](https://www.m3ter.com/docs/api#tag/Bill) section of this API
     *   Reference.
     *
     * **Notes:**
     * * If the response to the Create StatementJob call shows the `statementJobStatus` as `PENDING`
     *   or `RUNNING`, you will not receive the pre-signed URL in the response. Wait a few minutes
     *   to allow the StatementJob to complete and then use the
     *   [Get StatmentJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/GetStatementJob)
     *   call in this section to obtain the pre-signed download URL for the generated Bill
     *   Statement.
     * * When you have submitted a StatementJob and a Bill Statement has been generated, you can
     *   also download the Statement directly from a Bill Details page in the Console. See
     *   [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
     *   in our user Documentation.
     */
    fun createBatch(
        params: StatementStatementJobCreateBatchParams
    ): CompletableFuture<List<StatementJobResponse>> = createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: StatementStatementJobCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<StatementJobResponse>>

    /**
     * A view of [StatementJobServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementJobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs`, but is
         * otherwise the same as [StatementJobServiceAsync.create].
         */
        fun create(
            params: StatementStatementJobCreateParams
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StatementStatementJobCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementjobs/{id}`, but is
         * otherwise the same as [StatementJobServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            retrieve(id, StatementStatementJobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StatementStatementJobRetrieveParams =
                StatementStatementJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StatementStatementJobRetrieveParams = StatementStatementJobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StatementStatementJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StatementStatementJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            retrieve(id, StatementStatementJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementjobs`, but is
         * otherwise the same as [StatementJobServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StatementStatementJobListPageAsync>> =
            list(StatementStatementJobListParams.none())

        /** @see list */
        fun list(
            params: StatementStatementJobListParams = StatementStatementJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementStatementJobListPageAsync>>

        /** @see list */
        fun list(
            params: StatementStatementJobListParams = StatementStatementJobListParams.none()
        ): CompletableFuture<HttpResponseFor<StatementStatementJobListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatementStatementJobListPageAsync>> =
            list(StatementStatementJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs/{id}/cancel`,
         * but is otherwise the same as [StatementJobServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            cancel(id, StatementStatementJobCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: StatementStatementJobCancelParams = StatementStatementJobCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: StatementStatementJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>>

        /** @see cancel */
        fun cancel(
            params: StatementStatementJobCancelParams
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementJobResponse>> =
            cancel(id, StatementStatementJobCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementjobs/batch`, but is
         * otherwise the same as [StatementJobServiceAsync.createBatch].
         */
        fun createBatch(
            params: StatementStatementJobCreateBatchParams
        ): CompletableFuture<HttpResponseFor<List<StatementJobResponse>>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: StatementStatementJobCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<StatementJobResponse>>>
    }
}
