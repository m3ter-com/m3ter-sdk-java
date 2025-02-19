package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: M3terError) :
    M3terServiceException(400, headers, body, error)
