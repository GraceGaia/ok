import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter name")
    var name = chukua.next()

    println("Enter email")
    var email = chukua.next()

    println("Enter your marks")
    var marks = chukua.nextDouble()

    println("Enter your age")
    var age = chukua.nextInt()
    println("Hello $name, your email is $email, your age is $age and you scored $marks marks.")
}