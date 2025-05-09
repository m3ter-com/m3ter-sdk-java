// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductListPage
import com.m3ter.models.ProductListParams
import com.m3ter.models.ProductResponse
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams

interface ProductService {

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
    fun create(params: ProductCreateParams): ProductResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

    /**
     * Retrieve a Product with the given UUID.
     *
     * This endpoint retrieves the details of a specific Product within a specified Organization,
     * using the Product UUID.
     */
    fun retrieve(id: String): ProductResponse = retrieve(id, ProductRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): ProductResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

    /** @see [retrieve] */
    fun retrieve(params: ProductRetrieveParams): ProductResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ProductResponse =
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
    fun update(id: String, params: ProductUpdateParams): ProductResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: ProductUpdateParams): ProductResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

    /**
     * Retrieve a list of Products.
     *
     * This endpoint retrieves a list of all the Products within a specified Organization. The list
     * can be paginated, and supports filtering by specific Product IDs.
     */
    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see [list] */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    /**
     * Delete a Product with the given UUID.
     *
     * This endpoint deletes a specific Product within a specified Organization, using the Product
     * UUID.
     */
    fun delete(id: String): ProductResponse = delete(id, ProductDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
    ): ProductResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

    /** @see [delete] */
    fun delete(params: ProductDeleteParams): ProductResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): ProductResponse =
        delete(id, ProductDeleteParams.none(), requestOptions)

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductService.create].
         */
        @MustBeClosed
        fun create(params: ProductCreateParams): HttpResponseFor<ProductResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ProductResponse> =
            retrieve(id, ProductRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): HttpResponseFor<ProductResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProductRetrieveParams): HttpResponseFor<ProductResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ProductResponse> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.update].
         */
        @MustBeClosed
        fun update(id: String, params: ProductUpdateParams): HttpResponseFor<ProductResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProductUpdateParams): HttpResponseFor<ProductResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ProductResponse> =
            delete(id, ProductDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
        ): HttpResponseFor<ProductResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProductDeleteParams): HttpResponseFor<ProductResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<ProductResponse> =
            delete(id, ProductDeleteParams.none(), requestOptions)
    }
}
