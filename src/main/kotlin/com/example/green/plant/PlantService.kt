package com.example.green.plant

import com.example.green.core.CoreService
import com.example.green.plant.repository.PlantRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class PlantService(
    private val coreService: CoreService,
    private val plantRepository: PlantRepository
) {

    private val logger = org.slf4j.LoggerFactory.getLogger(PlantService::class.java)

    fun demo(): String {
        val core = coreService.theCore()
        val plants = plantRepository.getPlants()
        logger.info("Core: $core, Plants: $plants")
        return "Core: $core, Plants: $plants"
    }

    @PostConstruct
    fun init() {
        logger.info("PlantService initialized")
        demo()
    }

}