// File generated from our OpenAPI spec by Stainless.

package com.m3ter.client

import com.m3ter.core.ClientOptions
import com.m3ter.core.getPackageVersion
import com.m3ter.services.blocking.AccountPlanService
import com.m3ter.services.blocking.AccountPlanServiceImpl
import com.m3ter.services.blocking.AccountService
import com.m3ter.services.blocking.AccountServiceImpl
import com.m3ter.services.blocking.AggregationService
import com.m3ter.services.blocking.AggregationServiceImpl
import com.m3ter.services.blocking.AuthenticationService
import com.m3ter.services.blocking.AuthenticationServiceImpl
import com.m3ter.services.blocking.BalanceService
import com.m3ter.services.blocking.BalanceServiceImpl
import com.m3ter.services.blocking.BillConfigService
import com.m3ter.services.blocking.BillConfigServiceImpl
import com.m3ter.services.blocking.BillJobService
import com.m3ter.services.blocking.BillJobServiceImpl
import com.m3ter.services.blocking.BillService
import com.m3ter.services.blocking.BillServiceImpl
import com.m3ter.services.blocking.ChargeService
import com.m3ter.services.blocking.ChargeServiceImpl
import com.m3ter.services.blocking.CommitmentService
import com.m3ter.services.blocking.CommitmentServiceImpl
import com.m3ter.services.blocking.CompoundAggregationService
import com.m3ter.services.blocking.CompoundAggregationServiceImpl
import com.m3ter.services.blocking.ContractService
import com.m3ter.services.blocking.ContractServiceImpl
import com.m3ter.services.blocking.CounterAdjustmentService
import com.m3ter.services.blocking.CounterAdjustmentServiceImpl
import com.m3ter.services.blocking.CounterPricingService
import com.m3ter.services.blocking.CounterPricingServiceImpl
import com.m3ter.services.blocking.CounterService
import com.m3ter.services.blocking.CounterServiceImpl
import com.m3ter.services.blocking.CreditReasonService
import com.m3ter.services.blocking.CreditReasonServiceImpl
import com.m3ter.services.blocking.CurrencyService
import com.m3ter.services.blocking.CurrencyServiceImpl
import com.m3ter.services.blocking.CustomFieldService
import com.m3ter.services.blocking.CustomFieldServiceImpl
import com.m3ter.services.blocking.DataExportService
import com.m3ter.services.blocking.DataExportServiceImpl
import com.m3ter.services.blocking.DebitReasonService
import com.m3ter.services.blocking.DebitReasonServiceImpl
import com.m3ter.services.blocking.EventService
import com.m3ter.services.blocking.EventServiceImpl
import com.m3ter.services.blocking.ExternalMappingService
import com.m3ter.services.blocking.ExternalMappingServiceImpl
import com.m3ter.services.blocking.IntegrationConfigurationService
import com.m3ter.services.blocking.IntegrationConfigurationServiceImpl
import com.m3ter.services.blocking.LookupTableService
import com.m3ter.services.blocking.LookupTableServiceImpl
import com.m3ter.services.blocking.MeterService
import com.m3ter.services.blocking.MeterServiceImpl
import com.m3ter.services.blocking.NotificationConfigurationService
import com.m3ter.services.blocking.NotificationConfigurationServiceImpl
import com.m3ter.services.blocking.OrganizationConfigService
import com.m3ter.services.blocking.OrganizationConfigServiceImpl
import com.m3ter.services.blocking.PermissionPolicyService
import com.m3ter.services.blocking.PermissionPolicyServiceImpl
import com.m3ter.services.blocking.PlanGroupLinkService
import com.m3ter.services.blocking.PlanGroupLinkServiceImpl
import com.m3ter.services.blocking.PlanGroupService
import com.m3ter.services.blocking.PlanGroupServiceImpl
import com.m3ter.services.blocking.PlanService
import com.m3ter.services.blocking.PlanServiceImpl
import com.m3ter.services.blocking.PlanTemplateService
import com.m3ter.services.blocking.PlanTemplateServiceImpl
import com.m3ter.services.blocking.PricingService
import com.m3ter.services.blocking.PricingServiceImpl
import com.m3ter.services.blocking.ProductService
import com.m3ter.services.blocking.ProductServiceImpl
import com.m3ter.services.blocking.ResourceGroupService
import com.m3ter.services.blocking.ResourceGroupServiceImpl
import com.m3ter.services.blocking.ScheduledEventConfigurationService
import com.m3ter.services.blocking.ScheduledEventConfigurationServiceImpl
import com.m3ter.services.blocking.StatementService
import com.m3ter.services.blocking.StatementServiceImpl
import com.m3ter.services.blocking.TransactionTypeService
import com.m3ter.services.blocking.TransactionTypeServiceImpl
import com.m3ter.services.blocking.UsageService
import com.m3ter.services.blocking.UsageServiceImpl
import com.m3ter.services.blocking.UserService
import com.m3ter.services.blocking.UserServiceImpl
import com.m3ter.services.blocking.WebhookService
import com.m3ter.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

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

    private val withRawResponse: M3terClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    private val charges: ChargeService by lazy { ChargeServiceImpl(clientOptionsWithUserAgent) }

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

    private val lookupTables: LookupTableService by lazy {
        LookupTableServiceImpl(clientOptionsWithUserAgent)
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

    private val statements: StatementService by lazy {
        StatementServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactionTypes: TransactionTypeService by lazy {
        TransactionTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): M3terClientAsync = async

    override fun withRawResponse(): M3terClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): M3terClient =
        M3terClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun authentication(): AuthenticationService = authentication

    override fun accounts(): AccountService = accounts

    override fun accountPlans(): AccountPlanService = accountPlans

    override fun aggregations(): AggregationService = aggregations

    override fun balances(): BalanceService = balances

    override fun bills(): BillService = bills

    override fun billConfig(): BillConfigService = billConfig

    override fun commitments(): CommitmentService = commitments

    override fun billJobs(): BillJobService = billJobs

    override fun charges(): ChargeService = charges

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

    override fun lookupTables(): LookupTableService = lookupTables

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

    override fun statements(): StatementService = statements

    override fun transactionTypes(): TransactionTypeService = transactionTypes

    override fun usage(): UsageService = usage

    override fun users(): UserService = users

    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        M3terClient.WithRawResponse {

        private val authentication: AuthenticationService.WithRawResponse by lazy {
            AuthenticationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountPlans: AccountPlanService.WithRawResponse by lazy {
            AccountPlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aggregations: AggregationService.WithRawResponse by lazy {
            AggregationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bills: BillService.WithRawResponse by lazy {
            BillServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billConfig: BillConfigService.WithRawResponse by lazy {
            BillConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commitments: CommitmentService.WithRawResponse by lazy {
            CommitmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val billJobs: BillJobService.WithRawResponse by lazy {
            BillJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val charges: ChargeService.WithRawResponse by lazy {
            ChargeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val compoundAggregations: CompoundAggregationService.WithRawResponse by lazy {
            CompoundAggregationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val counters: CounterService.WithRawResponse by lazy {
            CounterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val counterAdjustments: CounterAdjustmentService.WithRawResponse by lazy {
            CounterAdjustmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val counterPricings: CounterPricingService.WithRawResponse by lazy {
            CounterPricingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditReasons: CreditReasonService.WithRawResponse by lazy {
            CreditReasonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val currencies: CurrencyService.WithRawResponse by lazy {
            CurrencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customFields: CustomFieldService.WithRawResponse by lazy {
            CustomFieldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataExports: DataExportService.WithRawResponse by lazy {
            DataExportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val debitReasons: DebitReasonService.WithRawResponse by lazy {
            DebitReasonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalMappings: ExternalMappingService.WithRawResponse by lazy {
            ExternalMappingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrationConfigurations:
            IntegrationConfigurationService.WithRawResponse by lazy {
            IntegrationConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookupTables: LookupTableService.WithRawResponse by lazy {
            LookupTableServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val meters: MeterService.WithRawResponse by lazy {
            MeterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationConfigurations:
            NotificationConfigurationService.WithRawResponse by lazy {
            NotificationConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizationConfig: OrganizationConfigService.WithRawResponse by lazy {
            OrganizationConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val permissionPolicies: PermissionPolicyService.WithRawResponse by lazy {
            PermissionPolicyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanService.WithRawResponse by lazy {
            PlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val planGroups: PlanGroupService.WithRawResponse by lazy {
            PlanGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val planGroupLinks: PlanGroupLinkService.WithRawResponse by lazy {
            PlanGroupLinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val planTemplates: PlanTemplateService.WithRawResponse by lazy {
            PlanTemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pricings: PricingService.WithRawResponse by lazy {
            PricingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val resourceGroups: ResourceGroupService.WithRawResponse by lazy {
            ResourceGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduledEventConfigurations:
            ScheduledEventConfigurationService.WithRawResponse by lazy {
            ScheduledEventConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val statements: StatementService.WithRawResponse by lazy {
            StatementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionTypes: TransactionTypeService.WithRawResponse by lazy {
            TransactionTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): M3terClient.WithRawResponse =
            M3terClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun authentication(): AuthenticationService.WithRawResponse = authentication

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun accountPlans(): AccountPlanService.WithRawResponse = accountPlans

        override fun aggregations(): AggregationService.WithRawResponse = aggregations

        override fun balances(): BalanceService.WithRawResponse = balances

        override fun bills(): BillService.WithRawResponse = bills

        override fun billConfig(): BillConfigService.WithRawResponse = billConfig

        override fun commitments(): CommitmentService.WithRawResponse = commitments

        override fun billJobs(): BillJobService.WithRawResponse = billJobs

        override fun charges(): ChargeService.WithRawResponse = charges

        override fun compoundAggregations(): CompoundAggregationService.WithRawResponse =
            compoundAggregations

        override fun contracts(): ContractService.WithRawResponse = contracts

        override fun counters(): CounterService.WithRawResponse = counters

        override fun counterAdjustments(): CounterAdjustmentService.WithRawResponse =
            counterAdjustments

        override fun counterPricings(): CounterPricingService.WithRawResponse = counterPricings

        override fun creditReasons(): CreditReasonService.WithRawResponse = creditReasons

        override fun currencies(): CurrencyService.WithRawResponse = currencies

        override fun customFields(): CustomFieldService.WithRawResponse = customFields

        override fun dataExports(): DataExportService.WithRawResponse = dataExports

        override fun debitReasons(): DebitReasonService.WithRawResponse = debitReasons

        override fun events(): EventService.WithRawResponse = events

        override fun externalMappings(): ExternalMappingService.WithRawResponse = externalMappings

        override fun integrationConfigurations(): IntegrationConfigurationService.WithRawResponse =
            integrationConfigurations

        override fun lookupTables(): LookupTableService.WithRawResponse = lookupTables

        override fun meters(): MeterService.WithRawResponse = meters

        override fun notificationConfigurations():
            NotificationConfigurationService.WithRawResponse = notificationConfigurations

        override fun organizationConfig(): OrganizationConfigService.WithRawResponse =
            organizationConfig

        override fun permissionPolicies(): PermissionPolicyService.WithRawResponse =
            permissionPolicies

        override fun plans(): PlanService.WithRawResponse = plans

        override fun planGroups(): PlanGroupService.WithRawResponse = planGroups

        override fun planGroupLinks(): PlanGroupLinkService.WithRawResponse = planGroupLinks

        override fun planTemplates(): PlanTemplateService.WithRawResponse = planTemplates

        override fun pricings(): PricingService.WithRawResponse = pricings

        override fun products(): ProductService.WithRawResponse = products

        override fun resourceGroups(): ResourceGroupService.WithRawResponse = resourceGroups

        override fun scheduledEventConfigurations():
            ScheduledEventConfigurationService.WithRawResponse = scheduledEventConfigurations

        override fun statements(): StatementService.WithRawResponse = statements

        override fun transactionTypes(): TransactionTypeService.WithRawResponse = transactionTypes

        override fun usage(): UsageService.WithRawResponse = usage

        override fun users(): UserService.WithRawResponse = users

        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
