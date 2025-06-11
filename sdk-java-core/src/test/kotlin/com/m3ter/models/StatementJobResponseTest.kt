// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementJobResponseTest {

    @Test
    fun create() {
        val statementJobResponse =
            StatementJobResponse.builder()
                .id("id")
                .version(0L)
                .billId("billId")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeCsvFormat(true)
                .lastModifiedBy("lastModifiedBy")
                .orgId("orgId")
                .presignedJsonStatementUrl("presignedJsonStatementUrl")
                .statementJobStatus(StatementJobResponse.StatementJobStatus.PENDING)
                .build()

        assertThat(statementJobResponse.id()).isEqualTo("id")
        assertThat(statementJobResponse.version()).isEqualTo(0L)
        assertThat(statementJobResponse.billId()).contains("billId")
        assertThat(statementJobResponse.createdBy()).contains("createdBy")
        assertThat(statementJobResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementJobResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementJobResponse.includeCsvFormat()).contains(true)
        assertThat(statementJobResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(statementJobResponse.orgId()).contains("orgId")
        assertThat(statementJobResponse.presignedJsonStatementUrl())
            .contains("presignedJsonStatementUrl")
        assertThat(statementJobResponse.statementJobStatus())
            .contains(StatementJobResponse.StatementJobStatus.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementJobResponse =
            StatementJobResponse.builder()
                .id("id")
                .version(0L)
                .billId("billId")
                .createdBy("createdBy")
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeCsvFormat(true)
                .lastModifiedBy("lastModifiedBy")
                .orgId("orgId")
                .presignedJsonStatementUrl("presignedJsonStatementUrl")
                .statementJobStatus(StatementJobResponse.StatementJobStatus.PENDING)
                .build()

        val roundtrippedStatementJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementJobResponse),
                jacksonTypeRef<StatementJobResponse>(),
            )

        assertThat(roundtrippedStatementJobResponse).isEqualTo(statementJobResponse)
    }
}
