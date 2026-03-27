package com.example.green.alpha.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class AlphaRepository(
    private val jdbcTemplate: JdbcTemplate
) {

    fun getAlphas() = jdbcTemplate.queryForList("SELECT * FROM alpha.alpha")
}