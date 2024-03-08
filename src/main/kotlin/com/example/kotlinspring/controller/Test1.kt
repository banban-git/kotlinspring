package com.example.kotlinspring.controller

import com.example.kotlinspring.data.User

fun main() {
    val userList = mutableListOf(
        User(1, "teamA", 30),
        User(2, "teamB", 50),
        User(3, "teamC", 10),
        User(4, "teamD", 40)
    )

    val userNames = userList.
        filter{it.name.contains("D")}
        // IDだけのリストに加工
        .map { e: User -> e.name }
    for(userName in userNames) {
        println("引数:${userName}")
    }

}