// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ObjectUrlResponse
import com.m3ter.models.StatementCreateCsvParams
import com.m3ter.models.StatementGetCsvParams
import com.m3ter.models.StatementGetJsonParams
import com.m3ter.services.blocking.statements.StatementDefinitionService
import com.m3ter.services.blocking.statements.StatementJobService
import java.util.function.Consumer

interface StatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService

    fun statementJobs(): StatementJobService

    fun statementDefinitions(): StatementDefinitionService

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
    fun createCsv(id: String): ObjectUrlResponse = createCsv(id, StatementCreateCsvParams.none())

    /** @see createCsv */
    fun createCsv(
        id: String,
        params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse = createCsv(params.toBuilder().id(id).build(), requestOptions)

    /** @see createCsv */
    fun createCsv(
        id: String,
        params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
    ): ObjectUrlResponse = createCsv(id, params, RequestOptions.none())

    /** @see createCsv */
    fun createCsv(
        params: StatementCreateCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse

    /** @see createCsv */
    fun createCsv(params: StatementCreateCsvParams): ObjectUrlResponse =
        createCsv(params, RequestOptions.none())

    /** @see createCsv */
    fun createCsv(id: String, requestOptions: RequestOptions): ObjectUrlResponse =
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
    fun getCsv(id: String): ObjectUrlResponse = getCsv(id, StatementGetCsvParams.none())

    /** @see getCsv */
    fun getCsv(
        id: String,
        params: StatementGetCsvParams = StatementGetCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse = getCsv(params.toBuilder().id(id).build(), requestOptions)

    /** @see getCsv */
    fun getCsv(
        id: String,
        params: StatementGetCsvParams = StatementGetCsvParams.none(),
    ): ObjectUrlResponse = getCsv(id, params, RequestOptions.none())

    /** @see getCsv */
    fun getCsv(
        params: StatementGetCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse

    /** @see getCsv */
    fun getCsv(params: StatementGetCsvParams): ObjectUrlResponse =
        getCsv(params, RequestOptions.none())

    /** @see getCsv */
    fun getCsv(id: String, requestOptions: RequestOptions): ObjectUrlResponse =
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
    fun getJson(id: String): ObjectUrlResponse = getJson(id, StatementGetJsonParams.none())

    /** @see getJson */
    fun getJson(
        id: String,
        params: StatementGetJsonParams = StatementGetJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse = getJson(params.toBuilder().id(id).build(), requestOptions)

    /** @see getJson */
    fun getJson(
        id: String,
        params: StatementGetJsonParams = StatementGetJsonParams.none(),
    ): ObjectUrlResponse = getJson(id, params, RequestOptions.none())

    /** @see getJson */
    fun getJson(
        params: StatementGetJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUrlResponse

    /** @see getJson */
    fun getJson(params: StatementGetJsonParams): ObjectUrlResponse =
        getJson(params, RequestOptions.none())

    /** @see getJson */
    fun getJson(id: String, requestOptions: RequestOptions): ObjectUrlResponse =
        getJson(id, StatementGetJsonParams.none(), requestOptions)

    /** A view of [StatementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService.WithRawResponse

        fun statementJobs(): StatementJobService.WithRawResponse

        fun statementDefinitions(): StatementDefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/bills/{id}/statement/csv`,
         * but is otherwise the same as [StatementService.createCsv].
         */
        @MustBeClosed
        fun createCsv(id: String): HttpResponseFor<ObjectUrlResponse> =
            createCsv(id, StatementCreateCsvParams.none())

        /** @see createCsv */
        @MustBeClosed
        fun createCsv(
            id: String,
            params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse> =
            createCsv(params.toBuilder().id(id).build(), requestOptions)

        /** @see createCsv */
        @MustBeClosed
        fun createCsv(
            id: String,
            params: StatementCreateCsvParams = StatementCreateCsvParams.none(),
        ): HttpResponseFor<ObjectUrlResponse> = createCsv(id, params, RequestOptions.none())

        /** @see createCsv */
        @MustBeClosed
        fun createCsv(
            params: StatementCreateCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse>

        /** @see createCsv */
        @MustBeClosed
        fun createCsv(params: StatementCreateCsvParams): HttpResponseFor<ObjectUrlResponse> =
            createCsv(params, RequestOptions.none())

        /** @see createCsv */
        @MustBeClosed
        fun createCsv(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUrlResponse> =
            createCsv(id, StatementCreateCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}/statement/csv`,
         * but is otherwise the same as [StatementService.getCsv].
         */
        @MustBeClosed
        fun getCsv(id: String): HttpResponseFor<ObjectUrlResponse> =
            getCsv(id, StatementGetCsvParams.none())

        /** @see getCsv */
        @MustBeClosed
        fun getCsv(
            id: String,
            params: StatementGetCsvParams = StatementGetCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse> =
            getCsv(params.toBuilder().id(id).build(), requestOptions)

        /** @see getCsv */
        @MustBeClosed
        fun getCsv(
            id: String,
            params: StatementGetCsvParams = StatementGetCsvParams.none(),
        ): HttpResponseFor<ObjectUrlResponse> = getCsv(id, params, RequestOptions.none())

        /** @see getCsv */
        @MustBeClosed
        fun getCsv(
            params: StatementGetCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse>

        /** @see getCsv */
        @MustBeClosed
        fun getCsv(params: StatementGetCsvParams): HttpResponseFor<ObjectUrlResponse> =
            getCsv(params, RequestOptions.none())

        /** @see getCsv */
        @MustBeClosed
        fun getCsv(id: String, requestOptions: RequestOptions): HttpResponseFor<ObjectUrlResponse> =
            getCsv(id, StatementGetCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{id}/statement/json`,
         * but is otherwise the same as [StatementService.getJson].
         */
        @MustBeClosed
        fun getJson(id: String): HttpResponseFor<ObjectUrlResponse> =
            getJson(id, StatementGetJsonParams.none())

        /** @see getJson */
        @MustBeClosed
        fun getJson(
            id: String,
            params: StatementGetJsonParams = StatementGetJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse> =
            getJson(params.toBuilder().id(id).build(), requestOptions)

        /** @see getJson */
        @MustBeClosed
        fun getJson(
            id: String,
            params: StatementGetJsonParams = StatementGetJsonParams.none(),
        ): HttpResponseFor<ObjectUrlResponse> = getJson(id, params, RequestOptions.none())

        /** @see getJson */
        @MustBeClosed
        fun getJson(
            params: StatementGetJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUrlResponse>

        /** @see getJson */
        @MustBeClosed
        fun getJson(params: StatementGetJsonParams): HttpResponseFor<ObjectUrlResponse> =
            getJson(params, RequestOptions.none())

        /** @see getJson */
        @MustBeClosed
        fun getJson(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUrlResponse> =
            getJson(id, StatementGetJsonParams.none(), requestOptions)
    }
}
