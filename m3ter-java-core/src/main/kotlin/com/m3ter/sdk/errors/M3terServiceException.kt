package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

abstract class M3terServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: M3terError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : M3terException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): M3terError = error
}
