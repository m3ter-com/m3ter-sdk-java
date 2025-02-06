// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OrganizationConfigServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val organizationConfigService = client.organizationConfig()
        val organizationConfig =
            organizationConfigService.retrieve(
                OrganizationConfigRetrieveParams.builder().orgId("orgId").build()
            )
        println(organizationConfig)
        organizationConfig.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .build()
        val organizationConfigService = client.organizationConfig()
        val organizationConfig =
            organizationConfigService.update(
                OrganizationConfigUpdateParams.builder()
                    .orgId("orgId")
                    .currency("USD")
                    .dayEpoch("2022-01-01")
                    .daysBeforeBillDue(1L)
                    .monthEpoch("2022-01-01")
                    .timezone("UTC")
                    .weekEpoch("2022-01-04")
                    .yearEpoch("2022-01-01")
                    .autoApproveBillsGracePeriod(1L)
                    .autoApproveBillsGracePeriodUnit("DAYS")
                    .autoGenerateStatementMode(
                        OrganizationConfigUpdateParams.AutoGenerateStatementMode.NONE
                    )
                    .billPrefix("Bill-")
                    .commitmentFeeBillInAdvance(true)
                    .consolidateBills(true)
                    .addCreditApplicationOrder(
                        OrganizationConfigUpdateParams.CreditApplicationOrder.PREPAYMENT
                    )
                    .addCurrencyConversion(
                        OrganizationConfigUpdateParams.CurrencyConversion.builder()
                            .from("EUR")
                            .to("USD")
                            .multiplier(1.0)
                            .build()
                    )
                    .defaultStatementDefinitionId("defaultStatementDefinitionId")
                    .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                    .minimumSpendBillInAdvance(true)
                    .scheduledBillInterval(0.0)
                    .sequenceStartNumber(1000L)
                    .standingChargeBillInAdvance(true)
                    .suppressedEmptyBills(true)
                    .version(0L)
                    .build()
            )
        println(organizationConfig)
        organizationConfig.validate()
    }
}
