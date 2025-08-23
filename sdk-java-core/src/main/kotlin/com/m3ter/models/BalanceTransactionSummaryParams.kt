// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves the Balance Transactions Summary for a given Balance.
 *
 * The response contains useful recorded and calculated Transaction amounts created for a Balance
 * during the time it is active for the Account, including amounts relevant to any rollover amount
 * configured for a Balance:
 * - `totalCreditAmount`. The sum of all credits amounts created for the Balance.
 * - `totalDebitAmount`. The sum of all debit amounts created for the Balance.
 * - `initialCreditAmount`. The initial credit amount created for the Balance.
 * - `expiredBalanceAmount`. The amount of the Balance remaining at the time the Balance expires and
 *   which is not included in any configured Rollover amount. For example, suppose a Balance reaches
 *   its end date and $1000 credit remains unused. If the Balance is configured to rollover $800,
 *   then the `expiredBalanceAmount` is calculated as $1000 - $800 = $200.
 * - `rolloverConsumed`. The sum of debits made against the configured rollover amount. Note that
 *   this amount is dynamic relative to when the API call is made until either the rollover end date
 *   is reached or the cap configured for the rollover amount is reached, after which it will be
 *   unchanged. If no rollover is configured for a Balance, then this is ignored.
 * - `balanceConsumed`. The sum of debits made against the Balance. Note that this amount is dynamic
 *   relative to when the API call is made until either the Balance end date is reached or the
 *   available Balance amount reaches zero, after which it will be unchanged.
 */
class BalanceTransactionSummaryParams
private constructor(
    private val orgId: String?,
    private val balanceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun balanceId(): Optional<String> = Optional.ofNullable(balanceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceTransactionSummaryParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionSummaryParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionSummaryParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceTransactionSummaryParams: BalanceTransactionSummaryParams) =
            apply {
                orgId = balanceTransactionSummaryParams.orgId
                balanceId = balanceTransactionSummaryParams.balanceId
                additionalHeaders = balanceTransactionSummaryParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    balanceTransactionSummaryParams.additionalQueryParams.toBuilder()
            }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun balanceId(balanceId: String?) = apply { this.balanceId = balanceId }

        /** Alias for calling [Builder.balanceId] with `balanceId.orElse(null)`. */
        fun balanceId(balanceId: Optional<String>) = balanceId(balanceId.getOrNull())

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
         * Returns an immutable instance of [BalanceTransactionSummaryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceTransactionSummaryParams =
            BalanceTransactionSummaryParams(
                orgId,
                balanceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> balanceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceTransactionSummaryParams &&
            orgId == other.orgId &&
            balanceId == other.balanceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, balanceId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BalanceTransactionSummaryParams{orgId=$orgId, balanceId=$balanceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
