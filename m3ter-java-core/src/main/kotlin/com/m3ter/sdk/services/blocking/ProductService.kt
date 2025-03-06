// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ProductCreateParams
import com.m3ter.sdk.models.ProductDeleteParams
import com.m3ter.sdk.models.ProductListPage
import com.m3ter.sdk.models.ProductListParams
import com.m3ter.sdk.models.ProductResponse
import com.m3ter.sdk.models.ProductRetrieveParams
import com.m3ter.sdk.models.ProductUpdateParams

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
    @JvmOverloads
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
    @JvmOverloads
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

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
    @JvmOverloads
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
    @JvmOverloads
    fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /**
     * Delete a Product with the given UUID.
     *
     * This endpoint deletes a specific Product within a specified Organization, using the Product
     * UUID.
     */
    @JvmOverloads
    fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductResponse

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/products`, but is otherwise
         * the same as [ProductService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProductListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/products/{id}`, but is
         * otherwise the same as [ProductService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductResponse>
    }
}
