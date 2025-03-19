// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
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
import com.m3ter.sdk.models.PermissionStatementResponse
import com.m3ter.sdk.models.PrincipalPermissionRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PermissionPolicyServiceTest {

    @Test
    fun create() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val permissionPolicyResponse =
            permissionPolicyService.create(
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

        permissionPolicyResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val permissionPolicyResponse =
            permissionPolicyService.retrieve(
                PermissionPolicyRetrieveParams.builder().orgId("orgId").id("id").build()
            )

        permissionPolicyResponse.validate()
    }

    @Test
    fun update() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val permissionPolicyResponse =
            permissionPolicyService.update(
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

        permissionPolicyResponse.validate()
    }

    @Test
    fun list() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val page =
            permissionPolicyService.list(
                PermissionPolicyListParams.builder().orgId("orgId").build()
            )

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val permissionPolicyResponse =
            permissionPolicyService.delete(
                PermissionPolicyDeleteParams.builder().orgId("orgId").id("id").build()
            )

        permissionPolicyResponse.validate()
    }

    @Test
    fun addToServiceUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.addToServiceUser(
                PermissionPolicyAddToServiceUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun addToSupportUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.addToSupportUser(
                PermissionPolicyAddToSupportUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .version(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun addToUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.addToUser(
                PermissionPolicyAddToUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun addToUserGroup() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.addToUserGroup(
                PermissionPolicyAddToUserGroupParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun removeFromServiceUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.removeFromServiceUser(
                PermissionPolicyRemoveFromServiceUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun removeFromSupportUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.removeFromSupportUser(
                PermissionPolicyRemoveFromSupportUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .build()
            )

        response.validate()
    }

    @Test
    fun removeFromUser() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.removeFromUser(
                PermissionPolicyRemoveFromUserParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun removeFromUserGroup() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val permissionPolicyService = client.permissionPolicies()

        val response =
            permissionPolicyService.removeFromUserGroup(
                PermissionPolicyRemoveFromUserGroupParams.builder()
                    .orgId("orgId")
                    .permissionPolicyId("permissionPolicyId")
                    .principalPermissionRequest(
                        PrincipalPermissionRequest.builder().principalId("x").version(0L).build()
                    )
                    .build()
            )

        response.validate()
    }
}
