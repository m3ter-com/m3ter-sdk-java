// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ObjectUrlResponse
import com.m3ter.models.StatementCreateCsvParams
import com.m3ter.models.StatementGetCsvParams
import com.m3ter.models.StatementGetJsonParams
import com.m3ter.services.async.statements.StatementDefinitionServiceAsync
import com.m3ter.services.async.statements.StatementJobServiceAsync
import java.util.concurrent.CompletableFuture

interface StatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun statementJobs(): StatementJobServiceAsync

    fun statementDefinitions(): StatementDefinitionServiceAsync

    /**
     * Generate a specific Bill Statement for the provided Bill UUID in CSV format.
     *
     * Bill Statements are backing sheets to the invoices sent to your customers. Bill Statements
     * provide a breakdown of the usage responsible for the usage charge line items shown on
     * invoices.
     *
     * The response to this call returns a pre-signed `downloadUrl`, which you then use with a `GET`
     * call to obtain the Bill statement in CSV format.
     */
    fun createCsv(id: String): CompletableFuture<ObjectUrlResponse> =
        createCsv(id, StatementCreateCsvParams.none())

    /** @see [createCsv] */
    fun createCsv(
        id: String,
        params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse> =
        createCsv(params.toBuilder().id(id).build(), requestOptions)

    /** @see [createCsv] */
    fun createCsv(
        id: String,
        params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
    ): CompletableFuture<ObjectUrlResponse> = createCsv(id, params, RequestOptions.none())

    /** @see [createCsv] */
    fun createCsv(
        params: StatementCreateCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse>

    /** @see [createCsv] */
    fun createCsv(params: StatementCreateCsvParams): CompletableFuture<ObjectUrlResponse> =
        createCsv(params, RequestOptions.none())

    /** @see [createCsv] */
    fun createCsv(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectUrlResponse> =
        createCsv(id, StatementCreateCsvParams.none(), requestOptions)

    /**
     * Retrieve a specific Bill Statement for the given Bill UUID in CSV format.
     *
     * Bill Statements are backing sheets to the invoices sent to your customers. Bill Statements
     * provide a breakdown of the usage responsible for the usage charge line items shown on
     * invoices.
     *
     * The response includes a pre-signed `downloadUrl`, which must be used with a separate `GET`
     * call to download the actual Bill Statement. This ensures secure access to the requested
     * information.
     */
    fun getCsv(id: String): CompletableFuture<ObjectUrlResponse> =
        getCsv(id, StatementGetCsvParams.none())

    /** @see [getCsv] */
    fun getCsv(
        id: String,
        params: StatementGetCsvParams = StatementGetCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse> =
        getCsv(params.toBuilder().id(id).build(), requestOptions)

    /** @see [getCsv] */
    fun getCsv(
        id: String,
        params: StatementGetCsvParams = StatementGetCsvParams.none(),
    ): CompletableFuture<ObjectUrlResponse> = getCsv(id, params, RequestOptions.none())

    /** @see [getCsv] */
    fun getCsv(
        params: StatementGetCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse>

    /** @see [getCsv] */
    fun getCsv(params: StatementGetCsvParams): CompletableFuture<ObjectUrlResponse> =
        getCsv(params, RequestOptions.none())

    /** @see [getCsv] */
    fun getCsv(id: String, requestOptions: RequestOptions): CompletableFuture<ObjectUrlResponse> =
        getCsv(id, StatementGetCsvParams.none(), requestOptions)

    /**
     * Retrieve a Bill Statement in JSON format for a given Bill ID.
     *
     * Bill Statements are backing sheets to the invoices sent to your customers. Bill Statements
     * provide a breakdown of the usage responsible for the usage charge line items shown on
     * invoices.
     *
     * The response to this call returns a pre-signed `downloadUrl`, which you use with a `GET` call
     * to obtain the Bill Statement.
     */
    fun getJson(id: String): CompletableFuture<ObjectUrlResponse> =
        getJson(id, StatementGetJsonParams.none())

    /** @see [getJson] */
    fun getJson(
        id: String,
        params: StatementGetJsonParams = StatementGetJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse> =
        getJson(params.toBuilder().id(id).build(), requestOptions)

    /** @see [getJson] */
    fun getJson(
        id: String,
        params: StatementGetJsonParams = StatementGetJsonParams.none(),
    ): CompletableFuture<ObjectUrlResponse> = getJson(id, params, RequestOptions.none())

    /** @see [getJson] */
    fun getJson(
        params: StatementGetJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUrlResponse>

    /** @see [getJson] */
    fun getJson(params: StatementGetJsonParams): CompletableFuture<ObjectUrlResponse> =
        getJson(params, RequestOptions.none())

    /** @see [getJson] */
    fun getJson(id: String, requestOptions: RequestOptions): CompletableFuture<ObjectUrlResponse> =
        getJson(id, StatementGetJsonParams.none(), requestOptions)

    /**
     * A view of [StatementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun statementJobs(): StatementJobServiceAsync.WithRawResponse

        fun statementDefinitions(): StatementDefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/bills/{id}/statement/csv`,
         * but is otherwise the same as [StatementServiceAsync.createCsv].
         */
        fun createCsv(id: String): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            createCsv(id, StatementCreateCsvParams.none())

        /** @see [createCsv] */
        fun createCsv(
            id: String,
            params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            createCsv(params.toBuilder().id(id).build(), requestOptions)

        /** @see [createCsv] */
        fun createCsv(
            id: String,
            params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            createCsv(id, params, RequestOptions.none())

        /** @see [createCsv] */
        fun createCsv(
            params: StatementCreateCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>>

        /** @see [createCsv] */
        fun createCsv(
            params: StatementCreateCsvParams
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            createCsv(params, RequestOptions.none())

        /** @see [createCsv] */
        fun createCsv(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            createCsv(id, StatementCreateCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}/statement/csv`,
         * but is otherwise the same as [StatementServiceAsync.getCsv].
         */
        fun getCsv(id: String): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getCsv(id, StatementGetCsvParams.none())

        /** @see [getCsv] */
        fun getCsv(
            id: String,
            params: StatementGetCsvParams = StatementGetCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getCsv(params.toBuilder().id(id).build(), requestOptions)

        /** @see [getCsv] */
        fun getCsv(
            id: String,
            params: StatementGetCsvParams = StatementGetCsvParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getCsv(id, params, RequestOptions.none())

        /** @see [getCsv] */
        fun getCsv(
            params: StatementGetCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>>

        /** @see [getCsv] */
        fun getCsv(
            params: StatementGetCsvParams
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getCsv(params, RequestOptions.none())

        /** @see [getCsv] */
        fun getCsv(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getCsv(id, StatementGetCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}/statement/json`,
         * but is otherwise the same as [StatementServiceAsync.getJson].
         */
        fun getJson(id: String): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getJson(id, StatementGetJsonParams.none())

        /** @see [getJson] */
        fun getJson(
            id: String,
            params: StatementGetJsonParams = StatementGetJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getJson(params.toBuilder().id(id).build(), requestOptions)

        /** @see [getJson] */
        fun getJson(
            id: String,
            params: StatementGetJsonParams = StatementGetJsonParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getJson(id, params, RequestOptions.none())

        /** @see [getJson] */
        fun getJson(
            params: StatementGetJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>>

        /** @see [getJson] */
        fun getJson(
            params: StatementGetJsonParams
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getJson(params, RequestOptions.none())

        /** @see [getJson] */
        fun getJson(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUrlResponse>> =
            getJson(id, StatementGetJsonParams.none(), requestOptions)
    }
}
