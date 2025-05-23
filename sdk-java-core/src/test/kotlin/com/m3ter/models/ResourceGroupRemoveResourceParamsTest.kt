// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

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
    fun pathParams() {
        val params =
            ResourceGroupRemoveResourceParams.builder()
                .type("type")
                .resourceGroupId("resourceGroupId")
                .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("")
        assertThat(params._pathParam(1)).isEqualTo("type")
        assertThat(params._pathParam(2)).isEqualTo("resourceGroupId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
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

        assertThat(body.targetId()).isEqualTo("06f6b50c-a868-4ca6-XXXX-448e507d5248")
        assertThat(body.targetType()).isEqualTo(ResourceGroupRemoveResourceParams.TargetType.ITEM)
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResourceGroupRemoveResourceParams.builder()
                .type("type")
                .resourceGroupId("resourceGroupId")
                .targetId("06f6b50c-a868-4ca6-XXXX-448e507d5248")
                .targetType(ResourceGroupRemoveResourceParams.TargetType.ITEM)
                .build()

        val body = params._body()

        assertThat(body.targetId()).isEqualTo("06f6b50c-a868-4ca6-XXXX-448e507d5248")
        assertThat(body.targetType()).isEqualTo(ResourceGroupRemoveResourceParams.TargetType.ITEM)
    }
}
