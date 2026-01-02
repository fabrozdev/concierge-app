package com.concierge.app.features.users.model.entity

import com.concierge.app.common.entity.Deletable
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    val firstName: String,
    val lastName: String,
    val email: String
) : Deletable()
