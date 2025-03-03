// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.PermissionPolicyAddToServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserParams
import com.m3ter.sdk.models.PermissionPolicyCreateParams
import com.m3ter.sdk.models.PermissionPolicyDeleteParams
import com.m3ter.sdk.models.PermissionPolicyListParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserParams
import com.m3ter.sdk.models.PermissionPolicyRetrieveParams
import com.m3ter.sdk.models.PermissionPolicyUpdateParams
import com.m3ter.sdk.models.PermissionStatement
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PermissionPolicyServiceAsyncTest {

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
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val permissionPolicyFuture =
            permissionPolicyServiceAsync.create(
                PermissionPolicyCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .addPermissionPolicy(
                        PermissionStatement.builder()
                            .addAction(PermissionStatement.Action.ALL)
                            .effect(PermissionStatement.Effect.ALLOW)
                            .addResource("string")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val permissionPolicy = permissionPolicyFuture.get()
        permissionPolicy.validate()
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
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val permissionPolicyFuture =
            permissionPolicyServiceAsync.retrieve(
                PermissionPolicyRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val permissionPolicy = permissionPolicyFuture.get()
        permissionPolicy.validate()
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
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val permissionPolicyFuture =
            permissionPolicyServiceAsync.update(
                PermissionPolicyUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .addPermissionPolicy(
                        PermissionStatement.builder()
                            .addAction(PermissionStatement.Action.ALL)
                            .effect(PermissionStatement.Effect.ALLOW)
                            .addResource("string")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val permissionPolicy = permissionPolicyFuture.get()
        permissionPolicy.validate()
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
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val pageFuture =
            permissionPolicyServiceAsync.list(
                PermissionPolicyListParams.builder().orgId("orgId").build()
            )

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
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val permissionPolicyFuture =
            permissionPolicyServiceAsync.delete(
                PermissionPolicyDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val permissionPolicy = permissionPolicyFuture.get()
        permissionPolicy.validate()
    }

    @Test
    fun addToServiceUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.addToServiceUser(
                PermissionPolicyAddToServiceUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun addToSupportUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.addToSupportUser(
                PermissionPolicyAddToSupportUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun addToUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.addToUser(
                PermissionPolicyAddToUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun addToUserGroup() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.addToUserGroup(
                PermissionPolicyAddToUserGroupParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun removeFromServiceUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.removeFromServiceUser(
                PermissionPolicyRemoveFromServiceUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun removeFromSupportUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.removeFromSupportUser(
                PermissionPolicyRemoveFromSupportUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun removeFromUser() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.removeFromUser(
                PermissionPolicyRemoveFromUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun removeFromUserGroup() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyServiceAsync = client.permissionPolicies()

        val responseFuture =
            permissionPolicyServiceAsync.removeFromUserGroup(
                PermissionPolicyRemoveFromUserGroupParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalId("x")
                    .version(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
