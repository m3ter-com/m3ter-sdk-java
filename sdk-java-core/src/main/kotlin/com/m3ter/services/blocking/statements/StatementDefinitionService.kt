// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.statements

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.StatementDefinitionResponse
import com.m3ter.models.StatementStatementDefinitionCreateParams
import com.m3ter.models.StatementStatementDefinitionDeleteParams
import com.m3ter.models.StatementStatementDefinitionListPage
import com.m3ter.models.StatementStatementDefinitionListParams
import com.m3ter.models.StatementStatementDefinitionRetrieveParams
import com.m3ter.models.StatementStatementDefinitionUpdateParams
import java.util.function.Consumer

interface StatementDefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementDefinitionService

    /**
     * Create a new StatementDefinition.
     *
     * This endpoint creates a new StatementDefinition within the specified Organization. The
     * details of the StatementDefinition are provided in the request body.
     */
    fun create(params: StatementStatementDefinitionCreateParams): StatementDefinitionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StatementStatementDefinitionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse

    /**
     * Retrieve a StatementDefinition with the given UUID.
     *
     * Retrieves the details of a specific StatementDefinition for the specified Organization, using
     * its unique identifier (UUID). This endpoint is useful when you want to retrieve the complete
     * details of a single StatementDefinition.
     */
    fun retrieve(id: String): StatementDefinitionResponse =
        retrieve(id, StatementStatementDefinitionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementDefinitionRetrieveParams =
            StatementStatementDefinitionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: StatementStatementDefinitionRetrieveParams =
            StatementStatementDefinitionRetrieveParams.none(),
    ): StatementDefinitionResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatementStatementDefinitionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse

    /** @see retrieve */
    fun retrieve(params: StatementStatementDefinitionRetrieveParams): StatementDefinitionResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): StatementDefinitionResponse =
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
    ): StatementDefinitionResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: StatementStatementDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: StatementStatementDefinitionUpdateParams): StatementDefinitionResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StatementStatementDefinitionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse

    /**
     * Retrieve a list of StatementDefinitions.
     *
     * This endpoint retrieves a list of all the StatementDefinitions within a specified
     * Organization. The list can be paginated for easier management.
     */
    fun list(): StatementStatementDefinitionListPage =
        list(StatementStatementDefinitionListParams.none())

    /** @see list */
    fun list(
        params: StatementStatementDefinitionListParams =
            StatementStatementDefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementStatementDefinitionListPage

    /** @see list */
    fun list(
        params: StatementStatementDefinitionListParams =
            StatementStatementDefinitionListParams.none()
    ): StatementStatementDefinitionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): StatementStatementDefinitionListPage =
        list(StatementStatementDefinitionListParams.none(), requestOptions)

    /**
     * Delete a StatementDefinition with the given UUID.
     *
     * This endpoint deletes a specific StatementDefinition within a specified Organization, using
     * the StatementDefinition UUID.
     */
    fun delete(id: String): StatementDefinitionResponse =
        delete(id, StatementStatementDefinitionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: StatementStatementDefinitionDeleteParams =
            StatementStatementDefinitionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: StatementStatementDefinitionDeleteParams =
            StatementStatementDefinitionDeleteParams.none(),
    ): StatementDefinitionResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StatementStatementDefinitionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementDefinitionResponse

    /** @see delete */
    fun delete(params: StatementStatementDefinitionDeleteParams): StatementDefinitionResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): StatementDefinitionResponse =
        delete(id, StatementStatementDefinitionDeleteParams.none(), requestOptions)

    /**
     * A view of [StatementDefinitionService] that provides access to raw HTTP responses for each
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
        ): StatementDefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/statementdefinitions`, but
         * is otherwise the same as [StatementDefinitionService.create].
         */
        @MustBeClosed
        fun create(
            params: StatementStatementDefinitionCreateParams
        ): HttpResponseFor<StatementDefinitionResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: StatementStatementDefinitionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementdefinitions/{id}`,
         * but is otherwise the same as [StatementDefinitionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<StatementDefinitionResponse> =
            retrieve(id, StatementStatementDefinitionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StatementStatementDefinitionRetrieveParams =
                StatementStatementDefinitionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: StatementStatementDefinitionRetrieveParams =
                StatementStatementDefinitionRetrieveParams.none(),
        ): HttpResponseFor<StatementDefinitionResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatementStatementDefinitionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatementStatementDefinitionRetrieveParams
        ): HttpResponseFor<StatementDefinitionResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> =
            retrieve(id, StatementStatementDefinitionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/statementdefinitions/{id}`,
         * but is otherwise the same as [StatementDefinitionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: StatementStatementDefinitionUpdateParams,
        ): HttpResponseFor<StatementDefinitionResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: StatementStatementDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: StatementStatementDefinitionUpdateParams
        ): HttpResponseFor<StatementDefinitionResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StatementStatementDefinitionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/statementdefinitions`, but is
         * otherwise the same as [StatementDefinitionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<StatementStatementDefinitionListPage> =
            list(StatementStatementDefinitionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: StatementStatementDefinitionListParams =
                StatementStatementDefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementStatementDefinitionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: StatementStatementDefinitionListParams =
                StatementStatementDefinitionListParams.none()
        ): HttpResponseFor<StatementStatementDefinitionListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<StatementStatementDefinitionListPage> =
            list(StatementStatementDefinitionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/statementdefinitions/{id}`, but is otherwise the same as
         * [StatementDefinitionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<StatementDefinitionResponse> =
            delete(id, StatementStatementDefinitionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: StatementStatementDefinitionDeleteParams =
                StatementStatementDefinitionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: StatementStatementDefinitionDeleteParams =
                StatementStatementDefinitionDeleteParams.none(),
        ): HttpResponseFor<StatementDefinitionResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StatementStatementDefinitionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementDefinitionResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StatementStatementDefinitionDeleteParams
        ): HttpResponseFor<StatementDefinitionResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementDefinitionResponse> =
            delete(id, StatementStatementDefinitionDeleteParams.none(), requestOptions)
    }
}
