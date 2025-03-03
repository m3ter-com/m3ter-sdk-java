// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.services.async.AccountPlanServiceAsync
import com.m3ter.sdk.services.async.AccountServiceAsync
import com.m3ter.sdk.services.async.AggregationServiceAsync
import com.m3ter.sdk.services.async.AuthenticationServiceAsync
import com.m3ter.sdk.services.async.BalanceServiceAsync
import com.m3ter.sdk.services.async.BillConfigServiceAsync
import com.m3ter.sdk.services.async.CommitmentServiceAsync
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsync
import com.m3ter.sdk.services.async.ContractServiceAsync
import com.m3ter.sdk.services.async.CounterAdjustmentServiceAsync
import com.m3ter.sdk.services.async.CounterPricingServiceAsync
import com.m3ter.sdk.services.async.CounterServiceAsync
import com.m3ter.sdk.services.async.CreditReasonServiceAsync
import com.m3ter.sdk.services.async.CurrencyServiceAsync
import com.m3ter.sdk.services.async.DataExportServiceAsync
import com.m3ter.sdk.services.async.DebitReasonServiceAsync
import com.m3ter.sdk.services.async.MeterServiceAsync
import com.m3ter.sdk.services.async.OrganizationConfigServiceAsync
import com.m3ter.sdk.services.async.PlanGroupLinkServiceAsync
import com.m3ter.sdk.services.async.PlanGroupServiceAsync
import com.m3ter.sdk.services.async.PlanServiceAsync
import com.m3ter.sdk.services.async.PlanTemplateServiceAsync
import com.m3ter.sdk.services.async.PricingServiceAsync
import com.m3ter.sdk.services.async.ProductServiceAsync
import com.m3ter.sdk.services.async.TransactionTypeServiceAsync

/**
 * A client for interacting with the M3ter REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface M3terClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): M3terClient

    fun authentication(): AuthenticationServiceAsync

    fun accounts(): AccountServiceAsync

    fun accountPlans(): AccountPlanServiceAsync

    fun aggregations(): AggregationServiceAsync

    fun balances(): BalanceServiceAsync

    fun billConfig(): BillConfigServiceAsync

    fun commitments(): CommitmentServiceAsync

    fun compoundAggregations(): CompoundAggregationServiceAsync

    fun contracts(): ContractServiceAsync

    fun counters(): CounterServiceAsync

    fun counterAdjustments(): CounterAdjustmentServiceAsync

    fun counterPricings(): CounterPricingServiceAsync

    fun creditReasons(): CreditReasonServiceAsync

    fun currencies(): CurrencyServiceAsync

    fun debitReasons(): DebitReasonServiceAsync

    fun meters(): MeterServiceAsync

    fun organizationConfig(): OrganizationConfigServiceAsync

    fun plans(): PlanServiceAsync

    fun planGroups(): PlanGroupServiceAsync

    fun planGroupLinks(): PlanGroupLinkServiceAsync

    fun planTemplates(): PlanTemplateServiceAsync

    fun pricings(): PricingServiceAsync

    fun products(): ProductServiceAsync

    fun transactionTypes(): TransactionTypeServiceAsync

    fun dataExports(): DataExportServiceAsync

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
