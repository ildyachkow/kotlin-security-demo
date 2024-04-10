package ru.dyachkov.kotlinsecuritydemo.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.dyachkov.kotlinsecuritydemo.model.User

interface UserRepository : JpaRepository<User, Long> {
}