package com.gdc.cityGuardians.entities

import javax.persistence.*

@Entity
@Table(name = "problem")
data class ProblemEntity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "problem_id")
        val id: Long,

        @Column(name = "problem")
        val problem: String
)