package com.gdc.cityGuardians.api.request

data class SolicitationRequest(
        val name: String,
        val phoneNumber: String,
        val email: String,
        val coordinates: String,
        val problem: String
)