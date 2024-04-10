package ru.dyachkov.kotlinsecuritydemo.service

import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import ru.dyachkov.kotlinsecuritydemo.mapper.UserMapper
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserCreateRequestDTO
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserDTO
import ru.dyachkov.kotlinsecuritydemo.repository.UserRepository

@Service
class UserService(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper,
    private val passwordEncoder: PasswordEncoder
) {
    fun create(user: UserCreateRequestDTO): UserDTO {
        val existUser = userRepository.findByEmail(user.email)
        if (existUser != null) return userMapper.toDto(existUser)

        user.password = passwordEncoder.encode(user.password)
        val saved = userRepository.save(userMapper.toEntity(user))
        return userMapper.toDto(saved)
    }

    fun findAllUsers(): List<UserDTO> {
        return userRepository.findAll().map { userMapper.toDto(it) }
    }

    // добавить остальные CRUD операции по необходимости
}