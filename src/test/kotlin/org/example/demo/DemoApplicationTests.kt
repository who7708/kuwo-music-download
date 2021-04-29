package org.example.demo

// import org.junit.jupiter.api.Test
// import org.junit.runner.RunWith
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class DemoApplicationTests {

    @Autowired
    private lateinit var ctx: ApplicationContext

    @Test
    fun contextLoads() {
        println("test")
        println(ctx.applicationName)
    }

}