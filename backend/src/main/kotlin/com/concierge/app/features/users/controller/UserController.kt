package com.concierge.app.features.users.controller

import com.concierge.app.features.users.model.entity.User
import com.concierge.app.features.users.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {
    @GetMapping
    fun getUsers(): List<User> = userService.getUsers()
}


