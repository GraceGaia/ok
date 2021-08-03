import java.util.*

fun main(args: Array<String>) {
    var retrieve = Scanner(System.`in`)
    println("Enter your weight")
    var w = retrieve.nextDouble()

    println("Enter your height")
    var h = retrieve.nextDouble()

    var bmi = w/(h*2);
    println("Your bmi is $bmi")
}