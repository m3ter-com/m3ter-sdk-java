package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: M3terError) :
    M3terServiceException(401, headers, body, error)
