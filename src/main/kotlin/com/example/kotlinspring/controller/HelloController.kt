package com.example.kotlinspring.controller

import com.example.kotlinspring.data.Member
import com.example.kotlinspring.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    lateinit var helloService: HelloService

    /**
     * エントリーID取得
     *
     * @return
     */
    @GetMapping("/hello")
    fun getHello(): ResponseEntity<Member> {

        // これから
        helloService.test("テストです")

        // ここから
        val member = Member(1, "name", 20, true)
        return ResponseEntity(member, HttpStatus.OK)
    }
}