package com.example.green.core.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CoreRepository(
    private val jdbcTemplate: JdbcTemplate
) {

    fun getCore() = jdbcTemplate.queryForList("SELECT * FROM core.core")

}