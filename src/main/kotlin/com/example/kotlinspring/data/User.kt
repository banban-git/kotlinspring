package com.example.kotlinspring.data

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    val userId: Long,
    val name: String,
    val age: Int
)