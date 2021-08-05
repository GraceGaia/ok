package ObjectOrientedProgramming

fun main(args: Array<String>) {
    var x = MySecond("King", "king@gmail.com")
    println(x.email)
    x.acc_balance_checker()
    x.age_checker()
}

abstract class MyFirstClass(open var name:String, open var email:String){
   abstract fun age_checker()
   abstract fun acc_balance_checker()
}

class MySecond(override var name: String, override var email: String):MyFirstClass(name,email){
    override fun age_checker() {
        println("Yeah, i can check the age")
    }

    override fun acc_balance_checker() {
        println("Yeah, i can check the balance")
    }
}
