// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ProductCreateParams
import com.m3ter.sdk.models.ProductDeleteParams
import com.m3ter.sdk.models.ProductListPageAsync
import com.m3ter.sdk.models.ProductListParams
import com.m3ter.sdk.models.ProductResponse
import com.m3ter.sdk.models.ProductRetrieveParams
import com.m3ter.sdk.models.ProductUpdateParams
import java.util.concurrent.CompletableFuture

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Product.
     *
     * This endpoint creates a new Product within the specified Organization. The details of the
     * Product are provided in the request body.
     */
    fun create(params: ProductCreateParams): CompletableFuture<ProductResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /**
     * Retrieve a Product with the given UUID.
     *
     * This endpoint retrieves the details of a specific Product within a specified Organization,
     * using the Product UUID.
     */
    fun retrieve(params: ProductRetrieveParams): CompletableFuture<ProductResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /**
     * Update a Product with the given UUID.
     *
     * This endpoint updates the details of a specific Product within a specified Organization,
     * using the Product UUID. The updated details are provided in the request body.
     *
     * **Note:** If you have created Custom Fields for a Product, when you use this endpoint to
     * update the Product use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    fun update(params: ProductUpdateParams): CompletableFuture<ProductResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /**
     * Retrieve a list of Products.
     *
     * This endpoint retrieves a list of all the Products within a specified Organization. The list
     * can be paginated, and supports filtering by specific Product IDs.
     */
    fun list(params: ProductListParams): CompletableFuture<ProductListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListPageAsync>

    /**
     * Delete a Product with the given UUID.
     *
     * This endpoint deletes a specific Product within a specified Organization, using the Product
     * UUID.
     */
    fun delete(params: ProductDeleteParams): CompletableFuture<ProductResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ProductCreateParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ProductListParams
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProductListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>
    }
}
