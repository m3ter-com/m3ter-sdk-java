// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.TestServerExtension
import com.m3ter.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.models.PermissionPolicyAddToServiceUserParams
import com.m3ter.models.PermissionPolicyAddToSupportUserParams
import com.m3ter.models.PermissionPolicyAddToUserGroupParams
import com.m3ter.models.PermissionPolicyAddToUserParams
import com.m3ter.models.PermissionPolicyCreateParams
import com.m3ter.models.PermissionPolicyDeleteParams
import com.m3ter.models.PermissionPolicyRemoveFromServiceUserParams
import com.m3ter.models.PermissionPolicyRemoveFromSupportUserParams
import com.m3ter.models.PermissionPolicyRemoveFromUserGroupParams
import com.m3ter.models.PermissionPolicyRemoveFromUserParams
import com.m3ter.models.PermissionPolicyRetrieveParams
import com.m3ter.models.PermissionPolicyUpdateParams
import com.m3ter.models.PermissionStatementResponse
import com.m3ter.models.PrincipalPermissionRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PermissionPolicyServiceAsyncTest {

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

        val permissionPolicyResponseFuture =
            permissionPolicyServiceAsync.create(
                PermissionPolicyCreateParams.builder()
                    .orgId("orgId")
                    .name("x")
                    .addPermissionPolicy(
                        PermissionStatementResponse.builder()
                            .addAction(PermissionStatementResponse.Action.ALL)
                            .effect(PermissionStatementResponse.Effect.ALLOW)
                            .addResource("string")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val permissionPolicyResponse = permissionPolicyResponseFuture.get()
        permissionPolicyResponse.validate()
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

        val permissionPolicyResponseFuture =
            permissionPolicyServiceAsync.retrieve(
                PermissionPolicyRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        val permissionPolicyResponse = permissionPolicyResponseFuture.get()
        permissionPolicyResponse.validate()
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

        val permissionPolicyResponseFuture =
            permissionPolicyServiceAsync.update(
                PermissionPolicyUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .name("x")
                    .addPermissionPolicy(
                        PermissionStatementResponse.builder()
                            .addAction(PermissionStatementResponse.Action.ALL)
                            .effect(PermissionStatementResponse.Effect.ALLOW)
                            .addResource("string")
                            .build()
                    )
                    .version(0L)
                    .build()
            )

        val permissionPolicyResponse = permissionPolicyResponseFuture.get()
        permissionPolicyResponse.validate()
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

        val pageFuture = permissionPolicyServiceAsync.list()

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

        val permissionPolicyResponseFuture =
            permissionPolicyServiceAsync.delete(
                PermissionPolicyDeleteParams.builder().orgId("orgId").id("id").build()
            )

        val permissionPolicyResponse = permissionPolicyResponseFuture.get()
        permissionPolicyResponse.validate()
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
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
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
