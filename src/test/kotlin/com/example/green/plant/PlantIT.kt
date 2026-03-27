package com.example.green.plant

import io.kotest.matchers.shouldBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.modulith.test.ApplicationModuleTest
import kotlin.test.Test

@ApplicationModuleTest(ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
class PlantIT {

    @Autowired lateinit var sut: PlantService

    @Test
    fun `it should work`() {
        // act
        val actual = sut.demo()
        // assert
        actual shouldBe "Core: [{ID=1, NAME=Main}], Plants: [{ID=1, NAME=plant1, CORE_ID=1}]"
    }
}