// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.CurrencyConversion
import com.m3ter.models.OrganizationConfigRequest
import com.m3ter.models.OrganizationConfigRetrieveParams
import com.m3ter.models.OrganizationConfigUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrganizationConfigServiceAsyncTest {

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

        val organizationConfigResponseFuture =
            organizationConfigServiceAsync.retrieve(
                OrganizationConfigRetrieveParams.builder().orgId("orgId").build()
            )

        val organizationConfigResponse = organizationConfigResponseFuture.get()
        organizationConfigResponse.validate()
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

        val organizationConfigResponseFuture =
            organizationConfigServiceAsync.update(
                OrganizationConfigUpdateParams.builder()
                    .orgId("orgId")
                    .organizationConfigRequest(
                        OrganizationConfigRequest.builder()
                            .currency("USD")
                            .dayEpoch("2022-01-01")
                            .daysBeforeBillDue(1)
                            .monthEpoch("2022-01-01")
                            .timezone("UTC")
                            .weekEpoch("2022-01-04")
                            .yearEpoch("2022-01-01")
                            .autoApproveBillsGracePeriod(2)
                            .autoApproveBillsGracePeriodUnit("DAYS")
                            .autoGenerateStatementMode(
                                OrganizationConfigRequest.AutoGenerateStatementMode.NONE
                            )
                            .billPrefix("Bill-")
                            .commitmentFeeBillInAdvance(true)
                            .consolidateBills(true)
                            .addCreditApplicationOrder(
                                OrganizationConfigRequest.CreditApplicationOrder.PREPAYMENT
                            )
                            .addCurrencyConversion(
                                CurrencyConversion.builder()
                                    .from("EUR")
                                    .to("USD")
                                    .multiplier(1.12)
                                    .build()
                            )
                            .defaultStatementDefinitionId("defaultStatementDefinitionId")
                            .externalInvoiceDate("LAST_DAY_OF_ARREARS")
                            .minimumSpendBillInAdvance(true)
                            .scheduledBillInterval(0.0)
                            .sequenceStartNumber(1000)
                            .standingChargeBillInAdvance(true)
                            .suppressedEmptyBills(true)
                            .version(0L)
                            .build()
                    )
                    .build()
            )

        val organizationConfigResponse = organizationConfigResponseFuture.get()
        organizationConfigResponse.validate()
    }
}
