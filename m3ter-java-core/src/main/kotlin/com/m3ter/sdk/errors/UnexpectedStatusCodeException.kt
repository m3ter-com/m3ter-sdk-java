package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: M3terError,
) : M3terServiceException(statusCode, headers, body, error)
