package com.gdc.cityGuardians.api.response

data class SolicitationResponse(
        val name: String,
        val phoneNumber: String,
        val email: String,
        val coordinates: String,
        val problem: String
)