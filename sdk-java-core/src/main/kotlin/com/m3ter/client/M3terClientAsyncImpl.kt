// File generated from our OpenAPI spec by Stainless.

package com.m3ter.client

import com.m3ter.core.ClientOptions
import com.m3ter.core.getPackageVersion
import com.m3ter.services.async.AccountPlanServiceAsync
import com.m3ter.services.async.AccountPlanServiceAsyncImpl
import com.m3ter.services.async.AccountServiceAsync
import com.m3ter.services.async.AccountServiceAsyncImpl
import com.m3ter.services.async.AggregationServiceAsync
import com.m3ter.services.async.AggregationServiceAsyncImpl
import com.m3ter.services.async.AuthenticationServiceAsync
import com.m3ter.services.async.AuthenticationServiceAsyncImpl
import com.m3ter.services.async.BalanceServiceAsync
import com.m3ter.services.async.BalanceServiceAsyncImpl
import com.m3ter.services.async.BillConfigServiceAsync
import com.m3ter.services.async.BillConfigServiceAsyncImpl
import com.m3ter.services.async.BillJobServiceAsync
import com.m3ter.services.async.BillJobServiceAsyncImpl
import com.m3ter.services.async.BillServiceAsync
import com.m3ter.services.async.BillServiceAsyncImpl
import com.m3ter.services.async.CommitmentServiceAsync
import com.m3ter.services.async.CommitmentServiceAsyncImpl
import com.m3ter.services.async.CompoundAggregationServiceAsync
import com.m3ter.services.async.CompoundAggregationServiceAsyncImpl
import com.m3ter.services.async.ContractServiceAsync
import com.m3ter.services.async.ContractServiceAsyncImpl
import com.m3ter.services.async.CounterAdjustmentServiceAsync
import com.m3ter.services.async.CounterAdjustmentServiceAsyncImpl
import com.m3ter.services.async.CounterPricingServiceAsync
import com.m3ter.services.async.CounterPricingServiceAsyncImpl
import com.m3ter.services.async.CounterServiceAsync
import com.m3ter.services.async.CounterServiceAsyncImpl
import com.m3ter.services.async.CreditReasonServiceAsync
import com.m3ter.services.async.CreditReasonServiceAsyncImpl
import com.m3ter.services.async.CurrencyServiceAsync
import com.m3ter.services.async.CurrencyServiceAsyncImpl
import com.m3ter.services.async.CustomFieldServiceAsync
import com.m3ter.services.async.CustomFieldServiceAsyncImpl
import com.m3ter.services.async.DataExportServiceAsync
import com.m3ter.services.async.DataExportServiceAsyncImpl
import com.m3ter.services.async.DebitReasonServiceAsync
import com.m3ter.services.async.DebitReasonServiceAsyncImpl
import com.m3ter.services.async.EventServiceAsync
import com.m3ter.services.async.EventServiceAsyncImpl
import com.m3ter.services.async.ExternalMappingServiceAsync
import com.m3ter.services.async.ExternalMappingServiceAsyncImpl
import com.m3ter.services.async.IntegrationConfigurationServiceAsync
import com.m3ter.services.async.IntegrationConfigurationServiceAsyncImpl
import com.m3ter.services.async.MeterServiceAsync
import com.m3ter.services.async.MeterServiceAsyncImpl
import com.m3ter.services.async.NotificationConfigurationServiceAsync
import com.m3ter.services.async.NotificationConfigurationServiceAsyncImpl
import com.m3ter.services.async.OrganizationConfigServiceAsync
import com.m3ter.services.async.OrganizationConfigServiceAsyncImpl
import com.m3ter.services.async.PermissionPolicyServiceAsync
import com.m3ter.services.async.PermissionPolicyServiceAsyncImpl
import com.m3ter.services.async.PlanGroupLinkServiceAsync
import com.m3ter.services.async.PlanGroupLinkServiceAsyncImpl
import com.m3ter.services.async.PlanGroupServiceAsync
import com.m3ter.services.async.PlanGroupServiceAsyncImpl
import com.m3ter.services.async.PlanServiceAsync
import com.m3ter.services.async.PlanServiceAsyncImpl
import com.m3ter.services.async.PlanTemplateServiceAsync
import com.m3ter.services.async.PlanTemplateServiceAsyncImpl
import com.m3ter.services.async.PricingServiceAsync
import com.m3ter.services.async.PricingServiceAsyncImpl
import com.m3ter.services.async.ProductServiceAsync
import com.m3ter.services.async.ProductServiceAsyncImpl
import com.m3ter.services.async.ResourceGroupServiceAsync
import com.m3ter.services.async.ResourceGroupServiceAsyncImpl
import com.m3ter.services.async.ScheduledEventConfigurationServiceAsync
import com.m3ter.services.async.ScheduledEventConfigurationServiceAsyncImpl
import com.m3ter.services.async.StatementServiceAsync
import com.m3ter.services.async.StatementServiceAsyncImpl
import com.m3ter.services.async.TransactionTypeServiceAsync
import com.m3ter.services.async.TransactionTypeServiceAsyncImpl
import com.m3ter.services.async.UsageServiceAsync
import com.m3ter.services.async.UsageServiceAsyncImpl
import com.m3ter.services.async.UserServiceAsync
import com.m3ter.services.async.UserServiceAsyncImpl
import com.m3ter.services.async.WebhookServiceAsync
import com.m3ter.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

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

    private val withRawResponse: M3terClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

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

    private val statements: StatementServiceAsync by lazy {
        StatementServiceAsyncImpl(clientOptionsWithUserAgent)
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

    override fun withRawResponse(): M3terClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): M3terClientAsync =
        M3terClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

    override fun statements(): StatementServiceAsync = statements

    override fun transactionTypes(): TransactionTypeServiceAsync = transactionTypes

    override fun usage(): UsageServiceAsync = usage

    override fun users(): UserServiceAsync = users

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        M3terClientAsync.WithRawResponse {

        private val authentication: AuthenticationServiceAsync.WithRawResponse by lazy {
            AuthenticationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountPlans: AccountPlanServiceAsync.WithRawResponse by lazy {
            AccountPlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val aggregations: AggregationServiceAsync.WithRawResponse by lazy {
            AggregationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bills: BillServiceAsync.WithRawResponse by lazy {
            BillServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billConfig: BillConfigServiceAsync.WithRawResponse by lazy {
            BillConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commitments: CommitmentServiceAsync.WithRawResponse by lazy {
            CommitmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val billJobs: BillJobServiceAsync.WithRawResponse by lazy {
            BillJobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val compoundAggregations: CompoundAggregationServiceAsync.WithRawResponse by lazy {
            CompoundAggregationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractServiceAsync.WithRawResponse by lazy {
            ContractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val counters: CounterServiceAsync.WithRawResponse by lazy {
            CounterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val counterAdjustments: CounterAdjustmentServiceAsync.WithRawResponse by lazy {
            CounterAdjustmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val counterPricings: CounterPricingServiceAsync.WithRawResponse by lazy {
            CounterPricingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditReasons: CreditReasonServiceAsync.WithRawResponse by lazy {
            CreditReasonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val currencies: CurrencyServiceAsync.WithRawResponse by lazy {
            CurrencyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customFields: CustomFieldServiceAsync.WithRawResponse by lazy {
            CustomFieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataExports: DataExportServiceAsync.WithRawResponse by lazy {
            DataExportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val debitReasons: DebitReasonServiceAsync.WithRawResponse by lazy {
            DebitReasonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalMappings: ExternalMappingServiceAsync.WithRawResponse by lazy {
            ExternalMappingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrationConfigurations:
            IntegrationConfigurationServiceAsync.WithRawResponse by lazy {
            IntegrationConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val meters: MeterServiceAsync.WithRawResponse by lazy {
            MeterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notificationConfigurations:
            NotificationConfigurationServiceAsync.WithRawResponse by lazy {
            NotificationConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizationConfig: OrganizationConfigServiceAsync.WithRawResponse by lazy {
            OrganizationConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val permissionPolicies: PermissionPolicyServiceAsync.WithRawResponse by lazy {
            PermissionPolicyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val plans: PlanServiceAsync.WithRawResponse by lazy {
            PlanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val planGroups: PlanGroupServiceAsync.WithRawResponse by lazy {
            PlanGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val planGroupLinks: PlanGroupLinkServiceAsync.WithRawResponse by lazy {
            PlanGroupLinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val planTemplates: PlanTemplateServiceAsync.WithRawResponse by lazy {
            PlanTemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pricings: PricingServiceAsync.WithRawResponse by lazy {
            PricingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val resourceGroups: ResourceGroupServiceAsync.WithRawResponse by lazy {
            ResourceGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduledEventConfigurations:
            ScheduledEventConfigurationServiceAsync.WithRawResponse by lazy {
            ScheduledEventConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val statements: StatementServiceAsync.WithRawResponse by lazy {
            StatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionTypes: TransactionTypeServiceAsync.WithRawResponse by lazy {
            TransactionTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): M3terClientAsync.WithRawResponse =
            M3terClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun authentication(): AuthenticationServiceAsync.WithRawResponse = authentication

        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        override fun accountPlans(): AccountPlanServiceAsync.WithRawResponse = accountPlans

        override fun aggregations(): AggregationServiceAsync.WithRawResponse = aggregations

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        override fun bills(): BillServiceAsync.WithRawResponse = bills

        override fun billConfig(): BillConfigServiceAsync.WithRawResponse = billConfig

        override fun commitments(): CommitmentServiceAsync.WithRawResponse = commitments

        override fun billJobs(): BillJobServiceAsync.WithRawResponse = billJobs

        override fun compoundAggregations(): CompoundAggregationServiceAsync.WithRawResponse =
            compoundAggregations

        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts

        override fun counters(): CounterServiceAsync.WithRawResponse = counters

        override fun counterAdjustments(): CounterAdjustmentServiceAsync.WithRawResponse =
            counterAdjustments

        override fun counterPricings(): CounterPricingServiceAsync.WithRawResponse = counterPricings

        override fun creditReasons(): CreditReasonServiceAsync.WithRawResponse = creditReasons

        override fun currencies(): CurrencyServiceAsync.WithRawResponse = currencies

        override fun customFields(): CustomFieldServiceAsync.WithRawResponse = customFields

        override fun dataExports(): DataExportServiceAsync.WithRawResponse = dataExports

        override fun debitReasons(): DebitReasonServiceAsync.WithRawResponse = debitReasons

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun externalMappings(): ExternalMappingServiceAsync.WithRawResponse =
            externalMappings

        override fun integrationConfigurations():
            IntegrationConfigurationServiceAsync.WithRawResponse = integrationConfigurations

        override fun meters(): MeterServiceAsync.WithRawResponse = meters

        override fun notificationConfigurations():
            NotificationConfigurationServiceAsync.WithRawResponse = notificationConfigurations

        override fun organizationConfig(): OrganizationConfigServiceAsync.WithRawResponse =
            organizationConfig

        override fun permissionPolicies(): PermissionPolicyServiceAsync.WithRawResponse =
            permissionPolicies

        override fun plans(): PlanServiceAsync.WithRawResponse = plans

        override fun planGroups(): PlanGroupServiceAsync.WithRawResponse = planGroups

        override fun planGroupLinks(): PlanGroupLinkServiceAsync.WithRawResponse = planGroupLinks

        override fun planTemplates(): PlanTemplateServiceAsync.WithRawResponse = planTemplates

        override fun pricings(): PricingServiceAsync.WithRawResponse = pricings

        override fun products(): ProductServiceAsync.WithRawResponse = products

        override fun resourceGroups(): ResourceGroupServiceAsync.WithRawResponse = resourceGroups

        override fun scheduledEventConfigurations():
            ScheduledEventConfigurationServiceAsync.WithRawResponse = scheduledEventConfigurations

        override fun statements(): StatementServiceAsync.WithRawResponse = statements

        override fun transactionTypes(): TransactionTypeServiceAsync.WithRawResponse =
            transactionTypes

        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
