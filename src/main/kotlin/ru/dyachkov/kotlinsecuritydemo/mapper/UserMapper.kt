package ru.dyachkov.kotlinsecuritydemo.mapper

import org.mapstruct.Mapper
import ru.dyachkov.kotlinsecuritydemo.model.User
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserCreateRequestDTO
import ru.dyachkov.kotlinsecuritydemo.model.dto.UserDTO

@Mapper
interface UserMapper {
    fun toDto(user: User): UserDTO
    fun toEntity(dto: UserDTO): User
    fun toEntity(dto: UserCreateRequestDTO): User
}