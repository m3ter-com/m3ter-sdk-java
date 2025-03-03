// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Account
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.AccountGetChildrenParams
import com.m3ter.sdk.models.AccountListPage
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountSearchResponse
import com.m3ter.sdk.models.AccountUpdateParams

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Account within the Organization. */
    override fun create(params: AccountCreateParams, requestOptions: RequestOptions): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Account with the given Account UUID. */
    override fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accounts",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Account with the given Account UUID.
     *
     * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to
     * update the Account, use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    override fun update(params: AccountUpdateParams, requestOptions: RequestOptions): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accounts",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<AccountListPage.Response> =
        jsonHandler<AccountListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    override fun list(params: AccountListParams, requestOptions: RequestOptions): AccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "accounts")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { AccountListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    override fun delete(params: AccountDeleteParams, requestOptions: RequestOptions): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accounts",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val endDateBillingEntitiesHandler: Handler<AccountEndDateBillingEntitiesResponse> =
        jsonHandler<AccountEndDateBillingEntitiesResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Apply the specified end-date to billing entities associated with an Account.
     *
     * **NOTE:**
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    override fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions,
    ): AccountEndDateBillingEntitiesResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accounts",
                    params.getPathParam(1),
                    "enddatebillingentities",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { endDateBillingEntitiesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getChildrenHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a list of Accounts that are children of the specified Account. */
    override fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions,
    ): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "accounts",
                    params.getPathParam(1),
                    "children",
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getChildrenHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val searchHandler: Handler<AccountSearchResponse> =
        jsonHandler<AccountSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Search for Account entities.
     *
     * This endpoint executes a search query for Accounts based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Accounts can be paginated for easier management.
     */
    override fun search(
        params: AccountSearchParams,
        requestOptions: RequestOptions,
    ): AccountSearchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "accounts", "search")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { searchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
