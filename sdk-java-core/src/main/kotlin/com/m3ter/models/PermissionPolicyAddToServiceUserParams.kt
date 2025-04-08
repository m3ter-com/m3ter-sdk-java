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

/** Add a permission policy to a service user. */
class PermissionPolicyAddToServiceUserParams
private constructor(
    private val orgId: String?,
    private val permissionPolicyId: String,
    private val principalPermissionRequest: PrincipalPermissionRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun permissionPolicyId(): String = permissionPolicyId

    fun principalPermissionRequest(): PrincipalPermissionRequest = principalPermissionRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        principalPermissionRequest._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyAddToServiceUserParams].
         *
         * The following fields are required:
         * ```java
         * .permissionPolicyId()
         * .principalPermissionRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicyAddToServiceUserParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var permissionPolicyId: String? = null
        private var principalPermissionRequest: PrincipalPermissionRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            permissionPolicyAddToServiceUserParams: PermissionPolicyAddToServiceUserParams
        ) = apply {
            orgId = permissionPolicyAddToServiceUserParams.orgId
            permissionPolicyId = permissionPolicyAddToServiceUserParams.permissionPolicyId
            principalPermissionRequest =
                permissionPolicyAddToServiceUserParams.principalPermissionRequest
            additionalHeaders = permissionPolicyAddToServiceUserParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                permissionPolicyAddToServiceUserParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun permissionPolicyId(permissionPolicyId: String) = apply {
            this.permissionPolicyId = permissionPolicyId
        }

        fun principalPermissionRequest(principalPermissionRequest: PrincipalPermissionRequest) =
            apply {
                this.principalPermissionRequest = principalPermissionRequest
            }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PermissionPolicyAddToServiceUserParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .permissionPolicyId()
         * .principalPermissionRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PermissionPolicyAddToServiceUserParams =
            PermissionPolicyAddToServiceUserParams(
                orgId,
                checkRequired("permissionPolicyId", permissionPolicyId),
                checkRequired("principalPermissionRequest", principalPermissionRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PrincipalPermissionRequest = principalPermissionRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> permissionPolicyId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyAddToServiceUserParams && orgId == other.orgId && permissionPolicyId == other.permissionPolicyId && principalPermissionRequest == other.principalPermissionRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, permissionPolicyId, principalPermissionRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PermissionPolicyAddToServiceUserParams{orgId=$orgId, permissionPolicyId=$permissionPolicyId, principalPermissionRequest=$principalPermissionRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
