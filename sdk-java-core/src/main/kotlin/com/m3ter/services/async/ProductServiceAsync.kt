// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductListPageAsync
import com.m3ter.models.ProductListParams
import com.m3ter.models.ProductResponse
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    /**
     * Create a new Product.
     *
     * This endpoint creates a new Product within the specified Organization. The details of the
     * Product are provided in the request body.
     */
    fun create(params: ProductCreateParams): CompletableFuture<ProductResponse> =
        create(params, RequestOptions.none())

    /** @see create */
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
    fun retrieve(id: String): CompletableFuture<ProductResponse> =
        retrieve(id, ProductRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): CompletableFuture<ProductResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /** @see retrieve */
    fun retrieve(params: ProductRetrieveParams): CompletableFuture<ProductResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ProductResponse> =
        retrieve(id, ProductRetrieveParams.none(), requestOptions)

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
    fun update(id: String, params: ProductUpdateParams): CompletableFuture<ProductResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ProductUpdateParams): CompletableFuture<ProductResponse> =
        update(params, RequestOptions.none())

    /** @see update */
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
    fun list(): CompletableFuture<ProductListPageAsync> = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListPageAsync>

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none()
    ): CompletableFuture<ProductListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListPageAsync> =
        list(ProductListParams.none(), requestOptions)

    /**
     * Delete a Product with the given UUID.
     *
     * This endpoint deletes a specific Product within a specified Organization, using the Product
     * UUID.
     */
    fun delete(id: String): CompletableFuture<ProductResponse> =
        delete(id, ProductDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
    ): CompletableFuture<ProductResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductResponse>

    /** @see delete */
    fun delete(params: ProductDeleteParams): CompletableFuture<ProductResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<ProductResponse> =
        delete(id, ProductDeleteParams.none(), requestOptions)

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductServiceAsync.create].
         */
        fun create(
            params: ProductCreateParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(id, ProductRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ProductRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.update].
         */
        fun update(
            id: String,
            params: ProductUpdateParams,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ProductUpdateParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none())

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>>

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(id, ProductDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductResponse>>

        /** @see delete */
        fun delete(
            params: ProductDeleteParams
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> =
            delete(id, ProductDeleteParams.none(), requestOptions)
    }
}
