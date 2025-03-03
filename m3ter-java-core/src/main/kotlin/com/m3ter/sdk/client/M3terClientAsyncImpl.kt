// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.getPackageVersion
import com.m3ter.sdk.services.async.AccountPlanServiceAsync
import com.m3ter.sdk.services.async.AccountPlanServiceAsyncImpl
import com.m3ter.sdk.services.async.AccountServiceAsync
import com.m3ter.sdk.services.async.AccountServiceAsyncImpl
import com.m3ter.sdk.services.async.AggregationServiceAsync
import com.m3ter.sdk.services.async.AggregationServiceAsyncImpl
import com.m3ter.sdk.services.async.AuthenticationServiceAsync
import com.m3ter.sdk.services.async.AuthenticationServiceAsyncImpl
import com.m3ter.sdk.services.async.BalanceServiceAsync
import com.m3ter.sdk.services.async.BalanceServiceAsyncImpl
import com.m3ter.sdk.services.async.BillConfigServiceAsync
import com.m3ter.sdk.services.async.BillConfigServiceAsyncImpl
import com.m3ter.sdk.services.async.BillJobServiceAsync
import com.m3ter.sdk.services.async.BillJobServiceAsyncImpl
import com.m3ter.sdk.services.async.BillServiceAsync
import com.m3ter.sdk.services.async.BillServiceAsyncImpl
import com.m3ter.sdk.services.async.CommitmentServiceAsync
import com.m3ter.sdk.services.async.CommitmentServiceAsyncImpl
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsync
import com.m3ter.sdk.services.async.CompoundAggregationServiceAsyncImpl
import com.m3ter.sdk.services.async.ContractServiceAsync
import com.m3ter.sdk.services.async.ContractServiceAsyncImpl
import com.m3ter.sdk.services.async.CounterAdjustmentServiceAsync
import com.m3ter.sdk.services.async.CounterAdjustmentServiceAsyncImpl
import com.m3ter.sdk.services.async.CounterPricingServiceAsync
import com.m3ter.sdk.services.async.CounterPricingServiceAsyncImpl
import com.m3ter.sdk.services.async.CounterServiceAsync
import com.m3ter.sdk.services.async.CounterServiceAsyncImpl
import com.m3ter.sdk.services.async.CreditReasonServiceAsync
import com.m3ter.sdk.services.async.CreditReasonServiceAsyncImpl
import com.m3ter.sdk.services.async.CurrencyServiceAsync
import com.m3ter.sdk.services.async.CurrencyServiceAsyncImpl
import com.m3ter.sdk.services.async.CustomFieldServiceAsync
import com.m3ter.sdk.services.async.CustomFieldServiceAsyncImpl
import com.m3ter.sdk.services.async.DataExportServiceAsync
import com.m3ter.sdk.services.async.DataExportServiceAsyncImpl
import com.m3ter.sdk.services.async.DebitReasonServiceAsync
import com.m3ter.sdk.services.async.DebitReasonServiceAsyncImpl
import com.m3ter.sdk.services.async.EventServiceAsync
import com.m3ter.sdk.services.async.EventServiceAsyncImpl
import com.m3ter.sdk.services.async.ExternalMappingServiceAsync
import com.m3ter.sdk.services.async.ExternalMappingServiceAsyncImpl
import com.m3ter.sdk.services.async.IntegrationConfigurationServiceAsync
import com.m3ter.sdk.services.async.IntegrationConfigurationServiceAsyncImpl
import com.m3ter.sdk.services.async.MeterServiceAsync
import com.m3ter.sdk.services.async.MeterServiceAsyncImpl
import com.m3ter.sdk.services.async.NotificationConfigurationServiceAsync
import com.m3ter.sdk.services.async.NotificationConfigurationServiceAsyncImpl
import com.m3ter.sdk.services.async.OrganizationConfigServiceAsync
import com.m3ter.sdk.services.async.OrganizationConfigServiceAsyncImpl
import com.m3ter.sdk.services.async.PermissionPolicyServiceAsync
import com.m3ter.sdk.services.async.PermissionPolicyServiceAsyncImpl
import com.m3ter.sdk.services.async.PlanGroupLinkServiceAsync
import com.m3ter.sdk.services.async.PlanGroupLinkServiceAsyncImpl
import com.m3ter.sdk.services.async.PlanGroupServiceAsync
import com.m3ter.sdk.services.async.PlanGroupServiceAsyncImpl
import com.m3ter.sdk.services.async.PlanServiceAsync
import com.m3ter.sdk.services.async.PlanServiceAsyncImpl
import com.m3ter.sdk.services.async.PlanTemplateServiceAsync
import com.m3ter.sdk.services.async.PlanTemplateServiceAsyncImpl
import com.m3ter.sdk.services.async.PricingServiceAsync
import com.m3ter.sdk.services.async.PricingServiceAsyncImpl
import com.m3ter.sdk.services.async.ProductServiceAsync
import com.m3ter.sdk.services.async.ProductServiceAsyncImpl
import com.m3ter.sdk.services.async.ResourceGroupServiceAsync
import com.m3ter.sdk.services.async.ResourceGroupServiceAsyncImpl
import com.m3ter.sdk.services.async.ScheduledEventConfigurationServiceAsync
import com.m3ter.sdk.services.async.ScheduledEventConfigurationServiceAsyncImpl
import com.m3ter.sdk.services.async.TransactionTypeServiceAsync
import com.m3ter.sdk.services.async.TransactionTypeServiceAsyncImpl
import com.m3ter.sdk.services.async.UsageServiceAsync
import com.m3ter.sdk.services.async.UsageServiceAsyncImpl
import com.m3ter.sdk.services.async.UserServiceAsync
import com.m3ter.sdk.services.async.UserServiceAsyncImpl
import com.m3ter.sdk.services.async.WebhookServiceAsync
import com.m3ter.sdk.services.async.WebhookServiceAsyncImpl

