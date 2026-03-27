package com.example.green.core

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.BadSqlGrammarException
import org.springframework.modulith.test.ApplicationModuleTest
import kotlin.test.Test

@ApplicationModuleTest
class CoreIT {

    @Autowired
    lateinit var sut: CoreService
    @Autowired
    lateinit var jdbcTemplate: org.springframework.jdbc.core.JdbcTemplate

    @Test
    fun `it should not execute the migrations of module plant`() {
        // act
        val actual = assertThrows<BadSqlGrammarException> {
            jdbcTemplate.queryForList("SELECT * FROM plant.plant")
        }
        // assert
        actual.message shouldBe "StatementCallback; bad SQL grammar [SELECT * FROM plant.plant]"
    }

    @Test
    fun `it should execute the migrations of module core`() {
        // act
        val actual = sut.theCore()
        // actual
        actual shouldBe "[{ID=1, NAME=Main}]"
    }



}