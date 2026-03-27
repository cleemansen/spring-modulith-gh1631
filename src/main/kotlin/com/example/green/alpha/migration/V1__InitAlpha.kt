package com.example.green.alpha.migration

import org.flywaydb.core.api.migration.BaseJavaMigration
import org.flywaydb.core.api.migration.Context

class V1__InitAlpha : BaseJavaMigration() {
    override fun migrate(context: Context) {
        context.connection.createStatement().use { statement ->
            statement.execute("CREATE SCHEMA IF NOT EXISTS alpha")
        }
        context.connection.createStatement().use { statement ->
            statement.execute("CREATE TABLE alpha.alpha (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), core_id INT NOT NULL REFERENCES core.core(id))")
        }
    }
}