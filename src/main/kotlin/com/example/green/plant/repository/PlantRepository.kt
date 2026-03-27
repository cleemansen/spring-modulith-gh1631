package com.example.green.plant.repository

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class PlantRepository(
    private val jdbcTemplate: JdbcTemplate
) {

    fun getPlants() = jdbcTemplate.queryForList("SELECT * FROM plant.plant")
}