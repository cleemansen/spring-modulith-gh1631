package com.example.green

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

@SpringBootTest
class GreenApplicationTests {

	@Test
	fun contextLoads() {
	}

	@Test
	fun modulith() {
		ApplicationModules.of(GreenApplication::class.java).verify();
	}

	@Test
	fun `it should generate documentation snippets`() {
		Documenter(ApplicationModules.of(GreenApplication::class.java))
			.writeDocumentation()
			.writeModulesAsPlantUml()
	}

}