class M3terClientAsyncImpl(private val clientOptions: ClientOptions) : M3terClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: M3terClient by lazy { M3terClientImpl(clientOptions) }

    private val authentication: AuthenticationServiceAsync by lazy {
        AuthenticationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountPlans: AccountPlanServiceAsync by lazy {
        AccountPlanServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aggregations: AggregationServiceAsync by lazy {
        AggregationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val balances: BalanceServiceAsync by lazy {
        BalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bills: BillServiceAsync by lazy { BillServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val billConfig: BillConfigServiceAsync by lazy {
        BillConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val commitments: CommitmentServiceAsync by lazy {
        CommitmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val billJobs: BillJobServiceAsync by lazy {
        BillJobServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val compoundAggregations: CompoundAggregationServiceAsync by lazy {
        CompoundAggregationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val contracts: ContractServiceAsync by lazy {
        ContractServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val counters: CounterServiceAsync by lazy {
        CounterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val counterAdjustments: CounterAdjustmentServiceAsync by lazy {
        CounterAdjustmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val counterPricings: CounterPricingServiceAsync by lazy {
        CounterPricingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val creditReasons: CreditReasonServiceAsync by lazy {
        CreditReasonServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val currencies: CurrencyServiceAsync by lazy {
        CurrencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val customFields: CustomFieldServiceAsync by lazy {
        CustomFieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val dataExports: DataExportServiceAsync by lazy {
        DataExportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val debitReasons: DebitReasonServiceAsync by lazy {
        DebitReasonServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val externalMappings: ExternalMappingServiceAsync by lazy {
        ExternalMappingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val integrationConfigurations: IntegrationConfigurationServiceAsync by lazy {
        IntegrationConfigurationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val meters: MeterServiceAsync by lazy {
        MeterServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notificationConfigurations: NotificationConfigurationServiceAsync by lazy {
        NotificationConfigurationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val organizationConfig: OrganizationConfigServiceAsync by lazy {
        OrganizationConfigServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val permissionPolicies: PermissionPolicyServiceAsync by lazy {
        PermissionPolicyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val plans: PlanServiceAsync by lazy { PlanServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val planGroups: PlanGroupServiceAsync by lazy {
        PlanGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val planGroupLinks: PlanGroupLinkServiceAsync by lazy {
        PlanGroupLinkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val planTemplates: PlanTemplateServiceAsync by lazy {
        PlanTemplateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pricings: PricingServiceAsync by lazy {
        PricingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val products: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val resourceGroups: ResourceGroupServiceAsync by lazy {
        ResourceGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scheduledEventConfigurations: ScheduledEventConfigurationServiceAsync by lazy {
        ScheduledEventConfigurationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactionTypes: TransactionTypeServiceAsync by lazy {
        TransactionTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageServiceAsync by lazy {
        UsageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): M3terClient = sync

    override fun authentication(): AuthenticationServiceAsync = authentication

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountPlans(): AccountPlanServiceAsync = accountPlans

    override fun aggregations(): AggregationServiceAsync = aggregations

    override fun balances(): BalanceServiceAsync = balances

    override fun bills(): BillServiceAsync = bills

    override fun billConfig(): BillConfigServiceAsync = billConfig

    override fun commitments(): CommitmentServiceAsync = commitments

    override fun billJobs(): BillJobServiceAsync = billJobs

    override fun compoundAggregations(): CompoundAggregationServiceAsync = compoundAggregations

    override fun contracts(): ContractServiceAsync = contracts

    override fun counters(): CounterServiceAsync = counters

    override fun counterAdjustments(): CounterAdjustmentServiceAsync = counterAdjustments

    override fun counterPricings(): CounterPricingServiceAsync = counterPricings

    override fun creditReasons(): CreditReasonServiceAsync = creditReasons

    override fun currencies(): CurrencyServiceAsync = currencies

    override fun customFields(): CustomFieldServiceAsync = customFields

    override fun dataExports(): DataExportServiceAsync = dataExports

    override fun debitReasons(): DebitReasonServiceAsync = debitReasons

    override fun events(): EventServiceAsync = events

    override fun externalMappings(): ExternalMappingServiceAsync = externalMappings

    override fun integrationConfigurations(): IntegrationConfigurationServiceAsync =
        integrationConfigurations

    override fun meters(): MeterServiceAsync = meters

    override fun notificationConfigurations(): NotificationConfigurationServiceAsync =
        notificationConfigurations

    override fun organizationConfig(): OrganizationConfigServiceAsync = organizationConfig

    override fun permissionPolicies(): PermissionPolicyServiceAsync = permissionPolicies

    override fun plans(): PlanServiceAsync = plans

    override fun planGroups(): PlanGroupServiceAsync = planGroups

    override fun planGroupLinks(): PlanGroupLinkServiceAsync = planGroupLinks

    override fun planTemplates(): PlanTemplateServiceAsync = planTemplates

    override fun pricings(): PricingServiceAsync = pricings

    override fun products(): ProductServiceAsync = products

    override fun resourceGroups(): ResourceGroupServiceAsync = resourceGroups

    override fun scheduledEventConfigurations(): ScheduledEventConfigurationServiceAsync =
        scheduledEventConfigurations

    override fun transactionTypes(): TransactionTypeServiceAsync = transactionTypes

    override fun usage(): UsageServiceAsync = usage

    override fun users(): UserServiceAsync = users

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.httpClient.close()
}
