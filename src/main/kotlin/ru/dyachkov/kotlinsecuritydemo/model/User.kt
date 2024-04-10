package ru.dyachkov.kotlinsecuritydemo.model

import jakarta.persistence.*

@Entity
@Table(name = "usr")
class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
    var username: String,
    var password: String,
    var email: String
) {
}