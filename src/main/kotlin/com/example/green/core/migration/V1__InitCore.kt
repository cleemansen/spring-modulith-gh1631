package com.example.green.core.migration

import org.flywaydb.core.api.migration.BaseJavaMigration
import org.flywaydb.core.api.migration.Context

class V1__InitCore : BaseJavaMigration() {
    override fun migrate(context: Context) {
        context.connection.createStatement().use { statement ->
            statement.execute("CREATE SCHEMA IF NOT EXISTS core")
        }
        context.connection.createStatement().use { statement ->
            statement.execute("CREATE TABLE core.core (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255))")
        }
    }
}