// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.services.blocking.AccountPlanService
import com.m3ter.sdk.services.blocking.AccountService
import com.m3ter.sdk.services.blocking.AggregationService
import com.m3ter.sdk.services.blocking.AuthenticationService
import com.m3ter.sdk.services.blocking.BalanceService
import com.m3ter.sdk.services.blocking.BillConfigService
import com.m3ter.sdk.services.blocking.CommitmentService
import com.m3ter.sdk.services.blocking.CompoundAggregationService
import com.m3ter.sdk.services.blocking.ContractService
import com.m3ter.sdk.services.blocking.CounterAdjustmentService
import com.m3ter.sdk.services.blocking.CounterPricingService
import com.m3ter.sdk.services.blocking.CounterService
import com.m3ter.sdk.services.blocking.CreditReasonService
import com.m3ter.sdk.services.blocking.CurrencyService
import com.m3ter.sdk.services.blocking.DebitReasonService
import com.m3ter.sdk.services.blocking.MeterService
import com.m3ter.sdk.services.blocking.OrganizationConfigService
import com.m3ter.sdk.services.blocking.PlanGroupLinkService
import com.m3ter.sdk.services.blocking.PlanGroupService
import com.m3ter.sdk.services.blocking.PlanService
import com.m3ter.sdk.services.blocking.PlanTemplateService
import com.m3ter.sdk.services.blocking.PricingService
import com.m3ter.sdk.services.blocking.ProductService
import com.m3ter.sdk.services.blocking.TransactionTypeService

/**
 * A client for interacting with the M3ter REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface M3terClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): M3terClientAsync

    fun authentication(): AuthenticationService

    fun accounts(): AccountService

    fun accountPlans(): AccountPlanService

    fun aggregations(): AggregationService

    fun balances(): BalanceService

    fun billConfig(): BillConfigService

    fun commitments(): CommitmentService

    fun compoundAggregations(): CompoundAggregationService

    fun contracts(): ContractService

    fun counters(): CounterService

    fun counterAdjustments(): CounterAdjustmentService

    fun counterPricings(): CounterPricingService

    fun creditReasons(): CreditReasonService

    fun currencies(): CurrencyService

    fun debitReasons(): DebitReasonService

    fun meters(): MeterService

    fun organizationConfig(): OrganizationConfigService

    fun plans(): PlanService

    fun planGroups(): PlanGroupService

    fun planGroupLinks(): PlanGroupLinkService

    fun planTemplates(): PlanTemplateService

    fun pricings(): PricingService

    fun products(): ProductService

    fun transactionTypes(): TransactionTypeService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
