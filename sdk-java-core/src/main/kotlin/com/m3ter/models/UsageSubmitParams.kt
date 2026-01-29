// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit a measurement or multiple measurements to the m3ter platform. The maximum size of the
 * payload needs to be less than 512,000 bytes.
 *
 * **NOTES:**
 * * **Non-existent Accounts.** The `account` request parameter is required. However, if you want to
 *   submit a usage data measurement for an Account which does not yet exist in your Organization,
 *   you can use an `account` code for a non-existent Account. A new skeleton Account will be
 *   automatically created. The usage data measurement is accepted and ingested as data belonging to
 *   the new auto-created Account. At a later date, you can edit the Account's Code,??Name,
 *   and??e-mail address. For more details, see
 *   [Submitting Usage Data for Non-Existent Accounts](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-for-non-existent-accounts)
 *   in our main documentation.
 * * **Usage Data Adjustments.** If you need to make corrections for billing retrospectively against
 *   an Account, you can use date/time values in the past for the `ts` (timestamp) request parameter
 *   to submit positive or negative usage data amounts to correct and reconcile earlier billing
 *   anomalies. For more details, see
 *   [Submitting Usage Data Adjustments Using Timestamp](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/submitting-usage-data-adjustments-using-timestamp)
 *   in our main documentation.
 * * **Ingest Validation Failure Events.** After the intial submission of a usage data measurement
 *   to the Ingest API, a data enrichment stage is performed to check for any errors in the usage
 *   data measurement, such as a missing field. If an error is identified, this might result in the
 *   submission being rejected. In these cases, an *ingest validation failure* Event is generated,
 *   which you can review on the
 *   [Ingest Events](https://www.m3ter.com/docs/guides/billing-and-usage-data/submitting-usage-data/reviewing-and-resolving-ingest-events)
 *   page in the Console. See also the [Events](https://www.m3ter.com/docs/api#tag/Events) section
 *   in this API Reference.
 *
 * **IMPORTANT! - Use of PII:** The use of any of your end-customers' Personally Identifiable
 * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please ensure
 * that any measurements you submit do not contain any end-customer PII data. See the
 * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
 * details.
 */
class UsageSubmitParams
private constructor(
    private val orgId: String?,
    private val submitMeasurementsRequest: SubmitMeasurementsRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun submitMeasurementsRequest(): SubmitMeasurementsRequest = submitMeasurementsRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        submitMeasurementsRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageSubmitParams].
         *
         * The following fields are required:
         * ```java
         * .submitMeasurementsRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageSubmitParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var submitMeasurementsRequest: SubmitMeasurementsRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageSubmitParams: UsageSubmitParams) = apply {
            orgId = usageSubmitParams.orgId
            submitMeasurementsRequest = usageSubmitParams.submitMeasurementsRequest
            additionalHeaders = usageSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageSubmitParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun submitMeasurementsRequest(submitMeasurementsRequest: SubmitMeasurementsRequest) =
            apply {
                this.submitMeasurementsRequest = submitMeasurementsRequest
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UsageSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .submitMeasurementsRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageSubmitParams =
            UsageSubmitParams(
                orgId,
                checkRequired("submitMeasurementsRequest", submitMeasurementsRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SubmitMeasurementsRequest = submitMeasurementsRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageSubmitParams &&
            orgId == other.orgId &&
            submitMeasurementsRequest == other.submitMeasurementsRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, submitMeasurementsRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageSubmitParams{orgId=$orgId, submitMeasurementsRequest=$submitMeasurementsRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
