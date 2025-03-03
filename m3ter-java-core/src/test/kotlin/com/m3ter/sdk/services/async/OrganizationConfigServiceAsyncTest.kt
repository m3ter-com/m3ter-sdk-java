// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.CurrencyConversion
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OrganizationConfigServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val organizationConfigServiceAsync = client.organizationConfig()

        val organizationConfigFuture =
            organizationConfigServiceAsync.retrieve(
                OrganizationConfigRetrieveParams.builder().orgId("orgId").build()
            )

        val organizationConfig = organizationConfigFuture.get()
        organizationConfig.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val organizationConfigServiceAsync = client.organizationConfig()

        val organizationConfigFuture =
            organizationConfigServiceAsync.update(
                OrganizationConfigUpdateParams.builder()
                    .orgId("orgId")
                    .currency("USD")
                    .dayEpoch("2022-01-01")
                    .daysBeforeBillDue(1L)
                    .monthEpoch("2022-01-01")
                    .timezone("UTC")
                    .weekEpoch("2022-01-04")
                    .yearEpoch("2022-01-01")
                    .autoApproveBillsGracePeriod(2L)
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
                        CurrencyConversion.builder().from("EUR").to("USD").multiplier(1.12).build()
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

        val organizationConfig = organizationConfigFuture.get()
        organizationConfig.validate()
    }
}
