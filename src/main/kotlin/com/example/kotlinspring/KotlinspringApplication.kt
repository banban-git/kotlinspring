package com.example.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinspringApplication

/**
 * メイン関数
 *
 * @see https://qiita.com/kawano_fumihiko/items/389f977186398f2bcbd3
 */
fun main(args: Array<String>) {
    runApplication<KotlinspringApplication>(*args)
}
