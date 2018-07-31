package example

import com.github.kittinunf.fuel.Fuel

fun main(args: Array<String>) {
    val result = Fuel.post("http://httpbin.org/post")
            .body("""{"foo": "bar"}""")
            .header("Content-Type" to "application/json")
            .responseString()
    println("------------- request ---------------")
    println(result.first)

    println("--------------- response -----------------")
    println(result.second)

    println("--------------- third ------------------")
    println(result.third)
}
