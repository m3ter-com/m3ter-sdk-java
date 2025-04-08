@file:JvmName("StringHandler")

package com.m3ter.core.handlers

import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
