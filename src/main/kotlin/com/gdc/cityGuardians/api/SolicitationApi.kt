package com.gdc.cityGuardians.api

import com.gdc.cityGuardians.api.request.SolicitationRequest
import com.gdc.cityGuardians.api.response.SolicitationResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping("/request")
interface SolicitationApi {

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(produces = ["application/json"])
    fun addSolicitation(@RequestBody solicitationRequest: SolicitationRequest): SolicitationResponse

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = ["application/json"])
    fun getSolicitations(@RequestParam(name = "person-id") personId: Long): SolicitationResponse

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(produces = ["application/json"])
    fun updateSolicitation(@RequestBody solicitationRequest: SolicitationRequest,
                           @RequestParam(name = "id") solicitationId: Long): SolicitationResponse

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    fun deleteSolicitation(@RequestParam(name = "id") solicitationId: Long)
}