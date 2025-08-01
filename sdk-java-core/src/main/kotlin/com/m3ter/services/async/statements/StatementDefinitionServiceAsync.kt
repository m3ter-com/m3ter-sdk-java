// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.statements

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.StatementDefinitionResponse
import com.m3ter.models.StatementStatementDefinitionCreateParams
import com.m3ter.models.StatementStatementDefinitionDeleteParams
import com.m3ter.models.StatementStatementDefinitionListPageAsync
import com.m3ter.models.StatementStatementDefinitionListParams
import com.m3ter.models.StatementStatementDefinitionRetrieveParams
import com.m3ter.models.StatementStatementDefinitionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatementDefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementDefinitionServiceAsync

    /**
     * Create a new StatementDefinition.
     *
     * This endpoint creates a new StatementDefinition within the specified Organization. The
     * details of the StatementDefinition are provided in the request body.
     */
    fun create(
        params: StatementStatementDefinitionCreateParams
    ): CompletableFuture<StatementDefinitionResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StatementStatementDefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse>

    /**
     * Retrieve a StatementDefinition with the given UUID.
     *
     * Retrieves the details of a specific StatementDefinition for the specified Organization, using
     * its unique identifier (UUID). This endpoint is useful when you want to retrieve the complete
     * details of a single StatementDefinition.
     */
    fun retrieve(id: String): CompletableFuture<StatementDefinitionResponse> =
        retrieve(id, StatementStatementDefinitionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementDefinitionRetrieveParams =
            StatementStatementDefinitionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementDefinitionRetrieveParams =
            StatementStatementDefinitionRetrieveParams.none(),
    ): CompletableFuture<StatementDefinitionResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatementStatementDefinitionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse>

    /** @see retrieve */
    fun retrieve(
        params: StatementStatementDefinitionRetrieveParams
    ): CompletableFuture<StatementDefinitionResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementDefinitionResponse> =
        retrieve(id, StatementStatementDefinitionRetrieveParams.none(), requestOptions)

    /**
     * Update StatementDefinition for the given UUID.
     *
     * Update the details of a specific StatementDefinition for the specified Organization, using
     * its unique identifier (UUID). The updated details for the StatementDefinition should be sent
     * in the request body.
     */
    fun update(
        id: String,
        params: StatementStatementDefinitionUpdateParams,
    ): CompletableFuture<StatementDefinitionResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: StatementStatementDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: StatementStatementDefinitionUpdateParams
    ): CompletableFuture<StatementDefinitionResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StatementStatementDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse>

    /**
     * Retrieve a list of StatementDefinitions.
     *
     * This endpoint retrieves a list of all the StatementDefinitions within a specified
     * Organization. The list can be paginated for easier management.
     */
    fun list(): CompletableFuture<StatementStatementDefinitionListPageAsync> =
        list(StatementStatementDefinitionListParams.none())

    /** @see list */
    fun list(
        params: StatementStatementDefinitionListParams =
            StatementStatementDefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementStatementDefinitionListPageAsync>

    /** @see list */
    fun list(
        params: StatementStatementDefinitionListParams =
            StatementStatementDefinitionListParams.none()
    ): CompletableFuture<StatementStatementDefinitionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<StatementStatementDefinitionListPageAsync> =
        list(StatementStatementDefinitionListParams.none(), requestOptions)

    /**
     * Delete a StatementDefinition with the given UUID.
     *
     * This endpoint deletes a specific StatementDefinition within a specified Organization, using
     * the StatementDefinition UUID.
     */
    fun delete(id: String): CompletableFuture<StatementDefinitionResponse> =
        delete(id, StatementStatementDefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StatementStatementDefinitionDeleteParams =
            StatementStatementDefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: StatementStatementDefinitionDeleteParams =
            StatementStatementDefinitionDeleteParams.none(),
    ): CompletableFuture<StatementDefinitionResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StatementStatementDefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatementDefinitionResponse>

    /** @see delete */
    fun delete(
        params: StatementStatementDefinitionDeleteParams
    ): CompletableFuture<StatementDefinitionResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatementDefinitionResponse> =
        delete(id, StatementStatementDefinitionDeleteParams.none(), requestOptions)

    /**
     * A view of [StatementDefinitionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementDefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementdefinitions`, but
         * is otherwise the same as [StatementDefinitionServiceAsync.create].
         */
        fun create(
            params: StatementStatementDefinitionCreateParams
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StatementStatementDefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementdefinitions/{id}`,
         * but is otherwise the same as [StatementDefinitionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            retrieve(id, StatementStatementDefinitionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StatementStatementDefinitionRetrieveParams =
                StatementStatementDefinitionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: StatementStatementDefinitionRetrieveParams =
                StatementStatementDefinitionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StatementStatementDefinitionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StatementStatementDefinitionRetrieveParams
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            retrieve(id, StatementStatementDefinitionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/statementdefinitions/{id}`,
         * but is otherwise the same as [StatementDefinitionServiceAsync.update].
         */
        fun update(
            id: String,
            params: StatementStatementDefinitionUpdateParams,
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: StatementStatementDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: StatementStatementDefinitionUpdateParams
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StatementStatementDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementdefinitions`, but is
         * otherwise the same as [StatementDefinitionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<StatementStatementDefinitionListPageAsync>> =
            list(StatementStatementDefinitionListParams.none())

        /** @see list */
        fun list(
            params: StatementStatementDefinitionListParams =
                StatementStatementDefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementStatementDefinitionListPageAsync>>

        /** @see list */
        fun list(
            params: StatementStatementDefinitionListParams =
                StatementStatementDefinitionListParams.none()
        ): CompletableFuture<HttpResponseFor<StatementStatementDefinitionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatementStatementDefinitionListPageAsync>> =
            list(StatementStatementDefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/statementdefinitions/{id}`, but is otherwise the same as
         * [StatementDefinitionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            delete(id, StatementStatementDefinitionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: StatementStatementDefinitionDeleteParams =
                StatementStatementDefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: StatementStatementDefinitionDeleteParams =
                StatementStatementDefinitionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StatementStatementDefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>>

        /** @see delete */
        fun delete(
            params: StatementStatementDefinitionDeleteParams
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatementDefinitionResponse>> =
            delete(id, StatementStatementDefinitionDeleteParams.none(), requestOptions)
    }
}
