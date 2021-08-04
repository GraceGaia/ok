package ObjectOrientedProgramming

import java.util.*

fun main(args: Array<String>) {
    var gari1 = Car()
    println(gari1.model)

    var mwanafunzi1 = Student("Grace", 100, "EMB/001")
    var mwanafunzi2 = Student("Mariga", 101, "EMB/002")
    var mwanafunzi3 = Student("Issack", 102, "EMB/003")
    println(mwanafunzi2.name)

    var chukua = Scanner(System.`in`)
    println("Enter name")
    var name = chukua.next()

    println("Enter age")
    var age = chukua.nextInt()

    println("Enter adm_no")
    var admission = chukua.next()

    var mwanafunzi = Student(name, age, admission)
    println(mwanafunzi.name+" "+mwanafunzi.age+" "+mwanafunzi.adm_no)
    println(mwanafunzi.register())
}

class Car{
    var model = "Mercedes 2016"
    var color = "Gray"
    var price =  3000000.00

    fun accelerate(){
        println("yeah, i can accelerate")
    }

    fun brake(){
        println("Yeah, i can brake")
    }

}


class Student(name:String, age:Int, adm_no:String){
    var name:String
    var age:Int
    var adm_no:String

    //This is a constructor
    init {
        this.name = name
        this.age = age
        this.adm_no = adm_no
    }

    fun register(){
        println("Yeah, i can register")
    }

    fun login(){
        println("Yeah, i can log in")
    }
}