// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.M3terSignedCredentialsRequest
import com.m3ter.sdk.models.WebhookCreateParams
import com.m3ter.sdk.models.WebhookDeleteParams
import com.m3ter.sdk.models.WebhookListParams
import com.m3ter.sdk.models.WebhookRetrieveParams
import com.m3ter.sdk.models.WebhookSetActiveParams
import com.m3ter.sdk.models.WebhookUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceAsyncTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .orgId("orgId")
                    .credentials(
                        M3terSignedCredentialsRequest.builder()
                            .apiKey("x")
                            .secret("x")
                            .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                            .empty(true)
                            .version(0L)
                            .build()
                    )
                    .description("x")
                    .name("x")
                    .url("x")
                    .active(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

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
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.retrieve(
                WebhookRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
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
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .credentials(
                        M3terSignedCredentialsRequest.builder()
                            .apiKey("x")
                            .secret("x")
                            .type(M3terSignedCredentialsRequest.Type.M3_TER_SIGNED_REQUEST)
                            .empty(true)
                            .version(0L)
                            .build()
                    )
                    .description("x")
                    .name("x")
                    .url("x")
                    .active(true)
                    .code("code")
                    .version(0L)
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val webhookServiceAsync = client.webhooks()

        val pageFuture =
            webhookServiceAsync.list(WebhookListParams.builder().orgId("orgId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.delete(
                WebhookDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Test
    fun setActive() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.setActive(
                WebhookSetActiveParams.builder().orgId("orgId").id("id").active(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
