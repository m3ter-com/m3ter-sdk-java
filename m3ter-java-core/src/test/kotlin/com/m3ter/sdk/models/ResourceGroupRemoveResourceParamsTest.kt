// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResourceGroupRemoveResourceParamsTest {

    @Test
    fun create() {
        ResourceGroupRemoveResourceParams.builder()
            .orgId("orgId")
            .type("type")
            .resourceGroupId("resourceGroupId")
            .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
            .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ResourceGroupRemoveResourceParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                .version(0L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.targetId()).isEqualTo("06f6b50c-a868-4ca6-XXXX-448e507d5248")
        assertThat(body.targetType()).isEqualTo(ResourceGroupRemoveResourceParams.TargetType.ITEM)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResourceGroupRemoveResourceParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.targetId()).isEqualTo("06f6b50c-a868-4ca6-XXXX-448e507d5248")
        assertThat(body.targetType()).isEqualTo(ResourceGroupRemoveResourceParams.TargetType.ITEM)
    }

    @Test
    fun getPathParam() {
        val params =
            ResourceGroupRemoveResourceParams.builder()
                .orgId("orgId")
                .type("type")
                .resourceGroupId("resourceGroupId")
                .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                .build()
        assertThat(params).isNotNull
        // path param "orgId"
        assertThat(params.getPathParam(0)).isEqualTo("orgId")
        // path param "type"
        assertThat(params.getPathParam(1)).isEqualTo("type")
        // path param "resourceGroupId"
        assertThat(params.getPathParam(2)).isEqualTo("resourceGroupId")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
