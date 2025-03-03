@file:JvmName("EmptyHandler")

package com.m3ter.sdk.core.handlers

import com.m3ter.sdk.core.http.HttpResponse
import com.m3ter.sdk.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
