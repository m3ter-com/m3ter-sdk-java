// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Create a new Export Destination to use for your Data Export Schedules or Ad-Hoc Data Exports.
 *
 * **NOTE:** Currently, you can only create Export Destinations using an S3 bucket on your AWS
 * Account.
 */
class DataExportDestinationCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Name of the S3 bucket for the Export Destination. */
    fun bucketName(): String = body.bucketName()

    /** The code of the Export Destination. */
    fun code(): String = body.code()

    /**
     * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an IAM
     * role with PutObject permission for the specified `bucketName`. Create a suitable IAM role in
     * your AWS account and enter ARN:
     *
     * **Formatting Constraints:**
     * - The IAM role ARN must begin with "arn:aws:iam".
     * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
     *   example: "arn:aws:iam::922609978421:role/IAMRole636".
     * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
     *   returned.
     *
     * **More Details:** For more details and examples of the Permission and Trust Policies you can
     * use to create the required IAM Role ARN, see
     * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
     * in our main User documentation.
     */
    fun iamRoleArn(): String = body.iamRoleArn()

    /** The name of the Export Destination. */
    fun name(): String = body.name()

    /**
     * Specify how you want the file path to be structured in your bucket destination - by Time
     * first (Default) or Type first.
     *
     * Type is dependent on whether the Export is for Usage data or Operational data:
     * - **Usage.** Type is `measurements`.
     * - **Operational.** Type is one of the entities for which operational data exports are
     *   available, such as `account`, `commitment`, `meter`, and so on.
     *
     * Example for Usage Data Export using .CSV format:
     * - Time first:
     *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     * - Type first:
     *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     */
    fun partitionOrder(): Optional<PartitionOrder> = body.partitionOrder()

    /**
     * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then the
     * root of the bucket will be used.
     */
    fun prefix(): Optional<String> = body.prefix()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** Name of the S3 bucket for the Export Destination. */
    fun _bucketName(): JsonField<String> = body._bucketName()

    /** The code of the Export Destination. */
    fun _code(): JsonField<String> = body._code()

    /**
     * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an IAM
     * role with PutObject permission for the specified `bucketName`. Create a suitable IAM role in
     * your AWS account and enter ARN:
     *
     * **Formatting Constraints:**
     * - The IAM role ARN must begin with "arn:aws:iam".
     * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
     *   example: "arn:aws:iam::922609978421:role/IAMRole636".
     * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
     *   returned.
     *
     * **More Details:** For more details and examples of the Permission and Trust Policies you can
     * use to create the required IAM Role ARN, see
     * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
     * in our main User documentation.
     */
    fun _iamRoleArn(): JsonField<String> = body._iamRoleArn()

    /** The name of the Export Destination. */
    fun _name(): JsonField<String> = body._name()

    /**
     * Specify how you want the file path to be structured in your bucket destination - by Time
     * first (Default) or Type first.
     *
     * Type is dependent on whether the Export is for Usage data or Operational data:
     * - **Usage.** Type is `measurements`.
     * - **Operational.** Type is one of the entities for which operational data exports are
     *   available, such as `account`, `commitment`, `meter`, and so on.
     *
     * Example for Usage Data Export using .CSV format:
     * - Time first:
     *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     * - Type first:
     *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     */
    fun _partitionOrder(): JsonField<PartitionOrder> = body._partitionOrder()

    /**
     * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then the
     * root of the bucket will be used.
     */
    fun _prefix(): JsonField<String> = body._prefix()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("bucketName")
        @ExcludeMissing
        private val bucketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iamRoleArn")
        @ExcludeMissing
        private val iamRoleArn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partitionOrder")
        @ExcludeMissing
        private val partitionOrder: JsonField<PartitionOrder> = JsonMissing.of(),
        @JsonProperty("prefix")
        @ExcludeMissing
        private val prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(): String = bucketName.getRequired("bucketName")

        /** The code of the Export Destination. */
        fun code(): String = code.getRequired("code")

        /**
         * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an
         * IAM role with PutObject permission for the specified `bucketName`. Create a suitable IAM
         * role in your AWS account and enter ARN:
         *
         * **Formatting Constraints:**
         * - The IAM role ARN must begin with "arn:aws:iam".
         * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
         *   example: "arn:aws:iam::922609978421:role/IAMRole636".
         * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
         *   returned.
         *
         * **More Details:** For more details and examples of the Permission and Trust Policies you
         * can use to create the required IAM Role ARN, see
         * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
         * in our main User documentation.
         */
        fun iamRoleArn(): String = iamRoleArn.getRequired("iamRoleArn")

        /** The name of the Export Destination. */
        fun name(): String = name.getRequired("name")

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        fun partitionOrder(): Optional<PartitionOrder> =
            Optional.ofNullable(partitionOrder.getNullable("partitionOrder"))

        /**
         * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then
         * the root of the bucket will be used.
         */
        fun prefix(): Optional<String> = Optional.ofNullable(prefix.getNullable("prefix"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** Name of the S3 bucket for the Export Destination. */
        @JsonProperty("bucketName")
        @ExcludeMissing
        fun _bucketName(): JsonField<String> = bucketName

        /** The code of the Export Destination. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an
         * IAM role with PutObject permission for the specified `bucketName`. Create a suitable IAM
         * role in your AWS account and enter ARN:
         *
         * **Formatting Constraints:**
         * - The IAM role ARN must begin with "arn:aws:iam".
         * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
         *   example: "arn:aws:iam::922609978421:role/IAMRole636".
         * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
         *   returned.
         *
         * **More Details:** For more details and examples of the Permission and Trust Policies you
         * can use to create the required IAM Role ARN, see
         * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
         * in our main User documentation.
         */
        @JsonProperty("iamRoleArn")
        @ExcludeMissing
        fun _iamRoleArn(): JsonField<String> = iamRoleArn

        /** The name of the Export Destination. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        @JsonProperty("partitionOrder")
        @ExcludeMissing
        fun _partitionOrder(): JsonField<PartitionOrder> = partitionOrder

        /**
         * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then
         * the root of the bucket will be used.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bucketName()
            code()
            iamRoleArn()
            name()
            partitionOrder()
            prefix()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bucketName: JsonField<String>? = null
            private var code: JsonField<String>? = null
            private var iamRoleArn: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var partitionOrder: JsonField<PartitionOrder> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bucketName = body.bucketName
                code = body.code
                iamRoleArn = body.iamRoleArn
                name = body.name
                partitionOrder = body.partitionOrder
                prefix = body.prefix
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name of the S3 bucket for the Export Destination. */
            fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

            /** Name of the S3 bucket for the Export Destination. */
            fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

            /** The code of the Export Destination. */
            fun code(code: String) = code(JsonField.of(code))

            /** The code of the Export Destination. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume
             * an IAM role with PutObject permission for the specified `bucketName`. Create a
             * suitable IAM role in your AWS account and enter ARN:
             *
             * **Formatting Constraints:**
             * - The IAM role ARN must begin with "arn:aws:iam".
             * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>".
             *   For example: "arn:aws:iam::922609978421:role/IAMRole636".
             * - If the `iamRoleArn` used doesn't comply with this format, then an error message
             *   will be returned.
             *
             * **More Details:** For more details and examples of the Permission and Trust Policies
             * you can use to create the required IAM Role ARN, see
             * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
             * in our main User documentation.
             */
            fun iamRoleArn(iamRoleArn: String) = iamRoleArn(JsonField.of(iamRoleArn))

            /**
             * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume
             * an IAM role with PutObject permission for the specified `bucketName`. Create a
             * suitable IAM role in your AWS account and enter ARN:
             *
             * **Formatting Constraints:**
             * - The IAM role ARN must begin with "arn:aws:iam".
             * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>".
             *   For example: "arn:aws:iam::922609978421:role/IAMRole636".
             * - If the `iamRoleArn` used doesn't comply with this format, then an error message
             *   will be returned.
             *
             * **More Details:** For more details and examples of the Permission and Trust Policies
             * you can use to create the required IAM Role ARN, see
             * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
             * in our main User documentation.
             */
            fun iamRoleArn(iamRoleArn: JsonField<String>) = apply { this.iamRoleArn = iamRoleArn }

            /** The name of the Export Destination. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the Export Destination. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Specify how you want the file path to be structured in your bucket destination - by
             * Time first (Default) or Type first.
             *
             * Type is dependent on whether the Export is for Usage data or Operational data:
             * - **Usage.** Type is `measurements`.
             * - **Operational.** Type is one of the entities for which operational data exports are
             *   available, such as `account`, `commitment`, `meter`, and so on.
             *
             * Example for Usage Data Export using .CSV format:
             * - Time first:
             *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             * - Type first:
             *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             */
            fun partitionOrder(partitionOrder: PartitionOrder?) =
                partitionOrder(JsonField.ofNullable(partitionOrder))

            /**
             * Specify how you want the file path to be structured in your bucket destination - by
             * Time first (Default) or Type first.
             *
             * Type is dependent on whether the Export is for Usage data or Operational data:
             * - **Usage.** Type is `measurements`.
             * - **Operational.** Type is one of the entities for which operational data exports are
             *   available, such as `account`, `commitment`, `meter`, and so on.
             *
             * Example for Usage Data Export using .CSV format:
             * - Time first:
             *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             * - Type first:
             *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             */
            fun partitionOrder(partitionOrder: Optional<PartitionOrder>) =
                partitionOrder(partitionOrder.orElse(null))

            /**
             * Specify how you want the file path to be structured in your bucket destination - by
             * Time first (Default) or Type first.
             *
             * Type is dependent on whether the Export is for Usage data or Operational data:
             * - **Usage.** Type is `measurements`.
             * - **Operational.** Type is one of the entities for which operational data exports are
             *   available, such as `account`, `commitment`, `meter`, and so on.
             *
             * Example for Usage Data Export using .CSV format:
             * - Time first:
             *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             * - Type first:
             *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
             */
            fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
                this.partitionOrder = partitionOrder
            }

            /**
             * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`,
             * then the root of the bucket will be used.
             */
            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`,
             * then the root of the bucket will be used.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("bucketName", bucketName),
                    checkRequired("code", code),
                    checkRequired("iamRoleArn", iamRoleArn),
                    checkRequired("name", name),
                    partitionOrder,
                    prefix,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && bucketName == other.bucketName && code == other.code && iamRoleArn == other.iamRoleArn && name == other.name && partitionOrder == other.partitionOrder && prefix == other.prefix && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bucketName, code, iamRoleArn, name, partitionOrder, prefix, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bucketName=$bucketName, code=$code, iamRoleArn=$iamRoleArn, name=$name, partitionOrder=$partitionOrder, prefix=$prefix, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportDestinationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportDestinationCreateParams: DataExportDestinationCreateParams) =
            apply {
                orgId = dataExportDestinationCreateParams.orgId
                body = dataExportDestinationCreateParams.body.toBuilder()
                additionalHeaders = dataExportDestinationCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dataExportDestinationCreateParams.additionalQueryParams.toBuilder()
            }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(bucketName: String) = apply { body.bucketName(bucketName) }

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(bucketName: JsonField<String>) = apply { body.bucketName(bucketName) }

        /** The code of the Export Destination. */
        fun code(code: String) = apply { body.code(code) }

        /** The code of the Export Destination. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an
         * IAM role with PutObject permission for the specified `bucketName`. Create a suitable IAM
         * role in your AWS account and enter ARN:
         *
         * **Formatting Constraints:**
         * - The IAM role ARN must begin with "arn:aws:iam".
         * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
         *   example: "arn:aws:iam::922609978421:role/IAMRole636".
         * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
         *   returned.
         *
         * **More Details:** For more details and examples of the Permission and Trust Policies you
         * can use to create the required IAM Role ARN, see
         * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
         * in our main User documentation.
         */
        fun iamRoleArn(iamRoleArn: String) = apply { body.iamRoleArn(iamRoleArn) }

        /**
         * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an
         * IAM role with PutObject permission for the specified `bucketName`. Create a suitable IAM
         * role in your AWS account and enter ARN:
         *
         * **Formatting Constraints:**
         * - The IAM role ARN must begin with "arn:aws:iam".
         * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
         *   example: "arn:aws:iam::922609978421:role/IAMRole636".
         * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
         *   returned.
         *
         * **More Details:** For more details and examples of the Permission and Trust Policies you
         * can use to create the required IAM Role ARN, see
         * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
         * in our main User documentation.
         */
        fun iamRoleArn(iamRoleArn: JsonField<String>) = apply { body.iamRoleArn(iamRoleArn) }

        /** The name of the Export Destination. */
        fun name(name: String) = apply { body.name(name) }

        /** The name of the Export Destination. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        fun partitionOrder(partitionOrder: PartitionOrder?) = apply {
            body.partitionOrder(partitionOrder)
        }

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        fun partitionOrder(partitionOrder: Optional<PartitionOrder>) =
            partitionOrder(partitionOrder.orElse(null))

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
            body.partitionOrder(partitionOrder)
        }

        /**
         * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then
         * the root of the bucket will be used.
         */
        fun prefix(prefix: String) = apply { body.prefix(prefix) }

        /**
         * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then
         * the root of the bucket will be used.
         */
        fun prefix(prefix: JsonField<String>) = apply { body.prefix(prefix) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): DataExportDestinationCreateParams =
            DataExportDestinationCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Specify how you want the file path to be structured in your bucket destination - by Time
     * first (Default) or Type first.
     *
     * Type is dependent on whether the Export is for Usage data or Operational data:
     * - **Usage.** Type is `measurements`.
     * - **Operational.** Type is one of the entities for which operational data exports are
     *   available, such as `account`, `commitment`, `meter`, and so on.
     *
     * Example for Usage Data Export using .CSV format:
     * - Time first:
     *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     * - Type first:
     *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     */
    class PartitionOrder @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TYPE_FIRST = of("TYPE_FIRST")

            @JvmField val TIME_FIRST = of("TIME_FIRST")

            @JvmStatic fun of(value: String) = PartitionOrder(JsonField.of(value))
        }

        /** An enum containing [PartitionOrder]'s known values. */
        enum class Known {
            TYPE_FIRST,
            TIME_FIRST,
        }

        /**
         * An enum containing [PartitionOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PartitionOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TYPE_FIRST,
            TIME_FIRST,
            /**
             * An enum member indicating that [PartitionOrder] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TYPE_FIRST -> Value.TYPE_FIRST
                TIME_FIRST -> Value.TIME_FIRST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                TYPE_FIRST -> Known.TYPE_FIRST
                TIME_FIRST -> Known.TIME_FIRST
                else -> throw M3terInvalidDataException("Unknown PartitionOrder: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartitionOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportDestinationCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
