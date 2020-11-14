package com.gdc.cityGuardians.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "request")
data class RequestEntity(
        @Id
        @Column(name = "request_id")
        val id: String,
        @Column(name = "place_id")
        val placeId: String,
        @Column(name = "person_id")
        val personId: String,
        @Column(name = "problem_id")
        val problemId: String
)