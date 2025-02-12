// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Meter
import com.m3ter.sdk.models.MeterCreateParams
import com.m3ter.sdk.models.MeterDeleteParams
import com.m3ter.sdk.models.MeterListParams
import com.m3ter.sdk.models.MeterListResponse
import com.m3ter.sdk.models.MeterRetrieveParams
import com.m3ter.sdk.models.MeterUpdateParams

interface MeterService {

    /**
     * Create a new Meter.
     *
     * When you create a Meter, you can define two types of field for usage data collection and
     * ingest into the platform:
     * - `dataFields` to collect raw usage data measures - numeric quantitative data values or
     *   non-numeric point data values.
     * - `derivedFields` to derive usage data measures that are the result of applying a calculation
     *   to `dataFields`, `customFields`, or system `Timestamp` fields.
     *
     * You can also:
     * - Create `customFields` for a Meter, which allows you to attach custom data to the Meter as
     *   name/value pairs.
     * - Create Global Meters, which are not tied to a specific Product and allow you collect to
     *   usage data that will form the basis of usage-based pricing across more than one of your
     *   Products.
     *
     * **IMPORTANT! - use of PII:** The use of any of your end-customers' Personally Identifiable
     * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please
     * ensure that any fields you configure for Meters, such as Data Fields or Derived Fields, do
     * not contain any end-customer PII data. See the
     * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
     * details.
     *
     * See also:
     * - [Reviewing Meter
     *   Options](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/reviewing-meter-options).
     */
    @JvmOverloads
    fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Meter

    /** Retrieve the Meter with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Meter

    /**
     * Update the Meter with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update
     * the Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: MeterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Meter

    /** Retrieve a list of Meter entities */
    @JvmOverloads
    fun list(
        params: MeterListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MeterListResponse

    /** Delete the Meter with the given UUID. */
    @JvmOverloads
    fun delete(
        params: MeterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Meter
}
