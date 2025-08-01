// File generated from our OpenAPI spec by Stainless.

package com.m3ter.client

import com.m3ter.core.ClientOptions
import com.m3ter.services.blocking.AccountPlanService
import com.m3ter.services.blocking.AccountService
import com.m3ter.services.blocking.AggregationService
import com.m3ter.services.blocking.AuthenticationService
import com.m3ter.services.blocking.BalanceService
import com.m3ter.services.blocking.BillConfigService
import com.m3ter.services.blocking.BillJobService
import com.m3ter.services.blocking.BillService
import com.m3ter.services.blocking.CommitmentService
import com.m3ter.services.blocking.CompoundAggregationService
import com.m3ter.services.blocking.ContractService
import com.m3ter.services.blocking.CounterAdjustmentService
import com.m3ter.services.blocking.CounterPricingService
import com.m3ter.services.blocking.CounterService
import com.m3ter.services.blocking.CreditReasonService
import com.m3ter.services.blocking.CurrencyService
import com.m3ter.services.blocking.CustomFieldService
import com.m3ter.services.blocking.DataExportService
import com.m3ter.services.blocking.DebitReasonService
import com.m3ter.services.blocking.EventService
import com.m3ter.services.blocking.ExternalMappingService
import com.m3ter.services.blocking.IntegrationConfigurationService
import com.m3ter.services.blocking.MeterService
import com.m3ter.services.blocking.NotificationConfigurationService
import com.m3ter.services.blocking.OrganizationConfigService
import com.m3ter.services.blocking.PermissionPolicyService
import com.m3ter.services.blocking.PlanGroupLinkService
import com.m3ter.services.blocking.PlanGroupService
import com.m3ter.services.blocking.PlanService
import com.m3ter.services.blocking.PlanTemplateService
import com.m3ter.services.blocking.PricingService
import com.m3ter.services.blocking.ProductService
import com.m3ter.services.blocking.ResourceGroupService
import com.m3ter.services.blocking.ScheduledEventConfigurationService
import com.m3ter.services.blocking.StatementService
import com.m3ter.services.blocking.TransactionTypeService
import com.m3ter.services.blocking.UsageService
import com.m3ter.services.blocking.UserService
import com.m3ter.services.blocking.WebhookService
import java.util.function.Consumer

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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): M3terClient

    fun authentication(): AuthenticationService

    fun accounts(): AccountService

    fun accountPlans(): AccountPlanService

    fun aggregations(): AggregationService

    fun balances(): BalanceService

    fun bills(): BillService

    fun billConfig(): BillConfigService

    fun commitments(): CommitmentService

    fun billJobs(): BillJobService

    fun compoundAggregations(): CompoundAggregationService

    fun contracts(): ContractService

    fun counters(): CounterService

    fun counterAdjustments(): CounterAdjustmentService

    fun counterPricings(): CounterPricingService

    fun creditReasons(): CreditReasonService

    fun currencies(): CurrencyService

    fun customFields(): CustomFieldService

    fun dataExports(): DataExportService

    fun debitReasons(): DebitReasonService

    fun events(): EventService

    fun externalMappings(): ExternalMappingService

    fun integrationConfigurations(): IntegrationConfigurationService

    fun meters(): MeterService

    fun notificationConfigurations(): NotificationConfigurationService

    fun organizationConfig(): OrganizationConfigService

    fun permissionPolicies(): PermissionPolicyService

    fun plans(): PlanService

    fun planGroups(): PlanGroupService

    fun planGroupLinks(): PlanGroupLinkService

    fun planTemplates(): PlanTemplateService

    fun pricings(): PricingService

    fun products(): ProductService

    fun resourceGroups(): ResourceGroupService

    fun scheduledEventConfigurations(): ScheduledEventConfigurationService

    fun statements(): StatementService

    fun transactionTypes(): TransactionTypeService

    fun usage(): UsageService

    fun users(): UserService

    fun webhooks(): WebhookService

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

    /** A view of [M3terClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): M3terClient.WithRawResponse

        fun authentication(): AuthenticationService.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun accountPlans(): AccountPlanService.WithRawResponse

        fun aggregations(): AggregationService.WithRawResponse

        fun balances(): BalanceService.WithRawResponse

        fun bills(): BillService.WithRawResponse

        fun billConfig(): BillConfigService.WithRawResponse

        fun commitments(): CommitmentService.WithRawResponse

        fun billJobs(): BillJobService.WithRawResponse

        fun compoundAggregations(): CompoundAggregationService.WithRawResponse

        fun contracts(): ContractService.WithRawResponse

        fun counters(): CounterService.WithRawResponse

        fun counterAdjustments(): CounterAdjustmentService.WithRawResponse

        fun counterPricings(): CounterPricingService.WithRawResponse

        fun creditReasons(): CreditReasonService.WithRawResponse

        fun currencies(): CurrencyService.WithRawResponse

        fun customFields(): CustomFieldService.WithRawResponse

        fun dataExports(): DataExportService.WithRawResponse

        fun debitReasons(): DebitReasonService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun externalMappings(): ExternalMappingService.WithRawResponse

        fun integrationConfigurations(): IntegrationConfigurationService.WithRawResponse

        fun meters(): MeterService.WithRawResponse

        fun notificationConfigurations(): NotificationConfigurationService.WithRawResponse

        fun organizationConfig(): OrganizationConfigService.WithRawResponse

        fun permissionPolicies(): PermissionPolicyService.WithRawResponse

        fun plans(): PlanService.WithRawResponse

        fun planGroups(): PlanGroupService.WithRawResponse

        fun planGroupLinks(): PlanGroupLinkService.WithRawResponse

        fun planTemplates(): PlanTemplateService.WithRawResponse

        fun pricings(): PricingService.WithRawResponse

        fun products(): ProductService.WithRawResponse

        fun resourceGroups(): ResourceGroupService.WithRawResponse

        fun scheduledEventConfigurations(): ScheduledEventConfigurationService.WithRawResponse

        fun statements(): StatementService.WithRawResponse

        fun transactionTypes(): TransactionTypeService.WithRawResponse

        fun usage(): UsageService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse
    }
}
