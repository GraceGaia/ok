import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("Enter the principle")
    var p = my_scanner.nextDouble()

    println("Enter the rate")
    var r = my_scanner.nextDouble()

    println("Enter time")
    var t = my_scanner.nextDouble()

    var interest = (p* r* t)/100.0;
    println("Your interest is $interest")
}