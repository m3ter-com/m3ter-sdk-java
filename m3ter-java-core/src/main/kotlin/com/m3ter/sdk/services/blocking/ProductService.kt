// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Product
import com.m3ter.sdk.models.ProductCreateParams
import com.m3ter.sdk.models.ProductListPage
import com.m3ter.sdk.models.ProductListParams
import com.m3ter.sdk.models.ProductRetrieveParams
import com.m3ter.sdk.models.ProductUpdateParams

interface ProductService {

    /**
     * Create a new Product.
     *
     * This endpoint creates a new Product within the specified Organization. The details of the
     * Product are provided in the request body.
     */
    @JvmOverloads
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Product

    /**
     * Retrieve a Product with the given UUID.
     *
     * This endpoint retrieves the details of a specific Product within a specified Organization,
     * using the Product UUID.
     */
    @JvmOverloads
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Product

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
        requestOptions: RequestOptions = RequestOptions.none()
    ): Product

    /**
     * Retrieve a list of Products.
     *
     * This endpoint retrieves a list of all the Products within a specified Organization. The list
     * can be paginated, and supports filtering by specific Product IDs.
     */
    @JvmOverloads
    fun list(
        params: ProductListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProductListPage
}
