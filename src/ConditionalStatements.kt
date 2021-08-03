fun main(args: Array<String>) {
    var age:Int
    age = 18
    if(age<18){
        println("You are underage")
    }else{
        println("You qualify")
    }

    var marks = 34
    if(marks<40){
        println("E")
    }else if(marks<50){
        println("D")
    }else if(marks<60){
        println("C")
    }else if(marks<70){
        println("B")
    }else{
        println("A")
    }

    var number = 1
    when(number){
        1 ->{
            println("Number one was found")
        }

    2 ->{
        println("Number two was found")
    }
    3 ->{
        println("Number three was found")
    }
    else->{
        println("Sorry, we don't know that number")
    }
    }

}