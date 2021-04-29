package org.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class DemoApplicationTests2 {

    @Autowired
    private lateinit var ctx: ApplicationContext

    @Test
    fun contextLoads() {
        println("test")
        println(ctx.applicationName)
    }

}