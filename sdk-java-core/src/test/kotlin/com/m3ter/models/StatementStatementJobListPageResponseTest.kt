// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatementStatementJobListPageResponseTest {

    @Test
    fun create() {
        val statementStatementJobListPageResponse =
            StatementStatementJobListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        assertThat(statementStatementJobListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(statementStatementJobListPageResponse.nextToken()).contains("nextToken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statementStatementJobListPageResponse =
            StatementStatementJobListPageResponse.builder()
                .addData(
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
                )
                .nextToken("nextToken")
                .build()

        val roundtrippedStatementStatementJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statementStatementJobListPageResponse),
                jacksonTypeRef<StatementStatementJobListPageResponse>(),
            )

        assertThat(roundtrippedStatementStatementJobListPageResponse)
            .isEqualTo(statementStatementJobListPageResponse)
    }
}
