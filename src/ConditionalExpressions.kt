fun main(args: Array<String>) {
    var x = 0
    var y = if (x<10){
        "x is less than 10"
    }else{
        "x is not less than 10"
    }

    println(y)

    var number = 0
    var result = if (number == 1){
        "Ooops!!! You lost"
    }else if(number == 2){
        "Ooops! You lost"
    }else if (number == 3){
        "Congrats!! You won"
    }else if (number == 4){
        "Ooops!!! You lost"
    }else{
        "Please enter a number from 1 to 4"
    }
    println(result)

    var a = 3
    var b = when(a){
        1->{
            "One is found"
        }
        2->{
            "Two is found"
        }
        3->{
            "Three is found"
        }
        else->{
            "Sorry, we don't know that number"
        }
    }
    println(b)
}