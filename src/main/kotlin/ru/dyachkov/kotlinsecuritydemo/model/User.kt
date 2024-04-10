package ru.dyachkov.kotlinsecuritydemo.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator
import java.util.*

@Entity
@Table(name = "usr")
class User(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator") val id: UUID?,
    val password: String,
    val email: String,

    @Enumerated(EnumType.STRING) val role: Role? = Role.USER
) {
}