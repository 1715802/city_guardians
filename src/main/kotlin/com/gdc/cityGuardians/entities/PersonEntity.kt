package com.gdc.cityGuardians.entities

import javax.persistence.*

@Entity
@Table(name = "person")
data class PersonEntity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "person_id")
        val id: Long,

        @Column(name = "name")
        val name: String,

        @Column(name = "phone_number")
        val phoneNumber: String,

        @Column(name = "email")
        val email: String
)