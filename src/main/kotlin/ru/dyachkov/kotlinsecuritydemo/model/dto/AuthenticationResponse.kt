package ru.dyachkov.kotlinsecuritydemo.model.dto

data class AuthenticationResponse(val accessToken: String,
                                  val refreshToken: String) {
}