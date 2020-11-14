package com.gdc.cityGuardians.repositories

import com.gdc.cityGuardians.entities.ProblemEntity
import org.springframework.data.repository.CrudRepository

interface ProblemRepository : CrudRepository<ProblemEntity, String> {
}