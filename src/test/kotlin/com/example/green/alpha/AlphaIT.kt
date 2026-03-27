package com.example.green.alpha

import io.kotest.matchers.shouldBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.modulith.test.ApplicationModuleTest
import kotlin.test.Test

@ApplicationModuleTest(ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
class AlphaIT {

    @Autowired lateinit var sut: AlphaService

    @Test
    fun `it should work`() {
        // act
        val actual = sut.demo()
        // assert
        actual shouldBe "Core: [{ID=1, NAME=Main}], Alphas: [{ID=1, NAME=alpha1, CORE_ID=1}]"
    }
}