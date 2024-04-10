package ru.dyachkov.kotlinsecuritydemo.model.dto

import ru.dyachkov.kotlinsecuritydemo.model.Role
import java.util.*

data class UserDTO(val id: UUID,
                   val email: String,
                   val role: Role
) {
}