package ru.dyachkov.kotlinsecuritydemo.model.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import ru.dyachkov.kotlinsecuritydemo.model.Role

data class UserCreateRequestDTO(
    val email: String,
    var password: String,

    @JsonIgnore
    val role : Role = Role.USER
) {
}