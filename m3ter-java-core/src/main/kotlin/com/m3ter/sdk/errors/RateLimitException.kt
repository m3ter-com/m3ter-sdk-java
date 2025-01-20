package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: M3terError,
) : M3terServiceException(429, headers, body, error)
