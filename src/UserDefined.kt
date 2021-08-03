import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
        println("Enter your name")
        var name = my_scanner.next()

        println("Enter your radius")
        var radius = my_scanner.nextDouble()

        println("Enter your height")
        var height = my_scanner.nextDouble()
    cylinder_volume(name, radius, height)

}

fun cylinder_volume(n:String, r:Double, h:Double) {
    var volume = Math.PI * Math.pow(r, 2.0) * h
    if (volume < 10000) {
        println("Hi $n, your volume is $volume and this is a small cylinder")
    } else {
        println("Hi $n, your volume is $volume and this is a large cylinder")
    }
}