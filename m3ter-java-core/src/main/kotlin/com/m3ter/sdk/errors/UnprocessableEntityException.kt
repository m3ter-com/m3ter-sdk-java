package com.m3ter.sdk.errors

import com.m3ter.sdk.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: M3terError) :
    M3terServiceException(422, headers, body, error)
