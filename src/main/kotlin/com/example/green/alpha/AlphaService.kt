package com.example.green.alpha

import com.example.green.alpha.repository.AlphaRepository
import com.example.green.core.CoreService
import org.springframework.stereotype.Service

@Service
class AlphaService(
    private val coreService: CoreService,
    private val alphaRepository: AlphaRepository,
) {

    private val logger = org.slf4j.LoggerFactory.getLogger(AlphaService::class.java)

    fun demo(): String {
        val core = coreService.theCore()
        val alphas = alphaRepository.getAlphas()
        logger.info("Core: $core, Alphas: $alphas")
        return "Core: $core, Alphas: $alphas"
    }

//    @PostConstruct
//    fun init() {
//        logger.info("AlphaService initialized")
//        demo()
//    }
}