package com.concierge.app.features.users.repository

import com.concierge.app.features.users.model.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository: CrudRepository<User, UUID> {
    fun findByDeletedAtIsNull(): List<User>
    fun findByIdAndDeletedAtIsNull(id: UUID): User?
}
