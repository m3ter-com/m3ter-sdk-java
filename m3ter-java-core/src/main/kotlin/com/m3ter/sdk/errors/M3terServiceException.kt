// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.errors

import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.http.Headers

abstract class M3terServiceException
protected constructor(message: String, cause: Throwable? = null) : M3terException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
