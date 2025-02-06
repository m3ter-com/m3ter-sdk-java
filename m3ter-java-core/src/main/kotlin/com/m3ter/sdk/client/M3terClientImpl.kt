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
import com.m3ter.sdk.services.blocking.DebitReasonService
import com.m3ter.sdk.services.blocking.DebitReasonServiceImpl
import com.m3ter.sdk.services.blocking.MeterService
import com.m3ter.sdk.services.blocking.MeterServiceImpl
import com.m3ter.sdk.services.blocking.OrganizationConfigService
import com.m3ter.sdk.services.blocking.OrganizationConfigServiceImpl
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
import com.m3ter.sdk.services.blocking.TransactionTypeService
import com.m3ter.sdk.services.blocking.TransactionTypeServiceImpl

class M3terClientImpl(
    private val clientOptions: ClientOptions,
) : M3terClient {

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

    private val billConfig: BillConfigService by lazy {
        BillConfigServiceImpl(clientOptionsWithUserAgent)
    }

    private val commitments: CommitmentService by lazy {
        CommitmentServiceImpl(clientOptionsWithUserAgent)
    }

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

    private val debitReasons: DebitReasonService by lazy {
        DebitReasonServiceImpl(clientOptionsWithUserAgent)
    }

    private val meters: MeterService by lazy { MeterServiceImpl(clientOptionsWithUserAgent) }

    private val organizationConfig: OrganizationConfigService by lazy {
        OrganizationConfigServiceImpl(clientOptionsWithUserAgent)
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

    private val transactionTypes: TransactionTypeService by lazy {
        TransactionTypeServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): M3terClientAsync = async

    override fun authentication(): AuthenticationService = authentication

    override fun accounts(): AccountService = accounts

    override fun accountPlans(): AccountPlanService = accountPlans

    override fun aggregations(): AggregationService = aggregations

    override fun balances(): BalanceService = balances

    override fun billConfig(): BillConfigService = billConfig

    override fun commitments(): CommitmentService = commitments

    override fun compoundAggregations(): CompoundAggregationService = compoundAggregations

    override fun contracts(): ContractService = contracts

    override fun counters(): CounterService = counters

    override fun counterAdjustments(): CounterAdjustmentService = counterAdjustments

    override fun counterPricings(): CounterPricingService = counterPricings

    override fun creditReasons(): CreditReasonService = creditReasons

    override fun currencies(): CurrencyService = currencies

    override fun debitReasons(): DebitReasonService = debitReasons

    override fun meters(): MeterService = meters

    override fun organizationConfig(): OrganizationConfigService = organizationConfig

    override fun plans(): PlanService = plans

    override fun planGroups(): PlanGroupService = planGroups

    override fun planGroupLinks(): PlanGroupLinkService = planGroupLinks

    override fun planTemplates(): PlanTemplateService = planTemplates

    override fun pricings(): PricingService = pricings

    override fun products(): ProductService = products

    override fun transactionTypes(): TransactionTypeService = transactionTypes

    override fun close() = clientOptions.httpClient.close()
}
