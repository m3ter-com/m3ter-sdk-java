package com.m3ter.sdk.errors

open class M3terException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
