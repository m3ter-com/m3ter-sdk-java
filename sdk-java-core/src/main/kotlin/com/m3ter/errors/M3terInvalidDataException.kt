package com.m3ter.errors

class M3terInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : M3terException(message, cause)
