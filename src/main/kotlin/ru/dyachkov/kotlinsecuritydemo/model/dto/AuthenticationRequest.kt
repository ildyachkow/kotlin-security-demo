package ru.dyachkov.kotlinsecuritydemo.model.dto

data class AuthenticationRequest(
    val email: String,
    val password: String
) {
}