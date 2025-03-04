// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.client

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.getPackageVersion
import com.m3ter.sdk.services.blocking.AccountPlanService
import com.m3ter.sdk.services.blocking.AccountPlanServiceImpl
import com.m3ter.sdk.services.blocking.AccountService
import com.m3ter.sdk.services.blocking.AccountServiceImpl
import com.m3ter.sdk.services.blocking.AggregationService
import com.m3ter.sdk.services.blocking.AggregationServiceImpl
import com.m3ter.sdk.services.blocking.AuthenticationService
import com.m3ter.sdk.services.blocking.AuthenticationServiceImpl
import com.m3ter.sdk.services.blocking.BalanceService
import com.m3ter.sdk.services.blocking.BalanceServiceImpl
import com.m3ter.sdk.services.blocking.BillConfigService
import com.m3ter.sdk.services.blocking.BillConfigServiceImpl
import com.m3ter.sdk.services.blocking.BillJobService
import com.m3ter.sdk.services.blocking.BillJobServiceImpl
import com.m3ter.sdk.services.blocking.BillService
import com.m3ter.sdk.services.blocking.BillServiceImpl
import com.m3ter.sdk.services.blocking.CommitmentService
import com.m3ter.sdk.services.blocking.CommitmentServiceImpl
import com.m3ter.sdk.services.blocking.CompoundAggregationService
import com.m3ter.sdk.services.blocking.CompoundAggregationServiceImpl
import com.m3ter.sdk.services.blocking.ContractService
import com.m3ter.sdk.services.blocking.ContractServiceImpl
import com.m3ter.sdk.services.blocking.CounterAdjustmentService
import com.m3ter.sdk.services.blocking.CounterAdjustmentServiceImpl
import com.m3ter.sdk.services.blocking.CounterPricingService
import com.m3ter.sdk.services.blocking.CounterPricingServiceImpl
import com.m3ter.sdk.services.blocking.CounterService
import com.m3ter.sdk.services.blocking.CounterServiceImpl
import com.m3ter.sdk.services.blocking.CreditReasonService
import com.m3ter.sdk.services.blocking.CreditReasonServiceImpl
import com.m3ter.sdk.services.blocking.CurrencyService
import com.m3ter.sdk.services.blocking.CurrencyServiceImpl
import com.m3ter.sdk.services.blocking.CustomFieldService
import com.m3ter.sdk.services.blocking.CustomFieldServiceImpl
import com.m3ter.sdk.services.blocking.DataExportService
import com.m3ter.sdk.services.blocking.DataExportServiceImpl
import com.m3ter.sdk.services.blocking.DebitReasonService
import com.m3ter.sdk.services.blocking.DebitReasonServiceImpl
import com.m3ter.sdk.services.blocking.EventService
import com.m3ter.sdk.services.blocking.EventServiceImpl
import com.m3ter.sdk.services.blocking.ExternalMappingService
import com.m3ter.sdk.services.blocking.ExternalMappingServiceImpl
import com.m3ter.sdk.services.blocking.IntegrationConfigurationService
import com.m3ter.sdk.services.blocking.IntegrationConfigurationServiceImpl
import com.m3ter.sdk.services.blocking.MeterService
import com.m3ter.sdk.services.blocking.MeterServiceImpl
import com.m3ter.sdk.services.blocking.NotificationConfigurationService
import com.m3ter.sdk.services.blocking.NotificationConfigurationServiceImpl
import com.m3ter.sdk.services.blocking.OrganizationConfigService
import com.m3ter.sdk.services.blocking.OrganizationConfigServiceImpl
import com.m3ter.sdk.services.blocking.PermissionPolicyService
import com.m3ter.sdk.services.blocking.PermissionPolicyServiceImpl
import com.m3ter.sdk.services.blocking.PlanGroupLinkService
import com.m3ter.sdk.services.blocking.PlanGroupLinkServiceImpl
import com.m3ter.sdk.services.blocking.PlanGroupService
import com.m3ter.sdk.services.blocking.PlanGroupServiceImpl
import com.m3ter.sdk.services.blocking.PlanService
import com.m3ter.sdk.services.blocking.PlanServiceImpl
import com.m3ter.sdk.services.blocking.PlanTemplateService
import com.m3ter.sdk.services.blocking.PlanTemplateServiceImpl
import com.m3ter.sdk.services.blocking.PricingService
import com.m3ter.sdk.services.blocking.PricingServiceImpl
import com.m3ter.sdk.services.blocking.ProductService
import com.m3ter.sdk.services.blocking.ProductServiceImpl
import com.m3ter.sdk.services.blocking.ResourceGroupService
import com.m3ter.sdk.services.blocking.ResourceGroupServiceImpl
import com.m3ter.sdk.services.blocking.ScheduledEventConfigurationService
import com.m3ter.sdk.services.blocking.ScheduledEventConfigurationServiceImpl
import com.m3ter.sdk.services.blocking.TransactionTypeService
import com.m3ter.sdk.services.blocking.TransactionTypeServiceImpl
import com.m3ter.sdk.services.blocking.UsageService
import com.m3ter.sdk.services.blocking.UsageServiceImpl
import com.m3ter.sdk.services.blocking.UserService
import com.m3ter.sdk.services.blocking.UserServiceImpl
import com.m3ter.sdk.services.blocking.WebhookService
import com.m3ter.sdk.services.blocking.WebhookServiceImpl

