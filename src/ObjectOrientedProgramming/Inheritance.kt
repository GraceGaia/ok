package ObjectOrientedProgramming

fun main(args: Array<String>) {
    var teacher = Mwalimu("grace@gmail.com","EMB/123")
    println(teacher.register())
}

abstract open class Mwanafunzi(open var email:String,open var password:String){
    abstract fun register()
    fun login(){
        println("Yeah, i can login")
    }
}

class Mwalimu(override var email:String, override var password: String):Mwanafunzi(email, password){
    fun add_marks(){
        println("Yeah, i can add marks")
    }
    override fun register(){
        println("Yeah, i can register with more strict rules")
    }
}

