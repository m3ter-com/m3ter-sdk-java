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
                .billId("billId")
                .createdBy("createdBy")
                .csvStatementStatus(StatementJobResponse.CsvStatementStatus.LATEST)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeCsvFormat(true)
                .jsonStatementStatus(StatementJobResponse.JsonStatementStatus.LATEST)
                .lastModifiedBy("lastModifiedBy")
                .orgId("orgId")
                .presignedCsvStatementUrl("presignedCsvStatementUrl")
                .presignedJsonStatementUrl("presignedJsonStatementUrl")
                .statementJobStatus(StatementJobResponse.StatementJobStatus.PENDING)
                .version(0L)
                .build()

        assertThat(statementJobResponse.id()).isEqualTo("id")
        assertThat(statementJobResponse.billId()).contains("billId")
        assertThat(statementJobResponse.createdBy()).contains("createdBy")
        assertThat(statementJobResponse.csvStatementStatus())
            .contains(StatementJobResponse.CsvStatementStatus.LATEST)
        assertThat(statementJobResponse.dtCreated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementJobResponse.dtLastModified())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(statementJobResponse.includeCsvFormat()).contains(true)
        assertThat(statementJobResponse.jsonStatementStatus())
            .contains(StatementJobResponse.JsonStatementStatus.LATEST)
        assertThat(statementJobResponse.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(statementJobResponse.orgId()).contains("orgId")
        assertThat(statementJobResponse.presignedCsvStatementUrl())
            .contains("presignedCsvStatementUrl")
        assertThat(statementJobResponse.presignedJsonStatementUrl())
            .contains("presignedJsonStatementUrl")
        assertThat(statementJobResponse.statementJobStatus())
            .contains(StatementJobResponse.StatementJobStatus.PENDING)
        assertThat(statementJobResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementJobResponse =
            StatementJobResponse.builder()
                .id("id")
                .billId("billId")
                .createdBy("createdBy")
                .csvStatementStatus(StatementJobResponse.CsvStatementStatus.LATEST)
                .dtCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dtLastModified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeCsvFormat(true)
                .jsonStatementStatus(StatementJobResponse.JsonStatementStatus.LATEST)
                .lastModifiedBy("lastModifiedBy")
                .orgId("orgId")
                .presignedCsvStatementUrl("presignedCsvStatementUrl")
                .presignedJsonStatementUrl("presignedJsonStatementUrl")
                .statementJobStatus(StatementJobResponse.StatementJobStatus.PENDING)
                .version(0L)
                .build()

        val roundtrippedStatementJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementJobResponse),
                jacksonTypeRef<StatementJobResponse>(),
            )

        assertThat(roundtrippedStatementJobResponse).isEqualTo(statementJobResponse)
    }
}
