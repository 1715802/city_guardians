package com.gdc.cityGuardians.entities

import javax.persistence.*

@Entity
@Table(name = "place")
data class PlaceEntity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "place_id")
        val id: Long,

        @Column(name = "coordinates")
        val coordinates: String
)