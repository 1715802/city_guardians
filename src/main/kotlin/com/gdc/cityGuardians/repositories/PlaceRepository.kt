package com.gdc.cityGuardians.repositories

import com.gdc.cityGuardians.entities.PlaceEntity
import org.springframework.data.repository.CrudRepository

interface PlaceRepository : CrudRepository<PlaceEntity, String> {
}