package ru.dyachkov.kotlinsecuritydemo.controller

import org.springframework.web.bind.annotation.*
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserCreateRequestDTO
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserDTO
import ru.dyachkov.kotlinsecuritydemo.service.UserService

@RestController
@RequestMapping("/api/user")
class UserController(private val userService: UserService) {
    @PostMapping
    fun create(@RequestBody userRequest: UserCreateRequestDTO): UserDTO = userService.create(userRequest)

    @GetMapping
    fun findAll(): List<UserDTO> = userService.findAllUsers()
}