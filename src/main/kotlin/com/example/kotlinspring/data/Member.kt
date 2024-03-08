package com.example.kotlinspring.data

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty

data class Member(
    val userId: Long,
    val name: String,
    val age: Int,
    @JsonProperty("isGold")
    val gold: Boolean = false
)