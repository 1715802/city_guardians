package com.gdc.cityGuardians.controller

import com.gdc.cityGuardians.api.SolicitationApi
import com.gdc.cityGuardians.api.request.SolicitationRequest
import com.gdc.cityGuardians.api.response.SolicitationResponse
import org.springframework.web.bind.annotation.RestController

@RestController
class SolicitationController :SolicitationApi {

    override fun addSolicitation(solicitationRequest: SolicitationRequest): SolicitationResponse {
        TODO("Not yet implemented")
    }

    override fun getSolicitations(personId: Long): SolicitationResponse {
        TODO("Not yet implemented")
    }

    override fun updateSolicitation(solicitationRequest: SolicitationRequest, solicitationId: Long): SolicitationResponse {
        TODO("Not yet implemented")
    }

    override fun deleteSolicitation(solicitationId: Long) {
        TODO("Not yet implemented")
    }
}