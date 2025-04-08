// File generated from our OpenAPI spec by Stainless.

package com.m3ter.client

import com.m3ter.services.async.AccountPlanServiceAsync
import com.m3ter.services.async.AccountServiceAsync
import com.m3ter.services.async.AggregationServiceAsync
import com.m3ter.services.async.AuthenticationServiceAsync
import com.m3ter.services.async.BalanceServiceAsync
import com.m3ter.services.async.BillConfigServiceAsync
import com.m3ter.services.async.BillJobServiceAsync
import com.m3ter.services.async.BillServiceAsync
import com.m3ter.services.async.CommitmentServiceAsync
import com.m3ter.services.async.CompoundAggregationServiceAsync
import com.m3ter.services.async.ContractServiceAsync
import com.m3ter.services.async.CounterAdjustmentServiceAsync
import com.m3ter.services.async.CounterPricingServiceAsync
import com.m3ter.services.async.CounterServiceAsync
import com.m3ter.services.async.CreditReasonServiceAsync
import com.m3ter.services.async.CurrencyServiceAsync
import com.m3ter.services.async.CustomFieldServiceAsync
import com.m3ter.services.async.DataExportServiceAsync
import com.m3ter.services.async.DebitReasonServiceAsync
import com.m3ter.services.async.EventServiceAsync
import com.m3ter.services.async.ExternalMappingServiceAsync
import com.m3ter.services.async.IntegrationConfigurationServiceAsync
import com.m3ter.services.async.MeterServiceAsync
import com.m3ter.services.async.NotificationConfigurationServiceAsync
import com.m3ter.services.async.OrganizationConfigServiceAsync
import com.m3ter.services.async.PermissionPolicyServiceAsync
import com.m3ter.services.async.PlanGroupLinkServiceAsync
import com.m3ter.services.async.PlanGroupServiceAsync
import com.m3ter.services.async.PlanServiceAsync
import com.m3ter.services.async.PlanTemplateServiceAsync
import com.m3ter.services.async.PricingServiceAsync
import com.m3ter.services.async.ProductServiceAsync
import com.m3ter.services.async.ResourceGroupServiceAsync
import com.m3ter.services.async.ScheduledEventConfigurationServiceAsync
import com.m3ter.services.async.TransactionTypeServiceAsync
import com.m3ter.services.async.UsageServiceAsync
import com.m3ter.services.async.UserServiceAsync
import com.m3ter.services.async.WebhookServiceAsync

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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun authentication(): AuthenticationServiceAsync

    fun accounts(): AccountServiceAsync

    fun accountPlans(): AccountPlanServiceAsync

    fun aggregations(): AggregationServiceAsync

    fun balances(): BalanceServiceAsync

    fun bills(): BillServiceAsync

    fun billConfig(): BillConfigServiceAsync

    fun commitments(): CommitmentServiceAsync

    fun billJobs(): BillJobServiceAsync

    fun compoundAggregations(): CompoundAggregationServiceAsync

    fun contracts(): ContractServiceAsync

    fun counters(): CounterServiceAsync

    fun counterAdjustments(): CounterAdjustmentServiceAsync

    fun counterPricings(): CounterPricingServiceAsync

    fun creditReasons(): CreditReasonServiceAsync

    fun currencies(): CurrencyServiceAsync

    fun customFields(): CustomFieldServiceAsync

    fun dataExports(): DataExportServiceAsync

    fun debitReasons(): DebitReasonServiceAsync

    fun events(): EventServiceAsync

    fun externalMappings(): ExternalMappingServiceAsync

    fun integrationConfigurations(): IntegrationConfigurationServiceAsync

    fun meters(): MeterServiceAsync

    fun notificationConfigurations(): NotificationConfigurationServiceAsync

    fun organizationConfig(): OrganizationConfigServiceAsync

    fun permissionPolicies(): PermissionPolicyServiceAsync

    fun plans(): PlanServiceAsync

    fun planGroups(): PlanGroupServiceAsync

    fun planGroupLinks(): PlanGroupLinkServiceAsync

    fun planTemplates(): PlanTemplateServiceAsync

    fun pricings(): PricingServiceAsync

    fun products(): ProductServiceAsync

    fun resourceGroups(): ResourceGroupServiceAsync

    fun scheduledEventConfigurations(): ScheduledEventConfigurationServiceAsync

    fun transactionTypes(): TransactionTypeServiceAsync

    fun usage(): UsageServiceAsync

    fun users(): UserServiceAsync

    fun webhooks(): WebhookServiceAsync

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

    /** A view of [M3terClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun authentication(): AuthenticationServiceAsync.WithRawResponse

        fun accounts(): AccountServiceAsync.WithRawResponse

        fun accountPlans(): AccountPlanServiceAsync.WithRawResponse

        fun aggregations(): AggregationServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun bills(): BillServiceAsync.WithRawResponse

        fun billConfig(): BillConfigServiceAsync.WithRawResponse

        fun commitments(): CommitmentServiceAsync.WithRawResponse

        fun billJobs(): BillJobServiceAsync.WithRawResponse

        fun compoundAggregations(): CompoundAggregationServiceAsync.WithRawResponse

        fun contracts(): ContractServiceAsync.WithRawResponse

        fun counters(): CounterServiceAsync.WithRawResponse

        fun counterAdjustments(): CounterAdjustmentServiceAsync.WithRawResponse

        fun counterPricings(): CounterPricingServiceAsync.WithRawResponse

        fun creditReasons(): CreditReasonServiceAsync.WithRawResponse

        fun currencies(): CurrencyServiceAsync.WithRawResponse

        fun customFields(): CustomFieldServiceAsync.WithRawResponse

        fun dataExports(): DataExportServiceAsync.WithRawResponse

        fun debitReasons(): DebitReasonServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun externalMappings(): ExternalMappingServiceAsync.WithRawResponse

        fun integrationConfigurations(): IntegrationConfigurationServiceAsync.WithRawResponse

        fun meters(): MeterServiceAsync.WithRawResponse

        fun notificationConfigurations(): NotificationConfigurationServiceAsync.WithRawResponse

        fun organizationConfig(): OrganizationConfigServiceAsync.WithRawResponse

        fun permissionPolicies(): PermissionPolicyServiceAsync.WithRawResponse

        fun plans(): PlanServiceAsync.WithRawResponse

        fun planGroups(): PlanGroupServiceAsync.WithRawResponse

        fun planGroupLinks(): PlanGroupLinkServiceAsync.WithRawResponse

        fun planTemplates(): PlanTemplateServiceAsync.WithRawResponse

        fun pricings(): PricingServiceAsync.WithRawResponse

        fun products(): ProductServiceAsync.WithRawResponse

        fun resourceGroups(): ResourceGroupServiceAsync.WithRawResponse

        fun scheduledEventConfigurations(): ScheduledEventConfigurationServiceAsync.WithRawResponse

        fun transactionTypes(): TransactionTypeServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun webhooks(): WebhookServiceAsync.WithRawResponse
    }
}
