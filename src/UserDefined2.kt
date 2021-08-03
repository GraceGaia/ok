import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("Enter your name")
    var name = my_scanner.next()

    println("Enter your weight")
    var weight = my_scanner.nextDouble()

    println("Enter your height")
    var height = my_scanner.nextDouble()
    measurement(name, weight, height)
}

fun measurement(n:String,w:Double,h:Double){
    var bmi = w/Math.pow(h,2.0)
    if (bmi>25.0){
        println("Hi $n, you are overweight.")
    }else if (bmi>18.5){
        println("Hi, $n, you are healthy")
    }else{
        println("Hi, $n you are underweight")
    }
}