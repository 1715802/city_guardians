package com.gdc.cityGuardians.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "place")
data class PlaceEntity(
        @Id
        @Column(name = "place_id")
        val id: String,
        @Column(name = "coordinates")
        val coordinates: String
)