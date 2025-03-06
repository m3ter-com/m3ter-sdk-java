@file:JvmName("JsonHandler")

package com.m3ter.sdk.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.enhanceJacksonException
import com.m3ter.sdk.core.http.HttpResponse
import com.m3ter.sdk.core.http.HttpResponse.Handler

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw enhanceJacksonException("Error reading response", e)
            }
    }
