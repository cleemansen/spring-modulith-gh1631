package com.example.green.core

import com.example.green.core.repository.CoreRepository
import org.springframework.stereotype.Service

@Service
class CoreService(
    private val coreRepository: CoreRepository
) {

    fun theCore(): String {
        val core = coreRepository.getCore()
        return core.toString()
    }
}