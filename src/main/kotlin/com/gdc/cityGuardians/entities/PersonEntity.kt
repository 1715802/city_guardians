package com.gdc.cityGuardians.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
data class PersonEntity(
        @Id
        @Column(name = "person_id")
        val id: String,
        @Column(name = "name")
        val name: String,
        @Column(name = "phone_number")
        val phoneNumber: String,
        @Column(name = "email")
        val email: String
)