// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClientAsync
import com.m3ter.sdk.models.PermissionStatementResponse
import com.m3ter.sdk.models.UserGetPermissionsParams
import com.m3ter.sdk.models.UserGetUserGroupsParams
import com.m3ter.sdk.models.UserListParams
import com.m3ter.sdk.models.UserMeParams
import com.m3ter.sdk.models.UserResendPasswordParams
import com.m3ter.sdk.models.UserRetrieveParams
import com.m3ter.sdk.models.UserUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

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
        val userServiceAsync = client.users()

        val userResponseFuture =
            userServiceAsync.retrieve(UserRetrieveParams.builder().orgId("orgId").id("id").build())

        val userResponse = userResponseFuture.get()
        userResponse.validate()
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
        val userServiceAsync = client.users()

        val userResponseFuture =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .dtEndAccess(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val userResponse = userResponseFuture.get()
        userResponse.validate()
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
        val userServiceAsync = client.users()

        val pageFuture = userServiceAsync.list(UserListParams.builder().orgId("orgId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun getPermissions() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val userServiceAsync = client.users()

        val permissionPolicyResponseFuture =
            userServiceAsync.getPermissions(
                UserGetPermissionsParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .nextToken("nextToken")
                    .pageSize(1L)
                    .build()
            )

        val permissionPolicyResponse = permissionPolicyResponseFuture.get()
        permissionPolicyResponse.validate()
    }

    @Test
    fun getUserGroups() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val userServiceAsync = client.users()

        val resourceGroupResponseFuture =
            userServiceAsync.getUserGroups(
                UserGetUserGroupsParams.builder()
                    .orgId("orgId")
                    .id("id")
                    .nextToken("nextToken")
                    .pageSize(1L)
                    .build()
            )

        val resourceGroupResponse = resourceGroupResponseFuture.get()
        resourceGroupResponse.validate()
    }

    @Test
    fun me() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val userServiceAsync = client.users()

        val responseFuture = userServiceAsync.me(UserMeParams.builder().orgId("orgId").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun resendPassword() {
        val client =
            M3terOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val userServiceAsync = client.users()

        val future =
            userServiceAsync.resendPassword(
                UserResendPasswordParams.builder().orgId("orgId").id("id").build()
            )

        val response = future.get()
    }
}
