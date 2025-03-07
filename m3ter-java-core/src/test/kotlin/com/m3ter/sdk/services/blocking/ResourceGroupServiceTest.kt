// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.TestServerExtension
import com.m3ter.sdk.client.okhttp.M3terOkHttpClient
import com.m3ter.sdk.models.ResourceGroupAddResourceParams
import com.m3ter.sdk.models.ResourceGroupCreateParams
import com.m3ter.sdk.models.ResourceGroupDeleteParams
import com.m3ter.sdk.models.ResourceGroupListContentsParams
import com.m3ter.sdk.models.ResourceGroupListParams
import com.m3ter.sdk.models.ResourceGroupListPermissionsParams
import com.m3ter.sdk.models.ResourceGroupRemoveResourceParams
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ResourceGroupServiceTest {

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
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.create(
                ResourceGroupCreateParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .name("x")
                    .version(0L)
                    .build()
            )

        resourceGroupResponse.validate()
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
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.retrieve(
                ResourceGroupRetrieveParams.builder().orgId("orgId").type("type").id("id").build()
            )

        resourceGroupResponse.validate()
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
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.update(
                ResourceGroupUpdateParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .id("id")
                    .name("x")
                    .version(0L)
                    .build()
            )

        resourceGroupResponse.validate()
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
        val resourceGroupService = client.resourceGroups()

        val page =
            resourceGroupService.list(
                ResourceGroupListParams.builder().orgId("orgId").type("type").build()
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
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.delete(
                ResourceGroupDeleteParams.builder().orgId("orgId").type("type").id("id").build()
            )

        resourceGroupResponse.validate()
    }

    @Test
    fun addResource() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.addResource(
                ResourceGroupAddResourceParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .resourceGroupId("resourceGroupId")
                    .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                    .targetType(ResourceGroupAddResourceParams.TargetType.ITEM)
                    .version(0L)
                    .build()
            )

        resourceGroupResponse.validate()
    }

    @Test
    fun listContents() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val resourceGroupService = client.resourceGroups()

        val page =
            resourceGroupService.listContents(
                ResourceGroupListContentsParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .resourceGroupId("resourceGroupId")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun listPermissions() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val resourceGroupService = client.resourceGroups()

        val page =
            resourceGroupService.listPermissions(
                ResourceGroupListPermissionsParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .resourceGroupId("resourceGroupId")
                    .build()
            )

        page.response().validate()
    }

    @Test
    fun removeResource() {
        val client =
            M3terOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .apiSecret("My API Secret")
                .token("My Token")
                .orgId("My Org ID")
                .build()
        val resourceGroupService = client.resourceGroups()

        val resourceGroupResponse =
            resourceGroupService.removeResource(
                ResourceGroupRemoveResourceParams.builder()
                    .orgId("orgId")
                    .type("type")
                    .resourceGroupId("resourceGroupId")
                    .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                    .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                    .version(0L)
                    .build()
            )

        resourceGroupResponse.validate()
    }
}
