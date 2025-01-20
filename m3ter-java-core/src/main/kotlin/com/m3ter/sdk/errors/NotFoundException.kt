package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: M3terError,
) : M3terServiceException(404, headers, body, error)
