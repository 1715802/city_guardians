package com.gdc.cityGuardians.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "problem")
data class ProblemEntity(
        @Id
        @Column(name = "problem_id")
        val id: String,
        @Column(name = "problem")
        val problem: String
)