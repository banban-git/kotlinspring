package com.example.kotlinspring.service

import com.example.kotlinspring.data.User
import org.springframework.stereotype.Component

@Component
class HelloService {

    /**
     * テストメソッド
     *
     */
    fun test(param: String) {

        val userList = mutableListOf(
            User(1, "teamA", 30),
            User(2, "teamB", 50),
            User(3, "teamA", 10),
            User(4, "teamB", 40)
        )

        var userIds = userList.stream()
            // IDだけのリストに加工
            .map{e :User-> e.userId}
        println("引数:$userIds")
    }
}