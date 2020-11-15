package com.gdc.cityGuardians.entities

import javax.persistence.*

@Entity
@Table(name = "request")
data class SolicitationEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "request_id")
        val id: Long,

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "place_id")
        val place: PlaceEntity,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "person_id")
        val person: PersonEntity,

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "problem_id")
        val problem: ProblemEntity
)