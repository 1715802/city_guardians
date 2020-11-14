package com.gdc.cityGuardians.repositories

import com.gdc.cityGuardians.entities.PersonEntity
import org.springframework.data.repository.CrudRepository

interface RequestRepository : CrudRepository<PersonEntity, String> {
}