class M3terClientImpl(private val clientOptions: ClientOptions) : M3terClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: M3terClientAsync by lazy { M3terClientAsyncImpl(clientOptions) }

    private val authentication: AuthenticationService by lazy {
        AuthenticationServiceImpl(clientOptionsWithUserAgent)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val accountPlans: AccountPlanService by lazy {
        AccountPlanServiceImpl(clientOptionsWithUserAgent)
    }

    private val aggregations: AggregationService by lazy {
        AggregationServiceImpl(clientOptionsWithUserAgent)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val bills: BillService by lazy { BillServiceImpl(clientOptionsWithUserAgent) }

    private val billConfig: BillConfigService by lazy {
        BillConfigServiceImpl(clientOptionsWithUserAgent)
    }

    private val commitments: CommitmentService by lazy {
        CommitmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val billJobs: BillJobService by lazy { BillJobServiceImpl(clientOptionsWithUserAgent) }

    private val compoundAggregations: CompoundAggregationService by lazy {
        CompoundAggregationServiceImpl(clientOptionsWithUserAgent)
    }

    private val contracts: ContractService by lazy {
        ContractServiceImpl(clientOptionsWithUserAgent)
    }

    private val counters: CounterService by lazy { CounterServiceImpl(clientOptionsWithUserAgent) }

    private val counterAdjustments: CounterAdjustmentService by lazy {
        CounterAdjustmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val counterPricings: CounterPricingService by lazy {
        CounterPricingServiceImpl(clientOptionsWithUserAgent)
    }

    private val creditReasons: CreditReasonService by lazy {
        CreditReasonServiceImpl(clientOptionsWithUserAgent)
    }

    private val currencies: CurrencyService by lazy {
        CurrencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val customFields: CustomFieldService by lazy {
        CustomFieldServiceImpl(clientOptionsWithUserAgent)
    }

    private val dataExports: DataExportService by lazy {
        DataExportServiceImpl(clientOptionsWithUserAgent)
    }

    private val debitReasons: DebitReasonService by lazy {
        DebitReasonServiceImpl(clientOptionsWithUserAgent)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val externalMappings: ExternalMappingService by lazy {
        ExternalMappingServiceImpl(clientOptionsWithUserAgent)
    }

    private val integrationConfigurations: IntegrationConfigurationService by lazy {
        IntegrationConfigurationServiceImpl(clientOptionsWithUserAgent)
    }

    private val meters: MeterService by lazy { MeterServiceImpl(clientOptionsWithUserAgent) }

    private val notificationConfigurations: NotificationConfigurationService by lazy {
        NotificationConfigurationServiceImpl(clientOptionsWithUserAgent)
    }

    private val organizationConfig: OrganizationConfigService by lazy {
        OrganizationConfigServiceImpl(clientOptionsWithUserAgent)
    }

    private val permissionPolicies: PermissionPolicyService by lazy {
        PermissionPolicyServiceImpl(clientOptionsWithUserAgent)
    }

    private val plans: PlanService by lazy { PlanServiceImpl(clientOptionsWithUserAgent) }

    private val planGroups: PlanGroupService by lazy {
        PlanGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val planGroupLinks: PlanGroupLinkService by lazy {
        PlanGroupLinkServiceImpl(clientOptionsWithUserAgent)
    }

    private val planTemplates: PlanTemplateService by lazy {
        PlanTemplateServiceImpl(clientOptionsWithUserAgent)
    }

    private val pricings: PricingService by lazy { PricingServiceImpl(clientOptionsWithUserAgent) }

    private val products: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val resourceGroups: ResourceGroupService by lazy {
        ResourceGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val scheduledEventConfigurations: ScheduledEventConfigurationService by lazy {
        ScheduledEventConfigurationServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactionTypes: TransactionTypeService by lazy {
        TransactionTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): M3terClientAsync = async

    override fun authentication(): AuthenticationService = authentication

    override fun accounts(): AccountService = accounts

    override fun accountPlans(): AccountPlanService = accountPlans

    override fun aggregations(): AggregationService = aggregations

    override fun balances(): BalanceService = balances

    override fun bills(): BillService = bills

    override fun billConfig(): BillConfigService = billConfig

    override fun commitments(): CommitmentService = commitments

    override fun billJobs(): BillJobService = billJobs

    override fun compoundAggregations(): CompoundAggregationService = compoundAggregations

    override fun contracts(): ContractService = contracts

    override fun counters(): CounterService = counters

    override fun counterAdjustments(): CounterAdjustmentService = counterAdjustments

    override fun counterPricings(): CounterPricingService = counterPricings

    override fun creditReasons(): CreditReasonService = creditReasons

    override fun currencies(): CurrencyService = currencies

    override fun customFields(): CustomFieldService = customFields

    override fun dataExports(): DataExportService = dataExports

    override fun debitReasons(): DebitReasonService = debitReasons

    override fun events(): EventService = events

    override fun externalMappings(): ExternalMappingService = externalMappings

    override fun integrationConfigurations(): IntegrationConfigurationService =
        integrationConfigurations

    override fun meters(): MeterService = meters

    override fun notificationConfigurations(): NotificationConfigurationService =
        notificationConfigurations

    override fun organizationConfig(): OrganizationConfigService = organizationConfig

    override fun permissionPolicies(): PermissionPolicyService = permissionPolicies

    override fun plans(): PlanService = plans

    override fun planGroups(): PlanGroupService = planGroups

    override fun planGroupLinks(): PlanGroupLinkService = planGroupLinks

    override fun planTemplates(): PlanTemplateService = planTemplates

    override fun pricings(): PricingService = pricings

    override fun products(): ProductService = products

    override fun resourceGroups(): ResourceGroupService = resourceGroups

    override fun scheduledEventConfigurations(): ScheduledEventConfigurationService =
        scheduledEventConfigurations

    override fun transactionTypes(): TransactionTypeService = transactionTypes

    override fun usage(): UsageService = usage

    override fun users(): UserService = users

    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.httpClient.close()
}
