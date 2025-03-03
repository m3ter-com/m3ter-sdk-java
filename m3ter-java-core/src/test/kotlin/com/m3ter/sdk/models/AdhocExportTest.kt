// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdhocExportTest {

    @Test
    fun createAdhocExport() {
        val adhocExport = AdhocExport.builder().jobId("jobId").build()
        assertThat(adhocExport).isNotNull
        assertThat(adhocExport.jobId()).contains("jobId")
    }
}
