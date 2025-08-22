// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Remove a permission policy from a service user. */
class PermissionPolicyRemoveFromServiceUserParams
private constructor(
    private val orgId: String?,
    private val permissionPolicyId: String?,
    private val principalPermissionRequest: PrincipalPermissionRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun permissionPolicyId(): Optional<String> = Optional.ofNullable(permissionPolicyId)

    fun principalPermissionRequest(): PrincipalPermissionRequest = principalPermissionRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        principalPermissionRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyRemoveFromServiceUserParams].
         *
         * The following fields are required:
         * ```java
         * .principalPermissionRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicyRemoveFromServiceUserParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var permissionPolicyId: String? = null
        private var principalPermissionRequest: PrincipalPermissionRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            permissionPolicyRemoveFromServiceUserParams: PermissionPolicyRemoveFromServiceUserParams
        ) = apply {
            orgId = permissionPolicyRemoveFromServiceUserParams.orgId
            permissionPolicyId = permissionPolicyRemoveFromServiceUserParams.permissionPolicyId
            principalPermissionRequest =
                permissionPolicyRemoveFromServiceUserParams.principalPermissionRequest
            additionalHeaders =
                permissionPolicyRemoveFromServiceUserParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                permissionPolicyRemoveFromServiceUserParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun permissionPolicyId(permissionPolicyId: String?) = apply {
            this.permissionPolicyId = permissionPolicyId
        }

        /**
         * Alias for calling [Builder.permissionPolicyId] with `permissionPolicyId.orElse(null)`.
         */
        fun permissionPolicyId(permissionPolicyId: Optional<String>) =
            permissionPolicyId(permissionPolicyId.getOrNull())

        fun principalPermissionRequest(principalPermissionRequest: PrincipalPermissionRequest) =
            apply {
                this.principalPermissionRequest = principalPermissionRequest
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PermissionPolicyRemoveFromServiceUserParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .principalPermissionRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PermissionPolicyRemoveFromServiceUserParams =
            PermissionPolicyRemoveFromServiceUserParams(
                orgId,
                permissionPolicyId,
                checkRequired("principalPermissionRequest", principalPermissionRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PrincipalPermissionRequest = principalPermissionRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> permissionPolicyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PermissionPolicyRemoveFromServiceUserParams &&
            orgId == other.orgId &&
            permissionPolicyId == other.permissionPolicyId &&
            principalPermissionRequest == other.principalPermissionRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            permissionPolicyId,
            principalPermissionRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PermissionPolicyRemoveFromServiceUserParams{orgId=$orgId, permissionPolicyId=$permissionPolicyId, principalPermissionRequest=$principalPermissionRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
