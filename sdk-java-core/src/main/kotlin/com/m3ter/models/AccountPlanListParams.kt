// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
 *
 * This endpoint retrieves a list of AccountPlans and AccountPlanGroups for a specific Organization.
 * The list can be paginated for easier management, and supports filtering with various parameters.
 *
 * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
 * always use it in combination with the `account` query parameter.
 */
class AccountPlanListParams
private constructor(
    private val orgId: String?,
    private val account: String?,
    private val contract: String?,
    private val date: String?,
    private val ids: List<String>?,
    private val includeall: Boolean?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val plan: String?,
    private val product: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * The unique identifier (UUID) for the Account whose AccountPlans and AccountPlanGroups you
     * want to retrieve.
     */
    fun account(): Optional<String> = Optional.ofNullable(account)

    fun contract(): Optional<String> = Optional.ofNullable(contract)

    /**
     * The specific date for which you want to retrieve active AccountPlans and AccountPlanGroups.
     */
    fun date(): Optional<String> = Optional.ofNullable(date)

    /**
     * A list of unique identifiers (UUIDs) for specific AccountPlans and AccountPlanGroups you want
     * to retrieve.
     */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * A Boolean flag that specifies whether to include both active and inactive AccountPlans and
     * AccountPlanGroups in the list.
     * - **TRUE** - both active and inactive AccountPlans and AccountPlanGroups are included in the
     *   list.
     * - **FALSE** - only active AccountPlans and AccountPlanGroups are retrieved in the list.
     */
    fun includeall(): Optional<Boolean> = Optional.ofNullable(includeall)

    /**
     * The `nextToken` for retrieving the next page of AccountPlans and AccountPlanGroups. It is
     * used to fetch the next page of AccountPlans and AccountPlanGroups in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of AccountPlans and AccountPlanGroups to return per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * The unique identifier (UUID) for the Plan or Plan Group whose associated AccountPlans or
     * AccountPlanGroups you want to retrieve.
     */
    fun plan(): Optional<String> = Optional.ofNullable(plan)

    /**
     * The unique identifier (UUID) for the Product whose associated AccountPlans you want to
     * retrieve.
     *
     * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
     * always use it in combination with the `account` query parameter.
     */
    fun product(): Optional<String> = Optional.ofNullable(product)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountPlanListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AccountPlanListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountPlanListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var account: String? = null
        private var contract: String? = null
        private var date: String? = null
        private var ids: MutableList<String>? = null
        private var includeall: Boolean? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var plan: String? = null
        private var product: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountPlanListParams: AccountPlanListParams) = apply {
            orgId = accountPlanListParams.orgId
            account = accountPlanListParams.account
            contract = accountPlanListParams.contract
            date = accountPlanListParams.date
            ids = accountPlanListParams.ids?.toMutableList()
            includeall = accountPlanListParams.includeall
            nextToken = accountPlanListParams.nextToken
            pageSize = accountPlanListParams.pageSize
            plan = accountPlanListParams.plan
            product = accountPlanListParams.product
            additionalHeaders = accountPlanListParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountPlanListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * The unique identifier (UUID) for the Account whose AccountPlans and AccountPlanGroups you
         * want to retrieve.
         */
        fun account(account: String?) = apply { this.account = account }

        /** Alias for calling [Builder.account] with `account.orElse(null)`. */
        fun account(account: Optional<String>) = account(account.getOrNull())

        fun contract(contract: String?) = apply { this.contract = contract }

        /** Alias for calling [Builder.contract] with `contract.orElse(null)`. */
        fun contract(contract: Optional<String>) = contract(contract.getOrNull())

        /**
         * The specific date for which you want to retrieve active AccountPlans and
         * AccountPlanGroups.
         */
        fun date(date: String?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<String>) = date(date.getOrNull())

        /**
         * A list of unique identifiers (UUIDs) for specific AccountPlans and AccountPlanGroups you
         * want to retrieve.
         */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /**
         * A Boolean flag that specifies whether to include both active and inactive AccountPlans
         * and AccountPlanGroups in the list.
         * - **TRUE** - both active and inactive AccountPlans and AccountPlanGroups are included in
         *   the list.
         * - **FALSE** - only active AccountPlans and AccountPlanGroups are retrieved in the list.
         */
        fun includeall(includeall: Boolean?) = apply { this.includeall = includeall }

        /**
         * Alias for [Builder.includeall].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeall(includeall: Boolean) = includeall(includeall as Boolean?)

        /** Alias for calling [Builder.includeall] with `includeall.orElse(null)`. */
        fun includeall(includeall: Optional<Boolean>) = includeall(includeall.getOrNull())

        /**
         * The `nextToken` for retrieving the next page of AccountPlans and AccountPlanGroups. It is
         * used to fetch the next page of AccountPlans and AccountPlanGroups in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** The maximum number of AccountPlans and AccountPlanGroups to return per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * The unique identifier (UUID) for the Plan or Plan Group whose associated AccountPlans or
         * AccountPlanGroups you want to retrieve.
         */
        fun plan(plan: String?) = apply { this.plan = plan }

        /** Alias for calling [Builder.plan] with `plan.orElse(null)`. */
        fun plan(plan: Optional<String>) = plan(plan.getOrNull())

        /**
         * The unique identifier (UUID) for the Product whose associated AccountPlans you want to
         * retrieve.
         *
         * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but
         * must always use it in combination with the `account` query parameter.
         */
        fun product(product: String?) = apply { this.product = product }

        /** Alias for calling [Builder.product] with `product.orElse(null)`. */
        fun product(product: Optional<String>) = product(product.getOrNull())

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
         * Returns an immutable instance of [AccountPlanListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountPlanListParams =
            AccountPlanListParams(
                orgId,
                account,
                contract,
                date,
                ids?.toImmutable(),
                includeall,
                nextToken,
                pageSize,
                plan,
                product,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                account?.let { put("account", it) }
                contract?.let { put("contract", it) }
                date?.let { put("date", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                includeall?.let { put("includeall", it.toString()) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                plan?.let { put("plan", it) }
                product?.let { put("product", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountPlanListParams && orgId == other.orgId && account == other.account && contract == other.contract && date == other.date && ids == other.ids && includeall == other.includeall && nextToken == other.nextToken && pageSize == other.pageSize && plan == other.plan && product == other.product && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, account, contract, date, ids, includeall, nextToken, pageSize, plan, product, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountPlanListParams{orgId=$orgId, account=$account, contract=$contract, date=$date, ids=$ids, includeall=$includeall, nextToken=$nextToken, pageSize=$pageSize, plan=$plan, product=$product, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
