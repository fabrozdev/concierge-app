package com.concierge.app.features.users.service

import com.concierge.app.features.users.model.entity.User
import com.concierge.app.features.users.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun getUsers(): List<User> = userRepository.findByDeletedAtIsNull()
}

class UserNotFoundException(message: String) : RuntimeException(message)

