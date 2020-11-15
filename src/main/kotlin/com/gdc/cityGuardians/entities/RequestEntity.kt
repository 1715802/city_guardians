package com.gdc.cityGuardians.entities

import javax.persistence.*

@Entity
@Table(name = "request")
data class RequestEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "request_id")
        val id: Long,

        @OneToOne
        @JoinColumn(name = "place_id")
        val place: PlaceEntity,

        @ManyToOne
        @JoinColumn(name = "person_id")
        val person: PersonEntity,

        @OneToOne
        @JoinColumn(name = "problem_id")
        val problem: ProblemEntity
)